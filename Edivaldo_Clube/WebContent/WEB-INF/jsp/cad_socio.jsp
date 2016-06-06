<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<c:import url="/head.jsp"/>
</head>
	<body>
		<c:import url="/header.jsp"/>
		
		<c:import url="/aside.jsp"/>
		<form id="formulario" action="mvc" method="post">
			<input type="text" hidden="hidden" value="AdicionaSocio" id="logica" name="logica">
			<section id="conteudo">
				<h2> Cadastro de S&oacute;cios</h2>
				<br/>
				<label> S&oacute;cio: </label>
				<input type="radio" id="socioT" name="socio" required="required" value="T">Titular
				<input type="radio" id="socioD" name="socio" required="required" value="D">Dependente
			
				<br><br>
				<label> Nome: </label>
				<input type="text" id="nome" name="nome" placeholder="Nome do socio"/>
				<label> CPF: </label>
				<input type="text" id="cpf" name="cpf"/>
				<br/>
				<label> RG: </label>
				<input type="text" id="rg" class="inteiro" name="rg" placeholder="RG do socio" maxlength="12"/>
				<label> Telefone: </label>
				<input type="text" id="fone" name="fone"/>
				<br/>
				<label> Respons&aacute;vel: </label>
				<select id="resp" name="resp">
					<c:forEach var="socios" items="${socio}">
						<option value="${socios.id}">${socios.nome}</option>
					</c:forEach>
				</select>
				
				<label>Expira&ccedil;&atilde;o: </label>
				<input type="text" id="dataExpira" class="data" name="dataExpira"/>
				<br/>
				<label> CEP: </label>
				<input type="text" id="cep" name="cep"/>
				<label> Endere&ccedil;o: </label>
				<input type="text" id="endereco" name="endereco" placeholder="Endereco do socio"/>
				<br/>
				<br/><br/>
				<input type="reset" value="Limpar" class="botao" id="limpar">
				<input type="button" value="cadastrar" class="botao" id="CadastroSocio">
			</section>
		</form>
		<c:import url="/rodape.jsp"/>
	
	</body>
</html>