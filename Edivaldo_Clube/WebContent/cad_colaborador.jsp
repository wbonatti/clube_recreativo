<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<form id="formulario">
					<h2> Cadastro de Colaborador</h2>					
					<br><br>
					<label> Nome: </label>
					<input type="text" id="nome" value="${colaborador.nome}" placeholder="Nome do colaborador"/>
					<label> CPF: </label>
					<input type="text" id="cpf" value="${colaborador.cpf}"/>
					<br/>
					<label> RG: </label>
					<input type="text" id="rg" class="inteiro" placeholder="RG do colaborador" value="${colaborador.rg}" maxlength="12"/>
					<label> Telefone: </label>
					<input type="text" id="fone"value="${colaborador.fone}"/>
					<br/><label> CEP: </label>
					<input type="text" id="cep"value="${colaborador.cep}"/>
					<label> Endere&ccedil;o: </label>
					<input type="text" id="endereco" placeholder="Endereco do colaborador"value="${colaborador.endereco}"/>
					<br/>
					<input type="text" id="logica" name="logica" value="AdicionaColaborador" hidden="hidden">
					<br/><br/>
					<input type="reset" value="Limpar" class="botao">
					<input type="button" value="cadastrar" class="botao" id="CadastroColab">
</form>
<script>
if($("#cpf").val()!=""){
	$("#logica").val("AtualizarColaborador");
}
</script>
<script type="text/javascript" src="JS/meu_script_js.js"> </script>