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
			out.print(request.getParameter("id") + "<br>");	//null
			out.print(request.getParameter("CCC") + "<br>");	// null
			out.print(session.getAttribute("AAA") + "<br>");	// AAA
			out.print(application.getAttribute("BBB") + "<br>");	// BBB
			out.print(application.getInitParameter("xxx") + "<br>");	// null
			out.print("홍길동");
		%>
	</body>
</html>