<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<form id="formulario">
					<h2> Cadastro de Produto</h2>					
					<br><br>
					<label> Nome: </label>
					<input type="text" id="nome" value="${produto.nome}" placeholder="Nome do produto"/>
					<label> Pre&ccedil;o de custo: </label>
					<input type="text" id="compra" value="<fmt:formatNumber value="${produto.compra}" pattern="#,##0.00"/>" class="valor"/>
					<br/>
					<label> Pre&ccedil;o de venda: </label>
					<input type="text" id="venda" class="valor" value="<fmt:formatNumber value="${produto.venda}" pattern="#,##0.00"/>"/>
					<input type="text" id="logica" name="logica" value="AdicionaProduto" hidden="hidden">
					<br/><br/>
					<input type="reset" value="Limpar" class="botao">
					<input type="button" value="cadastrar" class="botao" id="CadastroProduto">
</form>
<script>
if($("#nome").val()!=""){
	$("#logica").val("AtualizarProduto");
	$("h2").html("Editar Produto");
	$("#nome").prop("disabled", true);
}
</script>
<script type="text/javascript" src="JS/meu_script_js.js"> </script>