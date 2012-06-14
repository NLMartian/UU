<%-- 
    Document   : friendList
    Created on : 2012-6-4, 21:50:54
    Author     : 甲骨文
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

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
            
            
            
            var selectId = 0;
            
        </script>
        <style tyep="text/css">


            #friendListContent{
                margin-left:auto;  

                margin-right:auto;  

                width: 180px;
            }
            #listTitle{

            }
            .personLink:link,.personLink:visited{text-decoration:none;}
            
            .friend_li {list-style-type:none;}
        </style>
    </head>



    <body >

        
        <div id="friendListContent" class="ui-widget-content">
            <a href="/UU/GetFriend!goFriendPage.action?uid=${requsetScope.uid}" class="friend_li">
                <h3 id="listTitle" class="ui-widget-header">好友列表</h3>
            </a>
            <ul>
                <c:forEach var="user" items="${requestScope.pageList}" >
                     <li class="friend_li">
                        <div style="display: inline">
                            <a class="personLink" href="/UU/PersonalPage.action?uid=${user.uid}" class="personLink:link">
                                <img src="${user.avatar}" width="50">
                            </a>
                        </div>
                                    
                        <div style="display: inline">
                            <a class="personLink" href="/UU/PersonalPage.action?uid=${user.uid}" class="personLink:link">
                                ${user.name}
                            </a>
                        </div>
                    </li>
                </c:forEach>
                            
            </ul>
        </div>
                    
    </div>
            
     </body>
</html>