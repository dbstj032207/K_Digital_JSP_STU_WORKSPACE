<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! int num = 10; %>
<%
	String mesg = (String)request.getAttribute("xxx");
%>

<h1 style="color : red">
top.jsp
안녕하세요? mesg === <%= mesg %>
num === <%= num %>
</h1>