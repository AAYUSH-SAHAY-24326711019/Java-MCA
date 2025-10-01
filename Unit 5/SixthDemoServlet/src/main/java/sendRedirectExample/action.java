package sendRedirectExample;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/actionPage")
public class action extends HttpServlet{
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		
		String userReq = request.getParameter("req");
		
		String googleStr = "https://www.google.com/search?q="+userReq;
		
		response.sendRedirect(googleStr);
		
		
	}
	

}
