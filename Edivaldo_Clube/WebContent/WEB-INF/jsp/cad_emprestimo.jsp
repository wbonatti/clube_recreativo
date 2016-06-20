<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<c:import url="/head.jsp" />
</head>
<body>
	<c:import url="/header.jsp" />

	<c:import url="/aside.jsp" />
	<form id="formulario" action="mvc" method="post">
		<input type="text" hidden="hidden" id="logica" name="logica" value="RegistraEmprestimo">
		<section id="conteudo">
			<h2>Realizar Emprestimo</h2>
			<br>
			<br>
			<table>
				<tr>
					<td><label> Colaborador: </label> <select class="colaborador" name="colab1">
							<option value="">Selecione</option>
							<c:forEach var="Colaboradors" items="${Colaborador}">
								<option value="${Colaboradors.id}">${Colaboradors.nome}</option>
							</c:forEach>
					</select></td>
					<td><label> Socio: </label> <select class="socio" name="socio1">
							<option value="">Selecione</option>
							<c:forEach var="socios" items="${socio}">
								<option value="${socios.id}">${socios.nome}</option>
							</c:forEach>
					</select></td>
					<td><label> Acervo: </label> <select class="acervo" name="acervo1">
							<option value="">Selecione</option>
							<c:forEach var="acervos" items="${acervo}">
								<option value="${acervos.id}">${acervos.descricao}</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr hidden="hidden" id="2">
					<td><label> Colaborador: </label> <select class="colaborador" name="colab2">
							<option value="">Selecione</option>
							<c:forEach var="Colaboradors" items="${Colaborador}">
								<option value="${Colaboradors.id}">${Colaboradors.nome}</option>
							</c:forEach>
					</select></td>
					<td><label> Socio: </label> <select class="socio" name="socio2">
							<option value="">Selecione</option>
							<c:forEach var="socios" items="${socio}">
								<option value="${socios.id}">${socios.nome}</option>
							</c:forEach>
					</select></td>
					<td><label> Acervo: </label> <select class="acervo" name="acervo2">
							<option value="">Selecione</option>
							<c:forEach var="acervos" items="${acervo}">
								<option value="${acervos.id}">${acervos.descricao}</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr hidden="hidden" id="3">
					<td><label> Colaborador: </label> <select class="colaborador" name="colab3">
							<option value="">Selecione</option>
							<c:forEach var="Colaboradors" items="${Colaborador}">
								<option value="${Colaboradors.id}">${Colaboradors.nome}</option>
							</c:forEach>
					</select></td>
					<td><label> Socio: </label> <select class="socio" name="socio3">
							<option value="">Selecione</option>
							<c:forEach var="socios" items="${socio}">
								<option value="${socios.id}">${socios.nome}</option>
							</c:forEach>
					</select></td>
					<td><label> Acervo: </label> <select class="acervo" name="acervo3">
							<option value="">Selecione</option>
							<c:forEach var="acervos" items="${acervo}">
								<option value="${acervos.id}">${acervos.descricao}</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr hidden="hidden" id="4">
					<td><label> Colaborador: </label> <select class="colaborador" name="colab4">
							<option value="">Selecione</option>
							<c:forEach var="Colaboradors" items="${Colaborador}">
								<option value="${Colaboradors.id}">${Colaboradors.nome}</option>
							</c:forEach>
					</select></td>
					<td><label> Socio: </label> <select class="socio" name="socio4">
							<option value="">Selecione</option>
							<c:forEach var="socios" items="${socio}">
								<option value="${socios.id}">${socios.nome}</option>
							</c:forEach>
					</select></td>
					<td><label> Acervo: </label> <select class="acervo" name="acervo4">
							<option value="">Selecione</option>
							<c:forEach var="acervos" items="${acervo}">
								<option value="${acervos.id}">${acervos.descricao}</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
			</table>
			<div class="include" id=include></div>
			<br />
			<br /> <input type="reset" value="Limpar" class="botao" id="limpar">
			<input type="button" value="Emprestar" class="botao"
				id="RegistraEmprestimo">
		</section>
	</form>
	<c:import url="/rodape.jsp" />

</body>
</html>