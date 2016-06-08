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
			<input type="text" hidden="hidden" id="logica" name="logica" value="AdicionaRecurso">
			<section id="conteudo">
				<h2> Cadastro de Recurso</h2>					
				<br><br>
				<label> Nome: </label>
				<input type="text" id="nome" value="${recurso.nome}" placeholder="Nome do recurso" name="nome"/>
				<label> Valor: </label>
				<input type="text" id="valor" class="valor" value="<fmt:formatNumber value="${recurso.valor}" pattern="#,##0.00"/>" name="valor"/>
				<br/>
				<br/><br/>
				<input type="reset" value="Limpar" class="botao">
				<input type="button" value="cadastrar" class="botao" id="CadastroRecurso">
			</section>
		</form>
		<c:import url="rodape.jsp"/>
	
		<script>
		if($("#nome").val()!=""){
			$("#logica").val("AtualizarRecurso");
			$("h2").html("Editar Recurso");
			$("#nome").prop("disabled", true);
		}
		</script>

	</body>
</html>
