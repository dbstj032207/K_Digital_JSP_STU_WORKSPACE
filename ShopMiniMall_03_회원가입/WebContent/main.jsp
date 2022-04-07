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
			String mesg = (String)session.getAttribute("memberAdd");
			if(mesg != null){
		%>
			<script type="text/javascript">
				alert('<%= mesg %>');
			</script>
		<%	 
			session.removeAttribute("memberAdd");
			}	
		%>
		<h1>Main화면 입니다.</h1>
		<jsp:include page="common/top.jsp" flush="ture"></jsp:include><br>
		<jsp:include page="common/menu.jsp" flush="ture"></jsp:include>	
	</body>
</html>