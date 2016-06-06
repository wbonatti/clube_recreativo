<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<c:import url="/head.jsp"/>
</head>
	<body>
		<c:import url="/header.jsp"/>
		
		<c:import url="/aside.jsp"/>
		<form id="formulario" action="mvc" method="post">
			<input type="text" hidden="hidden" id="logica" name="logica">
			<section id="conteudo">
				<h2> Realizar Emprestimo</h2>
				<br><br>
				<table id="principal-table">
				<tr id="1">
				<td><label> Colaborador: </label>
				<select class="colaborador">
				<c:forEach var="Colaboradors" items="${Colaborador}">
					<option value="${Colaboradors.id}">${Colaboradors.nome}</option>
				</c:forEach>
				</select></td>
				<td><label> Socio: </label>
				<select class="socio">
				<c:forEach var="socios" items="${socio}">
					<option value="${socios.id}">${socios.nome}</option>
				</c:forEach>
				</select></td>
				<td><label> Acervo: </label>
				<select class="acervo">
				<c:forEach var="acervos" items="${acervo}">
					<option value="${acervos.id}">${acervos.descricao}</option>
					<option class="${acervos.descricao}" hidden="hidden">${acervos.valor}</option>
				</c:forEach>
				</select></td>
				</tr>
				</table>
				<div class="include" id=include></div>
				<br/><br/>
				<input type="reset" value="Limpar" class="botao" id="limpar">
				<input type="button" value="Emprestar" class="botao" id="RegistraEmprestimo">
				<table hidden="hidden">
				<tr class="tr_include">
									<td><label> Colaborador: </label>
									<select class="colaborador">
									<c:forEach var="Colaboradors" items="${Colaborador}">
										<option value="${Colaboradors.id}">${Colaboradors.nome}</option>
									</c:forEach>
									</select></td>
									<td><label> Socio: </label>
									<select class="socio">
									<c:forEach var="socios" items="${socio}">
										<option value="${socios.id}">${socios.nome}</option>
									</c:forEach>
									</select></td>
									<td><label> Acervo: </label>
									<select class="acervo">
									<c:forEach var="acervos" items="${acervo}">
										<option value="${acervos.id}">${acervos.descricao}</option>
										<option class="${acervos.descricao}" hidden="hidden">${acervos.valor}</option>
									</c:forEach>
									</select></td>
									</tr>
				</table>
			</section>
		</form>
		<div id="resposta_banco" title="Banco de Dados"></div>
		<c:import url="/rodape.jsp"/>
	
	</body>
</html>