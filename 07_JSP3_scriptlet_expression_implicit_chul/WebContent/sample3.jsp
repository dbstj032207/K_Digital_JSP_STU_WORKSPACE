<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%	// 내장객체  request, session, application은 import와 new 없이 사용이 가능함
		
			String id = request.getParameter("id");
			System.out.println("request.getParameter(id) === " + id);
			request.setAttribute("CCC", "ccc");
			session.setAttribute("AAA", "AAA");	// 내장객체이름으로 바로 사용 가능
			application.setAttribute("BBB", "BBB"); // 내장객체이름으로 바로 사용 가능
			out.print("홍길동");	// out을 사용하여 브라우저에 바로 출력 가능 // document.write
			
		%>
	</body>
</html>