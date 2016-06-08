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
			<input type="text" hidden="hidden" id="logica" name="logica" value="AdicionaProduto">
			<section id="conteudo">
				<h2> Cadastro de Produto</h2>					
				<br><br>
				<label> Nome: </label>
				<input type="text" id="nome" value="${produto.nome}" placeholder="Nome do produto" name="nome"/>
				<label> Pre&ccedil;o de custo: </label>
				<input type="text" id="compra" value="<fmt:formatNumber value="${produto.compra}" pattern="#,##0.00"/>" class="valor" name="compra"/>
				<br/>
				<label> Pre&ccedil;o de venda: </label>
				<input type="text" id="venda" class="valor" value="<fmt:formatNumber value="${produto.venda}" pattern="#,##0.00"/>" name="venda"/>
				<br/><br/>
				<input type="reset" value="Limpar" class="botao">
				<input type="button" value="cadastrar" class="botao" id="CadastroProduto">
			</section>
		</form>
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
