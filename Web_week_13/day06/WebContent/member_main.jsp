<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<% 
	//언어설정
	request.setCharacterEncoding("UTF-8"); 
%>

<jsp:useBean id="mb" class="day06.MemberBean"/>
<jsp:setProperty property="*" name="mb"/>
<jsp:useBean id="mdb" class="day06.MemberDataBean" scope="application"/>

<%
 	//mdb, 리스트에 MemberBean 추가하기
	mdb.add(mb); 

%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
			<tr>
				<td>이름</td>
				<td><%=mb.getUname()%></td>
			</tr>
			<tr>
				<td>아이디</td>
				<td><%= mb.getUid()%></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><%= mb.getUpw() %></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" value="회원가입"></td>
				
			</tr>
		</table>
		<hr>
		<a href="member_add.html">회원가입 바로가기</a>
		<a href="member_list.jsp">회원목록보기</a>
</body>
</html>