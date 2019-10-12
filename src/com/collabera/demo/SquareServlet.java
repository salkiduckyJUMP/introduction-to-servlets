package com.collabera.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		//int k = (int) req.getAttribute("k");
		
		int k = Integer.parseInt(req.getParameter("k"));
		
		//--Session Management--
		//HttpSession session = req.getSession();
		
		//Fetching value from the session in AddServlet
		//Returns an object, type cast it into 'int'
		//int k = (int) session.getAttribute("k");
		
		//To delete session data
		//session.removeAttribute("k");
		
		//--Cookie Management--
		
		//Request cookie here
		//req.getCookies();
		//Possible to have multiple cookies, will take all cookies here
		
		//Need to figure out which cookie we want
		//Cookie cookies[] = req.getCookies();
		//Use Array to fetch cookie we want
		/*int k = 0;
		for(Cookie c : cookies) {
			if(c.getName().equals("k"))
				//c.getValue() will return an object, parse into an Integer
				k = Integer.parseInt(c.getValue());
		}
		*/
		
				
		k = k * k;
		
		PrintWriter out = res.getWriter();
		out.println("Result is " + k);
		
		System.out.println("sq called");
	}
}

	
	

