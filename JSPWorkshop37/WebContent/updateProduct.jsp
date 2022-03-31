<%@page import="java.util.HashMap"%>
<%@page import="com.dto.MyProductDTO"%>
<%@page import="com.service.MyProductService"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
    String prodId = request.getParameter("prodId");
    String quantity = request.getParameter("quantity");
    
     MyProductService service = new MyProductService();
     HashMap<String,Object> map = new HashMap<>();//map에 String, Integer객체 두개 가 들어감 Generic사용안함 
     map.put("prodId", prodId );//String
     map.put("quantity", Integer.parseInt(quantity) );  //Integer객체 
     int n = service.updateProduct(map);
		
%>    
<%=n %>개 수정됨 
<a href="listProduct.jsp">목록으로 이동</a>