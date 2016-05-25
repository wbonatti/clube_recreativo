<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
<script type="text/javascript" src="JS/meu_script_js.js"> </script>