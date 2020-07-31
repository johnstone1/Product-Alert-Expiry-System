<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@page import="dao.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Title Page-->
    <title>Available Employees</title>

    <!-- Fontfaces CSS-->
    <link href="css/font-face.css" rel="stylesheet" media="all">
    <link href="vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <link href="vendor/font-awesome-5/css/fontawesome-all.min.css" rel="stylesheet" media="all">
    <link href="vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    
    <link rel="stylesheet" href="../../maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="../../ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="../../cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="../../maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

    <!-- Bootstrap CSS-->
    <link href="vendor/bootstrap-4.1/bootstrap.min.css" rel="stylesheet" media="all">
 
    <link href="vendor/animsition/animsition.min.css" rel="stylesheet" media="all">
    <link href="vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css" rel="stylesheet" media="all">
    <link href="vendor/wow/animate.css" rel="stylesheet" media="all">
    <link href="vendor/css-hamburgers/hamburgers.min.css" rel="stylesheet" media="all">
    <link href="vendor/slick/slick.css" rel="stylesheet" media="all">
    <link href="vendor/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="vendor/perfect-scrollbar/perfect-scrollbar.css" rel="stylesheet" media="all">
    <link href="vendor/vector-map/jqvmap.min.css" rel="stylesheet" media="all">
   
    <!-- Main CSS-->
    <link href="css/theme.css" rel="stylesheet" media="all">

</head>
<body class="animsition">
    <div class="page-wrapper">
    
        <!-- MENU SIDEBAR-->
        <aside class="menu-sidebar2">
            <div class="logo">
                <a href="#">
                   <!--  <img src="images/icon/logo-white.png" alt="Cool Manager" /> -->
                </a>
            </div>
            <div class="menu-sidebar2__content js-scrollbar1">
                <div class="account2">
                    <div class="image img-cir img-120">
                        <img src="images/bites/bites.jpg" alt="Manager" />
                    </div>
                    <% String name=(String)request.getSession().getAttribute("manager"); %>
                                                
                    <h4 class="name"><%=name %></h4>
                    <a href="#" class="btn btn-info text-white" data-toggle="modal" data-target="#update">Update Profile</a>
                    
                </div>
                <nav class="navbar-sidebar2">
                    <ul class="list-unstyled navbar__list">
                        <li>
                            <a href="AdminIndex.jsp">
                                <i class="fas fa-home"></i>Home</a>
                            
                        </li>
                       <!-- <li>-->
                          <!--  <a href="Inbox.jsp">
                              <!--  <i class="fas fa-envelope"></i>Inbox</a>
                               
                               <!--  <% 
                              // String url="jdbc:mysql://localhost:3306/expiry?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
                                 
                               // try{
                                	 
                            	   // Class.forName("com.mysql.cj.jdbc.Driver");
                            	   // Connection con6=DriverManager.getConnection(url,"root","");
                                	 
                            	  // Statement stmt=con6.createStatement();
                                	 
                            	   // ResultSet rs=stmt.executeQuery("select COUNT(*) from notification");
                                	 
                            	// String count;
                            	   // while(rs.next()==true){
                                		 
                            		  //  count=rs.getString(1);
                            		   //	%>
                                            			 
                                
                           //<span class="inbox-num"><% %></span>
                           // <% 
                           //  }
                            	     // }catch(Exception e){
                            		    //e.printStackTrace();
                                	 
                            		   //  }
                                 
                              // %>
                           
                       <!-- </li>-->                      
                       
                        <li class="has-sub">
                            <a class="js-arrow" href="#">
                                <i class="fas fa-trophy"></i>Goods and Items
                                <span class="arrow">
                                    <i class="fas fa-angle-down"></i>
                                </span>
                            </a>
                            <ul class="list-unstyled navbar__sub-list js-sub-list">
                                <li>
                                    <a href="ExpiredGoods.jsp">
                                        <i class="fas fa-minus-square"></i>Expired Goods</a>
                                </li>
                                <li>
                                    <a href="AvailableGoods.jsp">
                                        <i class="far fa-check-square"></i>Available Goods</a>
                                </li>
                                <li>
                                    <a href="AddGoods.jsp">
                                        <i class="fas fa-plus-square"></i>Add Goods</a>
                                </li>
                           
                            </ul>
                        </li>
                        <li class="has-sub">
                            <a class="js-arrow" href="#">
                                <i class="fas fa-copy"></i>Employee Details
                                <span class="arrow">
                                    <i class="fas fa-angle-down"></i>
                                </span>
                            </a>
                            <ul class="list-unstyled navbar__sub-list js-sub-list">
                                <li class='active'>
                                    <a href="AvailableEmployees.jsp">
                                        <i class="fas fa-user"></i>Available Employees</a>
                                </li>
                                <li>
                                    <a href="RegisterEmployee.jsp">
                                        <i class="fas fa-user"></i>Register New Employee</a>
                                </li>
                                <li>
                                    <a href="#">
                                        <i class="fas fa-dollar"></i>Employee Wages</a>
                                </li>
                            </ul>
                        </li>
                        <li class="">
                            <a class="js-arrow" href="#">
                                <i class="fas fa-bar-chart-o"></i>Statistics
                               
                            </a>
                            
                        </li>
                    </ul>
                </nav>
            </div>
        </aside>
        <!-- END MENU SIDEBAR-->
        
        

        <!-- PAGE CONTAINER-->
        <div class="page-container2">
            <!-- HEADER DESKTOP-->
            <header class="header-desktop2">
                <div class="section__content section__content--p30">
                    <div class="container-fluid">
                        <div class="header-wrap2">
                            
                            <div class="header-button2">
                                <div class="header-button-item js-item-menu">
                                    <i class="zmdi zmdi-search"></i>
                                    <div class="search-dropdown js-dropdown">
                                        <form action="">
                                            <input class="au-input au-input--full au-input--h65" type="text" placeholder="Search for datas &amp; reports..." />
                                            <span class="search-dropdown__icon">
                                                <i class="zmdi zmdi-search"></i>
                                            </span>
                                        </form>
                                    </div>
                                </div>
                                
                                <div class="header-button-item mr-0 js-sidebar-btn">
                                    <i class="zmdi zmdi-menu"></i>
                                </div>
                                <div class="setting-menu js-right-sidebar d-none d-lg-block">
                                    <div class="account-dropdown__body">
                                        <div class="account-dropdown__item">
                                            <a href="#">
                                                <i class="zmdi zmdi-account"></i>Update Profile</a>
                                        </div>
                                        <div class="account-dropdown__item">
                                            <a href="ExpiredGoods.jsp">
                                                <i class="fas fa-minus-square"></i>Expired Goods</a>
                                        </div>
                                        <div class="account-dropdown__item">
                                            <a href="#">
                                                <i class="zmdi zmdi-money-box"></i>Billing</a>
                                        </div>
                                    </div>
                                    <div class="account-dropdown__body">
                                        <div class="account-dropdown__item">
                                            <a href="AddGoods.jsp">
                                                <i class="fas fa-plus-square"></i>Add Goods</a>
                                        </div>
                                        <div class="account-dropdown__item">
                                            <a href="AvailableGoods.jsp">
                                                <i class="far fa-check-square"></i>Available Goods</a>
                                        </div>
                                        <div class="account-dropdown__item">
                                            <a href="../AdminIndex/index.jsp">
                                                <i class="fa fa-stop-circle"></i>Log Out</a>
                                        </div>
                                        
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </header>
            
            <!-- END HEADER DESKTOP-->

            <!-- -->
            <section class="au-breadcrumb m-t-75">
                <div class="section__content section__content--p30">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="au-breadcrumb-content">
                                <button  style="Height:40px;">
                                       <a href="AddGoods.jsp" class="btn btn-success"><i class="zmdi zmdi-plus"></i>Add Items</a></button>
                                    
                                    <div class="au-breadcrumb-right">
                                        <span class="au-breadcrumb-span"><p><b>WELCOME</b></p></span>
                                        <ul class="list-unstyled list-inline au-breadcrumb__list">
                                            <li class="list-inline-item active">
                                            
                                            <% String name5=(String)request.getSession().getAttribute("manager"); %>
                                                <h4><%=name5 %></h4>
                                            </li>
                                            <li class="list-inline-item seprate">
                                                <span>/</span>
                                            </li>
                                            <li class="list-inline-item" ><a href="#">HELP</a></li>
                                        
                                        <li class="list-inline-item seprate">
                                                <span>/</span>
                                            </li>
                                            <li class="list-inline-item ">
                                                <a href="../AdminIndex/index.jsp" class ="btn btn-secondary text-white">LOGOUT</a>
                                            </li>
                                           
                                        </ul>
                                        
                                    </div>
                                    
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
            <!-- END BREADCRUMB-->

            <!-- STATISTIC-->
            
            <!-- END STATISTIC-->

           <!--Start Main Body  -->
           
           <div class="main-content">
                <div class="section__content section__content--p30">
                    <div class="container-fluid">
                        <div class="row">
                            
                            
                        </div>
                        <div class="row">
                            <div class="col-lg-6">
                                <!-- USER DATA-->
                                
                                <!-- END USER DATA-->
                            </div>
                            <div class="col-lg-6">
                                <!-- TOP CAMPAIGN-->
                                
                                <!--  END TOP CAMPAIGN-->
                            </div>
                        </div>
                        
                        <div class="row m-t-30">
                            <div class="col-md-12">
                                <!-- DATA TABLE-->
                                <h3 class="title-5 m-b-35">Available Employees</h3>
                                <div class="table-responsive m-b-40">
                                    <table class="table table-borderless table-data3">
                                        <thead>
                                            <tr>
                                                <th>Username </th>
                                                <th>Full Name</th>
                                               
                                                <th>Phone Number</th>
                                                <th>Email</th>
                                                <th>Gender</th>
                                                <th>Date Enrolled</th>
                                                <th></th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                        <%
                                        
                                        String url5="jdbc:mysql://localhost:3306/expiry?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
                                       
                                       try{
                                       	
                                       	Class.forName("com.mysql.cj.jdbc.Driver");
                                       	Connection con=DriverManager.getConnection(url5,"root","");
                                       	Statement st=con.createStatement();
                                       	ResultSet rs=st.executeQuery("select * from employee");
                                       	//ResultSet rst=st.executeQuery("select * from employee");
                                       	while(rs.next()==true){
                                       		
                                       	
                                       
                                       %>
                                        
                                            <tr>
                                                <td><%=rs.getString(1) %></td>
                                                <td><%=rs.getString(3)+" " %><%=rs.getString(4) %></td>
                                                
                                                <td><%=rs.getString(5) %></td>
                                                <td><%=rs.getString(7) %></td>
                                                <td><%=rs.getString(8) %></td>
                                                <td>2020-02-29 </td>
                                                <td>
                                                
                                                 <div class="table-data-feature">
                                                        
                                                        <button class="item" data-toggle="tooltip" data-placement="top" title="Add Item">
                                                            <i class="zmdi zmdi-edit"></i>
                                                        </button>
                                                        <button class="item" data-toggle="tooltip" data-placement="top" title="Delete from table">
                                                            <i class="zmdi zmdi-delete"></i>
                                                        </button>
                                                        
                                                    </div>
                                                </td>
                                            </tr>
                              <%
                                        	}
                                        }catch(Exception e){
                                        	e.printStackTrace();
                                        }
                                   
                                   %>
                                        </tbody>
                                    </table>
                                </div>
                                <!-- END DATA TABLE-->
                            </div>
                        </div>
                        
                    </div>
                </div>
            </div>
           
           
           <!--End Main Body  -->
            
            
            <!--change profile-->
    <div class="modal fade" id="update" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered" role="document">
            <div class="modal-content">
                
                <div class="modal-body">
                    <div class="login px-4 mx-auto mw-100">
                        <h4 class="text-center mb-4"><b>Change/ Update Profile</b></h4>
                        <form action="../ChangeProfileServlet" enctype='multipart/form-data' method="post">
                            <div class="form-group">
                                <label>Change Your Username</label>

                                <input type="text" name="username" class="form-control" id="validationDefault01" placeholder="" required="">
                            </div>
                        

                            <div class="form-group">
                                <label class="mb-2">Change your Password</label>
                                <input type="password" name="password" class="form-control" id="password1" placeholder="" required="">
                            </div>
                            <div class="form-group">
                                <label>Confirm Password</label>
                                <input type="password" name="confirm" class="form-control" id="password2" placeholder="" required="">
                            </div>
                            <div class="form-group">
                                <label>Upload Photo</label>
                                <input type="file" name="image" class="form-control" id="image" placeholder="">
                            </div>
             
                           <div class="">
                            <button type="submit" class=" col-12 btn btn-success"><i class="fa fa-lock"></i>&nbsp;Save</button>
                           </div>
                        </form>

                    </div>
                </div>

            </div>
        </div>
    </div>
    <!--end change profile-->  
            
            
            <!-- END PAGE CONTAINER-->
        </div>
        <section>
               
                    <div class="footer-copyright text-center py-3"><p>
              
              Copyright &copy;
              <script>document.write(new Date().getFullYear());</script> All rights reserved.<a href="Index.jsp">PEAS SYSTEM</a>
            </p>
    
 
  <!-- Copyright -->
  

</footer>
                </div>
            </section>

    </div>

    <!-- Jquery JS-->
    <script src="vendor/jquery-3.2.1.min.js"></script>
    <!-- Bootstrap JS-->
    <script src="vendor/bootstrap-4.1/popper.min.js"></script>
    <script src="vendor/bootstrap-4.1/bootstrap.min.js"></script>
    <!-- Vendor JS       -->
    <script src="vendor/slick/slick.min.js">
    </script>
    <script src="vendor/wow/wow.min.js"></script>
    <script src="vendor/animsition/animsition.min.js"></script>
    <script src="vendor/bootstrap-progressbar/bootstrap-progressbar.min.js">
    </script>
    <script src="vendor/counter-up/jquery.waypoints.min.js"></script>
    <script src="vendor/counter-up/jquery.counterup.min.js">
    </script>
    <script src="vendor/circle-progress/circle-progress.min.js"></script>
    <script src="vendor/perfect-scrollbar/perfect-scrollbar.js"></script>
    <script src="vendor/chartjs/Chart.bundle.min.js"></script>
    <script src="vendor/select2/select2.min.js">
    </script>
    

    <!-- Main JS-->
    <script src="js/main.js"></script>

</body>

</html>
<!-- end document-->