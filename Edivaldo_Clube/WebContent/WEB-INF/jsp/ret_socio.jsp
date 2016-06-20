<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
	<c:import url="/head.jsp"/>
</head>
	<body>
		<c:import url="/header.jsp"/>
		
		<c:import url="/aside.jsp"/>
		<form id="formulario" action="mvc" method="post">
			<input type="text" hidden="hidden" id="logica" name="logica">
			<input type="text" hidden="hidden" id="id" name="id">
			<section id="conteudo">
				<h2>Consulta Socios</h2>
				<br><br>
				<label>Busca por nome:</label>
				<input type="text" maxlength="15" class="filtroTela">
				<br/><br/>
				<table>
				<tr>
				<th>Socio</th>
				<th>Nome</th>
				<th>Telefone</th>
				<th>Endereco</th>
				<th></th>
				<th></th>
				</tr>
				<c:forEach var="socios" items="${socio}" varStatus="id">
				
				<tr bgcolor="#${id.count %2!=0? 'bfbfbf':'8c8c8c' }">
					<c:choose>
					<c:when test="${socios.tipo == 'T'}">
						<td>Titular</td>
					</c:when>
					<c:otherwise>
						<td>Dependente</td>
					</c:otherwise>
					</c:choose>
					<td class="nome">${socios.nome}</td>
					<td>${socios.fone}</td>
					<td>${socios.endereco}</td>
					<td onclick="prepara_edit_contato(${socios.id},'CarregaAtualizaSocio')"><div title="Editar" class="Editar"></div></td>
					<td onclick="prepara_rm_contato(${socios.id},'RemoveSocio')"><div title="Excluir" class="Excluir"></div></td>
				</tr>
				</c:forEach>
				</table>
			</section>
		</form>
		<div id="resposta_banco" title="Exclusão"></div>
		<c:import url="/rodape.jsp"/>
		
	</body>
</html>
		