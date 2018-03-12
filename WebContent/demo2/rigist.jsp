<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>属性驱动方式</h3>
	<form action="${ pageContext.request.contextPath }/rigist1.action" 	method="post">
		姓名:<input type="text" name="username" /><br /> 
		密码:<input type="password" name="password" /><br /> 
		年龄:<input type="text" name="age" /><br /> 
			<input type="submit" value="注册" />
	</form>
	<h3>属性驱动方式，封装数据到JavaBean对象中</h3>
	<form action="${ pageContext.request.contextPath }/rigist2.action" 	method="post">
		姓名:<input type="text" name="user.username" /><br /> 
		密码:<input type="password" name="user.password" /><br /> 
		年龄:<input type="text" name="user.age" /><br /> 
			<input type="submit" value="注册" />
	</form>
	<h3>模型驱动</h3>
	<form action="${ pageContext.request.contextPath }/rigist3.action" 	method="post">
		姓名:<input type="text" name="username" /><br /> 
		密码:<input type="password" name="password" /><br /> 
		年龄:<input type="text" name="age" /><br /> 
			<input type="submit" value="注册" />
	</form>
</body>
</html>