<%-- 
    Document   : userCard
    Created on : 2012-6-9, 10:49:01
    Author     : 甲骨文
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
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
            .personLink:link,.personLink:visited{text-decoration:none;}
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
                         src="${requestScope.user.avatar}" alt="头像" width="50" height="50">
                </div>
                <div class="username"><a class="personLink" href="#">${requestScope.user.name}</a></div>
            </div>

            <div class="status">
                <div class="status_title">最近状态</div>
                <div class="status_content">
                    <p><s:property value="#request.statusContent"/></p><p>${requsetScope.statusContent}</p>
                </div>
            </div>
        </div>

        <hr>

        <div class="detail">
            <table id="detail_table">
                <tr>
                    <td width="76" height="31">
                        性别
                    </td>
                    <td width="144">
                <s:if test="#request.user.sex">
                    男
                </s:if>
                <s:else>
                    女
                </s:else>
                </td>
                </tr>
                <tr>
                    <td height="33">生日</td>
                    <td>${requsetScope.user.birthday}<s:date name="#request.user.birthday" format="yyyy-MM-dd"/></td>
                </tr>
                <tr>
                    <td height="35">年级</td>
                    <td>${requestScope.user.className}</td>
                </tr>
            </table>
                
                  

        </div>

    </body>
</html>
