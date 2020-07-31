<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="java.io.*" %>

<%
PrintWriter ut=response.getWriter();
  String email=request.getParameter("email");

 
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>forgot password</title>

 <script>
        addEventListener("load", function() {
            setTimeout(hideURLbar, 0);
        }, false);

        function hideURLbar() {
            window.scrollTo(0, 1);
        }
    </script>
    <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
    <link rel="stylesheet" href="css/component.css" type="text/css" media="all">
    <link href="css/style.css" rel='stylesheet' type='text/css' />
    <link rel="stylesheet" href="css/owl.theme.css" type="text/css" media="all">
    <link rel="stylesheet" href="css/owl.carousel.css" type="text/css" media="screen" property="" />
    <link href="css/minimal-slider.css" rel='stylesheet' type='text/css' />
    <link href="css/fontawesome-all.css" rel="stylesheet">
    <link href="//fonts.googleapis.com/css?family=Josefin+Sans:100,100i,300,300i,400,400i,600,600i,700,700i" rel="stylesheet">
    <link href="//fonts.googleapis.com/css?family=BenchNine:300,400,700" rel="stylesheet">
</head>

<body>
    <div class="mian-content">

        <div class="header-top">
            <div class="top-head-wthree text-left">
                <div class="row top-content-info">
                    <div class="col-lg-12 top-content-left">
                        <ul class="header-info-w3ls">
                            <li>
                                <i class="far fa-envelope"></i> <a href="mailto:johnstonesilunya@gmail.com">mail@peas.com</a>
                            </li>
                            
                            <li>
                                <i class="far fa-clock"></i> Mon to  Sat : 7:00am - 8:00pm EAT
                                 </li>
                                 <li>
                                <i class="fas fa-phone"> +25471 5582 733</i>
                            </li>
                        </ul>
                    </div>
                   
                </div>
            </div>
            <div class="container-fluid">
                <div class="row">
                    
                    <div class="col-md-9 login-right-img text-left">
          
                        <h2>
                        
                            <a class="navbar-brand text-white" href="index.html">
                            <i class="fas fa-"></i>PRODUCT ALERT EXPIRY SYSTEM</a>
                        </h2>
                    </div>
                    <div class="col-md-3 login-right-img text-center">
                        <!--  <a class="request text-uppercase" href="#" data-toggle="modal" data-target="#exampleModalCenter">Sign In</a>-->
                        <a class="request text-uppercase" href="#" data-toggle="modal" data-target="#exampleModalCenter2">Sign Up</a>
                    </div>
                </div>
            </div>
            <div class="header-bg">
                <div class="container">
                    <header>
                        <nav class="navbar navbar-expand-lg navbar-light">
                            <button class="navbar-toggler navbar-toggler-right mx-auto" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
				   </button>

                            <div class="collapse navbar-collapse" id="navbarSupportedContent ">
                                <ul class="navbar-nav mr-lg-auto text-right">
                                    <li class="nav-item active">
                                        <!--  <a class="nav-link" href="index.html">Home-->
                                         <a class="nav-link" >Home
                                    </a>
                                    </li>
                                    <li class="nav-item ">
                                       <!-- <a class="nav-link " href="about.html">About</a>-->
                                       <a class="nav-link ">About</a>
                                    </li>
                                    <li class="nav-item dropdown">
                                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        Services
                                        <i class="fas fa-angle-down"></i>
                                    </a>
                                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                            <!--<a class="dropdown-item" href="services.html">Services</a>-->
                                            <!--<a class="dropdown-item" href="services.html" title="">Services 1</a>-->

                                           <!-- <a class="dropdown-item" href="single.html" title="">Single Page</a>-->
                                           
                                        </div>
                                    </li>
                                    
                                    <li class="nav-item">
                                       <!-- <a class="nav-link" href="contact.html">Contact</a>-->
                                       <a class="nav-link" >Contact</a>
                                    </li>

                                </ul>
                                <form action="#" method="post" class="form-inline my-2 my-lg-0 header-search">
                                   
                                </form>
                            </div>
                        </nav>

                    </header>
                </div>
            </div>
        </div>
        <!-- main image slider container -->
        <div class="slide-window">
            <div class="slide-wrapper" style="width:300%;">
                <div class="slide">
                    <div class="slide-caption text-center">
                        <p class="text-uppercase">The right choice</p>
                        <h3 class="text-uppercase">Improving Business, improving lives.</h3>
                        <div class="cont-btn">
                            <a class="btn text-uppercase" href="contact.html">
                            Contact</a>
                        </div>

                    </div>
                </div>
                <div class="slide slide2">
                    <div class="slide-caption text-center">
                        <p class="text-uppercase">New goods</p>
                        <h3 class="text-uppercase">Affordable prices.</h3>
                        <div class="cont-btn">
                            <a class="btn text-uppercase" href="contact.html">
                            Contact</a>
                        </div>

                    </div>
                </div>
                <div class="slide slide3">
                    <div class="slide-caption text-center">
                        <p class="text-uppercase">The right choice.</p>
                        <h3 class="text-uppercase">Improving Business, improving lives.</h3>
                        <div class="cont-btn">
                            <a class="btn text-uppercase" href="contact.html">
                            Contact</a>
                        </div>

                    </div>
                </div>
            </div>
            <div class="slide-controller">
                <div class="slide-control-left">
                    <div class="slide-control-line"></div>
                    <div class="slide-control-line"></div>
                </div>
                <div class="slide-control-right">
                    <div class="slide-control-line"></div>
                    <div class="slide-control-line"></div>
                </div>
            </div>
        </div>
        <!-- main image slider container -->
    </div>
    <!-- end of main image slider container -->

   
    <!--footer -->
    <footer class="footer-emp-wthree bg-dark dotts py-lg-5 py-3">
        <div class="container">
            <div class="row footer-top">
                <div class="col-lg-3 footer-grid-w3ls">
                    <div class="footer-title">
                        <h3>About Us</h3>
                    </div>
                    <div class="footer-text">
                        <p>shopping staff.</p>
                        <ul class="social-icons">
                            <li class="mr-1"><a href="#"><span class="fab fa-facebook-f"></span></a></li>
                            <li class="mx-1"><a href="#"><span class="fab fa-twitter"></span></a></li>
                            <li class="mx-1"><a href="#"><span class="fab fa-google-plus-g"></span></a></li>
                            <li class="mx-1"><a href="#"><span class="fab fa-linkedin-in"></span></a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-3 footer-grid-w3ls">
                    <div class="footer-title">
                        <h3>Location</h3>
                    </div>
                    <div class="contact-info">
                        
                        <p>chs block building, Mbale.</p>
                        
                    </div>
                </div>
                <div class="col-lg-3 footer-grid-w3ls">
                    <div class="footer-title">
                        <h3>Contact</h3>
                    </div>
                    <div class="contact-info">
                        
                        <div class="phone">
                            <h4>Contact :</h4>
                            <p>Phone : +25471 5582 733</p>
                            <p>Email :
                                <a href="mailto:johnstonesilunya@gmail.com">info@peas.com</a>
                            </p>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 footer-grid-w3ls">
                    <div class="footer-title">
                        <h3>Quick Links</h3>
                    </div>
                    <ul class="links">
                        <li>
                            <a href="#">Home</a>
                        </li>
                        <li>
                            <a href="#">About us</a>
                        </li>
                        
                        <li>
                            <a href="#">Services</a>
                        </li>
                        
                    </ul>
                    <ul class="links">
                        <li>
                            <a href="#">Contact Us</a>
                        </li>
                                             
                    </ul>

                    <div class="clearfix"></div>
                </div>
            </div>
            <div class="copyright-w3 mt-4 text-center">
                <p>
              
              Copyright &copy;
              <script>document.write(new Date().getFullYear());</script> All rights reserved.<a href="Index.jsp">PEAS SYSTEM</a>
            </p>
            </div>
        </div>
    </footer>
   
     <%
     if(email.equals("johnstonesilunya@gmail.com")){
    	 %>
    	 <a  data-toggle="modal" data-target="#exampleModalCenter"></a>
    
    
    <!--/Login-->
    <div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered" role="document">
            <div class="modal-content">
                
                <div class="modal-body">

                    <div class="login px-4 mx-auto mw-100">
                        <h5 class="text-center mb-4">Manager Login</h5>
                        <form action="../ManagerLoginServlet" method="post">
                            <div class="form-group">
                                <label class="mb-2">Username</label>
                                <input type="text" name="name" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="" required="">
                                
                            </div>
                            <div class="form-group">
                                <label class="mb-2">Password</label>
                                <input type="password" name="password" class="form-control" id="exampleInputPassword1" placeholder="" required="">
                            </div>
                            
                           
                             <div class="text-center" >
               	   
 					<button type="submit" class="btn btn-success"><i class="fa fa-lock"></i>&nbsp;LOGIN</button>
 		
 		         <a href="#" class="btn btn-secondary" data-toggle="modal" data-target="#exampleModalCenter2">&nbsp;REGISTER</a>
 					</div> 
                                <div class="text-center">
                                <h1> </h1><br>
                                
                                <p class="text-center pb-4">
                               
                                <a href="forgot.jsp"> Forgot Password?</a>
                            </p>
                                </div>
                            
                        </form>
                    </div>
                </div>

            </div>
        </div>
    </div>
    <!--//Login-->
    <%
 }
     
     %>
    <!--/Register-->
    <div class="modal fade" id="exampleModalCenter2" tabindex="-1" role="dialog" aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered" role="document">
            <div class="modal-content">
                
                <div class="modal-body">
                    <div class="login px-4 mx-auto mw-100">
                        <h5 class="text-center mb-4">New Manager Registration</h5>
                        <form action="#" method="post">
                            <div class="form-group">
                                <label>Enter Your Username</label>

                                <input type="text" class="form-control" id="validationDefault01" placeholder="" required="">
                            </div>
                            <div class="form-group">
                                <label>Enter Your Email Address</label>
                                <input type="email" class="form-control" id="validationDefault02" placeholder="" required="">
                            </div>

                            <div class="form-group">
                                <label class="mb-2">Password</label>
                                <input type="password" class="form-control" id="password1" placeholder="" required="">
                            </div>
                            <div class="form-group">
                                <label>Confirm Password</label>
                                <input type="password" class="form-control" id="password2" placeholder="" required="">
                            </div>
                            <div class="form-group">
                                <label>National ID</label>
                                <input type="text" class="form-control" id="national" placeholder="" required="">
                            </div>
             
                           <div class="text-right">
                            <button type="submit" class="btn btn-success submit mb-4 ">Register</button>
                           </div>
                        </form>

                    </div>
                </div>

            </div>
        </div>
    </div>
    <!--//Register-->

    <!--//model-form-->
    <!-- js -->
    <script src="js/jquery-2.2.3.min.js"></script>
    <script src="js/minimal-slider.js"></script>
    <script src="js/toucheffects.js"></script>
    <script src="js/modernizr.custom.js"></script>
    <!-- carousel -->
    <script src="js/owl.carousel.js"></script>
    <script>
        $(document).ready(function() {
            $('.owl-carousel').owlCarousel({
                loop: true,
                margin: 10,
                responsiveClass: true,
                responsive: {
                    0: {
                        items: 1,
                        nav: true
                    },
                    600: {
                        items: 1,
                        nav: false
                    },
                    900: {
                        items: 1,
                        nav: false
                    },
                    1000: {
                        items: 2,
                        nav: true,
                        loop: false,
                        margin: 20
                    }
                }
            })
        })
    </script>
    <!-- //carousel -->
    <script>
        $(document).ready(function() {
            $(".dropdown").hover(
                function() {
                    $('.dropdown-menu', this).stop(true, true).slideDown("fast");
                    $(this).toggleClass('open');
                },
                function() {
                    $('.dropdown-menu', this).stop(true, true).slideUp("fast");
                    $(this).toggleClass('open');
                }
            );
        });
    </script>
    <!-- //dropdown nav -->
    <!-- stats -->
    <script src="js/jquery.waypoints.min.js"></script>
    <script src="js/jquery.countup.js"></script>
    <script>
        $('.counter').countUp();
    </script>
    <!-- //stats -->
    <!-- password-script -->
    <script>
        window.onload = function() {
            document.getElementById("password1").onchange = validatePassword;
            document.getElementById("password2").onchange = validatePassword;
        }

        function validatePassword() {
            var pass2 = document.getElementById("password2").value;
            var pass1 = document.getElementById("password1").value;
            if (pass1 != pass2)
                document.getElementById("password2").setCustomValidity("Passwords Don't Match");
            else
                document.getElementById("password2").setCustomValidity('');
            //empty string means no validation error
        }
    </script>
    <!-- //password-script -->

    <!--/ start-smoth-scrolling -->
    <script src="js/move-top.js"></script>
    <script src="js/easing.js"></script>
    <script>
        jQuery(document).ready(function($) {
            $(".scroll").click(function(event) {
                event.preventDefault();
                $('html,body').animate({
                    scrollTop: $(this.hash).offset().top
                }, 900);
            });
        });
    </script>
    <script>
        $(document).ready(function() {
           

            $().UItoTop({
                easingType: 'easeOutQuart'
            });

        });
    </script>
    <!--// end-smoth-scrolling -->
    <!-- /js -->
    <script src="js/bootstrap.js"></script>
    <!-- //js -->
</body>

</html>