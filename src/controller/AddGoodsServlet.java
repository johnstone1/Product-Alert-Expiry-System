package controller;

import java.io.IOException;
import java.io.InputStream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class AddGoodsServlet
 */
@WebServlet("/AddGoodsServlet")
@MultipartConfig
public class AddGoodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String url="jdbc:mysql://localhost:3306/expiry?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	
	String Username="root";
	String Password="";
       
    
    public AddGoodsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//PrintWriter out=response.getWriter();
	
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String model=request.getParameter("model");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime now = LocalDateTime.now();
		 String day_time=dtf.format(now);
		
		InputStream inputstream=null;
		
		
		Part filepart=request.getPart("photo");
		
		if(filepart!=null) {
			
			System.out.println(filepart.getName());
			System.out.println(filepart.getSize());
			
			inputstream=filepart.getInputStream();
			
		}
		
		Connection con=null;
		//String message=null;
		//String sql="insert into items(name,model,quantity,size,m_date,expiry_date,selling_price,buying_price,regular_price,day_time,image) values(?,?,?,?,?,?,?,?,?,?,?)";
		//String sql="insert into product2(quantity,size,m_date,e_date,s_price,b_price,r_price,day_time) values(?,?,?,?,?,?,?,?)";
		
		String sql2="insert into product3(id,name,model,photo) values(?,?,?,?)";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,Username,Password);
			
		//PreparedStatement st=con.prepareStatement(sql);
			PreparedStatement st1=con.prepareStatement(sql2);
			
			
			
			st1.setString(1, id);
			st1.setString(2,name);
			st1.setString(3,model);
			
			
			if(inputstream!=null) {
				st1.setBlob(4,inputstream);
			}
			
			//int row=st.executeUpdate();
			int row1=st1.executeUpdate();
			
			//if(row>0) {
				
				//System.out.println("wow it worked");
			//}
			 if(row1>0) {
				System.out.println("wow it worked too");
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
