<%-- 
    Document   : GetPaged
    Created on : 2012-6-10, 14:48:47
    Author     : 甲骨文
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
        <script type="text/javascript" src="js/jquery-ui-1.8.20.custom.min.js"></script> 
        <link type="text/css" href="css/ui-lightness/jquery-ui-custom.css" rel="Stylesheet" />


        <script type="text/javascript">
            $(document).ready( function() {
                 
                //弹出评论框
                $(".btn-slide").click(function(){
                    $(this).parent().next(".panel").slideToggle("slow");
                    $(this).toggleClass("active");
                    return false;
                });
                 
                // 提交评论
                $("[class='commentCommit']").click(function(){
                    
                    var comment = $(this).prev("input").attr("value");
                    var input = $(this).prev("input");
                   
                    if(comment == ''){
                        return false;
                    }
                   
                    var feed_id = $(this).attr("id");
                    // 新鲜事类型
                    var feed_type = $(this).next("input");
                    
                    //新鲜事列表项
                    var feed_li = $(this).parent().parent().parent();
                    
                    if(feed_type.val() == "STATUS"){
                        
                        $.post("AddStatusComment!addComment.action",
                        {
                            status_id: parseInt(feed_id),
                            content: comment
                        },
                        // 提交以后的回调函数
                        function(data, textStatus){
                            if(textStatus == "success"){
                                // 清空输入框
                                input.val("");
                                       
                                //显示回复的内容
                                feed_li.append(data);
                            }
                        }
                    );
                    }else if(feed_type.val() == "IMAGE"){
                        
                    }
                    
                    return true;
                }); 
                
            }); 
            
             
        </script>
        <style type="text/css">

            .commentCommit {
                background: url(resource/images/btn-slide.gif) no-repeat center top;
                width: 52px;
                height: 20px;
                padding: 10px 10px 0 0;
                margin: 0 auto;
                display: block;
                font: bold 120%/100% Arial, Helvetica, sans-serif;
                color: #fff;
                text-decoration: none;
                display: inline
            }

            .panel {
                display: none;
            }
            .personLink:link,.personLink:visited{text-decoration:none;}
        </style>
    </head>
    <body>
        <ul>
            <style>
                .feed_li {list-style-type:none;}
            </style>
            <div id="feedList">
                <s:iterator value="#request.feedList" id="feeds">
                    <li class="feed_li">
                        <input class="feedType" type="hidden" value="<s:property value='#feeds.feedType'/>"/>
                        <div style="display: inline">
                            <a class="personLink" href="PersonalPage.action?uid=<s:property value='#feeds.userinfo.uid'/>">
                                <img src="<s:property value='#feeds.userinfo.avatar'/>" width="50" height="50" >
                            </a>
                        </div>
                        <div style="display: inline">
                            <a class="personLink" href="PersonalPage.action?uid=<s:property value='#feeds.userinfo.uid'/>">
                                <s:property value="#feeds.userinfo.name"/>
                            </a>
                            :<s:property value="#feeds.title"/>
                        </div> 
                        
                        <s:if test="#feeds.feedType=='IMAGE'">
                            <image id="image" src="" width="200pix">
                        </s:if><br/>
                        <div>
                            <s:date name="#feeds.updateTime" format="yyyy-MM-dd HH:mm:ss"/>
                            <a class="btn-slide" href="#">评论</a>
                        </div>

                        <!--评论panel-->
                        <div class="panel">
                            <div class="commentForm">
                                <input type="text" size="43" style="display: inline"></input>
                                <a class="commentCommit" 
                                   id="<s:property value='#feeds.feedSrcid'/>" 
                                   href="#nogo">
                                    提交
                                </a>
                                <input class="feedType" type="hidden" value="<s:property value='#feeds.feedType'/>"/>
                            </div>

                            <!--评论-->

                            <s:if test="#feeds.feedType=='STATUS'">
                                <s:action name="GetStatusComments" executeResult="true">
                                    <s:param name="statusId" value="#feeds.feedSrcid" />
                                </s:action>
                            </s:if>
                            


                            <!--end of 评论panel-->
                        </div>


                        <hr size="2"/>
                    </li> 
                </s:iterator>
            </div>
        </ul>
    </body>
</html>
