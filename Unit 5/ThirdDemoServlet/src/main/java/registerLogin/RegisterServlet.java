package registerLogin;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException , IOException{
		
		System.out.println("Register Page was Accessed");
		
		PrintWriter out = response.getWriter();
		
		out.print("<h1>Welcome to Register Page</h1>");
		out.print("<br><a href='login'>Go to Login page");
		out.print("<br><a href='index.html'>Go to main welcome page");
	}
}
