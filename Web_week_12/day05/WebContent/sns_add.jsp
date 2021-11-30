<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, java.util.Date"%>
    
<% 
	request.setCharacterEncoding("UTF-8");

	String msg = request.getParameter("msg");
	
	//글목록 받아오기
	ArrayList<String> datas = (ArrayList)application.getAttribute("datas");
	
	//글목록이 없다면 새로운 글목록 생성
	if(datas==null){
		datas = new ArrayList<String>();
		application.setAttribute("datas", datas);
	}
	
	//
	Date date = new Date();
	datas.add(session.getAttribute("uid")+  "님 : " + msg+"["+date+"]");
	
	response.sendRedirect("sns_list.jsp");  //리스트 보기위해 페이지를 넘어가는 행위

%>
