package dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Items;


public class ItemDatabaseAccessor {
	
	private String name,model,m_date,expiry_date,day_time;
	private float buying_price,size,selling_price,regular_price;
	private int quantity,id;
	private String sql="insert into items(name,model,quantity,size,m_date,expiry_date,selling_price,buying_price,regular_price,day_time) values(?,?,?,?,?,?,?,?,?,?)";
	
	private PreparedStatement stmt;
	private ResultSet rs;
	
	
	
	 
	 Dao dao=new Dao();
	 
	 Items item =new Items();
	 
	 public void getItemData(Items data) {
		 
		 name=data.getName();
		 model=data.getModel();
		 quantity=data.getQuantity();
		 size=data.getSize();
		 m_date=data.getM_date();
		 expiry_date=data.getExpiry_date();
		 selling_price=data.getSelling_price();
		 buying_price=data.getBuying_price();
		 regular_price=data.getRegular_price();
		  day_time=data.getDay_time();
		  id=data.getId();
		 
		 stmt=dao.insertToDb(sql);
		 
		 try {
			 
			 stmt.setString(1, name);
			 stmt.setString(2, model);
			 stmt.setInt(3, quantity);
			 stmt.setFloat(4, size);
			 stmt.setString(5, m_date);
			 stmt.setString(6, expiry_date);
			 stmt.setFloat(7, selling_price);
			 stmt.setFloat(8, buying_price);
			 stmt.setFloat(9, regular_price);
			stmt.setString(10, day_time);
			 stmt.setInt(11, id);
			 
			 stmt.executeUpdate();
		 }catch(Exception e) {
			 
			e.printStackTrace();
		 }
	 }
	public Items retrieveFromDb() {
		
		String sql="select * from items";
		
		try {
			rs=dao.readFromDb(sql);
			
			while(rs.next()) {
			  item.setName(rs.getString("name"));
			  item.setModel(rs.getString("model"));
			  item.setQuantity(rs.getInt("quantity"));
			  item.setSize(rs.getFloat("size"));
			  item.setM_date(rs.getString("m_date"));
			  item.setExpiry_date(rs.getString("expiry_date"));
			  item.setSelling_price(rs.getFloat("selling_price"));
			  item.setBuying_price(rs.getFloat("buying_price"));
			  item.setRegular_price(rs.getFloat("regular_price"));
			  item.setDay_time(rs.getString("day_time"));
			  item.setId(rs.getInt(id));
			  
			  System.out.println("its okay");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return item;
	}
	 
}
