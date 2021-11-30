<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList"%>
    <% 
    	request.setCharacterEncoding("UTF-8"); //한글을 위한 인코딩 설정
    	
    	
    	//장바구니는 최초에 '한번' 만 만들면 된다. (분기점 생성됨) = if절 활용
    	ArrayList<String> datas = (ArrayList)session.getAttribute("datas"); 
    	if(datas == null){ //최초 생성일 경우
    		datas = new ArrayList<String>(); //새 장바구니 컬랙션 생성	
    		session.setAttribute("datas", datas); //session에 장바구니 정보 넣기
    	}
    	
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String product = request.getParameter("product");
		datas.add(product);
	%>
	<script type="text/javascript">
		alert("<%= product%>가 추가되었습니다.");
		history.go(-1);
	</script>
</body>
</html>