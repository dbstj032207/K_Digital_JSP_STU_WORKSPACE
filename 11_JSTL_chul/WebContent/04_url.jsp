<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>	
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>url: 상대경로</h1>
		<a href="target.jsp">A</a><br>
		
		<a href="<c:url value='target.jsp' />">B</a><br>
		
		<h1>url: 절대경로</h1>
		<a href="/target.jsp">C</a><br>
		<a href="<c:url value='/target.jsp' />">D</a><br>
	</body>
</html>