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
		<c:if test="<%= true %>">aaa1</c:if>
		<c:if test="${true}">aaa2</c:if>
		
		<h1>jstl core태그의 사용</h1>
		xxx: ${xxx}<br>
		<c:if test="${not empty xxx}">xxx가 있음</c:if><br>
		
		<c:set var="aaa" value="${xxx}" scope="application"></c:set>
		이름: ${aaa}<br>
		request의 이름:<c:out value="${xxx}"></c:out><br>
		application의 이름:<c:out value="${aaa}"></c:out><br>
		<% int x = 100; %>
		jsp 태그 변수값 출력<c:out value="<%= x %>"></c:out><br>
		${ xxx == 'bbb' }<br>
		${ xxx != '홍길동' }<br>
		${ not empty xxx }<br>
		${ empty xxx }<br>
	</body>
</html>