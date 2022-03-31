<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>회원정보</h1>
		<%
			String userid = (String)session.getAttribute("userid");
			String passwd = (String)session.getAttribute("passwd");
		%>
		회원아이디 <%= userid %><br>
		회원비번 <%= passwd %><br>
		<a href="LogoutServlet">로그아웃</a>
	</body>
</html>