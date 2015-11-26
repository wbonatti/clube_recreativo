<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<form id="formulario">
					<h2> Cadastro de S&oacute;cios</h2>
					<br/>
					<label> S&oacute;cio: </label>
					<input type="radio" id="socioT" name="socio" required="required" value="T">Titular
					<input type="radio" id="socioD" name="socio" required="required" value="D">Dependente
				
					<br><br>
					<label> Nome: </label>
					<input type="text" id="nome" placeholder="Nome do socio"/>
					<label> CPF: </label>
					<input type="text" id="cpf"/>
					<br/>
					<label> RG: </label>
					<input type="text" id="rg" class="inteiro" placeholder="RG do socio" maxlength="12"/>
					<label> Telefone: </label>
					<input type="text" id="fone"/>
					<br/>
					<label> Respons&aacute;vel: </label>
					<select id="resp" name="resp">
						<c:forEach var="socios" items="${socio}">
							<option value="${socios.id}">${socios.cpf}</option>
						</c:forEach>
					</select>
					
					<label>Expira&ccedil;&atilde;o: </label>
					<input type="text" id="dataExpira" class="data" />
					<br/>
					<label> CEP: </label>
					<input type="text" id="cep"/>
					<label> Endere&ccedil;o: </label>
					<input type="text" id="endereco" placeholder="Endereco do socio"/>
					<br/>
					<input type="text" id="logica" name="logica" value="AdicionaSocio" hidden="hidden">
					<br/><br/>
					<input type="reset" value="Limpar" class="botao" id="limpar">
					<input type="button" value="cadastrar" class="botao" id="CadastroSocio">
</form>
<script type="text/javascript" src="JS/meu_script_js.js"> </script>