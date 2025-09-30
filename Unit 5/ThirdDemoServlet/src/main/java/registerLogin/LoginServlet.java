package registerLogin;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException , IOException{
		
		System.out.println("Login Page was Accessed");
		
		PrintWriter out = response.getWriter();
		
		out.print("<h1>Welcome to Login Page</h1>");
		out.print("<br><a href=register>Go to register page");
		out.print("<br><a href='index.html'>Go to main welcome page");
	}
}
