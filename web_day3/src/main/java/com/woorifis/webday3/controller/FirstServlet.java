package com.woorifis.webday3.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// HTTP의 stateless 속성을 극복해보자!! - scope들을 사용해보자.
		// request - parameter & attribute - forward 까지 전달
		String type = request.getParameter("type"); // 클라이언트에서만 발생, String
		request.setAttribute("reqAttr", "request"); // 추가할 수 있는 데이터, 객체 관리
		
		// session - 여러개의 request동안 유지, 개별 사용자
		HttpSession session = request.getSession();
		session.setAttribute("sesAttr", "session");
		
		// application - 여러개의 session동안 유지
		ServletContext application = request.getServletContext();
		application.setAttribute("appAttr", "application");
		
		String path = "/session/first.jsp";
		if("forward".equals(type)) {
			RequestDispatcher disp = request.getRequestDispatcher(path);
			disp.forward(request, response);
		}else {
			response.sendRedirect(request.getContextPath() + path);
		}
		
	}

}
