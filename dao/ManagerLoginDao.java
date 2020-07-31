package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ManagerLoginDao {

	String sql="select * from manager where email=? and password=?";
	 String Username="root";
	 String Password="";
      String message;
      
      Dao dao =new Dao();
	  public boolean check(String email, String password) {
		  
		  
		  try {
			  dao.makeConnection();
			  
			  PreparedStatement stmt=dao.makeConnection().prepareStatement(sql);
			      
			  
			  stmt.setString(1, email);
			  stmt.setString(2, password);
			  
			  ResultSet rs =stmt.executeQuery();
			  
			  if(rs.next()) {
				  
				  return true;
			  }else {
				 message="please enter correct email and password"; 
				 System.out.println(message);
				 
			  }
			  
		  }catch(Exception e) {
			  System.out.println("error");
			  e.printStackTrace();
		  }
		  return false;
	  }
}
