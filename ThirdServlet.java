package com.hexaware.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String firstName=request.getParameter("First_Name");
		String  lastName=request.getParameter("Last_Name");
		String email =request.getParameter("Email_Id");
		String birthDay=request.getParameter("Birthday_day");
		String birthMonth=request.getParameter("Birthday_Month");
		String birthYear=request.getParameter("Birthday_Year");
		String gender=request.getParameter("Gender");
		
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h3> Name :"+firstName+" "+lastName+"</h3>");
		out.print("<h3> Email :"+email+"</h3>");
		out.print("<h3> DOB :"+birthDay+"-"+birthMonth+"-"+birthYear+"</h3>");
		out.print("<h3> Gender :"+gender+"</h3>");
		out.print("</body");
		out.print("</html>");
		
	}

}
