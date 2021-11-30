<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- login에서 출발한 request의 scope는 이 페이지에서 끝나기 때문에 session에 넣어서 result페이지 까지 활용 -->
    <% session.setAttribute("uid", request.getParameter("uid")); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>상품목록</h1>
	<%=session.getAttribute("uid") %>님, 환영합니다.<br>
	<hr>
	
	<form action="shop_add.jsp" method="post">
		<select name="product">
			<option>바드</option>
			<option>홀리나이트</option>
			<option>리퍼</option>
			<option>건슬링어</option>
			<option>황로드</option>
		</select>
		<input type="submit" value="장바구니에 추가">
	</form>
	<a href="shop_result.jsp">결제하기</a>
</body>
</html>