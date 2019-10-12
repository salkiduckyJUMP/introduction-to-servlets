package com.collabera.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
	
	//Method is a service that belongs to the Servlet lifecycle
	//Pass it the response object and response
	//doGet
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		//Servlet response object to show result to the client
		PrintWriter out = res.getWriter();
		out.println("result is " + k);
		
		//Simple println styling with html
		//Can be done, but it can get extremely large, not very flexible.
		//Add styling to our response object
		//out.println("<html><body bgcolor='cyan'>");
		//out.println("result is " + k);
		//Close HTML styling
		//out.println("</body></html>");
		
		//--Session Management--
		//Request Dispatcher and sendRedirect methods

		//sendRedirect
		//go to 'sq' and add the url of '?k=' followed by the k value
		//res.sendRedirect("sq?k="+k); //URL Rewriting
		
		//HttpSession session = req.getSession();
		//session.setAttribute("k", k);
		
		//--Cookies--
		//Cookie comes from client side in request, can be sent back in response.
		
		//Cookie cookie = new Cookie("k", k + "");
		//res.addCookie(cookie);
		
		//res.sendRedirect("sq");
		
		//Sending attribute 'k' with a value of k
		//req.setAttribute("k", k);

		
		//Request Dispatcher
		//Call the SquareServlet from within AddServlet
		//RequestDispatcher rd = req.getRequestDispatcher("sq");
		//rd.forward(req, res);
			
	}
	
	//doPost
//	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		
//		int i = Integer.parseInt(req.getParameter("num1"));
//		int j = Integer.parseInt(req.getParameter("num2"));
//		
//		int k = i + j;
//		
//		//Servlet response object to show result to the client
//		PrintWriter out = res.getWriter();
//		out.println("result is " + k);
//		
//	}

}
