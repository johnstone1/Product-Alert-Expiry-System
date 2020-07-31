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

import dao.Dao;


@WebServlet("/AddServlet")
@MultipartConfig
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Dao dao=new Dao();
	
    
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//PrintWriter out=response.getWriter();
		
		Connection con=null;
		
		
		try {
			
			String name=request.getParameter("name");
			String model=request.getParameter("model");
			
			InputStream inputstream=null;
			
			
			Part filepart=request.getPart("photo");
			
			if(filepart!=null) {
				
				inputstream=filepart.getInputStream();
				
			}
			
			String sql="insert into item1(name,model,image) values(?,?,?)";
			con=dao.makeConnection();
			
			PreparedStatement st1=con.prepareStatement(sql);
			
			
			st1.setString(1,name);
			st1.setString(2,model);
			
			if(inputstream!=null) {
				st1.setBlob(3,inputstream);
			}
			
			
			int row1=st1.executeUpdate();
			
			
			 if(row1>0) {
				 System.out.println();
				System.out.println(" it worked ");
				
				try {
					
					
					
					String sql1="insert into item2(model) values(?)";
					
					con=dao.makeConnection();
					
					PreparedStatement st2=con.prepareStatement(sql1);
					
					
					st2.setString(1,model);
					
					
					
					
					int row2=st2.executeUpdate();
					
					
					 if(row2>0) {
						System.out.println("wonders");
					}
					
				} catch(SQLException e) {
					e.printStackTrace();
					
				} 
				
				
				
			} 
			
		} catch(SQLException e) {
			
			
			System.out.println();
				System.out.println("product already registered check model name or just update goods instead");
			
		}
		
		
		
	}

}
