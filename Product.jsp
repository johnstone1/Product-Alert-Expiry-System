<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="model.item2"%>
 <%@page import="model.item1"%>
 <%@page import="dao.Dao"%>
 <%@page import="java.sql.*"%>
 <%@page import="java.util.ArrayList"%>
<%@page import="controller.SQLControl"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Select products</title>
</head>
<body>
   
     <%
     
     SQLControl control =new SQLControl();
      
     ArrayList<item2> iArray=control.selectAllitems();
     ArrayList<item1> aArray=control.selectAllitem1();
     
     %>
     
     <h1><center>Select Products to sell</center></h1>
     
     <button><a class="request text-uppercase" data-toggle="modal" data-target="#cart">View Cart</a></button>
    
     
     <h2><center>Sample products</center></h2>
       <center>  <table border="2" padding="3" margin="5">
            <thead>
               <tr>
                    <th>Name</th>
                    <th>Model</th>
                    <th>size</th>
                    
                    <th>quantity</th>
                   
                    
                    <th>Action</th>
                    
                </tr>
            </thead>
            
            <tbody>
            <%  if (aArray != null) {
                        for (int i = 0; i < aArray.size(); i++) {
                %>
                <tr>
                    <td><%= aArray.get(i).getname()%></td>
                    <td><%= iArray.get(i).getmodel()%></td>
                     <td><input type="text" name="siz"placeholder="size"></td>
                    <td><input type="text" name="quan"placeholder="quantity"></td>
               
                    
                    <td>
                        <input type="submit" value="Add to Cart">
                    </td>
                </tr>
                <% }
                    }%>
            </tbody>
           
        </table><br><br>
        </center>
        
       
       
   
</body>
</html>