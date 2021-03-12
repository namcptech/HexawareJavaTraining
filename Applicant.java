package com.hexware.config;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Applicant extends HttpServlet {
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			response.setContentType("text/html");
    		PrintWriter pw=response.getWriter();
    		ServletConfig servletConfig=getServletConfig();
    		String email=servletConfig.getInitParameter("email");
    		String mobile=servletConfig.getInitParameter("mobile");
    		ServletContext context=getServletContext();
    		pw.print("<center><h1>"+context.getInitParameter("website")+"</h1></center>");
    		pw.print("Applicant  Email:"+email+"<br>");
    		pw.print("Applicant  mobile:"+mobile+"<br>");
    		pw.print("Applicant  skill:"+servletConfig.getInitParameter("skill"));
	}

		

}
