package com.reddy.login_logout;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Simple extends HttpServlet {
	
	
	public void doGet(HttpServletRequest request ,HttpServletResponse response) throws IOException {
		
		String username = request.getParameter("data1");

		String password = request.getParameter("data2");
		
		// set session
		HttpSession session = request.getSession();
		
		session.setAttribute("username", username);
	
		// set cookie
		//Cookie cookie = new Cookie("username", username);
		
		response.addCookie(new Cookie("username", username));
		response.addCookie(new Cookie("password", password));
		
		response.sendRedirect("welcome");
		
		
	}

}
