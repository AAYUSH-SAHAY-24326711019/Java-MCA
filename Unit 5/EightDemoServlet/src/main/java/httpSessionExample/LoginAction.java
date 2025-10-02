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
@WebServlet("/loginAction")
public class LoginAction extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException{
		
		PrintWriter out = response.getWriter();
		String userEmail = request.getParameter("email1");
		String userPass =  request.getParameter("pass1");
		if(userEmail.equals("email1") && userPass.equals("pass1")) {
			System.out.println("Login Success :"+userEmail);
			
			//request.setAttribute("username_field", userEmail);
			
			HttpSession session = request.getSession();
			session.setAttribute("username_field",userEmail);
			
			
			RequestDispatcher rd = request.getRequestDispatcher("/profile.jsp");
			rd.forward(request, response);
		}else {
			response.setContentType("text/html");
			System.out.println("Failed to login");
			out.println("<p style='color:red'><b>Maybe, Password or Email is wrong</b></p>");
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);//-> will write responses but also show the
			//html code. so you need to use response.setContentType("text/html")
			//rd.forward(request, response); -> forward will not let you write anything
		}
	}
	
	

}
