<%-- 
    Document   : picList
    Created on : 2012-6-13, 13:55:37
    Author     : 甲骨文
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
        <script type="text/javascript" src="js/jquery-ui-1.8.20.custom.min.js"></script> 
        <link type="text/css" href="css/ui-lightness/jquery-ui-custom.css" rel="Stylesheet" />
        <link href="sources/facebox/facebox.css" media="screen" rel="stylesheet" type="text/css"/>
        <script src="sources/facebox/facebox.js" type="text/javascript"></script> 
        
        <script type="text/javascript">
             $(document).ready( function() {
                 //facebox
                 $('a[rel=facebox]').facebox();
                 
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
                   
                   var status_id = $(this).attr("id");
                   // 状态所在的列表项
                   var status_li = $(this).parent().parent(".panel");
                   $.post("AddPicComment!addComment.action",
                           {
                               picId: parseInt(status_id),
                               content: comment
                           },
                           // 提交以后的回调函数
                           function(data, textStatus){
                                   if(textStatus == "success"){
                                       // 清空输入框
                                       input.val("");
                                       
                                       //显示回复的内容
//                                       status_li.append("<p><span>"
//                                       + data.comment.userinfo.name + ":" + data.comment.content
//                                       + "</span> <span>" + data.time 
//                                       + "</span></p><hr size='1'/>");
                                         
                                         //添加jsp内容
                                         status_li.append(data);
                                         
                                   }
                            }
                    );
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
        <div id="debug"></div>
        <ul>
            <div id="picList"></div>
                
            <style>
                .status_li {list-style-type:none;}
            </style>
                
            <s:iterator value="#request.picList" id="pic">
                <li class="status_li">
                    <div style="display: inline">
                        <a class="personLink" href="PersonalPage.action?uid=<s:property value='#pic.userinfo.uid'/>">
                            <img src="<s:property value='#pic.userinfo.avatar'/>" width="50" height="50" >
                        </a>
                    </div>
                    <div style="display: inline">
                        <a class="personLink" href="PersonalPage.action?uid=<s:property value='#pic.userinfo.uid'/>">
                            <s:property value="#pic.userinfo.name"/>
                        </a>
                            :<s:property value="#pic.description"/>
                    </div>
                    <div>
                        <a href="<s:property value='#pic.picPath'/>" rel="facebox">
                            <img src="<s:property value='#pic.picPath'/>" width="200">
                        </a>
                    </div>
                    
                    <br/>
                    <div>
                        <s:date name="#pic.time" format="yyyy-MM-dd HH:mm:ss"/>
                        <a class="btn-slide" href="#">评论</a>
                    </div>  
                    
                    <!--评论panel-->
                    <div class="panel">
                        <div class="commentForm">
                            <input type="text" size="43" style="display: inline"></input>
                                <a class="commentCommit" 
                                   id="<s:property value='#pic.picId'/>" 
                                   href="#nogo">
                                    提交
                                </a>
                        </div>
                        <!--评论-->
                        <s:action name="GetPicComments" executeResult="true">
                            <s:param name="picId" value="#pic.picId" />
                        </s:action>
                        
                        <!--end of 评论panel-->
                    </div>
                    
                    
                    <hr size="2"/>
                </li>
            </s:iterator>
        </ul>
    </body>
</html>
