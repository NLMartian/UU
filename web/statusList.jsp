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
                    <p><input type="text"></input></p>
                    <hr/>
                </li>
            </c:forEach>
        </ul>
    </body>
</html>
