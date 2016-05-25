<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<h2>Relat&oacute;rio de Empr&eacute;stimo</h2>
<br><br>
<table>
<tr>
<th>Nome Colaborador</th>
<th>Nome S&oacute;cio</th>
<th>Data Empr&eacute;stimo</th>
<th>Data Devolu&ccedil;&atilde;o</th>
<th>Valor</th>
</tr>
<c:forEach var="empr" items="${Emprestimo}" varStatus="id">

<tr bgcolor="#${id.count %2!=0? 'bfbfbf':'8c8c8c'' }">
	<td>${empr.nomeColaborador}</td>
	<td>${empr.nomeSocio}</td>
	<td><fmt:formatDate value="${empr.data.time}" pattern="dd/MM/yyyy"/></td>
	<td><fmt:formatDate value="${empr.dataDevolucao.time}" pattern="dd/MM/yyyy"/></td>
	<td>${empr.compraValorTotal}</td>
</tr>
</c:forEach>
</table>
<div id="resp_banco"></div>
<br>
<br>
<input type="button" value="Imprimir" class="botao" onclick="javascript:window.print()">
<script type="text/javascript" src="JS/meu_script_js.js"> </script>