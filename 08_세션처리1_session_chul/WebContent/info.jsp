<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
		String userid = (String)session.getAttribute("username");
		String passwd = (String)session.getAttribute("passwd");
		%>
		사용자id: <%= userid %><br>
		패스워드: <%= passwd %><br>
		<a href="GetServlet">GetServlet가기</a>
	</body>
</html>