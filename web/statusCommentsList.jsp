<%-- 
    Document   : statusCommentsList
    Created on : 2012-6-7, 22:43:10
    Author     : 甲骨文
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        
        <c:if test="${requestScope.commentList!=null}">
            <c:forEach var="comment" items="${requestScope.commentList}" >
                <p>
                    <span>${comment.userinfo.name}:${comment.content}</span>
                    <fmt:formatDate value="${comment.time}" pattern="yyyy-MM-dd HH:mm:ss" var="time"/>	
                    <span><c:out value="${time}"></c:out></span>
                </p>
                <hr size="1"/>
            </c:forEach>
        </c:if>
        
    </body>
</html>
