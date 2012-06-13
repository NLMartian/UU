<%-- 
    Document   : status_test
    Created on : 2012-5-11, 8:47:26
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>你在想什么？</h3>
        <form name="statusone" method="POST" action="Status.action">
            <textarea name="status_content" rows="4" cols="60">
            </textarea>
            <input type="submit" value="发布" name="submit" />
        </form>
    </body>
</html>
