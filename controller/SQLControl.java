package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import dao.Dao;
import model.item1;
import model.item2;

public class SQLControl {
	
	Connection con;
	Statement st;
	PreparedStatement stmt;
	ResultSet rs;
	
	Dao dao =new Dao();
	
	
	public SQLControl() {
		
	}
	
	//method for connecting to database
	
	
  public void  ConnectToDb() {
	  
	  try {
		  con=dao.makeConnection();
		st=con.createStatement();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch(Exception e) {
		e.printStackTrace();
	}
  }
  
  //@SuppressWarnings("unchecked")
public ArrayList<item2> selectAllitems() throws SQLException{
	  
	  ArrayList<item2> itemlist=new ArrayList<>();
	   
	  ConnectToDb();
	  
	  String sql="select * from item2";
	  
	  
	  try {
		  
		  rs=st.executeQuery(sql);
		  
		  while(rs.next()) {
			  
			    
				String model=rs.getString("model");
				int quantity=Integer.parseInt(rs.getString("quantity"));
				float size=Float.parseFloat(rs.getString("size"));
				
				String e_date=rs.getString("e_date");
				float s_price=Float.parseFloat(rs.getString("s_price"));
				float b_price=Float.parseFloat(rs.getString("b_price"));
				float r_price=Float.parseFloat(rs.getString("r_price"));
				String day_time=rs.getString("day_time");
				int id=Integer.parseInt(rs.getString("id"));
				
				
	     itemlist.add(new item2(id,model,quantity,size,e_date,s_price,b_price,r_price,day_time));
	     
	    
				
		  }
		  
	  } catch(SQLException e) {
		  
		  e.printStackTrace();
		  
	  }finally{
		  rs.close();
		  st.close();
		  con.close();
	  }
	  
	return itemlist;
  }
  

public ArrayList<item1> selectAllitem1() throws SQLException{
	  
	  ArrayList<item1> itemlist=new ArrayList<>();
	   
	  ConnectToDb();
	  
	  String sql1="select * from item1";
	  
	  
	  try {
		  
		  rs=st.executeQuery(sql1);
		  
		  while(rs.next()) {
			  
			    
				String name=rs.getString("name");
				
				
	     itemlist.add(new item1(name,null,null));
	     
	    
				
		  }
		  
	  } catch(SQLException e) {
		  
		  e.printStackTrace();
		  
	  }finally{
		  rs.close();
		  st.close();
		  con.close();
	  }
	  
	return itemlist;
}


  public ArrayList<item2> selectitems(int id) throws SQLException{
	  
	  ArrayList<item2> cartArray=new ArrayList<>();
	  
	  ConnectToDb();
	  
	  String sql1="";
	  
	  try {
		  
		  rs=st.executeQuery(sql1);
		  
		  while(rs.next()) {
			  
			  String model=rs.getString("model");
				int quantity=Integer.parseInt(rs.getString("quantity"));
				float size=Float.parseFloat(rs.getString("size"));
				
				String e_date=rs.getString("e_date");
				float s_price=Float.parseFloat(rs.getString("s_price"));
				float b_price=Float.parseFloat(rs.getString("b_price"));
				float r_price=Float.parseFloat(rs.getString("r_price"));
				String day_time=rs.getString("date_time");
			
	     cartArray.add(new item2(id,model,quantity,size,e_date,s_price,b_price,r_price,day_time));
			  
		  }
	  }catch(SQLException e) {
		  e.printStackTrace();
	  }
	return cartArray;
  }
  
  
  
	
}
