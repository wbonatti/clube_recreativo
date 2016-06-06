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
				<h2>Realizar Compra</h2>
				<br><br>
				<table id="principal-table">
				<tr id="1">
				<td><label> Fornecedor: </label>
				<select class="forn">
				<c:forEach var="fornecedores" items="${fornecedor}">
					<option value="${fornecedores.id}">${fornecedores.nome}</option>
				</c:forEach>
				</select></td>
				<td><label> Quantidade: </label>
				<input type="text" class="inteiro quantidade" placeholder="Qtd de itens"/></td>
				<td><label> Produto: </label>
				<select class="prod">
					<c:forEach var="produtos" items="${produto}">
						<option value="${produtos.id}">${produtos.nome}</option>
					</c:forEach>
				</select></td>
				<td><label>Preco Unidade: </label>
				<input type="text" class="valor unidade"/></td>
				</tr>
				</table>
				<div class="include" id=include></div>
				<br>
				<div id="valTotalDiv">
				<label> Total: </label>
				<input type="text" id="total" class="valor" disabled="disabled" value="0,00"/>
				</div>
				<br/><br/>
				<input type="reset" value="Limpar" class="botao" id="limpar">
				<input type="button" value="Comprar" class="botao" id="RegistraCompra">
				<table hidden="hidden">
					<tr class="tr_include">
						<td><label> Fornecedor: </label>
						<select class="forn">
						<c:forEach var="fornecedores" items="${fornecedor}">
							<option value="${fornecedores.id}">${fornecedores.nome}</option>
						</c:forEach>
						</select></td>
						<td><label> Quantidade: </label>
						<input type="text" class="inteiro quantidade" placeholder="Qtd de itens"/></td>
						<td><label> Produto: </label>
						<select class="prod">
							<c:forEach var="produtos" items="${produto}">
								<option value="${produtos.id}">${produtos.nome}</option>
							</c:forEach>
						</select></td>
						<td><label>Preco Unidade: </label>
						<input type="text" class="valor unidade"/></td>
					</tr>
				</table>
			</section>
		</form>
		<div id="resposta_banco" title="Banco de Dados"></div>
		<c:import url="/rodape.jsp"/>
	
	</body>
</html>