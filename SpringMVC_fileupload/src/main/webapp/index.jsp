<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>传统文件上传</h3>
	<form action="user/fileupload1" method="post"
		enctype="multipart/form-data">
		选择文件：<input type="file" name="upload" /><br /> <input type="submit"
			value="上传" />
	</form>

	<h3>SpringMVC文件上传</h3>
	<form action="user/fileupload2" method="post"
		enctype="multipart/form-data">
		选择文件：<input type="file" name="upload" /><br /> <input type="submit"
			value="上传" />
	</form>

	<h3>跨服务器文件上传</h3>
	<form action="user/fileupload3" method="post"
		enctype="multipart/form-data">
		选择文件：<input type="file" name="upload" /><br /> <input type="submit"
			value="上传" />
	</form>

</body>
</html>