<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
	<c:import url="head.jsp"/>
</head>
	<body>
		<c:import url="header.jsp"/>
		
		<c:import url="aside.jsp"/>
		<form id="formulario" action="mvc" method="post">
			<input type="text" hidden="hidden" id="logica" name="logica">
			<section id="conteudo">
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
			</section>
		</form>
		<div id="resposta_banco" title="Banco de Dados"></div>
		<c:import url="rodape.jsp"/>
	
		<script>
		if($("#nome").val()!=""){
			$("#logica").val("AtualizarProduto");
			$("h2").html("Editar Produto");
			$("#nome").prop("disabled", true);
		}
		</script>

	</body>
</html>
