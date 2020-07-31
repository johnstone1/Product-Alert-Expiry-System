package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TryRetrieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		try {
			String url="jdbc:mysql://localhost:3306/expiry?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,"root" , "");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from items");
			
			while(rs.next()) {
				
				System.out.println(rs.getString(1));
			}
		}catch(Exception e) {
		System.out.println("An error occured");
		e.printStackTrace();
		}
	}

}
