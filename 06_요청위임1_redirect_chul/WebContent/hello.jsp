<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%	// MVC패턴의 view부분: 데이터를 받아서 화면 구현만 해줌
			String mesg = (String)request.getAttribute("request");
			String mesg2 = (String)session.getAttribute("session");
			String mesg3 = (String)application.getAttribute("application");
		
		%>
		
		1>> <%= mesg %><br>
		2>> <%= mesg2 %><br>
		3>> <%= mesg3 %><br>
		<hr>
		
		request: <%= request.getAttribute("request") %><br>
		session: <%= session.getAttribute("session") %><br>
		application: <%= application.getAttribute("application") %><br>
	</body>
</html>