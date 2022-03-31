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
		request.setCharacterEncoding("utf-8");
		String userid = request.getParameter("userid");
		String passwd = request.getParameter("passwd");
		if(userid.equals("abcd")){
			out.print("회원인증됨<br>");
		}else{
			response.sendRedirect("loginForm.html");	// 화면 전환
		}
	%>
	사용자id: <%= userid %><br>
	패스워드: <%= passwd %><br>
</body>
</html>