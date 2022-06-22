package com.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form")
public class ServletConn extends HttpServlet {
	private static final long serialVersionUID = 6960329218353998249L;

	public ServletConn() {
		super();
	}
	

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	
		System.out.println(req.getMethod());
		String id = req.getParameter("userId");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		
		System.out.println(id + " | " + name + " | " + email);
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getMethod());
		String id = req.getParameter("userId");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		
		System.out.println(id + " | " + name + " | " + email);
		
	}
}
