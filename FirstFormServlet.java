package com.hexware.sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstFormServlet")
public class FirstFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FirstFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<html><body><center><h1>First Form Page</h1><form action='SecondFormServlet'>");
		out.print("Name :<input type='text' name='name'><br><br>");
		out.print("Age :<input type='number' name='age'><br><br>");
		out.print("<input type='submit' value='Submit'><br><br>");
		out.print("</form></center></body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
