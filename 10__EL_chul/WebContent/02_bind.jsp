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
		String xxx = (String)request.getAttribute("xxx");
	%>
	일반: <%= xxx %><br>
	
	<hr>
	
	EL 이용한 데이터 열기: ${ xxx }<br>
	EL: ${ empty xxx }
	EL: ${ not empty xxx }
	
	</body>
</html>