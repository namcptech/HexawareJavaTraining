package com.hexware.sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FristFormServlet
 */
@WebServlet("/SecondFormServlet")
public class SecondFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		
		out.print("<html><body><center><h1>Second Form Page</h1><form action='ThirdFormServlet'>");
		out.print("Email :<input type='email' name='email'><br><br>");
		out.print("Mobile :<input type='text' name='mobile'><br><br>");
		out.print("<input type='hidden' name='name' value='"+request.getParameter("name")+"'>");
		out.print("<input type='hidden' name='age' value='"+request.getParameter("age")+"'>");
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
