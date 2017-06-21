<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="common/taglib.jsp" %>     
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8 no-js"> <![endif]-->
<!--[if IE 9]> <html lang="en" class="ie9 no-js"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
    <!--<![endif]-->
    <!-- BEGIN HEAD -->

    <head>
   		 <title>Metronic | Dashboard</title>
   		 
		<%@include file="common/csslib.jsp" %> 
     </head>
    <!-- END HEAD -->

    <body class="page-header-fixed page-sidebar-closed-hide-logo page-content-white">
		
		<%@include file="common/header.jsp" %> 
		
        <!-- BEGIN HEADER & CONTENT DIVIDER -->
        <div class="clearfix"> </div>
        <!-- END HEADER & CONTENT DIVIDER -->
        
		<!-- BEGIN CONTAINER -->
        <div class="page-container">
            <%@include file="common/sidebar.jsp" %> 
            <!-- BEGIN CONTENT -->
            <div class="page-content-wrapper">
                <!-- BEGIN CONTENT BODY -->
                <div class="page-content">
                    <%@include file="common/pageHeader.jsp" %>
					<%@include file="common/include/homeContent.jsp" %>
			    </div>
                <!-- END CONTENT BODY -->
            </div>
            <!-- END CONTENT -->
			<%@include file="common/quickSidebar.jsp" %>
		</div>
        <!-- END CONTAINER -->
 		<%@ include file="common/footer.jsp" %>
 		<%@ include file="common/jslib.jsp" %>
    </body> 

</html>
