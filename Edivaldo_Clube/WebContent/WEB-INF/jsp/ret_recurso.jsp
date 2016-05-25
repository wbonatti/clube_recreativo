<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<h2>Consulta Recursos</h2>
<br><br>
<table>
<tr>
<th>Nome</th>
<th>Valor</th>
<th></th>
<th></th>
</tr>
<c:forEach var="Recursos" items="${recurso}" varStatus="id">

<tr bgcolor="#${id.count %2!=0? 'bfbfbf':'8c8c8c' }">
	<td>${Recursos.nome}</td>
	<td>${Recursos.valor}</td>
	<td onclick="javascript:prepara_edit_contato(${Recursos.id})"><div title="Editar" class="Editar"></div></td>
	<td onclick="javascript:prepara_rm_contato(${Recursos.id})"><div title="Excluir" class="Excluir"></div></td>
</tr>
</c:forEach>
</table>
<div id="resp_banco"></div>
<script>
function prepara_rm_contato(idse){
	$("#resp_banco").html('Deseja excluir o Recurso?').dialog({
		width: 400,
		buttons: [
			{
				text: "Sim",
				click: function() {
					$( this ).dialog( "close" );
					$.post( "mvc", { id: idse, logica:"RemoveRecurso"} , function(data){
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
	$.post( "mvc", { id: sociose, logica:"CarregaAtualizaRecurso" } )
	.done(function(data){
		$("article").html(data);
	});
}
</script>
<script type="text/javascript" src="JS/meu_script_js.js"> </script>