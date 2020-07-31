package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;

/**
 * Servlet implementation class forgotServlet
 */
@WebServlet("/forgotServlet")
public class forgotServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public forgotServlet() {
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
		PrintWriter ut=response.getWriter();
		String email=request.getParameter("email");
		String query="select password from manager where email='"+email+"'";
		Dao dao=new Dao();
		  try {
			 dao.makeConnection();
			 Statement st=dao.makeConnection().createStatement();
			    
			 ResultSet rs=st.executeQuery(query); 
			 
			 rs.next();
			 
			 try {
			  if(rs.getString(1)!=null) {
				  
		
				  ut.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js'></script>");
				  ut.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js'></script>");
				  ut.println("<script>");
				  ut.println("$(document).ready(function(){");
				  ut.println("swal(('Welcome',)"+rs.getString(1)+"(,'success'));");
				
				  ut.println("});");
				  ut.println("</script>");
				  
				  ut.print("Your password is : "+rs.getString(1));
			  }
			 }catch(Exception e) {
				 ut.print("not found");
			 }
		  }
		  
		  catch(Exception e) {
			  e.printStackTrace();
		  }
	}

}
