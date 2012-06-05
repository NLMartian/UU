<%-- 
    Document   : statusList
    Created on : 2012-6-5, 1:07:35
    Author     : 甲骨文
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
                $("[class='commentCommit']").click(function(){
                   var comment = $(this).prev("input").attr("value");
                   var status_id = $(this).attr("id");
                   
                   $.post("AddStatusComment.action",
                           {
                               status_id: status_id,
                               content: comment
                           },
                           // 提交以后的回调函数
                           function(data, textStatus){
                                   $("#statusList").append("<p>" + textStatus + "</p>");
                            }
                    );
                        return true;
                }); 
                
            }); 
            
             
        </script>
    </head>
    <body>
        <p>状态列表</p>
        <ul>
            <div id="statusList"></div>
            
            <c:forEach var="status" items="${requestScope.statusList}" >
                <li>
                    <p>${status.userinfo.name}:</p>
                    <p>${status.statusMessage}</p> <br/>
                    <p>${status.time}</p>
                    <div class="commentForm">
                            <input type="text"></input>
                            <a class="commentCommit" id="${status.statusId}" href="#">评论</a>
                    </div>
                    <hr/>
                </li>
            </c:forEach>
        </ul>
    </body>
</html>
