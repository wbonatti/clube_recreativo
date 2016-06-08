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
			<input type="text" hidden="hidden" id="logica" name="logica" value="AdicionaServicos">
			<section id="conteudo">
				<h2> Cadastro de Servi&ccedil;o</h2>					
				<br><br>
				<label> Nome: </label>
				<input type="text" id="descricao" placeholder="Nome do servico"value="${servico.nome}" name="descricao"/>
				<label> Valor: </label>
				<input type="text" id="valor" class="valor"value="<fmt:formatNumber value="${servico.valor}" pattern="#,##0.00"/>" name="valor"/>
				<br/>
				<br/><br/>
				<input type="reset" value="Limpar" class="botao">
				<input type="button" value="cadastrar" class="botao" id="CadastroService">
			</section>
		</form>
		<c:import url="rodape.jsp"/>
	
		<script>
			if($("#descricao").val()!=""){
				$("#logica").val("AtualizarServico");
				$("h2").html("Editar Servi&ccedil;o");
				$("#descricao").prop("disabled", true);
			}
		</script>

	</body>
</html>

