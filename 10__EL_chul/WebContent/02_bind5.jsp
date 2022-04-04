<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
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
	<h1>2. bind5</h1>
	
	<%
		List<Person> list = (List)request.getAttribute("xxx");
		for(Person p : list){
	%>
	
	일반 p 이름: <%= p.getUsername() %><br>
	일반 p 나이: <%= p.getAge() %><br>
	
	<%} %>
	<hr>

	<% int x = 0; %>
	${xxx}<br>
	El::::::::${ xxx[0].username }<br>
	El::::::::${ xxx[x].username }<br> <!-- 출력 안됨 -->
	<% for(int i = 0; i < list.size(); i++){ %>
			EL: person.name = ${ xxx[i].username }<br> <!-- 출력 안됨, jsp태그의 변수 사용 불가 -->
			EL: person.age = ${ xxx[i].age }<br> 
	<%} %>
	
	</body>
</html>