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
		//request.setAttribute("xxx", "홍길동");
	%>
	second.jsp<br>
	아래화면은 top.jsp를 jsp:include 시킨 내용입니다. <br>
	<hr>
	<jsp:include page="include/top.jsp" flush="true" /><!-- end tag 주의 -->
	<!-- flush 속성: 캐쉬 없이 변화가 생기면 바로 반영하도록 설정 -->
	<hr>
	다시 second.jsp 내용입니다.
</body>
</html>