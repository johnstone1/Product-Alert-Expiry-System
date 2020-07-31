package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;

/**
 * Servlet implementation class SignServlet
 */
@WebServlet("/SignServlet")
public class SignServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignServlet() {
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
		String password2=request.getParameter("password2");
		String first_name=request.getParameter("first");
		String last_name=request.getParameter("last");
		String phone_no=request.getParameter("phone");
		String national=request.getParameter("national");
		int national_id=Integer.parseInt(national);
		String email=request.getParameter("email");
		
		 
			Dao dao=new Dao();
			
			if(!password.equals(password2)) {
				
				
				request.setAttribute("message", "password mismatch");
				getServletContext().getRequestDispatcher("/tes0.jsp").forward(request,response);
				
			}else {
				
				String sql="insert into manager(username,password,first_name,last_name,phone_no,national_no,email) values('"+username+"','"+password+"','"+first_name+"','"+last_name+"','"+phone_no+"','"+national_id+"','"+email+"')";
			
				dao.insertToDb(sql);
				request.setAttribute("message", "good");
				getServletContext().getRequestDispatcher("/test1.jsp").forward(request, response);
			}
		
		
	}

}
