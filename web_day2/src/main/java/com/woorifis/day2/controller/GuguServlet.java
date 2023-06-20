package com.woorifis.day2.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;

/**
 * Servlet implementation class GuguServlet
 */
@WebServlet("/gugu")
@Slf4j
public class GuguServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		log.debug("메서드 호출: {}", request.getServletPath());
		String strDan = request.getParameter("dan");

		// 구구단 5단을 만들어보자. - business logic
		// primitive <--> primitive
		// reference <--> reference
		// 문자열 <--> 기본형: Wrapper class를 활용
		// int -> Integer, byte -> Byte, ...
		
		
		int dan = Integer.parseInt(strDan);
		List<Integer> gugu = MakeGugu.getInstance().getGugu(dan);
		log.debug("구구단 생성 결과: {}", gugu);

		// 화면 만들기 - presentation logic
		// String의 concat 연산은 성능상 좋지 않다!!! --> StringBuilder 사용

		StringBuilder builder = new StringBuilder("<!DOCTYPE html>");
		builder.append("<html>")
			   .append("<head>")
			   .append("<meta charset=\"UTF-8\">")
			   .append("<title>구구단</title>")
			   .append("</head>")
			   .append("<body>")
			   .append("<table border = '1'><tr><th>dan</th><th>i</th><th>result</th></tr>");
		
		for(int i=0; i<gugu.size();i++) {
			builder.append("<tr><td>")
				   .append(dan)
				   .append("</td><td>")
				   .append(i+1)
				   .append("</td><td>")
				   .append(gugu.get(i))
				   .append("</td></tr>");
		}
		builder.append("</table></body>")
			   .append("</html>");

		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().append(builder.toString());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
