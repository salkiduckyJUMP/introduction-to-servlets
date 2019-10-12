package com.collabera.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.print("Hi ");
		
		//ServletContext is an interface
		//Will give the object without you creating it
		//ServletContext ctx = getServletContext();
		//String str = ctx.getInitParameter("name");
		//To print name
		//out.println(str);
		
		//ServletConfig is also an interface
		ServletConfig cg = getServletConfig();
		String str = cg.getInitParameter("name");
		//To print name
		out.println(str);
	}
	
}
