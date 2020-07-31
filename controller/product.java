package controller;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class product
 */
@WebServlet("/product")

@MultipartConfig
public class product extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       String url="jdbc:mysql://localhost:3306/expiry?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	
	String Username="root";
	String Password="";
       
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public product() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String model=request.getParameter("model");
		
		InputStream inputstream=null;
         Part filepart=request.getPart("photo");
		
		if(filepart!=null) {
			
			inputstream=filepart.getInputStream();
			
		}
		

		Connection con=null;
		
		
		String sql3="insert into product(id,name,model,photo) values(?,?,?,?)";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,Username,Password);
			
		
			PreparedStatement st2=con.prepareStatement(sql3);
			
			
			st2.setString(1,name);
			st2.setString(2,model);
			st2.setString(3,model);
			
			
			if(inputstream!=null) {
				st2.setBlob(3,inputstream);
			}
			
			
			int row1=st2.executeUpdate();
			
			
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
