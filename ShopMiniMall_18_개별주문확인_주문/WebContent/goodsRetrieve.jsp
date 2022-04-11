<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String mesg = (String)session.getAttribute("mesg");
	if(mesg != null){
%>
	<script type="text/javascript">
		alert('<%= mesg %>');
	</script>
<%	 
	}
	session.removeAttribute("mesg");	
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>상품상세 화면입니다.</h1>
		<jsp:include page="common/top.jsp" flush="ture"/><br>
		<jsp:include page="common/menu.jsp" flush="ture"/>	
		<hr>
		<jsp:include page="goods/goodsRetrieve.jsp" flush="true"/>
	</body>
</html>