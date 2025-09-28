package deletionCode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeletionDemo1 {

	public static void main(String[] args)throws Exception {
		
		String mysqlSTR = "com.mysql.cj.jdbc.Driver";
		
		String connectionStr = "jdbc:mysql://localhost:3306/jdbc_db";
		
		Scanner z = new Scanner(System.in);
		
		Class.forName(mysqlSTR);
		
		Connection con = DriverManager.getConnection(connectionStr,"root","root");
		
		System.out.println("Give username :");
		String userName = z.next();
		
		System.out.println("Give password :");
		String userPass = z.next();
		
		PreparedStatement ps = con.prepareStatement("Delete from "
				+ "register where username=? and pass=?");
		
		ps.setString(1, userName);
		ps.setString(2, userPass);
		
		int i = ps.executeUpdate();
		
		if(i>0)
			System.out.println("Success");
		else
			System.out.println("Failure");
		
		con.close();
		z.close();

	}

}

//Give username :
//Aayush-User
//Give password :
//NewPass
//Success