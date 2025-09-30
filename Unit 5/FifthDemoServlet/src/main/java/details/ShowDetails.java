package details;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/detailsServlet")
public class ShowDetails extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
	throws ServletException , IOException{
		String userNameValue = request.getParameter("username");
		String emailValue = request.getParameter("email");
		
		System.out.println("---------------------------------------------------");
		System.out.println("User Details : username :"+userNameValue+
				" email ="+emailValue);
		
		//String mysqlString = "com.mysql.cj.jdbc.Driver";
		String connectionURL = "jdbc:mysql://localhost:3306/jdbc_db"+
				"?useSSL=false&allowPublicKeyRetrieval=true";
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(connectionURL,"root","root");
		PreparedStatement ps = con.prepareStatement("insert into user_details_reports(username,email) values(?,?)");
		ps.setString(1,userNameValue);
		ps.setString(2, emailValue);
		int i = ps.executeUpdate();
		
		if(i>0) {
			System.out.println("Successful input");
		}
		
		
		
		}catch(ClassNotFoundException cnfe) {
			System.out.println(cnfe.getMessage());
		}catch(SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}
