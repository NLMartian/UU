<%-- 
    Document   : welcome
    Created on : 2012-5-7, 22:54:26
    Author     : 甲骨文
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix ="s" uri="/struts-tags" %>
<%@taglib prefix ="sj" uri="/struts-jquery-tags" %>
<%@taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>

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
        <s:url id = "first" value= "/welcome.jsp"/>

        <form id="statusForm" method="post" action="FirstAjaxAction.action">
        <div id="apDiv10">
        <textarea name="textarea" id="textarea" cols="17" rows="4">请点此直接输入状态</textarea>
        </div>
        </form>
        <sj:a id="ajaxlink" formIds="statusForm" targets="result" cssClass="ajax_link" 
              button="true" >
            发状态
        </sj:a>
    
            
         <!--表格-->
        <s:url id="remoteurl" action="Searchp"/>
        <sjg:grid
            id="gridtable"
            caption="Customer Examples"
            dataType="json"
            href="%{remoteurl}"
            pager="true"
            gridModel="gridModel"
            rowList="10,15,20"
            rowNum="15"
            rownumbers="true">

            <sjg:gridColumn name="name" index="name" title="名字" sortable="true"/>
            <sjg:gridColumn name="sex" index="sex" title="生日" sortable="false"/>
        </sjg:grid>      
           
    </body>
</html>
