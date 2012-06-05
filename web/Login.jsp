<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Login</title>
<style type="text/css">
body {
	background-repeat: repeat-y;
	font-size: 18px;
	font-family: "Arial Black", Gadget, sans-serif;
	font-weight: normal;
	font-variant: normal;
	color: #F60;
	bottom: auto;
	text-align: left;
}
#apDiv1 {
	position:absolute;
	width:509px;
	height:417px;
	z-index:1;
	left: 136px;
	top: 42px;
	text-align: left;
}
#apDiv2 {
	position:absolute;
	width:869px;
	height:571px;
	z-index:2;
	left: 138px;
	top: 43px;
	font-weight: bold;
	color: #FC0;
}
</style>
</head>
    <script language="javascript">
        function fsubmit(obj,targetElement)
        {
            obj.submit();
        }
    </script>
<body background="resource/5252423_173600895562_2.png" leftmargin="0">
<div id="apDiv1"><img src="resource/login_div.png" width="870" height="570" /></div>
<div id="apDiv2">
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p>&nbsp;</p>
  <p><img src="resource/logo.png" width="423" height="67" /></p>
  <form id="login_form" name="login_form" method="post" action="Login.action">
  <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <label for="textfield">用户名：</label>
    <input name="username" type="text" size="20" />
  </p>
  <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <label for="textfield2">密   码：&nbsp;&nbsp;&nbsp;&nbsp;</label>
    <input name="password" type="password"  size="20" />
  </p>
  <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <img src="resource/login3.png" width="165" height="59" 
       onclick="javascript:fsubmit(document.login_form);"
       style="cursor: hand;"                                                             
       /></p>
  <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="register.jsp"><img src="resource/login2.png" border="0" width="291" height="59" /></p>
  </form>
</div>
</body>
</html>

