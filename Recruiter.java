package com.hexware.config;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Recruiter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		response.setContentType("text/html");
    		PrintWriter pw=response.getWriter();
    		ServletConfig servletConfig=getServletConfig();
    		String email=servletConfig.getInitParameter("email");
    		String mobile=servletConfig.getInitParameter("mobile");
    		
    	//ServletContext context=servletConfig.getServletContext();	
    	ServletContext context=getServletContext();
    		pw.print("<center><h1>"+context.getInitParameter("website")+"</h1></center>");
    		pw.print("Recruiter  Email:"+email+"<br>");
    		pw.print("Recruiter  Mobile:"+mobile+"<br>");
    		
    		
	}

	
}
