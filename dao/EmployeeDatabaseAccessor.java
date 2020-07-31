package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Employee;

public class EmployeeDatabaseAccessor {
	
	private String username,password,first_name,last_name,phone_no;
	private int national_id;
	private String email;
	private String gender;
	private String sql="insert into employee(username,password,first_name,last_name,phone_no,national_id,email,gender) values(?,?,?,?,?,?,?,?)";
	private PreparedStatement stmt;
	private ResultSet rs;
	
	Dao dao=new Dao();
	Employee emp=new Employee();
	
	
	public Employee getEmployeeData(Employee data) {
		
		username=data.getUsername();
		password=data.getPassword();
		first_name=data.getFirst_name();
		last_name=data.getLast_name();
		phone_no=data.getPhone_no();
		national_id=data.getNational_id();
		email=data.getEmail();
		gender=data.getGender();
		
		stmt=dao.insertToDb(sql);
		
		try {
			
			stmt.setString(1, username);
			stmt.setString(2, password);
			stmt.setString(3, first_name);
			stmt.setString(4, last_name);
			stmt.setString(5, phone_no);
			stmt.setInt(6, national_id);
			stmt.setString(7, email);
			stmt.setString(8, gender);
			
			stmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("the member already exists");
		}
		return data;
	}
		public Employee retrieveFromDb() {
			
			String sql="select * from Employee";
			
			try {
				
				rs=dao.readFromDb(sql);
				
				while(rs.next()) {
					emp.setUsername(rs.getString(username));
					emp.setPassword(rs.getString(password));
					emp.setFirst_name(rs.getString(first_name));
					emp.setLast_name(rs.getString(last_name));
					emp.setPhone_no(rs.getString(phone_no));
					emp.setNational_id(rs.getInt(national_id));
					emp.setEmail(rs.getString(email));
					emp.setEmail(rs.getString(gender));
					
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		
		
		return emp;
	}
	
	

}
