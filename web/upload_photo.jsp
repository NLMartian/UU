<%-- 
    Document   : upload_photo
    Created on : 2012-6-9, 12:51:22
    Author     : Administrator
--%>

<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
    <form action="UploadImage.action" enctype="multipart/form-data" method="post">
    	<input type="file" name="image"/>
    	<input type="submit" value="submit"/>
    </form>
    <s:if test="imageFileName!=null">
      <script language="Javascript"> 
 
			// Remember to invoke within jQuery(window).load(...)
			// If you don't, Jcrop may not initialize properly
			jQuery(window).load(function(){
 
				jQuery('#cropbox').Jcrop({
					onChange: showPreview,
					onSelect: showPreview,
					aspectRatio: 1,
                                        boxWidth: 300
				});
 
			});
 
			// Our simple event handler, called from onChange and onSelect
			// event handlers, as per the Jcrop invocation above
			function showPreview(coords)
			{
				if (parseInt(coords.w) > 0)
				{
					var rx = 100 / coords.w;
					var ry = 100 / coords.h;
 
					jQuery('#preview').css({
						width: Math.round(rx * <s:property value='imageWidth'/>) + 'px',
						height: Math.round(ry * <s:property value='imageHeigth'/>) + 'px',
						marginLeft: '-' + Math.round(rx * coords.x) + 'px',
						marginTop: '-' + Math.round(ry * coords.y) + 'px'
					});
					jQuery('#x1').val(coords.x);
					jQuery('#y1').val(coords.y);
					jQuery('#x2').val(coords.x2);
					jQuery('#y2').val(coords.y2);
					jQuery('#w').val(coords.w);
					jQuery('#h').val(coords.h);
				}
			}
 
		</script> 
      <img  src="images/<s:property value='imageFileName'/>" id="cropbox"/> 
		
		<div style="width:100px;height:100px;overflow:hidden;"> 
			<img  src="images/<s:property value='imageFileName'/>" id="preview" /> 
		</div> 
		<form method="post" action="CropImage.action"> 
		    <input type="hidden" name="imageFile" value="<s:property value='imageFileName'/>"/> 
			<label>X1 <input type="text" size="4" id="x1" name="x1" /></label> 
			<label>Y1 <input type="text" size="4" id="y1" name="y1" /></label> 
			<label>X2 <input type="text" size="4" id="x2" name="x2" /></label> 
			<label>Y2 <input type="text" size="4" id="y2" name="y2" /></label> 
			<label>W <input type="text" size="4" id="w" name="width" /></label> 
			<label>H <input type="text" size="4" id="h" name="height" /></label>
			<input type="submit" value="upload" /> 
		</form> 
    </s:if>
  </body>
</html>

