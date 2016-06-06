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
				<h2>Relat&oacute;rio de Compra</h2>
				<br><br>
				<table>
				<tr>
				<th>Quantidade</th>
				<th>Nome Produto</th>
				<th>Nome Fornecedor</th>
				<th>Data</th>
				<th>Valor Total</th>
				</tr>
				<c:forEach var="comp" items="${compra}" varStatus="id">
				
				<tr bgcolor="#${id.count %2!=0? 'bfbfbf':'8c8c8c' }">
					<td>${comp.compraQtdItem}</td>
					<td>${comp.nomeProduto}</td>
					<td>${comp.nomeFornecedor}</td>
					<td><fmt:formatDate value="${comp.data.time}" pattern="dd/MM/yyyy"/></td>
					<td>${comp.compraValorTotal}</td>
				</tr>
				</c:forEach>
				</table>
				<div id="resp_banco"></div>
				<br>
				<br>
				<input type="button" value="Imprimir" class="botao" onclick="javascript:window.print()">
			</section>
		</form>
		<div id="resposta_banco" title="Banco de Dados"></div>
		<c:import url="/rodape.jsp"/>
	
	</body>
</html>