package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.Item;

public class GoodsDbAccessor {
	
	private String name,model,m_date,expiry_date,day_time,image;
	private int quantity;
	private float size,selling_price,buying_price, regular_price;
	private String sql="insert into items(name,model,quantity,size,m_date,expiry_date,selling_price,buying_price,regular_price,day_time,image) values(?,?,?,?,?,?,?,?,?,?,?)";
	PreparedStatement st;
	ResultSet rs;
	
	Dao dao=new Dao();
	Item item=new Item();
	
	public void getItemData(Item data) {
		
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
		image=data.getImage();
		
		st=dao.insertToDb(sql);
		
		try {
		
			st.setString(1, name);
			st.setString(2, model);
			st.setInt(3,quantity);
			st.setFloat(4, size);
			st.setString(5, m_date);
			st.setString(6, expiry_date);
			st.setFloat(7, selling_price);
			st.setFloat(8, buying_price);
			st.setFloat(9, regular_price);
			st.setString(10, day_time);
			st.setString(11, image);
			
			st.executeUpdate();
		}
		
		catch(Exception e) {
			
		}
	}
	
	public Item retrieveFromDb() {
		
		String url="select * from items";
		
		try {
			
			rs=dao.readFromDb(url);
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
				item.setImage(rs.getString("image"));
				
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return item;
		
	}
}
