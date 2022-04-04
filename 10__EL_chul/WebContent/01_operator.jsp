<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>연산기능</h1>
		${"홍길동"}<br> <!-- EL태그, 출력 전용 -->
		<%= "홍길동" %><br>
		<hr>
		${ 10 + 4 }<br>	<!-- 사칙연산 가능 -->
		${ 10 - 4 }<br>
		${ 10 / 4 }<br>
		${ 10 * 4 }<br>
		<hr>
		${ 10 >= 4 }<br> <!-- 논리연산 가능 -->
		${ 10 <= 4 }<br>
		${ 10 == 4 }<br>
		${ 10 != 4 }<br>
		<hr>
		<% int x = 10; %> 
		표준 jsp 태그 x: <%= x %><br>
		<%-- <%= ${10+4} %> --%> <!-- el과 jsp태그 혼용 안됨 -->
		EL태그 x: ${ x }<br> <!-- 주의 : bind 객체(request, session 등)에 접근만 가능하며 일반 변수 사용이 안됨 -->
	</body>
</html>