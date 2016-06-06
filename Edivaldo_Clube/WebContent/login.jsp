<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<c:import url="head.jsp"/>
</head>

<body>
<c:import url="/header.jsp"/>
<form action="mvc" method="post" id="formulario">
	<input type="text" value="FazerLogin" id="logica" name="logica" hidden="hidden">
	<section>
		<div class="gray">
			<label>Usuario:</label>
			<input type="text" id="usuario" name="usuario"><br><br>
			<label>Senha:</label>
			<input type="password" id="senha" name="senha">
			<br><br><br>
			<input type="reset" class="botao">
			<input type="submit" class="botao">
		</div>
	</section>
</form>
<c:import url="/rodape.jsp"></c:import>

</body>
</html>