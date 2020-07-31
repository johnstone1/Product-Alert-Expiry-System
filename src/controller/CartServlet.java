package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  
		SQLController cont=new SQLController();
		
		HttpSession session =request.getSession();
		
		//String name, String model, int quantity, float size, float selling_price,String day_time,int id
		
		String name=request.getParameter("name");
		String model=request.getParameter("model");
		
		String quan=request.getParameter("quantity");
		int quantity=Integer.parseInt(quan);
		
		String siz=request.getParameter("size");
		float size=Integer.parseInt(siz);
		
		String selling=request.getParameter("selling_price");
		float selling_price=Integer.parseInt(selling);
		
		String day_time=request.getParameter("name");
	
		
       int id=0;
	
		PrintWriter out=response.getWriter();
		
		if(session.getAttribute("cart")!=null) {
			
			try {
				//insert to db
				cont.insertOrder(name, model, quantity, size, selling_price, day_time,id);
				
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
			session.invalidate();
			out.println("<script language=(\"text/javaScript\")>");
			out.println("alert('good');");
			out.println("location='test3.jsp'");
			out.println("</script>");
		}else {
			
			

			out.println("<script language=(\"text/javaScript\")>");
			out.println("alert('good');");
			out.println("location='test5.jsp'");
			out.println("</script>");
		}
	}

}
