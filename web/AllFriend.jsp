<%-- 
    Document   : AllFriend
    Created on : 2012-6-4, 13:38:06
    Author     : 甲骨文
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UU-好友</title>
        <link rel="stylesheet" type="text/css" href="css/style.css" /> 
        <script type="text/javascript" src="js/jquery.js"></script> 
        <script type="text/javascript" src="js/jquery.paginate.js"></script> 
        <script type="text/javascript"> 
            $(function(){ 
                
                $("#paginate").paginate({ 
                    count         : Number(${requestScope.count})/15 + 5, 
                    start         : 1, 
                    display     : 5, 
                    border                    : true, 
                    border_color            : '#BEF8B8', 
                    text_color              : '#79B5E3', 
                    background_color        : '#E3F2E1',     
                    border_hover_color        : '#68BA64', 
                    text_hover_color          : '#2573AF', 
                    background_hover_color    : '#CAE6C6',  
                    images                    : true, 
                    mouse                    : 'press', 
                    onChange                 : function(page){
                                                    $("#resultList").empty();
                                                    
                                                    $.post(
                                                       "GetFriend.action",
                                                       {
                                                           uid: ${requestScope.uid},
                                                           start: (page - 1) * 15,
                                                           length: 15
                                                       },
                                                       function(data, textStatus){
                                                           if(textStatus == "success") {                                                               
                                                                $("#resultList").append(data);
                                                           }
                                                       }
                                                    );
                                                } 
                    }); 
                }); 
                
                $(document).ready( function() {
                    $.post(
                        "GetFriend.action",
                        {
                            uid: ${requestScope.uid},
                            start: 0,
                            length: 15
                        },
                        function(data, textStatus){
                            if(textStatus == "success") {                                                               
                                $("#resultList").append(data);
                            }
                        }
                    );
                }); 
                
        </script>
    </head>
    <body>
        <ul>
            <div id ="resultList"></div>
        </ul>
        <div id="paginate"></div>
    </body>
</html>
