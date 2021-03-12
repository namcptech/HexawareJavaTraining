package com.hexaware.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		String userName=req.getParameter("username");
		String password=req.getParameter("password");
		if(userName.equalsIgnoreCase("User123") && password.equals("Hexa123"))
		{
//			RequestDispatcher requestDispatcher=req.getRequestDispatcher("home");
//			
//			requestDispatcher.forward(req, resp);
			resp.sendRedirect("home");
			//out.print("Welcome User");
		}else
		{
			out.print("<h2><font color='red'>Sorry User Name and Password are incorrect.</font><h2>");
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("login.html");
			requestDispatcher.include(req, resp);
			
		}
	}

}
