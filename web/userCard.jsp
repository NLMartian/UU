<%-- 
    Document   : userCard
    Created on : 2012-6-9, 10:49:01
    Author     : 甲骨文
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title></title>
    <style type="text/css">
<!--
.title {
	font-size: medium;
	color: #F90;
	position: relative;
	font-weight: bold;
	width: 80px;
	margin-right: auto;
	margin-left: auto;
	padding-top: 0px;
	padding-bottom: 0px;
	padding-left: 10px;
	margin-bottom: 10px;
	margin-top: 10px;
}
.avatar {
	background-color: #FFF;
	cursor: wait;
	width: auto;
	margin-right: auto;
	margin-left: auto;
	margin-top: 10px;
	margin-bottom: 10px;
}
.pic_and_name {
	float: left;
	width: 33%;
	margin-top: auto;
	margin-right: auto;
	margin-bottom: auto;
	margin-left: auto;
}
.brief {
	width: 14.6em;
	margin-right: auto;
	margin-left: auto;
	height: 160px;
}
.detail {
	background-color: #CCC;
	margin-top: 10px;
	margin-right: auto;
	margin-bottom: 10px;
	margin-left: auto;
	width: 14em;
}
.detail_table {
	width: 14em;
}
.status {
	float:right;
	display: inline;
	height: 140px;
	padding-top: 10px;
	padding-bottom: 10px;
	width: 66%;
}
.status_content {
	display: block;
	word-break:break-all;
	;
	height: 115px;
	margin-top: 10px;
	margin-bottom: 10px;
	color: #0CF;
}
.status_title {
	background-color: #F90;
	color: #FFF;
}
.username {
	width: 60px;
	margin-right: auto;
	margin-left: auto;
}
-->
    </style>
    </head>
    <body>
        <div class="title">个人信息</div>
    
        <hr>
		
    <div class="brief">
          <!--头像&姓名-->
      <div class="pic_and_name">
          <div class="avatar" align="center">
            <img name="avatar" 
              src="file:///C|/Users/甲骨文/Desktop/LOGO.png" width="50" 
              height="50" alt="头像">
</div>
       	  <div class="username">姓名</div>
      </div>
                
      <div class="status">
                    <div class="status_title">最近状态</div>
                    <div class="status_content">
                    	大家好，我是一条测试状态，啊哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈~
                    </div>
      </div>
      </div>
        
        <hr>
		
        <div class="detail">
    <table id="detail_table">
              <tr>
                <td width="76" height="31">性别</td>
                <td width="144">&nbsp;</td>
              </tr>
              <tr>
                <td height="33">生日</td>
                <td>&nbsp;</td>
              </tr>
              <tr>
                <td height="35">年级</td>
                <td>&nbsp;</td>
              </tr>
          </table>

   	</div>
        
        
        
        
</body>
</html>
