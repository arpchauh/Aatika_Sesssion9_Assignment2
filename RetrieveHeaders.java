package com.acadgild.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RetrieveHeaders
 */
@WebServlet("/RetrieveHeaders")
public class RetrieveHeaders extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Enumeration<String>headerNames = request.getHeaderNames();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		while(headerNames.hasMoreElements())
		{
			String headerName = headerNames.nextElement();
			out.println(headerName +" =  "+request.getHeader(headerName));
			
			out.println("<br>");
		}
	}

}
