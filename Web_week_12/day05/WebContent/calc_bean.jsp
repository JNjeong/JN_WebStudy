<%@page import="day05.calculation"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList"%>
    
	<jsp:useBean id="calc" class="day05.calcBean"/>
    <jsp:setProperty property="*" name="calc"/>

    
    <%
		//결과를 담을 배열을 생성
		ArrayList<String> datas = (ArrayList) session.getAttribute("datas");
		if(datas == null) {
			datas = new ArrayList<String>();
			session.setAttribute("datas", datas);
		}
		
		//계산기능 적용
		String result="";
		if(datas != null){
			//0으로 나누면 alert 출력
			if(calc.getNum2()==0 && calc.getOper().equals("/")){
				result="'[주의]0으로 나눌 수 없습니다!'";
			}
			else{
				result = Integer.toString(new calculation(calc.getNum1(), calc.getNum2(), calc.getOper()).calc());
			}
		}

		
		//계산결과를 배열에 추가
		String numFirst = Integer.toString(calc.getNum1());
		String numSecond = Integer.toString(calc.getNum2());
		datas.add(numFirst + calc.getOper() + numSecond + "=" + result);
		
		response.sendRedirect("calc_intro.jsp");
	%>