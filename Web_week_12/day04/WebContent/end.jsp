<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border ="1">
			<tr>
				<td>ID</td>
				<td><%=request.getParameter("uid") %></td>
			</tr>
			<tr>
				<td>관심언어</td>
				<td><%=request.getParameter("ln") %></td>
			</tr>
			<tr>
				<td>좋아하는 과일</td>
				<td>
				<%
					String datas[] = request.getParameterValues("ff");
				
					if(datas != null){
						//console에 찍는 방법 = System.out.println();
						for(String v: datas) out.println(v+"<br>");
					}
					else{
						out.println("Not Selected!!");
					}
				%>
		<%-- 		<%=v%><br> --%>
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value ="보내기"></td>
			</tr>
		</table>
		<hr>
		<a href="start.html">돌아가기</a>
</body>
</html>