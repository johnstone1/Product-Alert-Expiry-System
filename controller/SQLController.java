package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import dao.Dao;
import model.Employee;
import model.Item;
import model.Items;

public class SQLController {
	
	Connection con;
	Statement st;
	PreparedStatement stmt;
	ResultSet rs;
	
	Dao dao =new Dao();
	
	public SQLController() {
		
	}
	
	public void connectDB() {
		
		try {
			con=dao.makeConnection();
			st=con.createStatement();
			
			System.out.println("connection done");
		}catch(Exception e) {
			
			e.printStackTrace();
			System.out.println("SQL connection failed");
		}
	}
	
	public ArrayList<Items> selectAllItems() throws SQLException{
		
		ArrayList<Items> ItemList=new ArrayList<>();
		connectDB();
		
		String sql="select * from items";
		
		try {
			rs=st.executeQuery(sql);
			
			while(rs.next()) {
				
				String name=rs.getString("name");
				String model=rs.getString("model");
				int quantity=Integer.parseInt(rs.getString("quantity"));
				float size=Float.parseFloat(rs.getString("size"));
				String m_date=rs.getString("m_date");
				String expiry_date=rs.getString("expiry_date");
				float selling_price=Float.parseFloat(rs.getString("selling_date"));
				float buying_price=Float.parseFloat(rs.getString("buying_price"));
				float regular_price=Float.parseFloat(rs.getString("regular_price"));
				String day_time=rs.getString("date_time");
				int id=Integer.parseInt(rs.getString("id"));
				//String name, String model, String m_date, String expiry_date, int quantity,float size, float buying_price,float selling_price,float regular_price,String day_time, int id				
				ItemList.add(new Items( name, model, m_date,  expiry_date,  quantity, size, buying_price, selling_price,regular_price,day_time, id));
				
			}
			
		}catch(SQLException e) {
			System.out.println("items error");
		} finally {
			//disconnect db
			
			rs.close();
			st.close();
			con.close();
		}
		return ItemList;
	}
	
	
	
	public ArrayList<Items> selectItems(String id) throws SQLException{
		
		ArrayList<Items> cartArray=new ArrayList<>();
		connectDB();
		
		String sql1="select top 1 * from Items where id="+id+"";
		
		try {
			rs=st.executeQuery(sql1);
			
			while(rs.next()) {
				
				String name=rs.getString("name");
				String model=rs.getString("model");
				int quantity=Integer.parseInt(rs.getString("quantity"));
				float size=Float.parseFloat(rs.getString("size"));
				String m_date=rs.getString("m_date");
				String expiry_date=rs.getString("expiry_date");
				float selling_price=Float.parseFloat(rs.getString("selling_date"));
				float buying_price=Float.parseFloat(rs.getString("buying_price"));
				float regular_price=Float.parseFloat(rs.getString("regular_price"));
				String day_time=rs.getString("date_time");
				int id1=Integer.parseInt(rs.getString("id"));
				//String name, String model, String m_date, String expiry_date, int quantity,float size, float buying_price,float selling_price,float regular_price,String day_time, int id				
				cartArray.add(new Items( name, model, m_date,  expiry_date,  quantity, size, buying_price, selling_price,regular_price,day_time, id1));
				
			}
			
			
		}catch(SQLException e) {
			System.out.println("cartitems error");
			
		} finally {
			
			//disconnect db;
			rs.close();
			st.close();
			con.close();
		}
		
		return cartArray;
	}
	

	public ArrayList<Employee> selectEmployee() throws SQLException{
		
		ArrayList<Employee> empArray=new ArrayList<>();
		connectDB();
		
		String sql2="select * from employee";
		
		try {
			rs=st.executeQuery(sql2);
			
			while(rs.next()) {
				
				String username=rs.getString("username");
				String password=rs.getString("password");
				String first_name=rs.getString("first_name");
				String last_name=rs.getString("last_name");
				String phone_no=rs.getString("phone_no");
				int national_id=Integer.parseInt(rs.getString("national_id"));
				String email=rs.getString("email");
				String gender=rs.getString("gender");
				

				//String username, String password, String first_name, String last_name, String phone_no,
				//int national_id, String email, String gender				
				empArray.add(new Employee( username, password, first_name, last_name, phone_no, national_id, email, gender));
				
			}
			
			
		}catch(SQLException e) {
			System.out.println("employee error");
			
		} finally {
			
			//disconnect db;
			rs.close();
			st.close();
			con.close();
		}
		
		return empArray;
	}
	
	 public void insertOrder(String name,String model,int quantity,float size,float selling_price,String day_time,int id) throws SQLException {
	        connectDB();

	        try {
	            //Assume a valid connection object con;
	            con.setAutoCommit(false);

	            //transaction insert order to database
	            String sql = "insert into ordetTb (name,model,quantity,size,selling_price,day_time,id) "
	                    + "values ('" + name + "','" + model + "','" + quantity+ "',,'" +size + "',,'" +selling_price + "',,'" +day_time + "',,'" +id + "')";
	            st.executeUpdate(sql);
	            // If there is no error.
	            con.commit();

	        } catch (SQLException ex) {
	            System.out.println("SQL Error");
	            //if have any error
	            con.rollback();
	        } finally {
	            st.close();
	            con.close();
	        }

	    }

	    public int getlastedOrID() throws SQLException {
	        connectDB();
	        int orID = -1;
	        try {
	            String sql = "select top 1 id from orderTb order by OrderID DESC ";
	            rs = st.executeQuery(sql);
	            while (rs.next()) {
	                orID = rs.getInt("orderid");
	            }

	        } catch (SQLException ex) {
	            System.out.println("SQL Error");
	        } finally {
	            rs.close();
	            st.close();
	            con.close();
	        }

	        return orID;
	    }

	    
}
