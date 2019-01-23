package com.douzon.helloweb.servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/join")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Post 방식으로 넘어오는 데이터 엔코딩
		request.setCharacterEncoding("utf-8");

		String email = request.getParameter("email");
		System.out.println(email);

		String password = request.getParameter("password");
		System.out.println(password);

		String gender = request.getParameter("gender");
		System.out.println(gender);

		String birthYear = request.getParameter("birth-year");
		System.out.println(birthYear);

		// 같은 이름으로 여러 값이 넘어오는 multyvalues의 경우에 사용 - checkbox
		String[] hobbies = request.getParameterValues("hobby");
		for (String hobby : hobbies) {
			System.out.println(hobby);
		}
		// textarea
		String selfIntro = request.getParameter("self-intro");
		System.out.println(selfIntro);

		response.getWriter().println("ok");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost() called");
		doGet(request, response);
	}

}
