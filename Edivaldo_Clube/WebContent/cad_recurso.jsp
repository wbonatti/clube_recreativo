<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<form id="formulario">
					<h2> Cadastro de Recurso</h2>					
					<br><br>
					<label> Nome: </label>
					<input type="text" id="nome" value="${recurso.nome}" placeholder="Nome do recurso"/>
					<label> Valor: </label>
					<input type="text" id="valor" class="valor" value="<fmt:formatNumber value="${recurso.valor}" pattern="#,##0.00"/>"/>
					<br/>
					<input type="text" id="logica" name="logica" value="AdicionaRecurso" hidden="hidden">
					<br/><br/>
					<input type="reset" value="Limpar" class="botao">
					<input type="button" value="cadastrar" class="botao" id="CadastroRecurso">
</form>
<script>
if($("#nome").val()!=""){
	$("#logica").val("AtualizarRecurso");
	$("h2").html("Editar Recurso");
	$("#nome").prop("disabled", true);
}
</script>
<script type="text/javascript" src="JS/meu_script_js.js"> </script>