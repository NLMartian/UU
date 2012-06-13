<%-- 
    Document   : newStatusComment
    Created on : 2012-6-13, 2:22:28
    Author     : 甲骨文
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>new Comment Page</title>
        <style type="text/css">
            .personLink:link,.personLink:visited{text-decoration:none;}
        </style>
    </head>
    <body>
        <div style="display: inline">
            <a class="personLink" href="PersonalPage.action?uid=${comment.userinfo.uid}">
                <img src="${comment.userinfo.avatar}" width="30" height="30" >
            </a>
        </div>
        <div style="display: inline">
            <a class="personLink" href="PersonalPage.action?uid=${comment.userinfo.uid}/>">
                ${comment.userinfo.name}
            </a>
            :${comment.content} 
            <fmt:formatDate value="${comment.time}" pattern="yyyy-MM-dd HH:mm:ss" var="time"/>
            <c:out value="${time}"></c:out>
        </div>

        <hr size="1"/>
    </body>
</html>
