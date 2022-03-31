<%@page import="com.dto.MyProductDTO"%>
<%@page import="java.util.List"%>
<%@page import="javax.swing.ListModel"%>
<%@page import="com.service.MyProductService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	MyProductService service = new MyProductService();
	List<MyProductDTO> list = service.select();
	System.out.println(list);
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<table border="1">
		  	<tr>
		    	<td>상품아이디</td>
		    	<td>상품명</td>
		    	<td>가격</td>
		    	<td>갯수</td>
		    	<td>삭제</td>
		  	</tr>
		  	<% for(MyProductDTO dto: list){ %> 
		  	<tr>
			    <td><%= dto.getProdId()%></td>
			    <td><%= dto.getProdName()%></td>
			    <td><%= dto.getPrice()%></td>
			    <td><%= dto.getQuantity()%></td>
			    <td><button onclick="location.href='deleteProduct.jsp?prodId=<%= dto.getProdId()%>'" >삭제</button></td>
  			</tr>
 			<% } %> 
		  	 
		  </table>
	</body>
</html>