<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<form id="formulario">
					<h2> Realizar Atendimento</h2>
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
					<td><label> Serviço: </label>
					<select class="servico">
					<c:forEach var="servicos" items="${servico}">
						<option value="${servicos.id}">${servicos.nome}</option>
						<option class="${servicos.nome}" hidden="hidden">${servicos.valor}</option>
					</c:forEach>
					</select></td>
					</tr>
					</table>
					<div class="include" id=include></div>
					<br/><br/>
					<input type="reset" value="Limpar" class="botao" id="limpar">
					<input type="button" value="Atender" class="botao" id="RegistraAtendimento">
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
					<td><label> Serviço: </label>
					<select class="servico">
					<c:forEach var="servicos" items="${servico}">
						<option value="${servicos.id}">${servicos.nome}</option>
						<option class="${servicos.nome}" hidden="hidden">${servicos.valor}</option>
					</c:forEach>
					</select></td>
					</tr>
</table>
<script type="text/javascript" src="JS/meu_script_js.js"> </script>