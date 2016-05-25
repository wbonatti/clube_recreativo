<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<h2>Consulta Produtos</h2>
<br><br>
<table>
<tr>
<th>Nome</th>
<th>Preco Custo</th>
<th>Preco Venda</th>
<th></th>
<th></th>
</tr>
<c:forEach var="produtos" items="${produto}" varStatus="id">

<tr bgcolor="#${id.count %2!=0? 'bfbfbf':'8c8c8c' }">
	<td>${produtos.nome}</td>
	<td>${produtos.compra}</td>
	<td>${produtos.venda}</td>
	<td onclick="javascript:prepara_edit_contato(${produtos.id})"><div title="Editar" class="Editar"></div></td>
	<td onclick="javascript:prepara_rm_contato(${produtos.id})"><div title="Excluir" class="Excluir"></div></td>
</tr>
</c:forEach>
</table>
<div id="resp_banco"></div>
<script>
function prepara_rm_contato(idse){
	$("#resp_banco").html('Deseja excluir o Produto?').dialog({
		width: 400,
		buttons: [
			{
				text: "Sim",
				click: function() {
					$( this ).dialog( "close" );
					$.post( "mvc", { id: idse, logica:"RemoveProduto"} , function(data){
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
	$.post( "mvc", { id: sociose, logica:"CarregaAtualizaProduto" } )
	.done(function(data){
		$("article").html(data);
	});
}
</script>
<script type="text/javascript" src="JS/meu_script_js.js"> </script>