<%@page import="com.dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	MemberDTO dto = (MemberDTO)session.getAttribute("login");
	if(dto != null){
		String username = dto.getUsername();
%>
<%= username %> 님 환영합니다.<br>
<a href="LogoutServlet">로그아웃</a>
<a href="MyPageServlet">mypage</a>
<a href="CartListServlet">장바구니 목록</a>
<%
	}else{
%>
<a href="LoginUIServlet">로그인</a>
<a href="MemberUIServlet">회원가입</a><!-- MVC 패턴 지키기 -->

<%
	}
%>