package com.mycompany.webapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet02 extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet02 - service() 실행");
		//요청 내용을 확인
		System.out.println("클라이언트 ip:" + req.getRemoteHost());

		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/view02.jsp");
		rd.forward(req, resp);

	}

}
