<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
	//页面加载，绑定单机事件
	$(function(){
		$("#btn").click(function(){
			//发送ajax请求
			$.ajax({
				//编写json格式，设置属性和值
				url:"user/testAjax",
				contentType:"application/json;character=UTF-8",
				data:'{"username":"hehe","password":"123","age":30}',
				dataType:"json",
				type:"post",
				success:function(data){
					//data服务端响应的json的数据，进行解析
					alert(data);
					alert(data.username);
					alert(data.password);
					alert(data.age);
				}
			});
		});
	})
</script>
</head>
<body>
	
	<a href="user/testString" >testString</a><br/>
	
	<a href="user/testVoid">testVoid</a><br/>
	
	<a href="user/testModelAndView">testModelAndView</a><br/>
	
	<a href="user/testForwardOrRedirect">testForwardOrRedirect</a><br/>
	
	<button id="btn">发送Ajax的请求</button>
	
	
</body>
</html>