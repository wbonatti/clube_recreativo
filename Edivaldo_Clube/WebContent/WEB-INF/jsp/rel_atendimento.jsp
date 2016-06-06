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
			<section id="conteudo">
				<h2>Relat&oacute;rio de Atendimento</h2>
				<br><br>
				<table>
				<tr>
				<th>Data</th>
				<th>Nome Colaborador</th>
				<th>Nome Socio</th>
				<th>Servi&ccedil;o</th>
				<th>Valor</th>
				</tr>
				<c:forEach var="atend" items="${atendimento}" varStatus="id">
				
				<tr bgcolor="#${id.count %2!=0? 'bfbfbf':'8c8c8c' }">
					<td><fmt:formatDate value="${atend.data.time}" pattern="dd/MM/yyyy"/></td>
					<td>${atend.nomeColaborador}</td>
					<td>${atend.nomeSocio}</td>
					<td>${atend.nomeServico}</td>
					<td>${atend.compraValorTotal}</td>
				</tr>
				</c:forEach>
				</table>
				<br>
				<br>
				<input type="button" value="Imprimir" class="botao" onclick="javascript:window.print()">
			</section>
		</form>
		<div id="resposta_banco" title="Banco de Dados"></div>
		<c:import url="/rodape.jsp"/>
	
	</body>
</html>