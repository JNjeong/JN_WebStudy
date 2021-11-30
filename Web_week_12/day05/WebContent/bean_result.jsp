<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="lb" class="day05.loginBean"/>
    <jsp:setProperty property="*" name="lb"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	if(lb.check()) out.println("로그인 성공");
	else out.println("로그인 실패");
%>
	
</body>
</html>