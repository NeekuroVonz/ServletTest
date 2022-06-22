package com.test.bloguser;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserAddServlet
 */
@WebServlet(urlPatterns = {"/user/add"})
public class UserAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserAddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// send to form
		request
		.getRequestDispatcher("/WEB-INF/views/user/add.jsp")
		.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		BlogUser user = new BlogUser();
		user.setName(request.getParameter("name"));
		user.setEmail(request.getParameter("email"));
		System.out.println(user);
		
		response.sendRedirect("/ServletTest/user/list");
	}

}
