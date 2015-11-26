<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<h2>Consulta Socios</h2>
<br><br>
<table>
<tr>
<th>Socio</th>
<th>Nome</th>
<th>Telefone</th>
<th>Endereco</th>
<th></th>
<th></th>
</tr>
<c:forEach var="socios" items="${socio}" varStatus="id">

<tr bgcolor="#${id.count %2!=0? '9999CC':'C2C2E0' }">
	<c:choose>
	<c:when test="${socios.tipo == 'T'}">
		<td>Titular</td>
	</c:when>
	<c:otherwise>
		<td>Dependente</td>
	</c:otherwise>
	</c:choose>
	<td>${socios.nome}</td>
	<td>${socios.fone}</td>
	<td>${socios.endereco}</td>
	<td onclick="javascript:prepara_edit_contato(${socios.id})"><div title="Editar" class="Editar"></div></td>
	<td onclick="javascript:prepara_rm_contato(${socios.id})"><div title="Excluir" class="Excluir"></div></td>
</tr>
</c:forEach>
</table>
<div id="resp_banco"></div>
<script>
function prepara_rm_contato(idse){
	$("#resp_banco").html('Deseja excluir o socio?').dialog({
		width: 400,
		buttons: [
			{
				text: "Sim",
				click: function() {
					$( this ).dialog( "close" );
					$.post( "mvc", { id: idse, logica:"RemoveSocio"} , function(data){
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
	$.post( "mvc", { id: sociose, logica:"CarregaAtualizaSocio" } )
	.done(function(data){
		$("article").html(data);
	});
}
</script>
<script type="text/javascript" src="JS/meu_script_js.js"> </script>