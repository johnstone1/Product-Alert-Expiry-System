package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeLoginDao {
	
	 String url="jdbc:mysql://localhost:3306/expiry?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	 //String sql= "select * from employee where password=? and (national_id=? or email=?)";
	String sql="select * from employee where username=? and password=?";
	 String Username="root";
	 String Password="";

	  public boolean check(String uname, String password) {
		  
		  
		  try {
			  
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  
			  Connection con=DriverManager.getConnection(url,Username,Password);
			  PreparedStatement stmt=con.prepareStatement(sql);
			      
			  
			  stmt.setString(1, uname);
			  stmt.setString(2, password);
			  
			  ResultSet rs =stmt.executeQuery();
			  
			  if(rs.next()) {
				  return true;
			  }
			  
		  }catch(Exception e) {
			  System.out.println("error");
			  e.printStackTrace();
		  }
		  return false;
	  }
}
