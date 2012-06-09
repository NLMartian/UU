<%-- 
    Document   : list_test
    Created on : 2012-5-30, 11:21:24
    Author     : 甲骨文
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix ="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <sj:head jqueryui="true" jquerytheme="eggplant" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>分页 Page</title>
        <link rel="stylesheet" type="text/css" href="css/style.css" /> 
        <script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
        <script type="text/javascript" src="js/jquery-ui-1.8.20.custom.min.js"></script> 
        <link type="text/css" href="css/ui-lightness/jquery-ui-custom.css" rel="Stylesheet" />
        <script type="text/javascript" src="js/jquery.paginate.js"></script>
        <script type="text/javascript"> 
            $(function(){ 
                // 性别选择radio
                $( "#sex_radio" ).buttonset();
                
                // 生日选择
                $( "#birthday" ).datepicker(
                    {
                        dateFormat: "yy-mm-dd",
			changeMonth: true,
			changeYear: true
                    }
                );
                
                // 分页组件
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
        
        <style type="text/css">
                #searchFriendLink {padding: .4em 1em .4em 20px;text-decoration: none;position: relative;}
                #searchFriendLink span.ui-icon {margin: 0 5px 0 0;position: absolute;left: .2em;top: 50%;margin-top: -8px;}
        </style>

        
    </head>
    <body>
        <h1>搜索</h1>
        
        <div id="search">   
            <form id="keyWords">
                <p>
                    <s:textfield  label="姓名" id="name" name="name"/>
                </p>
                <div id="sex_radio">
                    <span>性别:</span>
                    <input type="radio" id="male" name="sex" /><label for="male">男</label>
                    <input type="radio" id="female" name="sex" checked="checked" /><label for="female">女</label>
                        <input type="radio" id="undefined" name="sex" /><label for="undefined">不限</label>
                </div>
                <p>
                    <s:textfield  label="生日" id="birthday" name="birthday"/>
                </p>
                <p>
                    <s:textfield  label="Email" id="email" name="email"/>
                </p>
                <p>
                    <a href="#" id="searchFriendLink" class="ui-state-default ui-corner-all">
                       <span class="ui-icon ui-icon-search"></span>
                       搜索
                    </a>
                </P>
            </form> 
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
