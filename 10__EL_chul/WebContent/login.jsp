<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<h1>2. bind</h1>
	
	<%
		request.setCharacterEncoding("utf-8");
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
	%>
	일반: <%= userid %><br>
	일반: <%= passwd %><br>
	
	<hr>
	EL ${param.userid}<br>
	EL ${param.passwd}<br>
	
	<hr>
	${param.aaa }
	
	</body>
</html>