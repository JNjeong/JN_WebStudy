<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList,model.BoardVO" %>
<jsp:useBean id="datas" scope="request" class="java.util.ArrayList" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 페이지</title>
</head>
<link rel="stylesheet" href="css/style.css" type="text/css"/>
<body>

<table border="1">
   <tr>
      <th>글 번호</th><th>글 제목</th><th>작성자</th>
   </tr>
   <%
   		System.out.println("datas의 상태 : "+datas);
   		System.out.println("datas의 크기 : "+datas.size());
   		
   		if(datas.size()== 0){
   			%>
   			<tr>
   				<td colspan="3">표시할 데이터가 없습니다.</td>
   			</tr>
   			<%		
   		}
   		else{
   			for(BoardVO v:(ArrayList<BoardVO>)datas){  	
	%>
			<tr>
				<td><a href="controller.jsp?action=board&bid=<%=v.getBid()%>"><%=v.getBid()%></a></td><td><%=v.getTitle()%></td><td><%=v.getWriter()%></td>
   			</tr>
    <%		  	  		
    		}
   		}
   	%>
</table>

<hr>

<a href="form.jsp">글 작성하기</a>

</body>
</html>