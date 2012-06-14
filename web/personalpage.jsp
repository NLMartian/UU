<%-- 
    Document   : peronalpage
    Created on : 2012-5-11, 2:44:39
    Author     : Administrator
--%>

<%@ page contentType="text/html" language = "java" import= "java.util.*"  pageEncoding = "UTF-8"%> 
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix ="sj" uri="/struts-jquery-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <meta name="description" content="UU——大学生交友网络"/>
        <title>个人主页</title>
        <link rel="stylesheet" type="text/css" href="css/style.css" /> 
        <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
        <script type="text/javascript" src="js/jquery-ui-1.8.20.custom.min.js"></script> 
        <link type="text/css" href="css/ui-lightness/jquery-ui-custom.css" rel="Stylesheet" />
        <script type="text/javascript" src="js/jquery.paginate.js"></script>
        <script type="text/javascript">
            $(function(){

                $.post(
                        "UserCard.action", 
                        {uid: Number($("#uid").val())},
                        function(data, textStatus){
                            if(textStatus == "success")
                                $("#sidebar1").append(data);
                        }
                        
                    );
                   
                   
                // 中间tab页
                $( "#tabs" ).tabs();
                
                $("#tab_btn1").click(function(){
                    $("#tabs-1").empty();
                    $("#tabs-1").load("AllOnesStatus.action",
                                        {uid: Number($("#uid").val())}
                    );
                });
                
                $("#tab_btn2").click(function(){
                    $("#tabs-1").empty();
                    $("#tabs-1").load("AllOnesPic.action",
                                        {uid: Number($("#uid").val())}
                    );
                });
                
                $("#tabs-1").load("AllOnesStatus.action",
                                        {uid: Number($("#uid").val())}
                    );
            
            });
        </script>
        <style type="text/css"> 
             
            body  {
	font: 100% 宋体, 新宋体;
	background: #666666;
	margin: 0; /* 最好将 body 元素的边距和填充设置为 0 以覆盖不同的浏览器默认值 */
	padding: 0;
	text-align: center; /* 在 IE 5* 浏览器中，这会将容器居中。文本随后将在 #container 选择器中设置为默认左对齐 */
	color: #000000;
	background-image: url(resource/uubg.png);
            }

            /* 弹性布局提示 
            1. 由于弹性布局的总体大小取决于用户的默认字体大小，因此弹性布局更难预测。如果正确使用的话，弹性布局对于那些需要较大字体的用户更为方便，因为行的长度仍保持适当比例。
            2. 此布局中 div 的大小取决于 body 元素中的 100% 字体大小。如果您通过对 body 元素或 #container 使用“font-size: 80%”来减小文本的总体大小，请记住整体布局将按比例缩小。您最好增加各个 div 的宽度以对此进行补偿。
            3. 如果字体大小在每个 div 中按不同的量进行更改（例如，#sidebar1 上的字体大小为 70%，#mainContent 上的字体大小为 85%），而不是对总体设计进行更改，则将按比例更改每个 div 的总体大小。您最好根据最终的字体大小来进行调整。
            */
            .thrColElsHdr #container { 
                width: 65em;  /* 当文本保持浏览器的默认字体大小时，此宽度将创建一个适合 800px 浏览器窗口的容器 */
                background: #FFFFFF;
                margin: 0 auto; /* 自动边距（与宽度一起）会将页面居中 */
                border: 1px solid #000000;
                text-align: left; /* 这将覆盖 body 元素上的“text-align: center”。 */
            } 
            .thrColElsHdr #header { 
                background: #DDDDDD; 
                padding: 0 10px;  /* 此填充会将出现在它后面的 div 中的元素左对齐。如果 #header 中使用的是图像（而不是文本），您最好删除填充。 */
            } 
            .thrColElsHdr #header h1 {
                margin: 0; /* 将 #header div 中最后一个元素的边距设置为零将避免边距重叠（即 div 之间出现的无法解释的空白）。如果 div 周围有边框，则不必将边距设置为零，因为边框也会避免边距重叠 */
                padding: 10px 0; /* 使用填充而不使用边距将可以使元素远离 div 的边缘 */
            }

            /* sidebar1 提示：
            1. 请记住，如果为该 div 设置了字体大小，则该 div 的总体宽度将进行相应的调整。
            2. 由于我们使用的是全方 (em)，因此最好不要针对侧栏本身使用填充。它将会新增至宽度，而让符合标准的浏览器建立未知的实际宽度。 
            3. 如果为 div 中的元素设置左边距和右边距，则会在 div 边缘和这些元素之间产生空白，如“.thrColElsHdr #sidebar1 p”规则中所示。
            */
            .thrColElsHdr #sidebar1 {
                float: left; 
                width: 15em; /* 由于此元素是浮动的，因此必须指定宽度 */
                background: #EBEBEB; /* 将显示背景色，其宽度等于栏中内容的长度，*/
                padding: 15px 0; /* 顶部和底部的填充将在该 div 中产生视觉空间 */
            }
            .thrColElsHdr #sidebar2 {
                float: right; 
                width: 15em; /* 由于此元素是浮动的，因此必须指定宽度 */
                background: #EBEBEB; /* 将显示背景色，其宽度等于栏中内容的长度，*/
                padding: 15px 0; /* 顶部和底部的填充将在该 div 中产生视觉空间 */
            }
            .thrColElsHdr #sidebar1 h3, .thrColElsHdr #sidebar1 p, .thrColElsHdr #sidebar2 p, .thrColElsHdr #sidebar2 h3 {
                margin-left: 10px; /* 对于将要放在侧栏中的每个元素，都应当设置左边距和右边距 */
                margin-right: 10px;
            }

            /* mainContent 提示：
            1. 如果为 #mainContent div 和 #sidebar1 div 指定不同的字体大小，则 #mainContent div 的边距和 #sidebar1 div 的宽度将取决于各自 div 的字体大小。您最好调整这些 div 的值。
            2. mainContent 和 sidebar1 之间的空白是由 mainContent div 的左边距创建的。无论 sidebar1 div 中包含多少内容，都将保留栏空白。如果您希望在 #sidebar1 中的内容结束时，用 #mainContent div 的文本填充 #sidebar1 空白，则可以删除此左边距。
            3. 为避免出现“浮动下降”，可能需要进行测试，以确定近似的最大图像/元素大小，这是由于此布局基于用户的字体大小以及您所设置的值。但是，如果用户将浏览器的字体大小设置为低于正常值，那么，在 #mainContent div 中看到的空白将少于在测试时看到的空白。
            4. 在下面的 Internet Explorer 条件注释中，zoom 属性用来赋予 mainContent“hasLayout”。这会避免几个可能出现的特定于 IE 的错误。
            */
            .thrColElsHdr #mainContent {
                margin: 0 16em 0 16em; /* 右边距可以用全方 (em) 或像素来指定，它会在页面的右下方产生空白。 */
            } 
            .thrColElsHdr #footer { 
                padding: 0 10px; /* 此填充会将它上面 div 中的所有元素左对齐。 */
                background:#DDDDDD;
            } 
            .thrColElsHdr #footer p {
                margin: 0; /* 将脚注中第一个元素的边距设置为零将避免出现可能的边距重叠（即 div 之间出现的空白）*/
                padding: 10px 0; /* 就像边距会产生空白一样，此元素上的填充也将产生空白，但不会出现边距重叠问题 */
            }

            /* 要重用的各种类 */
            .fltrt { /* 此类可用来使页面中的元素向右浮动。浮动元素必须位于页面上要与之相邻的元素之前。 */
                float: right;
                margin-left: 8px;
            }
            .fltlft { /* 此类可用来使页面上的元素向左浮动 */
                float: left;
                margin-right: 8px;
            }
            .clearfloat { /* 此类应当放在 div 或 break 元素上，而且该元素应当是完全包含浮动的容器关闭之前的最后一个元素 */
                clear:both;
                height:0;
                font-size: 1px;
                line-height: 0px;
            }
            
            .tabButtons {
                height: 40px;
            }
             #headpage {
            
                position:absolute;
                width:auto;
                height:auto;
                z-index:1;
                left: 940px;
                top: 24px;
            }    
                
 
        </style><!--[if IE]>
        <style type="text/css"> 
        /* 请将所有版本的 IE 的 css 修复放在这个条件注释中 */
        .thrColElsHdr #sidebar1, .thrColElsHdr #sidebar2 { padding-top: 30px; }
        .thrColElsHdr #mainContent { zoom: 1; padding-top: 15px; }
        /* 上面的专用 zoom 属性为 IE 提供避免错误所需的 hasLayout */
        </style>
        <![endif]--></head>

    <body class="thrColElsHdr">

        <div id="container">
            <div id="header">
                <h1>${sessionScope.CurrUser.name}的个人主页</h1>
                <div id="headpage">
                        <a href="/UU/PersonalPage.action?uid=${sessionScope.CurrUser.uid}">个人主页</a>
                         &nbsp;
                    <a href="infoCenterN.jsp">信息中心</a>
                    &nbsp;
                    <a href="/UU/Logout.action">退出登录</a>
                </div>
            </div>
            <div id="sidebar1">
                <input id="uid" type="hidden" value="${requestScope.uid}">

                <!-- end #sidebar1 --></div>
            <div id="sidebar2">
                <h3>sidebar2 内容</h3>
                <p>Donec eu mi sed turpis feugiat feugiat. Integer turpis arcu, pellentesque  eget, cursus et, fermentum ut, sapien. </p>
                <!-- end #sidebar2 --></div>
            <div id="mainContent">
                <div id="maincontainer2">
       
                <div id="tabs">
                    <ul class ="tabButtons">
                        <li><a href="#tabs-1" id="tab_btn1">状态</a></li>
                        <li><a href="#tabs-1" id="tab_btn2">图片</a></li>
                        <li><a href="#tabs-2" id="tab_btn3">微博留言</a></li>
                    </ul>
                    
                    <div id="tabs-1"></div>
                    <div id="tabs-2">
                        <script type="text/javascript">
                            (function(){
                            var url = "http://widget.weibo.com/distribution/comments.php?width=0&url=auto&border=1&fontsize=12&appkey=382264144&dpc=1";
                            url = url.replace("url=auto", "url=" + document.URL); 
                            document.write('<iframe id="WBCommentFrame" src="' + url + '" scrolling="no" frameborder="0" style="width:100%"></iframe>');
                            })();
                            </script>
                            <script src="http://tjs.sjs.sinajs.cn/open/widget/js/widget/comment.js" type="text/javascript" charset="utf-8"></script>
                            <script type="text/javascript">
                            window.WBComment.init({
                                "id": "WBCommentFrame"
                            });
                        </script>
                    </div>
		
	</div>
                </div>
                
                <p>&nbsp;</p>
                <p>&nbsp;</p>
                <p>&nbsp;</p>
                
                
                </div>
                <!-- end #mainContent --></div>
            <!-- 这个用于清除浮动的元素应当紧跟 #mainContent div 之后，以便强制 #container div 包含所有的子浮动 --><br class="clearfloat" />
            <div id="footer">
                ©2012 UU   &nbsp;&nbsp;
                   
                    <a target="_blank" href="http://www.hao123.com">关于</a>
                    |
                    <a target="_blank" href="http://www.hao123.com">开放平台</a>
                    |
                    <a target="_blank" href="http://www.hao123.com">UU游戏</a>
                    |
                    <a target="_blank" href="http://www.hao123.com">客服帮助</a>
                    |
                    <a target="_blank" href="http://www.hao123.com">隐私</a>
                <!-- end #footer --></div>
            <!-- end #container --></div>
    </body>
</html>


