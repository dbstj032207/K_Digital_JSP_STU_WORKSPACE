<%@page import="java.util.Collections"%>
<%@page import="java.util.Arrays"%>
<%@page import="com.dto.MyProductDTO"%>
<%@page import="com.service.MyProductService"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
    String [] prodIds = request.getParameterValues("delCheck");	
    List<String> x = Arrays.asList(prodIds);   //id를 리스트에 저장 
    System.out.println(x);
    
     MyProductService service = new MyProductService();
     int n = service.deleteAll(x);//리스트 전달 

%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <%
  String pName = "";
 for(String name:x){
	 pName +=(name+" ");
 }
  String mesg = pName + " 상품삭제 성공";
  if(n==0){
	  mesg = pName + " 상품삭제 실패";
  }
  out.print(mesg);	  
 %>
 <br>
 <a href="listProduct.jsp">목록보기</a>
</body>
</html>