<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	확인
	<h1>현재 시간은 <%= new java.util.Date() %> 입니다.</h1> 
	<h2>현재 시간은 <%= new Date() %></h2>
	
	<%
		System.out.println(session);
	
	%>
	
</body>
</html>