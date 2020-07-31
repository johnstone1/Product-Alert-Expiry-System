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
import dao.ManagerLoginDao;

/**
 * Servlet implementation class ManagerLoginServlet
 */
@WebServlet("/ManagerLoginServlet")
public class ManagerLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManagerLoginServlet() {
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
	    String password=request.getParameter("password");
		
		 ManagerLoginDao employee=new ManagerLoginDao();
		Dao dao=new Dao();
		
		
		try {
			
			dao.makeConnection();
			Statement stmt=dao.makeConnection().createStatement();
			
			ResultSet rs=stmt.executeQuery("select COUNT(*) from notification");
			
			String count;
			while(rs.next()==true) {
				
				count=rs.getString(1);
				
				
				request.getSession().setAttribute("inbox3", count);
				
				request.setAttribute("mess", count);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
if(employee.check(email, password)) {
	
	  String count =(String)request.getAttribute("mess");
	  ut.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js'></script>");
	  ut.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js'></script>");
	  ut.println("<script>");
	  ut.println("$(document).ready(function(){");
	  ut.println("swal('Welcome','success','success');");
	
	  ut.println("});");
	  ut.println("</script>");
			
			try {
				
				dao.makeConnection();
				Statement st=dao.makeConnection().createStatement();
				ResultSet rs1=st.executeQuery("select username from manager where email='"+email+"'");
				
				while(rs1.next()) {
					String user=rs1.getString(1);
			request.getSession().setAttribute("inbox5", count);
			request.getSession().setAttribute("manager", user);
			request.getSession().setAttribute("emaill", email);
			response.sendRedirect("Admin/AdminIndex.jsp");
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else {
			 ut.println("<script src='https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js'></script>");
			  ut.println("<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js'></script>");
			  ut.println("<script>");
			  ut.println("$(document).ready(function(){");
			  ut.println("swal('Oops','wrong username or password','error');");
			
			  ut.println("});");
			  ut.println("</script>");
			request.getSession().setAttribute("message", "please enter valid email and password");
			response.sendRedirect("AdminIndex/index.jsp");
		
		}
		
	
	}

}
