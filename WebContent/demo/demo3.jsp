<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>向List集合中封装数据（默认为属性驱动）</h3>
	<form action="${ pageContext.request.contextPath }/rigist4.action" 	method="post">
		姓名:<input type="text" name="list[0].username" /><br /> 
		密码:<input type="password" name="list[0].password" /><br /> 
		年龄:<input type="text" name="list[0].age" /><br /> 
			
		姓名:<input type="text" name="list[1].username" /><br /> 
		密码:<input type="password" name="list[1].password" /><br /> 
		年龄:<input type="text" name="list[1].age" /><br /> 
			<input type="submit" value="注册" />
	</form>
</body>
</html>