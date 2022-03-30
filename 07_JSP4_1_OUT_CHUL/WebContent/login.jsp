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
			request.setCharacterEncoding("UTF-8");
			String userid = request.getParameter("userid");
			String passwd = request.getParameter("passwd");
			out.print("사용자 id : " + userid + "<br>");
			out.print("사용자 pw : " + passwd + "<br>");
		%>
		사용자 id: <%= userid %> <br>
		패스워드: <%= passwd %> <br>
	</body>
</html>