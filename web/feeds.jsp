<%-- 
    Document   : feeds
    Created on : 2012-6-11, 19:21:13
    Author     : 甲骨文
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/style.css" /> 
        <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
        <script type="text/javascript" src="js/jquery-ui-1.8.20.custom.min.js"></script> 
        <link type="text/css" href="css/ui-lightness/jquery-ui-custom.css" rel="Stylesheet" />
        <script type="text/javascript" src="js/jquery.paginate.js"></script>
        <title>feed Page</title>
        
        <script type="text/javascript"> 
            $(function(){
               // 分页组件
                $("#picpagenate").paginate({ 
                    count         : 100, 
                    start         : 1, 
                    display     : 5, 
                   border                    : true, 
                    border_color            : '#BEF8B8', 
                    text_color              : '#79B5E3', 
                    background_color        : '#FFB344',     
                    border_hover_color        : '#68BA64', 
                    text_hover_color          : '#2573AF', 
                    background_hover_color    : '#FFFFFF',  
                    images                    : false, 
                    mouse                    : 'press',  
                    onChange                 : function(page){
                                                    $.post(
                                                       "GetPagedFeeds.action",
                                                       {
                                                           start: page * 25,
                                                           length: 25
                                                       },
                                                       function(data, textStatus){
                                                           if(textStatus == "success") {  
                                                                $("#picpageContent").empty();
                                                                $("#picpageContent").append(data);
                                                           }
                                                       }
                                                    );
                                                } 
                    }); 
                    
                    $.post(
                         "GetPagedFeeds.action",
                        {
                            start: 0,
                            length: 25
                        },
                        function(data, textStatus){
                            if(textStatus == "success") {  
                                $("#picpageContent").empty();
                                $("#picpageContent").append(data);
                            }
                        }
                    );
            });
        </script>
        
        <style type="text/css">
            #picpagenate{
                margin-left:auto;  
 
                margin-right:auto;  

                width:200px; 
            }
        </style>
    </head>
    <body>
        <div class="picList"> 
            <div id="picpageContent"> 
                
            </div> 
            <div id="picpagenate"></div> 
        </div>  
    </body>
</html>
