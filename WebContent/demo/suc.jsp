<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>使用EL表达式获取,完全解耦合方式</h3>
	
	${requestScope.msg }
	${sessionScope.msg }
	${applicationScope.msg}
	
	<h3>使用EL表达式获取，原生态方式</h3>
	
	${requestScope.msg }
	${sessionScope.msg }
	${applicationScope.msg}
	
</body>
</html>