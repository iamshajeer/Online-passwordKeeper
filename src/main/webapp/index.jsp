<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="myApp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- section import styles -->
<link rel="stylesheet" href="bower/bootstrap/dist/css/bootstrap.css"
	type="text/css">
	
	<!-- import style closes -->
	
	<!-- import scripts -->
	
	<script src="bower/jquery/dist/jquery.min.js" type="text/javascript"></script>
	<script src="bower/angular/angular.min.js" type="text/javascript"></script>
	<script src="bower/angular-route/angular-route.min.js" type="text/javascript"></script>
	
	<script src="js/app.js" type="text/javascript"></script>
	<script src="js/loginController.js" type="text/javascript"></script>
	
	<!-- import script ends -->

</head>
<body>


<div ng-view />


</body>
</html>