<%-- 
    Document   : realregister
    Created on : 2012-5-11, 0:41:45
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>UU-register</title>
<style type="text/css">
body {
	color: #F60;
}
#apDiv1 {
	position:absolute;
	width:469px;
	height:609px;
	z-index:1;
	left: 332px;
	top: 22px;
}
#apDiv2 {
	position:absolute;
	width:350px;
	height:329px;
	z-index:2;
	left: 395px;
	top: 147px;
	color: #30C;
	background-color: #CCC;
}
#apDiv3 {
	position:absolute;
	width:123px;
	height:31px;
	z-index:3;
	left: 216px;
	top: 274px;
}
</style>
</head>
    
    <script language="javascript">
        function fsubmit(obj,targetElement)
        {
            obj.submit();
        }
    </script>

<body background="resource/5252423_173600895562_2.png">
<div id="apDiv1"><img src="resource/WantedPoster.png" width="470" height="611" /></div>
<div id="apDiv2">
  <form id="register_form" name="register_form" method="post" action="Register.action">
  <p>
    <label for="textfield2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;注册姓名：&nbsp;&nbsp;</label>
    <input type="text" name="login_name" id="textfield2" />
  </p>
  <p>
    <label for="textfield3">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;密&nbsp;&nbsp;&nbsp;码：</label>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <input type="password" name="password" id="textfield3" />
  </p>
  <p>
    <label for="textfield4">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;确认密码：</label>
  &nbsp;
  <input type="password" name="password2" id="textfield4" />
  </p>
  <p>
    <label for="textfield5">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 真实姓名：</label>
    &nbsp;
    <input type="text" name="name" id="textfield5" />
  </p>
  <p>
    <label for="textfield6">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;邮&nbsp;&nbsp;&nbsp;箱：</label>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  <input type="text" name="email" id="textfield6" />
  </p>
  <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;性别：
    <label>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input name="sex" type="radio" id="RadioGroup1_0" value="0" checked="checked" />
      男</label>
    <label>
      <input type="radio" name="sex" value="1" id="RadioGroup1_1" />
      女</label>
  </p>
  <p>
    <label for="select"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
    生日：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <select name="birthday_yyyy" size="1" id="select2">
      <option value="1912">1912</option>
      <option value="1913">1913</option>
      <option value="1914">1914</option>
      <option value="1915">1915</option>
      <option value="1916">1916</option>
      <option value="1917">1917</option>
      <option value="1918">1918</option>
      <option value="1919">1919</option>
      <option value="1920">1920</option>
      <option value="1921">1921</option>
      <option value="1922">1922</option>
      <option value="1923">1923</option>
      <option value="1924">1924</option>
      <option value="1925">1925</option>
      <option value="1926">1926</option>
      <option value="1927">1927</option>
      <option value="1928">1928</option>
      <option value="1929">1929</option>
      <option value="1930">1930</option>
      <option value="1931">1931</option>
      <option value="1932">1932</option>
      <option value="1933">1933</option>
      <option value="1934">1934</option>
      <option value="1935">1935</option>
      <option value="1936">1936</option>
      <option value="1937">1937</option>
      <option value="1938">1938</option>
      <option value="1939">1939</option>
      <option value="1940">1940</option>
      <option value="1941">1941</option>
      <option value="1942">1942</option>
      <option value="1943">1943</option>
      <option value="1944">1944</option>
      <option value="1945">1945</option>
      <option value="1946">1946</option>
      <option value="1947">1947</option>
      <option value="1948">1948</option>
      <option value="1949">1949</option>
      <option value="1950">1950</option>
      <option value="1951">1951</option>
      <option value="1952">1952</option>
      <option value="1953">1953</option>
      <option value="1954">1954</option>
      <option value="1955">1955</option>
      <option value="1966">1966</option>
      <option value="1967">1967</option>
      <option value="1968">1968</option>
      <option value="1969">1969</option>
      <option value="1970">1970</option>
      <option value="1971">1971</option>
      <option value="1972">1972</option>
      <option value="1973">1973</option>
      <option value="1974">1974</option>
      <option value="1975">1975</option>
      <option value="1976">1976</option>
      <option value="1977">1977</option>
      <option value="1978">1978</option>
      <option value="1979">1979</option>
      <option value="1980">1980</option>
      <option value="1981">1981</option>
      <option value="1982">1982</option>
      <option value="1983">1983</option>
      <option value="1984">1984</option>
      <option value="1985">1985</option>
      <option value="1986">1986</option>
      <option value="1987">1987</option>
      <option value="1988">1988</option>
      <option value="1989">1989</option>
      <option value="1990">1990</option>
      <option value="1991">1991</option>
      <option value="1992">1992</option>
      <option value="1993">1993</option>
      <option value="1994">1994</option>
      <option value="1995">1995</option>
      <option value="1996">1996</option>
      <option value="1997">1997</option>
      <option value="1998">1998</option>
      <option value="1999">1999</option>
      <option value="2000">2000</option>
      <option value="2001">2001</option>
      <option value="2002">2002</option>
      <option value="2003">2003</option>
      <option value="2004">2004</option>
      <option value="2005">2005</option>
      <option value="2006">2006</option>
      <option value="2007">2007</option>
      <option value="2008">2008</option>
      <option value="2009">2009</option>
      <option value="2010">2010</option>
      <option value="2011">2011</option>
      <option value="2012">2012</option>
    </select>
    年
    <label for="select3"></label>
    <select name="birthday_mm" id="select3">
      <option value="1">1</option>
      <option value="2">2</option>
      <option value="3">3</option>
      <option value="4">4</option>
      <option value="5">5</option>
      <option value="6">6</option>
      <option value="7">7</option>
      <option value="8">8</option>
      <option value="9">9</option>
      <option value="10">10</option>
      <option value="11">11</option>
      <option value="12">12</option>
    </select>
    月
    <label for="select4"></label>
    <select name="birthday_dd" id="select4">
      <option value="1">1</option>
      <option value="2">2</option>
      <option value="3">3</option>
      <option value="4">4</option>
      <option value="5">5</option>
      <option value="6">6</option>
      <option value="7">7</option>
      <option value="8">8</option>
      <option value="9">9</option>
      <option value="10">10</option>
      <option value="11">11</option>
      <option value="12">12</option>
      <option value="13">13</option>
      <option value="14">14</option>
      <option value="15">15</option>
      <option value="16">16</option>
      <option value="17">17</option>
      <option value="18">18</option>
      <option value="19">19</option>
      <option value="20">20</option>
      <option value="21">21</option>
      <option value="22">22</option>
      <option value="23">23</option>
      <option value="24">24</option>
      <option value="25">25</option>
      <option value="26">26</option>
      <option value="27">27</option>
      <option value="28">28</option>
      <option value="29">29</option>
      <option value="30">30</option>
      <option value="31">31</option>
    </select>
    日
    <label for="select"><br />
      <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    &nbsp;职业：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
    <select name="className" id="select">
      <option value="在上大学">在上大学</option>
      <option value="在上中学">在上中学</option>
      <option value="在上小学">在上小学</option>
      <option value="已经工作">已经工作</option>
    </select>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</p>
  <div id="apDiv3"><img src="resource/reg.png" width="120" height="30"
  onclick="javascript:fsubmit(document.register_form);"
       style="cursor: hand;"  /></div>
  </form>
</div>
</body>
</html>