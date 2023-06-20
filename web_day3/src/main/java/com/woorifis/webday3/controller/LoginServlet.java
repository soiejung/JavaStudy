package com.woorifis.webday3.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.woorifis.webday3.model.LoginService;

import lombok.extern.slf4j.Slf4j;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
@Slf4j
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// 1. parameter
		HttpSession session = request.getSession();
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		log.debug("id: {}, pass: {}", id, pass);
		
		// 2.business
		boolean result = LoginService.getService().login(id, pass);
		
		// 3. presentation
		String path;
		if(result) {
			path = "/login/loginResult.jsp";
			//path = "/index.jsp";
			
			session.setAttribute("loginName", id);
		}else {
			path = "/loginform.jsp";
		}
		RequestDispatcher disp = request.getRequestDispatcher(path);
		disp.forward(request,response);

	}
}
