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
				<h2>Consulta Colaborador</h2>
				<br><br>
				<label>Busca por nome:</label>
				<input type="text" maxlength="15" class="filtroTela">
				<br/><br/>
				<table>
				<tr>
				<th>Nome</th>
				<th>CPF</th>
				<th>Telefone</th>
				<th></th>
				<th></th>
				</tr>
				<c:forEach var="colab" items="${colaborador}" varStatus="id">
				
				<tr bgcolor="#${id.count %2!=0? 'bfbfbf':'8c8c8c' }">
					<td class="nome">${colab.nome}</td>
					<td>${colab.cpf}</td>
					<td>${colab.fone}</td>
					<td onclick="prepara_edit_contato(${colab.id}, 'CarregaAtualizaColaborador')"><div title="Editar" class="Editar"></div></td>
					<td onclick="prepara_rm_contato(${colab.id}, 'RemoveColaborador')"><div title="Excluir" class="Excluir"></div></td>
				</tr>
				</c:forEach>
				</table>
			</section>
		</form>
		<div id="resposta_banco" title="Banco de Dados"></div>
		<c:import url="/rodape.jsp"/>
		
	</body>
</html>

		