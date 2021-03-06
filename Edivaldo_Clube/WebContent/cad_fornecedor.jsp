<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<c:import url="head.jsp"/>
</head>
	<body>
		<c:import url="header.jsp"/>
		
		<c:import url="aside.jsp"/>
		<form id="formulario" action="mvc" method="post">
			<input type="text" hidden="hidden" id="logica" name="logica" value="AdicionaFornecedor">
			<section id="conteudo">
				<h2> Cadastro de Fornecedor</h2>					
				<br><br>
				<label> Nome: </label>
				<input type="text" id="nome" placeholder="Nome do fornecedor" value="${fornecedor.nome }" name="nome"/>
				<label> CNPJ: </label>
				<input type="text" id="cnpj" value="${fornecedor.cnpj }" name="cnpj"/>
				<br/>
				<label> Telefone: </label>
				<input type="text" id="fone" value="${fornecedor.fone }" name="fone"/>
				<br/>
				<br/><br/>
				<input type="reset" value="Limpar" class="botao">
				<input type="button" value="cadastrar" class="botao" id="CadastroFornecedor">
				
			</section>
		</form>
		<c:import url="rodape.jsp"/>
	
		<script>
		if($("#nome").val()!=""){
			$("#logica").val("AtualizarFornecedor");
			$("h2").html("Editar Fornecedor");
		}
		</script>

	</body>
</html>
