<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<h2>Consulta Fornecedor</h2>
<br><br>
<table>
<tr>
<th>Nome</th>
<th>CNPJ</th>
<th>Telefone</th>
<th></th>
<th></th>
</tr>
<c:forEach var="forn" items="${fornecedor}" varStatus="id">

<tr bgcolor="#${id.count %2!=0? '9999CC':'C2C2E0' }">
	<td>${forn.nome}</td>
	<td>${forn.cnpj}</td>
	<td>${forn.fone}</td>
	<td onclick="javascript:prepara_edit_contato(${forn.id})"><div title="Editar" class="Editar"></div></td>
	<td onclick="javascript:prepara_rm_contato(${forn.id})"><div title="Excluir" class="Excluir"></div></td>
</tr>
</c:forEach>
</table>
<div id="resp_banco"></div>
<script>
function prepara_rm_contato(idse){
	$("#resp_banco").html('Deseja excluir o Fornecedor?').dialog({
		width: 400,
		buttons: [
			{
				text: "Sim",
				click: function() {
					$( this ).dialog( "close" );
					$.post( "mvc", { id: idse, logica:"RemoveFornecedor"}, function(data){
						$("article").html(data);
					});
				}
			},
			{
				text: "Cancelar",
				click: function() {
					$( this ).dialog( "close" );
				}
			}
		]
	});
}

function prepara_edit_contato(sociose){
	$.post( "mvc", { id: sociose, logica:"CarregaAtualizaFornecedor" } )
	.done(function(data){
		$("article").html(data);
	});
}
</script>
<script type="text/javascript" src="JS/meu_script_js.js"> </script>