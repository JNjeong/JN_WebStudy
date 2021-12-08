<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<%
    String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user ="system";
	String password= "0000";
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	String sql_selectAll = "select * from board";
	String sql_insert = "Insert Into board values((select nvl(max(bid),0)+1 from board),?,?)";
	
	try {
		Class.forName(driver);
		
		conn = DriverManager.getConnection(url,user, password);
		
		
		//insert sql
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		if(writer != null){			
			pstmt = conn.prepareStatement(sql_insert);
			pstmt.setString(1, writer);
			pstmt.setString(2, content);
			pstmt.executeUpdate();
		}
		
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="jdbc.jsp" method="post">
		작성자 : <input type="text" name="writer"> 내용 : <input type="text" name="content"> <input type="submit" value="등록">
	</form>
	<hr>
	<h2>게시글 목록</h2>
	
	<%
			pstmt = conn.prepareStatement(sql_selectAll);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				out.println(rs.getInt("bid")+ ". " +rs.getString("writer")+ "님: " +rs.getString("content")+ "<br>");
			}
			
			
			rs.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	%>
</body>
</html>