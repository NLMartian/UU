<%-- 
    Document   : searchResultList
    Created on : 2012-5-31, 13:45:33
    Author     : 甲骨文
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" import="org.uu.dao.model.Userinfo" import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <ul>
            <c:forEach var="user" items="${sessionScope.searchList}" >
                <li>
                   ${user.name}
                    ${user.email}
                    
                </li>
            </c:forEach>
            <li>${sb} ${sessionScope.searchList.get(0).getEmail()}</li>
            

        </ul>
    </body>
</html>
