<%@page import="impl.CartDAOImpl"%>
<%@page import="dao.CartDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Cart</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
<link href='https://fonts.googleapis.com/css?family=Sofia' rel='stylesheet'>


<%

CartDAO kdao = new CartDAOImpl();

String email = request.getParameter("email");


	
%>

</head>
<body style="margin: auto; width: 80%;">

<div class=container style="text-align: center; ">
    
     <i class="far fa-grin-beam" aria-hidden="true" style="font-size:20vw;color:dimgrey; margin-top: 10px;"> 
 </i>
		<h1 style="font-family: 'Sofia';">Thank You For Visit</h1>
    
	<h1 style=" font-family: 'Sofia';">We Are Happy to Serve You</h1>
	<hr>
	 <a href="DeleteCart?email=<%=request.getParameter("email")%>" class="btn btn-danger">Continue</a>
   
</div>
	
	
    
		


</body>
</html>