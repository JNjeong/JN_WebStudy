<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="day06.MemberBean" errorPage="error.jsp"%>
<!DOCTYPE html>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="mdb" class="day06.MemberDataBean" scope="application"/>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String sname = request.getParameter("sname");	
		MemberBean b= mdb.search(sname);
		if(b != null){
			out.println(b.getUname()+"<br>");
			out.println(b.getUid()+"<br>"); 
		}
		else{
			out.println("검색결과가 없습니다... 거 참 유감..");
		}
	%>
	<br>
	<a href="member_add.html">회원가입 바로가기</a>
	<a href="member_list.jsp">회원목록 보러가기</a>
</body>
</html>