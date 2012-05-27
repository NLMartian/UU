<%-- 
    Document   : welcome
    Created on : 2012-5-7, 22:54:26
    Author     : 甲骨文
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix ="s" uri="/struts-tags" %>
<%@taglib prefix ="sj" uri="/struts-jquery-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <sj:head jqueryui="true" jquerytheme="eggplant" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>      
    </head>
    <body>
        <s:property value= "echo"/>
        <h1>Welcome!</h1>
        
        <div  id = "result"  class= "result"></div>
        <s:url id = "first" value= "FirstAjaxAction.action"/>

        <form id="statusForm" method="post" action="FirstAjaxAction.action">
        <div id="apDiv10">
        <textarea name="textarea" id="textarea" cols="17" rows="4">请点此直接输入状态</textarea>
        </div>
        </form>
        <sj:a id="ajaxlink" formIds="statusForm" target="result" cssClass="ajax_link" button="true">
            发状态
        </sj:a>
    
    </body>
</html>
