package com.mycompany.webapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mycompany.webapp.controller.Controller05;

public class Servlet05 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet05 - service() 실행");
		/*// 요청 내용을 확인
		System.out.println("클라이언트 ip:" + request.getRemoteHost());
		
		// 데이터 생성 및 JSP 전달
		List<Board> list = new ArrayList();
		for (int i = 1; i <= 10; i++) {
			Board board = new Board();
			board.setBno(i);
			board.setBtitle("제목"+i);
			board.setBcontent("내용"+i);
			board.setBwriter("spring");
			list.add(board);
		}
		request.setAttribute("list", list);
		//Servlet에서 위에 내용을 분리 시키자
		*/		
		
		//컨트롤러 생성 및 요청 처리 메소드 호출!
		Controller05 ctrl = new Controller05();
		String viewName = ctrl.getBoardList(request, response);
		
		//응답 내용을 생성 및 전송
		String prefix = "/WEB-INF/views/";
		String suffix = ".jsp";
		RequestDispatcher rd = request.getRequestDispatcher(prefix + viewName + suffix);
		rd.forward(request, response);
	}

}
