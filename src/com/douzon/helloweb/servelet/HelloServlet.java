package com.douzon.helloweb.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(description = "Hello Servlet", urlPatterns = { "/hello" }) // 여러 url을 매핑할 수 있다.
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");// Content Type
		// Header 부분이므로 getWriter 이전에 입력한다.
		PrintWriter out = response.getWriter(); 
		out.print("<h1>헬로우 월드</h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
