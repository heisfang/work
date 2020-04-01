<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html";charset="UTF-8">
	<title>Index</title>
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>

</head>

<body>
	<div style="height:100px">
		<a href="login-out">
		<button>退出登录</button>
		</a>
	</div>
	<div style="width:500px;margin:auto">
		<h2>This is Student Index !</h2>
		<br>
		<c:forEach items="${list}" var="student">
			${student.id } - ${student.name} - ${student.course } - ${student.score }
			<br>
		</c:forEach>
		
	</div>
	
	<button id="maxscore">获取最高分</button>
		<P id="test"></P>
</body>

<script type="text/javascript">
	$(document).ready(function(){
		$("#maxscore").click(function(){
			$.get('/ssm-student/maxscore',function(data,status){
				alert("\nStatus:"+status);
				
			});
			
		});
		
	});
	
</script>

</html>