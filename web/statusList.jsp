<%-- 
    Document   : statusList
    Created on : 2012-6-5, 1:07:35
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
                   
                   var status_id = $(this).attr("id");
                   // 状态所在的列表项
                   var status_li = $(this).parent().parent(".panel");
                   $.post("AddStatusComment!addComment.action",
                           {
                               status_id: parseInt(status_id),
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
            <div id="statusList"></div>
                
            <style>
                .status_li {list-style-type:none;}
            </style>
                
            <s:iterator value="#request.statusList" id="status">
                <li class="status_li">
                    <div style="display: inline">
                        <a class="personLink" href="PersonalPage.action?uid=<s:property value='#status.userinfo.uid'/>">
                            <img src="<s:property value='#status.userinfo.avatar'/>" width="50" height="50" >
                        </a>
                    </div>
                    <div style="display: inline">
                        <a class="personLink" href="PersonalPage.action?uid=<s:property value='#status.userinfo.uid'/>">
                            <s:property value="#status.userinfo.name"/>
                        </a>
                            :<s:property value="#status.statusMessage"/>
                    </div> <br/>
                    <div>
                        <s:date name="#status.time" format="yyyy-MM-dd HH:mm:ss"/>
                        <a class="btn-slide" href="#">评论</a>
                    </div>  
                    
                    <!--评论panel-->
                    <div class="panel">
                        <div class="commentForm">
                            <input type="text" size="43" style="display: inline"></input>
                                <a class="commentCommit" 
                                   id="<s:property value='#status.statusId'/>" 
                                   href="#nogo">
                                    提交
                                </a>
                        </div>
                        <!--评论-->
                        <s:action name="GetStatusComments" executeResult="true">
                            <s:param name="statusId" value="#status.statusId" />
                        </s:action>
                        
                        <!--end of 评论panel-->
                    </div>
                    
                    
                    <hr size="2"/>
                </li>
            </s:iterator>
        </ul>
    </body>
</html>
