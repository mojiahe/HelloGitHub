<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!--在进行文件上传时，表单提交方式一定要是post的方式，因为文件上传时二进制文件可能会很大，还有就是enctype属性，这个属性一定要写成multipart/form-data，
　　不然就会以二进制文本上传到服务器端--> 
　　<form action="fileupload.action" method="post" enctype="multipart/form-data">
    　　
        username: <input type="text" name="username"><br>
        file: <input type="file" name="file"><br>
        
        <input type="submit" value="submit">
    </form>
</body>
</html>