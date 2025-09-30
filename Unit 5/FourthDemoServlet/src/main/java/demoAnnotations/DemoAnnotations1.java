package demoAnnotations;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class DemoAnnotations1 extends HttpServlet {
	
	protected void service(HttpServletRequest request , HttpServletResponse response)
	throws ServletException ,IOException{
		System.out.println("Inside the Login page");
		PrintWriter out = response.getWriter();
		out.print("<h1>Inside Login page</h1>");
		out.print("<a href='index.html'>Go to home page</a>");
	}
}
