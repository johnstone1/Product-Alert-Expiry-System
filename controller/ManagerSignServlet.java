package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ManagerDatabaseAccessor;
import model.Manager;

/**
 * Servlet implementation class ManagerSignServlet
 */
@WebServlet("/ManagerSignServlet")
public class ManagerSignServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManagerSignServlet() {
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
		
		
		//username,password,password2,first,last,phone,national,email,gender
		
		 String username=request.getParameter("username");
		 String password=request.getParameter("password");
		 String confirm=request.getParameter("confirm");
		 String national=request.getParameter("national");
		 int national_id=Integer.parseInt(national);
		 
		 String email=request.getParameter("email");
		 
		 
		 
		 if(!password.equals(confirm))
		 
		 {
            request.getSession().setAttribute("message", "please input same password");
			 //request.setAttribute("message", "please input same password");
			 getServletContext().getRequestDispatcher("").forward(request, response);
			 response.sendRedirect("AdminIndex/index.jsp");
			 
		 } 
		 
		 
		 else
		 
		 {
			 
			 Manager manager=new Manager(username,password,national_id,email);
			 
			 ManagerDatabaseAccessor MDA =new ManagerDatabaseAccessor();
			 
			 
			 
			 MDA.getManagerData(manager);
			 request.getSession().setAttribute("message", "Welcome");
			 
			 //request.setAttribute("message", "Welcome"+first_name);
			 response.sendRedirect("AdminIndex/index.jsp");
			 System.out.println("manager added succesful");
			 
		 }
		 
	}

}
 
