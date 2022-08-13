package com.reddy.login_logout;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import javax.servlet.http.HttpSession;

public class Welcome extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
			
		String username;


		String cookieUsername = null, cookiePassword = null;
		
		HttpSession session = request.getSession();
		username = (String) session.getAttribute("username");
		
		
		
		Cookie cookiez[] = request.getCookies();
		for(Cookie cookie : cookiez) {
			if (cookie.getName().equals("username") ) {
				cookieUsername = cookie.getValue();
			}
			if (cookie.getName().equals("password") ) {
				cookiePassword = cookie.getValue();
			}
		}
		
		
		
		PrintWriter outPrintWriter = response.getWriter();
		outPrintWriter.println("hey "+username);
		outPrintWriter.println("hey cookie username : "+cookieUsername);
		outPrintWriter.println("hey cookie password : "+cookiePassword);
	
		
	}
}
