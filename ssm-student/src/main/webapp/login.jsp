<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html";charset="UTF-8">
	<title>Login</title>
</head>

<!-- <script type="text/javascript" src="static/js/jquery-3.4.1.min.js"></script> -->

<body>
	<div style="height:100px"></div>
	<div style="width:300px;margin:auto">
		<h2>Welcome to you !</h2>
		<br>
		<form action="login" method="post">
			username: <input type="text" id="username" name="username"/>
			<br>
			password: <input type="password" id="password" name="password">
			<br>
			<button type="submit" >登录</button>
			
		</form>
		<button onclick="registe()" type="button">注册</button>
		<div style="color: red;" id="mydiv"></div>
	</div>
		
</body>



<script type="text/javascript">
		function registe() {
			
			var xmlhttp;
			if(window.XMLHttpRequest){
				xmlhttp = new XMLHttpRequest();
			}else{
				xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
			}
			
			var username = document.getElementById('username').value;
            var password = document.getElementById('password').value;
			xmlhttp.onreadystatechange = function() {
				if(xmlhttp.readyState == 4 && xmlhttp.status == 200){
					document.getElementById("myDiv").innerHTML = xmlhttp.responseText;
				}
			}
			xmlhttp.open("POST","/ssm-student/register?username="+username+"&password="+password,true);
			xmlhttp.send();
		}
	
		
</script>










</html>