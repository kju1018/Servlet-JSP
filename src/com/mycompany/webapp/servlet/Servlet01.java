package com.mycompany.webapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet01")
public class Servlet01 extends HttpServlet {//Servlet을 상속받음
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet01 - service() 실행");
		//요청 내용을 확인
		System.out.println("클라이언트 ip:" + req.getRemoteHost());
		//클라이언트의 ip주소가 뭐냐
		
		//응답 내용을 생성 및 전송
//		resp.setContentType("text/html; charset=UTF-8");
//		Writer writer = resp.getWriter();
//		writer.write("<html>");
//		writer.write("<head></head>");
//		writer.write("<body>");
//		writer.write("Servlet01<hr/>");
//		writer.write("</body>");
//		writer.write("</html>");
//		writer.flush();
//		writer.close();
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/view01.jsp");
		rd.forward(req, resp);
		//dispatcher 분배
	}
	//WEB-INF에 외부에서는 접근불가지만 servlet에서는 접근 가능
	
	//JSP는 응답을 만들어냄
}
