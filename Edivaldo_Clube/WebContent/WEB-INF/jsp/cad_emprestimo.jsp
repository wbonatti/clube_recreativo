<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<form id="formulario">
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
</form>
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
<script type="text/javascript" src="JS/meu_script_js.js"> </script>