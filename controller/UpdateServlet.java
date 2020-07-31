package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;


@WebServlet("/UpdateServlet")
@MultipartConfig
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Dao dao=new Dao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//String name=request.getParameter("name");
		String model=request.getParameter("model");
		
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		Float size=Float.parseFloat(request.getParameter("size"));
		
		String e_date=request.getParameter("e_date");
		Float s_price=Float.parseFloat(request.getParameter("s_price"));
		Float b_price=Float.parseFloat(request.getParameter("b_price"));
		Float r_price=Float.parseFloat(request.getParameter("r_price"));
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime now = LocalDateTime.now();
		 String day_time=dtf.format(now);
		 
		 
		 Connection con=null;
		 
		 try {
			
			 con=dao.makeConnection();
			 String sql="UPDATE item2 SET quantity='"+quantity+"',size='"+size+"',e_date='"+e_date+"',s_price='"+s_price+"',b_price='"+b_price+"',r_price='"+r_price+"',day_time='"+day_time+"' WHERE model='"+model+"'";
			 //String sql="insert into item2(quantity,size,e_date,s_price,b_price,r_price,day_time) values(?,?,?,?,?,?,?)";
			 
			 PreparedStatement st=con.prepareStatement(sql);
			 
			 
			 int row=st.executeUpdate();
			 
			 if(row>0) {
				 System.out.println();
				 System.out.println("wonders");
			
			 }
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		
		
		
	}

	

}
