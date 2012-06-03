<%-- 
    Document   : searchpage
    Created on : 2012-5-28, 21:50:10
    Author     : 甲骨文
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix ="sj" uri="/struts-jquery-tags" %>
<%@taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>

<sj:head jqueryui="true" jquerytheme="eggplant"/>

<link rel="stylesheet" type="text/css" media="screen" href="css/smoothness/jquery-ui-1.8.20.custom.css" />
<link rel="stylesheet" type="text/css" media="screen" href="css/ui.jqgrid.css" />
 
<script src="js/jquery-1.7.2.min.js" type="text/javascript"></script>
<script src="js/i18n/grid.locale-en.js" type="text/javascript"></script>
<script src="js/jquery.jqGrid.min.js" type="text/javascript"></script>

<style type="text/css">
#apDiv1 {
	position:absolute;
	width:265px;
	height:114px;
	z-index:1;
	left: 40%;
	top: 30%;
}
body {
	background-image: url(resource/BG.png);
	background-repeat: repeat;
}
#apDiv2 {
	position:absolute;
	width:182px;
	height:56px;
	z-index:2;
	left: 764px;
	top: 233px;
}
#apDiv3 {
	position:absolute;
	width:212px;
	height:58px;
	z-index:2;
	left: 25%;
	top: 38%;
}
#apDiv4 {
	position:absolute;
	width:150px;
	height:87px;
	z-index:2;
	left: 492px;
	top: 446px;
}
#apDiv5 {
	position:absolute;
	width:443px;
	height:234px;
	z-index:2;
	left: 38px;
	top: 90px;
}
#apDiv6 {
	position:absolute;
	width:541px;
	height:222px;
	z-index:3;
	left: 35%;
	top: 50%;
}
#apDiv7 {
	position:absolute;
	width:457px;
	height:276px;
	z-index:1;
	left: -200px;
	top: 172px;
}
#apDiv8 {
	position:absolute;
	width:200px;
	height:115px;
	z-index:1;
	left: 104px;
	top: 6px;
}
#apDiv9 {
	position:absolute;
	width:216px;
	height:32px;
	z-index:1;
	left: 16px;
	top: 11px;
}
#apDiv10 {
	position:absolute;
	width:232px;
	height:206px;
	z-index:2;
	left: 256px;
	top: 9px;
}
</style>
</head>

<body>
    
 
<div id="apDiv1">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    
  <input name="searchContent" type="text" value="" />

 <sj:a id="ajaxlink" formId="searchForm" target="gridtable" cssClass="ajax_link" button="true">
            搜索
 </sj:a>
                
  <p>    &nbsp;<img src="resource/login2.png" width="225" height="59" /></p>
</div>
<div id="apDiv6">
  <div id="apDiv9"><img src="resource/result.png" width="217" height="26" /></div>
  <div id="apDiv10">
         
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
  </div>
</div>
</body>
</html>
