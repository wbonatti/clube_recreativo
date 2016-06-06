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
				<h2>Realizar Venda</h2>
				<br><br>
				<table id="principal-table">
				<tr id="1">
				<td><label> Colaborador: </label>
				<select class="forn">
				<c:forEach var="colaboradors" items="${colaborador}">
					<option value="${colaboradors.id}">${colaboradors.nome}</option>
				</c:forEach>
				</select></td>
				<td><label> Quantidade: </label>
				<input type="text" class="inteiro quantidade" placeholder="Qtd de itens"/></td>
				<td><label> Produto: </label>
				<select class="prod unidade">
					<c:forEach var="produtos" items="${produto}">
						<option value="${produtos.id}">${produtos.nome}</option>
						<option class="${produtos.nome}" hidden="hidden">${produtos.venda}</option>
					</c:forEach>
				</select></td>
				</table>
				<div class="include" id=include></div>
				<br>
				<table>
				<tr>
				<td><label> Selecione o Socio: </label>
				<select class="socio">
				<c:forEach var="socios" items="${socio}">
					<option value="${socios.id}">${socios.nome}</option>
				</c:forEach>
				</select>
				</td>
				<td><div id="valTotalDiv">
				<label> Total: </label>
				<input type="text" id="total" class="valor" disabled="disabled" value="0,00"/>
				</div></td></tr>					
				</table>
				<br/><br/>
				<input type="reset" value="Limpar" class="botao" id="limpar">
				<input type="button" value="Vender" class="botao" id="RegistraCompra">
				<table hidden="hidden">
				<tr class="tr_include">
									<td><label> Colaborador: </label>
									<select class="colab">
									<c:forEach var="colaboradors" items="${colaborador}">
										<option value="${colaboradors.id}">${colaboradors.nome}</option>
									</c:forEach>
									</select></td>
									<td><label> Quantidade: </label>
									<input type="text" class="inteiro quantidade" placeholder="Qtd de itens"/></td>
									<td><label> Produto: </label>
									<select class="prod unidade">
										<c:forEach var="produtos" items="${produto}">
											<option value="${produtos.id}">${produtos.nome}</option>
											<option class="${produtos.nome}" hidden="hidden">${produtos.venda}</option>
										</c:forEach>
									</select></td>
				</table>
			</section>
		</form>
		<div id="resposta_banco" title="Banco de Dados"></div>
		<c:import url="/rodape.jsp"/>

	</body>
</html>