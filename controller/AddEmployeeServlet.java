package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDatabaseAccessor;
import model.Employee;




/**
 * Servlet implementation class AddEmployeeServlet
 */
@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String confirm=request.getParameter("password2");
		String first_name=request.getParameter("first");
		String last_name=request.getParameter("last");
		String phone_no=request.getParameter("phone");
		String national_i=request.getParameter("national");
		
		int national_id=Integer.parseInt(national_i);
		
		String email=request.getParameter("email");
		String gender=request.getParameter("gender");
		
		if(username==""||password==""||confirm==""||first_name=="") {
			
			request.getSession().setAttribute("message", "please enter valid data");
			
			response.sendRedirect("RegisterEmployee.jsp");
		}
		
		else if(!password.equals(confirm)){
			
			request.getSession().setAttribute("message", "please enter matching passwords");
		}
		else {
			
		Employee emp=new Employee(username,password,first_name,last_name,phone_no,national_id,email,gender);
		//System.out.println(emp);
		
		
		EmployeeDatabaseAccessor dbAccess=new EmployeeDatabaseAccessor();
		
		dbAccess.getEmployeeData(emp);
		
		request.getSession().setAttribute("message", "employee successfully added");
		//response.sendRedirect("test3.jsp");
		System.out.println("nice");
		}
		
	}

}
