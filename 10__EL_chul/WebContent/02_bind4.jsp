<%@page import="com.dto.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
	<h1>2. bind4</h1>
	
	<%
		String xxx = (String)request.getAttribute("xxx");
		Person p = (Person)request.getAttribute("person");

	%>
	일반: <%= xxx %><br>
	일반 p 이름: <%= p.getUsername() %><br>
	일반 p 나이: <%= p.getAge() %><br>
	<hr>

	${person }<br>
	${xxx }<br>
	
	EL : requestScope.person.name = ${requestScope.person.username }<br>
	
	EL : person.name = ${person.username }<br>
	
	EL : person.age = ${person.age }<br>
	
	<input type="text" value="${person.username}">

	
	</body>
</html>