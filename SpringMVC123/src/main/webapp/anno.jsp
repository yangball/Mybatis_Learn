<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 常见的注解 -->

	<a href="anno/testRequestParam?name=hahah">RequestParam</a><br/>
	
	<form action="anno/testRequestBody" method="post">
		用户姓名：<input type="text" name="uname"  /><br/>
		用户年龄：<input type="text" name="age" /><br/>
		<input type="submit" value="提交" /><br/>
	</form>	
	
	
	<a href="anno/testPathVariable/10">testPathVariable</a><br/>
	
	<a href="anno/testRequestHeader">testRequestHeader</a><br/>
	
	<a href="anno/testCookieValue">testCookieValue</a><br/>
	
	<form action="anno/testModelAttribute" method="post">
		用户姓名：<input type="text" name="uname"  /><br/>
		用户年龄：<input type="text" name="age" /><br/>
		<input type="submit" value="提交" /><br/>
	</form>	

	<a href="anno/testSessionAttributes">testSessionAttributes</a><br/>
	
	<a href="anno/getSessionAttributes">getSessionAttributes</a><br/>
	
	<a href="anno/delSessionAttributes">delSessionAttributes</a><br/>
	
</body>
</html>