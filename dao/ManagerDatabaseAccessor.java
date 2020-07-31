package dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;



import model.Manager;


public class ManagerDatabaseAccessor {
	
	String username,password;
	int national_id ;
	String email;
	String sql="insert into manager(username,password,national_id,email) values(?,?,?,?)";
	 
	 ResultSet rs;
	 PreparedStatement stmt;
	 
	 Dao dao=new Dao();
	 
	 Manager manager=new Manager();
	 
	 public Manager getManagerData(Manager data) {
		 
		 username=data.getUsername();
		 password=data.getPassword();
		
		 national_id=data.getNational_id();
		 email=data.getEmail();
		 
		 
		 stmt=dao.insertToDb(sql);
		 
		 try {
			 
			 stmt.setString(1, username);
			 stmt.setString(2, password);
			
			 stmt.setInt(3, national_id);
			 stmt.setString(4, email);
			
			 
			 stmt.executeUpdate();
			 
		 }
		 
		 catch(Exception e)
		 {
			 String m="manager already exists";
			 System.out.print(m);
		 }
		return data;
		 
		 
	 }
	 
	public Manager retrieve() {
		
		String sql="select * from manager";
		
		try {
			
			rs=dao.readFromDb(sql);
			
			while(rs.next()) {
				
				manager.setUsername(rs.getString(username));
				manager.setPassword(rs.getString(password));
				
				manager.setNational_id(rs.getInt(national_id));
				manager.setEmail(rs.getString(email));
				
			}
		}
		
		catch(Exception e) 
		
		{
			e.printStackTrace();
			
		}
		return manager;
		
	
	}

}
