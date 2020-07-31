package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Statement;

public class Dao {
	
	private static String url="jdbc:mysql://localhost:3306/expiry?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static String username="root";
	private static String Password="";
	private static Connection con;
	private PreparedStatement stmt;
	private ResultSet rs;
	private Statement st;
	
	
	public static void main(String[] args) {
		makeConnection();
		
	}
	public static Connection makeConnection() {
		
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection(url,username,Password);
			System.out.print("connection success");
		}
		
		catch(Exception e) {
			e.printStackTrace();
			System.out.print("connecion unsuccessful");
		}
		
		return con;
	}
	
	public PreparedStatement insertToDb(String sql) {
		
		con=makeConnection();
		
		try {
			stmt=con.prepareStatement(sql);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return stmt;
	}
	
	public ResultSet readFromDb(String sql) {
		
		con=makeConnection();
		try {
			st=con.createStatement();
			rs=st.executeQuery(sql);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	

}
