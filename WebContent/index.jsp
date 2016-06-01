<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <link type="text/css" rel="stylesheet" href="./resources/lib/ratchet/css/ratchet.min.css">
    <script  type="text/javascript" src="./resources/js/flexible.js"></script>
    <script  type="text/javascript" src="./resources/js/flexible_css.js"></script>
    <link type="text/css" rel="stylesheet" href="./resources/css/style.css"/>
<title>用户登录</title>
    <script type="text/javascript">
        var xmlHttp=null;
        function showHint(str)
        {
            if (str.length==0)
            {
                document.getElementById("txtHint").innerHTML="";
                return;
            }
            mk(function(){    
            	document.getElementById("txtHint").innerHTML=xmlHttp.responseText;
            });
        }
        function mk(cfunc) {
            xmlHttp=new XMLHttpRequest();
            var url="http://localhost:8080/KalenPage/searchServlet";
            xmlHttp.open("POST",url,true);
            xmlHttp.send();
            xmlHttp.onreadystatechange=cfunc;
        }
        
/*         function selectMultiple()
        {
        document.getElementById("mySelect").multiple=true
        } */
        
        function showAlert() {
        	alert("kalen your are the best!");
        }

        function showPrompt() {
        	 var name=prompt("请输入您的名字","Bill Gates");
        }
        
        function showConfirm() {
        	var ff = confirm("kalen you are the best");
        }
    </script>
</head>
<body>
<div class="content">
<div><div><div><div id="dd"><div><div><div>
   

<div id="kalen" class="form_login"><div>

<form action="loginServlet" method="post" onsubmint="">

    <div class="container" id="c4">
        <div class="container box">
            <select class="op" name="week" id="list1">
                <option value="1">行政部</option>
                <option value="2">市场部</option>
                <option value="3">销售部</option>
                <option value="4">技术部</option>
                <option value="5">人力资源部</option>
            </select>
        </div>
    </div>
    <div class="container addtion" id="c6">
         <div class="container box">
           全职 <input type="radio" checked="checked" name="sex" value="male"/>
        </div>
        <div class="container box">
           兼职 <input type="radio" name="sex" value="female"/>
        </div>
    </div>
    
    <div class="container" id="c1">
        <div class="container box">
            <input class="user_name_input" type="text" placeholder="请输入用户名" name="username"/>
        </div>
    </div>
    <div class="container" id="c2">
        <div class="container box">
            <input class="password_input" type="password" placeholder="请输入密码" name="pwd"/>
        </div>
    </div>
    <div class="container" id="c3">
        <div class="container box">
            <!-- <button  class="btn btn-positive btn-block sb">提交</button> -->
            <button type="submit" class="btn btn-positive btn-block sb">提交</button>
        </div>
    </div>
</form>
    <div class="container" id="c5">

        <div class="container box">
            记住密码<input type="checkbox" name="remind">
        </div>
        <div class="container box">
            <a href="http://www.baidu.com" target="_blank">忘记密码？</a>
        </div>
    </div>
    
    <div class="container table" id="c7">
   <!--      <textarea name="user_input" id="input3" cols="10" rows="10">asdasdasdasdasdasda</textarea>
    </div> -->
    <!-- <a href="http://www.baidu.com" target=_blank>百度</a> -->
    
     <table class="table1" width="100%" border="1" cellspace="0" cellpadding="0" height="54" backgroundcolor="white">
    	<tr>
    		<th>工号</th>
    		<th>姓名</th>
    		<th>职位状态</th>
    		<th>部门</th>
    	</tr>
    	<tr>
    		<td>001</td>
    		<td>王娜娜</td>
    		<td>全职</td>
    		<td>销售部</td>
    	</tr>
    	<tr>
    		<td>002</td>
    		<td>李娜</td>
        	<td>兼职</td>
    		<td>市场部</td>
    	</tr>
    	<tr>
    		<td>003</td>
    		<td>李里</td>
        	<td>兼职</td>
    		<td>技术部</td>
    	</tr>
    	<tr>
    		<td>004</td>
    		<td>李安</td>
        	<td>全职</td>
    		<td>技术部</td>
    	</tr>
    </table> 
</div>
   
<!--  <form action="searchServlet" method="post" onsubmint="">
    First Name:
    <input type="text" id="txt1"
           onkeyup="showHint(this.value)" name="searchtest">
</form>
<p>Suggestions: <span id="txtHint"></span>
</p> -->
    
    
    <div class="container" id="cc">
        <div class="container box">
            <input type="button" onclick="showAlert()"/>
        </div>
    </div>
        <div class="container" id="cc1">
        <div class="container box">
            <input type="button" onclick="showPrompt()"/>
        </div>
    </div>
        </div>
        <div class="container" id="cc2">
        <div class="container box">
            <input type="button" onclick="showConfirm()"/>
        </div>
    </div>
    
 <!--    <div class="container" id="c10">
        <div class="container box">
            <select name="" id="list2" multiple=true size=5>
                <option value="1">RedFlag</option>
                <option value="2">Ford</option>
                <option value="3">BENS</option>
                <option value="4">PEUGEOT</option>
                <option value="5">TOYOTA</option>
            </select>
        </div>
    </div>
    <input type="button" onclick="selectMultiple()" > -->


</div></div></div></div></div></div></div></div>
</body>
</html>