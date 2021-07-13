<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="/css/estiloHora.css">
    <script type="text/javascript" src="js/appHora.js"></script>
    
    
	<title>Mostrando la Hora</title>
</head>
<body>

	<h1><c:out value="${Hora}"/></h1>

</body>
</html>