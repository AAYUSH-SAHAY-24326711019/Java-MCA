package Insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDemo1 {
	public static void main(String[] args) throws Exception {
		String mySQLClass = "com.mysql.cj.jdbc.Driver";
		
		Class.forName(mySQLClass);
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:"
				+ "3306/jdbc_db","root","root");
		
		PreparedStatement ps = con.prepareStatement("insert into register values(?,?)");
			
			ps.setString(1,"Demo-User");
			ps.setString(2,"Demo-Pass");
			
			int i = ps.executeUpdate();
			
			if(i>0) {
				System.out.println("Successful input");
			}
			
			con.close();

	}

}
