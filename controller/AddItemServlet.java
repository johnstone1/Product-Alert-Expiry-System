package controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ItemDatabaseAccessor;
import model.Items;


/**
 * Servlet implementation class AddItemServlet
 */
@WebServlet("/AddItemServlet")
public class AddItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddItemServlet() {
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
		
		
		
		String name=request.getParameter("i_name");
		String model=request.getParameter("i_model");
		String quan=request.getParameter("i_quantity");
		int quantity=Integer.parseInt(quan);
		String siz=request.getParameter("i_size");
		float size=Float.parseFloat(siz);
		String m_date=request.getParameter("i_m_date");
		String expiry_date=request.getParameter("i_expiry_date");
		String selling_pric=request.getParameter("i_selling_price");
		float selling_price=Float.parseFloat(selling_pric);
		
		String buying_pric=request.getParameter("i_buying_price");
		float buying_price=Float.parseFloat(buying_pric);
		
		String regular_pric=request.getParameter("i_regular_price");
		float regular_price=Float.parseFloat(regular_pric);
		int id = 0;
		
		//SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDateTime now = LocalDateTime.now();
		 String day_time=dtf.format(now);
		 
		 
		 //DateFormat dF = DateFormat.getDateInstance(DateFormat.SHORT);
		 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		   
		   String date1=(String)request.getSession().getAttribute("day_time");
		   String date2=(String)request.getSession().getAttribute("expiry_date");
		   
		    
		    Date day1 = null;
			try {
				day1 = sdf.parse(date1);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    Date day2 = null;
			try {
				day2 = sdf.parse(date2);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		    
		    
		     if(day1.compareTo(day2)<0){
		    	 
		    	 System.out.println(" woow goods are still afresh");
		     }
		     
		     
		     else if(day1.compareTo(day2)>0||day1.compareTo(day2)==0){
		    	 System.out.println(" oops !! goods have expired");
		     }
		 
		 
		
		if(name.length()==0||model.length()==0) {
          
			@SuppressWarnings("unused")
			String url="/addItem.jsp";
		}
		
		
		else {
			//Items(String uname, String model, String m_date, String expiry_date, int quantity,float size, float buying_price,float selling_price,float regular_price)
			
			Items item_data=new Items(name,model,m_date,expiry_date,quantity,size,buying_price,selling_price,regular_price,day_time,id);
		
		     
		     
			ItemDatabaseAccessor item_accessor=new ItemDatabaseAccessor();
			
			item_accessor.getItemData(item_data);
			
			request.getSession().setAttribute("day_time",day_time);
			request.getSession().setAttribute("expiry_date",expiry_date);
			
			//response.sendRedirect("TimeServlet");
			//printwriter out=response.getwriter();
			//out.println();
		   response.sendRedirect("test1.jsp");
		}
		
	}

}
