<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<form id="formulario" class="atualizaCadastro">
					<h2> Editar S&oacute;cio</h2>
					<br/>
					<label> S&oacute;cio: </label>
					<c:if test="${socio.tipo=='T'}">
					<input type="radio" id="socioT" name="socio" required="required" checked="checked" value="T">Titular
					</c:if>
					<c:if test="${socio.tipo =='D'}">
					<input type="radio" id="socioD" name="socio" required="required" checked="checked" value="D">Dependente
					</c:if>				
					<br><br>
					<label> Nome: </label>
					<input type="text" id="nome" value="${socio.nome}" placeholder="Nome do socio"/>
					<label> CPF: </label>
					<input type="text" id="cpf"value="${socio.cpf}"/>
					<br/>
					<label> RG: </label>
					<input type="text" id="rg" class="inteiro" placeholder="RG do socio" value="${socio.rg}" maxlength="12"/>
					<label> Telefone: </label>
					<input type="text" id="fone" value="${socio.fone}"/>
					<br/>
					<label> Respons&aacute;vel: </label>
					<select id="resp" name="resp">
							<option value="${socios.id}">${socios.cpf}</option>
					</select>
					
					<label>Expira&ccedil;&atilde;o: </label>
					<input type="text" id="dataExpira" class="data" value='<fmt:formatDate value="${socio.dataExpiracao.time}" pattern="dd/mm/yyyy"/>'/>
					<br/>
					<label> CEP: </label>
					<input type="text" id="cep" value="${socio.cep}"/>
					<label> Endere&ccedil;o: </label>
					<input type="text" id="endereco" placeholder="Endereco do socio" value="${socio.endereco}"/>
					<br/>
					<input type="text" id="logica" name="logica" value="AtualizarSocio" hidden="hidden">
					<br/><br/>
					<input type="reset" value="Limpar" class="botao" id="limpar">
					<input type="button" value="cadastrar" class="botao" id="CadastroSocio">
</form>
<script>
if($("input#socioT:checked").val()?true:false){	
	$("#cpf").prop( "disabled", false );
	$("#cep").prop( "disabled", false );
	$("#endereco").prop( "disabled", false );
	
	$("#rg").prop( "disabled", true );
	$("#resp").prop( "disabled", true );
	$("#dataExpira").prop( "disabled", true );
	$("#dataExpira").val("");
}else{				
	$("#rg").prop( "disabled", false );
	$("#resp").prop( "disabled", false );
	$("#dataExpira").prop( "disabled", false );

	$("#cpf").prop( "disabled", true );
	$("#cep").prop( "disabled", true );
	$("#endereco").prop( "disabled", true );	
}
</script>
<script type="text/javascript" src="JS/meu_script_js.js"> </script>