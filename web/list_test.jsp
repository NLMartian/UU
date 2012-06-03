<%-- 
    Document   : list_test
    Created on : 2012-5-30, 11:21:24
    Author     : 甲骨文
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix ="s" uri="/struts-tags" %>
<%@taglib prefix ="sj" uri="/struts-jquery-tags" %>
<%@taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <sj:head jqueryui="true" jquerytheme="eggplant" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>分页 Page</title>
        <link rel="stylesheet" type="text/css" href="css/style.css" /> 
        <script type="text/javascript" src="js/jquery.js"></script> 
        <script type="text/javascript" src="js/jquery.paginate.js"></script> 
        <script type="text/javascript"> 
            $(function(){ 
                $("#demo").paginate({ 
                    count         : 100, 
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
                                                       "SearchUser.action",
                                                       function(data, textStatus){
                                                           if(textStatus == "success") {                                                               
                                                                $("#resultList").append(data);
                                                           }
                                                       }
                                                    );
                                                } 
                    }); 
                }); 
        </script> 
        
        <script type="text/javascript">
            $(document).ready( function() {
                $("#searchFriendLink").click(function(){
                    $("#resultList").empty();
                    postSearchData();
                }); 
                
                //搜索框输入回车
                $("#searchKeyWord").keypress(function(e){
                    if (e.which == 13) {
                         postSearchData();
                    } 
                });
                
                
            }); 
            
            function postSearchData(){
                $.post(
                        "SearchUser.action",
                        function(data, textStatus){
                            if(textStatus == "success") {                                                               
                                $("#resultList").append(data);
                            }
                        }
                );
            }
            
        </script> 
        
    </head>
    <body>
        <h1>搜索</h1>
        
        <div id="search">     
                <s:textfield  id="searchKeyWord" name="keyWords"/>
                <input type="button" id="searchFriendLink" value="搜索一下" />
        </div>
        
        <div class="demo"> 
            <div id="pagetxt"> 
                <h4>搜索结果</h4>
                <ul id="resultList">
                    
                </ul>
            </div> 
            <div id="demo"></div> 
        </div>  
       
    </body>
</html>
