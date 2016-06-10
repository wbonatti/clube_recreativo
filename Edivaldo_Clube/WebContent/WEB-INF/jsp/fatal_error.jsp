<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>Pagina n&atilde;o encontrada</title>
	<link rel="shortcut icon" href="<c:url value="/CSS/images/logo.ico"/>"> 
	<link type="text/css" rel="stylesheet" href="<c:url value="/CSS/estilo.css"/>"/>
</head>

<body>
<header> 
	<c:import url="/header.jsp"></c:import>
</header>

<div class="azul">
	<span>Fatal Error<br><br> Contate o administrador!!<br><br>Para voltar &agrave; home <a href="inicio.jsp">clique aqui</a></span>
</div>
<c:import url="/rodape.jsp"></c:import>

</body>
</html>