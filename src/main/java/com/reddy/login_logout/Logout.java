package com.reddy.login_logout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout extends HttpServlet {
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
			
			HttpSession session = request.getSession();
		
			
			PrintWriter out = response.getWriter();
			
			
			out.println("logged out, Bye "+session.getAttribute("username"));
		}
}
