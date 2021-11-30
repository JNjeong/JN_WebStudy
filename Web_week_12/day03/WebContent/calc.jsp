<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%	
	//스크립트릿
	int res = 0;

	//만약 POST로 요청했다면..
	if(request.getMethod().equals("POST")){
		
		//계산기능에 필요한 값을 추출
		int num1 = Integer.parseInt(request.getParameter("num1"));	//형변환을 해야하는데, 대상이 null이라 오류발생
																	//num1이라는 이름의 파라미터가 없음!
		int num2 = Integer.parseInt(request.getParameter("num2"));
		String op = request.getParameter("op");
		
		//계산기능을 수행
		if(op.equals("+")) res = num1 + num2;
		else res = num1-num2;
		
		//계산결과를 출력
		//아래의 HTML에서 출력 활성화되있음
	}
%>

	<form method = "post">
		<input type=text" name="num1">
		<select name="op">
			<option selected>+</option>
			<option>-</option>
		</select>
		<input type="text" name="num2">
		<input type="submit" value="계산하기">
	</form>
	<hr>
	<h2>계산결과는 <%= res %> 입니다.</h2>
</body>
</html>