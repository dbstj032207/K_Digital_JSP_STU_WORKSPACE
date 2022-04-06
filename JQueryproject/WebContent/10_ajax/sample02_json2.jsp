<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String name = "홍길동";
	int age = 20;
	// 클라이언트 text(=> json 변환필요), json(변환 필요 없음)
%>
{
	{"username": "<%= name %>", "age": "<%= age %>"},
	{"username": "이순신", "age": "10"},
	{"username": "강감찬", "age": "20"}
}