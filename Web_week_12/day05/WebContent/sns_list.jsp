<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList"%>
<%
	request.setCharacterEncoding("UTF-8");
	if(session.getAttribute("uid") == null){	
		session.setAttribute("uid", request.getParameter("uid"));
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action ="sns_add.jsp" method="post">
		<%=session.getAttribute("uid") %>님 : &nbsp;&nbsp;<input type="text" name="msg"> <input type="submit" value="글작성">
	</form>
	<hr>
	<%
		ArrayList<String> datas = (ArrayList)application.getAttribute("datas");
		//목록이 존재할땐 그 목록을 출력하고, 없다면 "채팅 기록이 없습니다." 출력
		if(datas != null){
			for(String msg : datas){
				out.println(msg+"<br>");
			}
		}
		else out.println("채팅 기록이 없습니다.");
	%>
	
</body>
</html>