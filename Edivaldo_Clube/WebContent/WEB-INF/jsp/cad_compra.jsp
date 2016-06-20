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
			<input type="text" hidden="hidden" id="logica" name="logica" value="RegistraCompra">
			<section id="conteudo">
				<h2>Realizar Compra</h2>
				<br><br>
				<table>
					<tr>
						<td>
							<label> Fornecedor: </label>
							<select class="forn" name="forn1">
							<c:forEach var="fornecedores" items="${fornecedor}">
								<option value="${fornecedores.id}">${fornecedores.nome}</option>
							</c:forEach>
							</select>
						</td>
						<td>
							<label> Quantidade: </label>
							<input type="text" class="inteiro quantidade" placeholder="Qtd de itens" name="qtd1"/>
						</td>
						<td>
							<label> Produto: </label>
							<select class="prod" name="prod1">
								<c:forEach var="produtos" items="${produto}">
									<option value="${produtos.id}">${produtos.nome}</option>
								</c:forEach>
							</select>
						</td>
						<td>
							<label>Preco Unidade: </label>
							<input type="text" class="valor carregaValor" name="preco1"/>
						</td>
					</tr>
					<tr hidden="hidden" id="2">
						<td>
							<label> Fornecedor: </label>
							<select class="forn" name="forn2">
								<c:forEach var="fornecedores" items="${fornecedor}">
									<option value="${fornecedores.id}">${fornecedores.nome}</option>
								</c:forEach>
							</select>
						</td>
						<td>
							<label> Quantidade: </label>
							<input type="text" class="inteiro quantidade" placeholder="Qtd de itens"name="qtd2"/>
						</td>
						<td>
							<label> Produto: </label>
							<select class="prod" name="prod2">
								<c:forEach var="produtos" items="${produto}">
									<option value="${produtos.id}">${produtos.nome}</option>
								</c:forEach>
							</select>
						</td>
						<td>
							<label>Preco Unidade: </label>
							<input type="text" class="valor carregaValor" name="preco2"/>
						</td>
					</tr>
					<tr hidden="hidden" id="3">
						<td>
							<label> Fornecedor: </label>
							<select class="forn" name="forn3">
								<c:forEach var="fornecedores" items="${fornecedor}">
									<option value="${fornecedores.id}">${fornecedores.nome}</option>
								</c:forEach>
							</select>
						</td>
						<td>
							<label> Quantidade: </label>
							<input type="text" class="inteiro quantidade" placeholder="Qtd de itens"name="qtd3"/>
						</td>
						<td>
							<label> Produto: </label>
							<select class="prod" name="prod3">
								<c:forEach var="produtos" items="${produto}">
									<option value="${produtos.id}">${produtos.nome}</option>
								</c:forEach>
							</select>
						</td>
						<td>
							<label>Preco Unidade: </label>
							<input type="text" class="valor carregaValor" name="preco3"/>
						</td>
					</tr>
					<tr hidden="hidden" id="4">
						<td>
							<label> Fornecedor: </label>
							<select class="forn" name="forn4">
								<c:forEach var="fornecedores" items="${fornecedor}">
									<option value="${fornecedores.id}">${fornecedores.nome}</option>
								</c:forEach>
							</select>
						</td>
						<td>
							<label> Quantidade: </label>
							<input type="text" class="inteiro quantidade" placeholder="Qtd de itens"name="qtd4" maxlength="3"/>
						</td>
						<td>
							<label> Produto: </label>
							<select class="prod" name="prod4">
								<c:forEach var="produtos" items="${produto}">
									<option value="${produtos.id}">${produtos.nome}</option>
								</c:forEach>
							</select>
						</td>
						<td>
							<label>Preco Unidade: </label>
							<input type="text" class="valor carregaValor" name="preco4"/>
						</td>
					</tr>
				</table>
				<div class="include" id="include"></div>
				<br>
				<div id="valTotalDiv">
					<label> Total: </label>
					<input type="text" id="total" class="valor" disabled="disabled" name="total" value="0,00"/>
				</div>
				<br/><br/>
				<input type="reset" value="Limpar" class="botao" id="limpar">
				<input type="button" value="Comprar" class="botao" id="RegistraCompra">
			</section>
		</form>
		<div id="resposta_banco" title="Banco de Dados"></div>
		<c:import url="/rodape.jsp"/>
	
	</body>
</html>