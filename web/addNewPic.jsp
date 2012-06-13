<%-- 
    Document   : addNewPic
    Created on : 2012-6-13, 17:45:44
    Author     : 甲骨文
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
        <script src="./jcrop/jquery.min.js"></script> 
		<script src="./jcrop/jquery.Jcrop.js"></script> 
		<link rel="stylesheet" href="./jcrop/jquery.Jcrop.css" type="text/css" /> 
		<link rel="stylesheet" href="./jcrop/demos.css" type="text/css" /> 
                <title>Upload photo</title>
  </head>
  <body>
  	<!-- 此处需将表单enctype设置为  multipart/form-date  -->
    <form action="AddNewPic.action" enctype="multipart/form-data" method="post">
    	上传图片<input type="file" name="image"/>
        <input type="text" name="description"/>
    	<input type="submit" value="submit"/>
    </form>
    
  </body>
</html>
