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
			<br>
			<input type="text" id="loginError" hidden="hidden">
			<br><br>
			<input type="reset" class="botao" value="Limpar">
			<input type="submit" class="botao" value="Login">
		</div>
	</section>
</form>
<c:import url="/rodape.jsp"></c:import>
<script type="text/javascript">
	
	var error = location.search.split("erro=")[1];
	switch (error) {
		case "1":
			$("#loginError").text("Usuário e/ou senha em branco.").show();
			break;
	}

</script>


</body>
</html>