<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<title>Pagina n&atilde;o encontrada</title>
	<link rel="shortcut icon" href='<c:url value="/CSS/images/logo.ico"/>'> 
	<link type="text/css" rel="stylesheet" href="<c:url value="/CSS/estilo.css"/>"/>
	
</head>

<body>
<c:import url="/header.jsp"/>

<div class="azul">
	<span>Erro 404<br><br> A P&aacute;gina que voc&ecirc; procura n&atilde;o existe!!!<br><br>Para voltar &agrave; home <a href="inicio.jsp">clique aqui</a></span>
</div>
<c:import url="/rodape.jsp"></c:import>

</body>
</html>