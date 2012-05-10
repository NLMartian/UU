<%-- 
    Document   : Login
    Created on : 2012-5-7, 22:03:29
    Author     : 甲骨文
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form action="login" namespace="/home">  
            <s:textfield name="username" label="username" /> <br> 
            <s:password name="password" label="password" /><br>  
            <s:submit value="submit" />  
        </s:form> 
    </body>
</html>
