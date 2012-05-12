<%-- 
    Document   : peronalpage
    Created on : 2012-5-11, 2:44:39
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>personalhome</title>
<style type="text/css">
#apDiv1 {
	position:absolute;
	width:1136px;
	height:124px;
	z-index:2;
	left: 9px;
	top: 15px;
}
#apDiv2 {
	position:absolute;
	width:260px;
	height:606px;
	z-index:1;
	left: 11px;
	top: 27px;
}
#apDiv3 {
	position:absolute;
	width:313px;
	height:248px;
	z-index:1;
	left: 833px;
	top: 37px;
}
#apDiv4 {
	position:absolute;
	width:559px;
	height:34px;
	z-index:3;
	left: 273px;
	top: 170px;
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
	top: 243px;
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
	left: 834px;
	top: 296px;
}
</style>
</head>

<body>
<div id="apDiv1"><img src="resource/image001.png" width="1137" height="195" /></div>
<div id="apDiv2"><img src="resource/image002.png" width="259" height="604" /></div>
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
<script type="text/javascript">
var Accordion1 = new Spry.Widget.Accordion("Accordion1");
var Accordion2 = new Spry.Widget.Accordion("Accordion2");
</script>
</body>
</html>

