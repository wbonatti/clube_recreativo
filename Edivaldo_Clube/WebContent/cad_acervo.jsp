<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<form id="formulario">
					<h2> Cadastro de Acervo</h2>					
					<br><br>
					<label> Nome: </label>
					<input type="text" id="descricao" placeholder="Nome do acervo"value="${acervo.descricao }"/>
					<label> Valor: </label>
					<input type="text" id="valor" class="valor" value="<fmt:formatNumber value="${acervo.valor}" pattern="#,##0.00"/>"/>
					<br/>
					<input type="text" id="logica" name="logica" value="AdicionaAcervo" hidden="hidden">
					<br/><br/>
					<input type="reset" value="Limpar" class="botao">
					<input type="button" value="cadastrar" class="botao" id="CadastroAcervo">
</form>
<script>
if($("#descricao").val()!=""){
	$("#logica").val("AtualizarAcervo");
	$("h2").html("Editar Acervo");
	$("#descricao").prop("disabled", true);
}
</script>
<script type="text/javascript" src="JS/meu_script_js.js"> </script>