<%-- 
    Document   : searchResultList
    Created on : 2012-5-31, 13:45:33
    Author     : 甲骨文
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" import="org.uu.dao.model.Userinfo" import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix ="sj" uri="/struts-jquery-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <sj:head jqueryui="true" jquerytheme="eggplant" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
        <script type="text/javascript" src="js/jquery-ui-1.8.20.custom.min.js"></script> 
        <link type="text/css" href="css/ui-lightness/jquery-ui-custom.css" rel="Stylesheet" />
        
        <script type="text/javascript">
            
            $.fx.speeds._default = 500;
            $(function() {
                    $( "#dialog" ).dialog({
                            autoOpen: false,
                            resizable: false,
                            show: "blind",
                            hide: "explode",
                            modal: true,
                            buttons: {
						"确定": function() {
                                                        addFriend(selectId);
							$(this).dialog("close");
						},
						"取消": function() {
							$(this).dialog("close");
						}
					}

                    });

                    $( "[href='#']" ).click(function() {
                         $( "#dialog" ).dialog( "open" );
                         
                         selectId = $(this).attr("id");
                         return false;
                            
                    });
            });
            
            function addFriend(uid){
                $.post(
                        "AddFriend.action",
                        {uid: uid},
                        function(data, textStatus){
                            if(textStatus == "success") {                                                               
                                $("#resultList").append(data);
                            }
                        }
                );
            }
            
            var selectId = 0;
            
        </script>
    </head>
    <body>
        <div id="dialog" title="确认">
            <p>你确认要加他为好友？</p>
        </div>
        
        <ul>
            <c:forEach var="user" items="${sessionScope.searchList}" >
                <li>
                    
                    <s:a url="PerrsonalPage.action?uid=${user.uid}">${user.name}</s:a>
                    
                   
                    <a id="${user.uid}" href="#">加为好友</a>
                    生日：${user.birthday}
                    <c:out value="邮箱：${user.email}"></c:out>
                </li>
            </c:forEach>

        </ul>
        
        
            
            <div id="result"></div>
    </body>
</html>
