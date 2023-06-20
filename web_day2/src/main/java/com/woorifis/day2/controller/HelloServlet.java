package com.woorifis.day2.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lombok.extern.slf4j.Slf4j;

/**
 * Servlet implementation class HelloServlet
 */
//@WebServlet(urlPatterns = {"/hi", "/hello"})  // key = value 형태로 속성 지정
//@WebServlet(value= {"/hi", "/hello"})			// urlpatterns의 alias로 value
//@WebServlet({"/hi", "/hello"})				// 사용하는 속성이 value하나면 생략
@WebServlet("/hi")								// 배열 값이 하나면 {} 생략
@Slf4j
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	@SuppressWarnings("rawtypes")
	List list;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    //@Deprecated(since = "2022.02.02")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.debug("main은 tomcat이구나!!!");
    	log.debug("서블릿 호출됨: {}", request.getServletPath());
		response.getWriter().append("Served at: ").append(new Date().toString());
	}
	/**
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
