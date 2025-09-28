package retrivalOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectDemo1 {

	public static void main(String[] args) throws Exception {
	
		String mySqlStr = "com.mysql.cj.jdbc.Driver";
		
		String url ="jdbc:mysql://localhost:3306/jdbc_db";
		
		Class.forName(mySqlStr);
		
		Connection con = DriverManager.getConnection(url,"root","root");
		
		PreparedStatement ps = con.prepareStatement("Select * from master");
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.println("------------------------------------");
			System.out.println(" name : "+rs.getString("username")
			+"\n gender :"+rs.getString("gender")+
			"\n email :"+rs.getString("email"));
			
		}
		
		con.close();
	}

}
//------------------------------------
//name : aayush
//gender :MALE
//email :aayush@gmail.com
//------------------------------------
//name : amrit
//gender :MALE
//email :amrit@gmail.com
//------------------------------------
//name : akash
//gender :MALE
//email :akash@gmail.com
//------------------------------------
//name : Jayesh
//gender :MALE
//email :jayesh@gmail.com
//------------------------------------
//name : Monu
//gender :MALE
//email :monu@gmail.com