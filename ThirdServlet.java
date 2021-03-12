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
		String[]	hobbies=request.getParameterValues("Hobbies");
		
		
		out.print("<html>");
		out.print("<body>");
		out.print("<h3> Name :"+firstName+" "+lastName+"</h3>");
		out.print("<h3> Email :"+email+"</h3>");
		out.print("<h3> DOB :"+birthDay+"-"+birthMonth+"-"+birthYear+"</h3>");
		out.print("<h3> Gender :"+gender+"</h3>");
		out.print("<h3> Gender :");
		for(String hobby:hobbies)
			out.print(hobby+"<br>");
		out.print("</h3>");
		out.print("<table border='1'>");
		out.print("<thead>");
		out.print("<tr><th>S.No</th><th>Examination</th><th>Board</th><th>Percentage</th><th>Year of Passing</th><tr>");
		out.print("</thead>");
		out.print("<tbody>");
		out.print("<tr><td>1</td><td>Class X</td><td>"+request.getParameter("ClassX_Board")+"</td><td>"+request.getParameter("ClassX_Percentage")+"</td><td>"+request.getParameter("ClassX_YrOfPassing")+"</td></tr>");
		out.print("<tr><td>2</td><td>Class XII</td><td>"+request.getParameter("ClassXII_Board")+"</td><td>"+request.getParameter("ClassXII_Percentage")+"</td><td>"+request.getParameter("ClassXII_YrOfPassing")+"</td></tr>");
		out.print("<tr><td>3</td><td>Graduation</td><td>"+request.getParameter("Graduation_Board")+"</td><td>"+request.getParameter("Graduation_Percentage")+"</td><td>"+request.getParameter("Graduation_YrOfPassing")+"</td></tr>");
		out.print("<tr><td>4</td><td>Masters</td><td>"+request.getParameter("Masters_Board")+"</td><td>"+request.getParameter("Masters_Percentage")+"</td><td>"+request.getParameter("Masters_YrOfPassing")+"</td></tr>");
				out.print("</tbody>");
		out.print("</table>");
		out.print("</body");
		out.print("</html>");
		
	}

}
