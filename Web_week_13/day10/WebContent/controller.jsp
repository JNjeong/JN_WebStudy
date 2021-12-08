<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, model.BoardVO"%>
    
	<jsp:useBean id="dao" class="model.BoardDAO"></jsp:useBean>
	<jsp:useBean id="vo" class="model.BoardVO"/>
	<jsp:setProperty property="*" name="vo"/>
	
<%
	/* 사용자에게 보여주는 것은 없고, Model과 View의 연결기능/역할만 한다. */
	// 이 프로젝트에선 Controller는 index의 요청인 main페이지 이동을 수행함
	// 흐름 : Main 데이터 필요 -> DB연동하여 데이터가져옴 -> main페이지 완성했으니까 가서 보여주라는 명령 보냄 -> main페이지 보여줌
	
	String action = request.getParameter("action");
	
	if(action.equals("main")){
		
		//1.Model 에게서 데이터 받기
		ArrayList<BoardVO> datas = dao.selectAll();
		
		//2.View에게 전달
		request.setAttribute("datas", datas);
		
		//3.메인페이지 보여줘
		System.out.println("확인용 코드");
		pageContext.forward("main.jsp");
	}
	else if(action.equals("board")){
		//상세페이지 보여줘
		//1. Model한테서 데이터 확보
		BoardVO data = dao.selectOne(vo);
		
		//2. View한테 데이터 전달
		request.setAttribute("data", data);
		
		//3. 페이지로 이동
		pageContext.forward("board.jsp");
	} 
	else if(action.equals("insert")){
 		if(dao.insert(vo)){
 			//삽입이 성공했다면, 다음페이지 이동
 			response.sendRedirect("controller.jsp?action=main"); //controller(insert)중에 -> 버튼을 누르는 액션 ->(main)
 		}
 		throw new Exception("insert 수행중에 오류발생!");
	}
	else if(action.equals("update")){
		if(dao.update(vo)){
 			//수정이 성공했다면, 다음페이지 이동
 			response.sendRedirect("controller.jsp?action=main"); //controller(update)중에 -> 버튼을 누르는 액션 ->(main)
 		}
 		throw new Exception("update 수행중에 오류발생!");
	}
	else if(action.equals("delete")){
		if(dao.delete(vo)){
 			//삭제가 성공했다면, 다음페이지 이동
 			response.sendRedirect("controller.jsp?action=main"); //controller(delete)중에 -> 버튼을 누르는 액션 ->(main)
 		}
 		throw new Exception("delete 수행중에 오류발생!");
	}
	else{
		out.println("<script>alert('action 파라미터의 값이 올바르지 않습니다!')</script>");
	}
%>