<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>계산기 프로그램 미리보기</h1>
	<form action="calc_bean.jsp" method = "post">
		<input type="number" name="num1">
		<select name="oper">
			<option>+</option>
			<option>-</option>
			<option>*</option>
			<option>/</option>
			<option>%</option>
		</select>
		<input type="number" name="num2">
		<input type="submit" value="=(결과보러가기)">
	</form>
	<hr>
	<h3>history</h3>
	<%
		//결과 출력하기
		ArrayList<String> datas = (ArrayList)session.getAttribute("datas");
		if(datas != null){
			for(String result: datas){
				out.println(result+"<br>");
			}
		}
		else{
			out.println("결과 없음");
		}
	
	%>
</body>
</html>