<%-- 
    Document   : infocenter
    Created on : 2012-6-1, 15:32:22
    Author     : 甲骨文
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" import="org.uu.dao.model.Userinfo" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UU-${CurrUser.name}</title>
    </head>
    <body>
        <h1>个人中心!</h1>
        <h2> ${CurrUser.name}，你好！</h2>
    </body>
</html>
