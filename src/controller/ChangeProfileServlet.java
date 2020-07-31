package controller;

import java.io.IOException;
import java.io.InputStream;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dao.Dao;

/**
 * Servlet implementation class ChangeProfileServlet
 */
@WebServlet("/ChangeProfileServlet")
@MultipartConfig
public class ChangeProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String confirm=request.getParameter("confirm");
		
		 String user=(String) request.getSession().getAttribute("manager");
		 String email1=(String) request.getSession().getAttribute("emaill");
		 
        InputStream inputstream=null;
		if(password!=confirm){
			
		}
		
		Part filepart=request.getPart("image");
		
		if(filepart!=null||filepart==null) {
			
			inputstream=filepart.getInputStream();
			
		}
		
	
		Dao dao =new Dao();
		String sql="UPDATE manager SET username='"+username+"',password='"+password+"',image='"+inputstream+"' where email='"+email1+"'";
		
		try {
			dao.makeConnection();
			
			PreparedStatement st=dao.makeConnection().prepareStatement(sql);
			
			
			
			if(inputstream!=null||inputstream==null) {
				
			}
			
			st.executeUpdate();
			
			
			
		} catch(SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
