<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 把数据封装在Account类中，类中存在User类
	<form action="param/saveAccount" method="post">
		用户名：<input type="text" name="username" /><br/>
		密码：<input type="password" name="password" /><br/>
		金额：<input type="text" name="money" /><br/>
		用户姓名：<input type="text" name="user.uname"  /><br/>
		用户年龄：<input type="text" name="user.age" /><br/>
		<input type="submit" value="提交" /><br/>
	</form>
	-->
	
	<!-- 把数据封装在Account类中，类中存在list和map的集合
	<form action="param/saveAccount" method="post">
		用户名：<input type="text" name="username" /><br/>
		密码：<input type="password" name="password" /><br/>
		金额：<input type="text" name="money" /><br/>
		
		用户姓名：<input type="text" name="list[0].uname"  /><br/>
		用户年龄：<input type="text" name="list[0].age" /><br/>
		
		用户姓名：<input type="text" name="map['one'].uname"  /><br/>
		用户年龄：<input type="text" name="map['one'].age" /><br/>
		<input type="submit" value="提交" /><br/>
	</form>
	-->	
	
	<!-- 自定义类型转换器
	<form action="param/saveUser" method="post">
		用户姓名：<input type="text" name="uname"  /><br/>
		用户年龄：<input type="text" name="age" /><br/>
		用户生日：<input type="text" name="date"  /><br/>
		<input type="submit" value="提交" /><br/>
	</form>	
	-->
	
	
	<a href="/param/testServlet">Servlet原生的API</a>
	
	
	
	
	
	
	
</body>
</html>