package com.qf.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddCookieServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie=new Cookie("username","����");
		cookie.setMaxAge(60);
		
		Cookie cookie2=new Cookie("pwd","123");
		cookie2.setMaxAge(0);
		response.addCookie(cookie);
		response.addCookie(cookie2);
		
	}

}
