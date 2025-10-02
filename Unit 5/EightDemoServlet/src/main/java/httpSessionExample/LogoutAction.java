package httpSessionExample;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/logoutAction")
public class LogoutAction extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		HttpSession hs = request.getSession();
		String username = (String)hs.getAttribute("username_field");
		
		
		PrintWriter out = response.getWriter();
		System.out.println("User :"+username+" Logged out successfully");
		out.println("<p style='color:green'><b>User Logged out successfully</b></p>");
		RequestDispatcher rd = request.getRequestDispatcher("/index.html");
		rd.include(request, response);
		hs.invalidate();
		
	}

}
	
	
