<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <body>
       This is my JSP page. <br>
    <h1><s:property value="imageFileName"/> </h1>
  	<img alt="no such image" src="images/<s:property value='imageFile'/>">
  </body>
</html>
