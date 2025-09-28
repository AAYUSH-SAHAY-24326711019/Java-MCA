package UpdateRegisterTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateDemo1 {

	public static void main(String[] args)throws Exception {
		
		Scanner z= new Scanner(System.in);
		
		String connectorMYSQL = "com.mysql.cj.jdbc.Driver";
		
		Class.forName(connectorMYSQL);
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306"
				+ "/jdbc_db","root","root");
		
		System.out.println("May I know your UserName =>");
		String userName = z.next();
		
		System.out.println("Provide Desired Password =>");
		String userPass = z.next();
		
		PreparedStatement ps = con.prepareStatement("update register set pass=?"
				+ "where username=? ");

		ps.setString(1, userPass);
		ps.setString(2, userName);
		
		int i = ps.executeUpdate();
		
		if(i>0) {
			System.out.println("Success");
		}
		else {
			System.out.println("failed");
		}
		con.close();
		z.close();
	}

}

/*
 * May I know your UserName =>
Aayush-User
Provide Desired Password =>
NewPass
Success
 * */
