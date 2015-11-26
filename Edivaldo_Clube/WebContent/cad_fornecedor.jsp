<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<form id="formulario">
					<h2> Cadastro de Fornecedor</h2>					
					<br><br>
					<label> Nome: </label>
					<input type="text" id="nome" placeholder="Nome do fornecedor" value="${fornecedor.nome }"/>
					<label> CNPJ: </label>
					<input type="text" id="cnpj" value="${fornecedor.cnpj }"/>
					<br/>
					<label> Telefone: </label>
					<input type="text" id="fone" value="${fornecedor.fone }"/>
					<br/>
					<input type="text" id="logica" name="logica" value="AdicionaFornecedor" hidden="hidden">
					<br/><br/>
					<input type="reset" value="Limpar" class="botao">
					<input type="button" value="cadastrar" class="botao" id="CadastroFornecedor">
</form>
<script>
if($("#nome").val()!=""){
	$("#logica").val("AtualizarFornecedor");
	$("h2").html("Editar Fornecedor");
}
</script>
<script type="text/javascript" src="JS/meu_script_js.js"> </script>