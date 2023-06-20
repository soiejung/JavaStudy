package com.woorifis.webday3.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.woorifis.webday3.model.MyCalcService;

import lombok.extern.slf4j.Slf4j;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/add")
@Slf4j
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// 1. 파라미터 분석
		String type = request.getParameter("type");
		String strNum1 = request.getParameter("num1");
		String strNum2 = request.getParameter("num2");
		log.debug("num1: {}, num2: {}, type: {}", strNum1, strNum2, type);
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);

		// 2. 비지니스 전문가(모델) 호출
		int result = MyCalcService.getService().add(num1, num2);
		log.debug("result: {}", result);

		// 화면에 전달할 추가적인 데이터를 설정한다.
		request.setAttribute("result", result);
		// 결과를 쿠키로 만들어서 내려보내보자!
		Cookie cookie = new Cookie("calc_" + System.currentTimeMillis(), num1 + "+" + num2 + "=" + result);
		cookie.setMaxAge(60);
		response.addCookie(cookie);

		// 3. 화면 전문가(View) 연결
		String path = "/calc/addresult.jsp";

		if ("forward".equals(type)) {
			RequestDispatcher disp = request.getRequestDispatcher("/calc/addresult.jsp");
			disp.forward(request, response);
		} else {
			response.sendRedirect(request.getContextPath() + path);
		}

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
