<%@page import="com.dto.MyProductDTO"%>
<%@page import="com.service.MyProductService"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
    String prodId = request.getParameter("prodId");
	System.out.println("deleteProduect.jsp======"+prodId);
     MyProductService service = new MyProductService();
     int n = service.delete(prodId);

%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%
  String mesg = prodId + " 상품삭제 성공";
  if(n!=1){
	  mesg = prodId + " 상품삭제 실패";
  }
  out.print(mesg);	  
 %>
 <br>
 <a href="listProduct.jsp">목록보기</a>
</body>
</html>