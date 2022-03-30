<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> <!-- JSP 태그 -->
<%@page import="java.util.Date" %>
<%@page import="java.util.Random"%>
<%@page import="com.dto.Person"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<% 	// Servlet에서의 doGet, doPost 부분 함수 구현과 동일
			String name = "홍길동"; 
			System.out.println(name);
			Date d = new Date();
			Random r = new Random();
			Person p = new Person();	// 자바 주석 /*  */, // 사용 
		%>	<!-- JSP 태그 -->
		<h1>JSP 기본실습</h1>
		hello !!<br>
		안녕하세요 <%= name %>	<!-- JSP 태그 -->
		<!-- JSP 태그가 먼저 실행 되고 실행 결과가 HTML에 추가되어 사용자는 HTML만 보게 됨 -->
	</body>
</html>