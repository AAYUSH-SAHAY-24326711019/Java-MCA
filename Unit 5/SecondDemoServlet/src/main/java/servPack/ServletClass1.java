package servPack;



import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequestWrapper;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletClass1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		
		System.out.println("Running 1st Servlet program");
		
		PrintWriter out = response.getWriter();
		
		out.print("<h1>Running 1st Servlet Program</h1>");
		
	}
	
	

}
