<%-- 
    Document   : peronalpage
    Created on : 2012-5-11, 2:44:39
    Author     : Administrator
--%>

<%@ page contentType="text/html" language = "java" import= "java.util.*"  pageEncoding = "UTF-8"%> 
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix ="sj" uri="/struts-jquery-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<%--  引入Struts  jquery 插件标签库 --%>
<sj:head jqueryui="true" jquerytheme="eggplant"/>
<style type="text/css">
#apDiv1 {
	position:absolute;
	width:1136px;
	height:124px;
	z-index:2;
	left: 13px;
	top: 8px;
}
#apDiv2 {
	position:absolute;
	width:259px;
	height:588px;
	z-index:1;
	left: 14px;
	top: 23px;
}
#apDiv3 {
	position:absolute;
	width:313px;
	height:248px;
	z-index:1;
	left: 834px;
	top: 40px;
}
#apDiv4 {
	position:absolute;
	width:559px;
	height:34px;
	z-index:3;
	left: 272px;
	top: 168px;
}
#apDiv5 {
	position:absolute;
	width:551px;
	height:45px;
	z-index:4;
	left: 284px;
	top: 187px;
	font-size: 18px;
	font-weight: bold;
	font-family: Arial, Helvetica, sans-serif;
	color: #333;
}
#apDiv6 {
	position:absolute;
	width:128px;
	height:129px;
	z-index:1;
	left: 81px;
	top: 21px;
}
#apDiv7 {
	position:absolute;
	width:557px;
	height:388px;
	z-index:5;
	left: 273px;
	top: 224px;
}
</style>
<script src="resource/SpryAssets/SpryAccordion.js" type="text/javascript"></script>
<link href="resource/SpryAssets/SpryAccordion.css" rel="stylesheet" type="text/css" />
<style type="text/css">
#apDiv8 {
	position:absolute;
	width:314px;
	height:241px;
	z-index:6;
	left: 833px;
	top: 274px;
}
#apDiv9 {
	position:absolute;
	width:252px;
	height:129px;
	z-index:7;
	left: -261px;
	top: -16px;
}
#apDiv10 {
	position:absolute;
	width:141px;
	height:66px;
	z-index:7;
	left: 64px;
	top: 238px;
	background-color: #999;
}
#apDiv11 {
	position:absolute;
	width:105px;
	height:73px;
	z-index:8;
	left: 138px;
	top: 316px;
}
</style>
</head>

<body>
<div id="apDiv1"></div>
<div id="apDiv2"><img src="resource/image002.png" width="258" height="588" /></div>
<div id="apDiv3"><img src="resource/image005.png" width="313" height="255" /></div>
<div id="apDiv4"><img src="resource/head.png" width="558" height="70" /></div>
<div id="apDiv5"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;日&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;志&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;状&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;态&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;评&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;论&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;相&nbsp;&nbsp;&nbsp;&nbsp;册&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>
<div id="apDiv7">
  <div id="Accordion1" class="Accordion" tabindex="0">
    <div class="AccordionPanel">
      <div class="AccordionPanelTab">日志动态</div>
      <div class="AccordionPanelContent">内容预览1</div>
    </div>
    <div class="AccordionPanel">
      <div class="AccordionPanelTab">新状态</div>
      <div class="AccordionPanelContent">内容预览2</div>
      <div id="apDiv9"><img src="resource/内容框.png" width="251" height="131" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</div>
    </div>
    <div class="AccordionPanel">
      <div class="AccordionPanelTab">相册动态</div>
      <div class="AccordionPanelContent">内容预览3</div>
    </div>
  </div>
</div>
<div id="apDiv8">
  <div id="Accordion2" class="Accordion" tabindex="0">
    <div class="AccordionPanel">
      <div class="AccordionPanelTab">最新评论</div>
      <div class="AccordionPanelContent">评论内容</div>
    </div>
  </div>
</div>



<form id="statusForm" method="post" action="FirstAjaxAction.action">
<div id="apDiv10">
    <s:url id = "first" value= "FirstAjaxAction.action"/>
    
  <textarea name="textarea" id="textarea" cols="17" rows="4">请点此直接输入状态</textarea>
</div>
</form>
    
<div id="apDiv11"> 
    <sj:a id="ajaxlink" formIds="statusForm" target="apDiv10" cssClass="ajax_link" button="true">
            发状态
    </sj:a>
</div>


<img src="resource/image001.png" width="1137" height="195" />
<script type="text/javascript">
var Accordion1 = new Spry.Widget.Accordion("Accordion1");
var Accordion2 = new Spry.Widget.Accordion("Accordion2");
</script>
</body>
</html>

