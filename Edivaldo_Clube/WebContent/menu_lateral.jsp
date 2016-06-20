<li><a href="inicio.jsp">Home</a></li>
<li>Cadastrar
	<ul>
		<li onclick="adicionaLogicaESubmita('CarregaAdicionaSocio')">S&oacute;cio</li>
		<li onclick="adicionaLogicaESubmita('CarregaAdicionaColaborador')">Colaborador</li>
		<li onclick="adicionaLogicaESubmita('CarregaAdicionaServico')">Servi&ccedil;o</li>
		<li onclick="adicionaLogicaESubmita('CarregaAdicionaProduto')">Produto</li>
		<li onclick="adicionaLogicaESubmita('CarregaAdicionaRecurso')">Recurso</li>
		<li onclick="adicionaLogicaESubmita('CarregaAdicionaAcervo')">Acervo</li>
		<li onclick="adicionaLogicaESubmita('CarregaAdicionaFornecedor')">Fornecedor</li>
	</ul>
</li>
<li>Pesquisar
	<ul>
		<li onclick="adicionaLogicaESubmita('BuscaSocio')">S&oacute;cio</li>
		<li onclick="adicionaLogicaESubmita('BuscaColaborador')">Colaborador</li>
		<li onclick="adicionaLogicaESubmita('BuscaServico')">Servi&ccedil;o</li>
		<li onclick="adicionaLogicaESubmita('BuscaProduto')">Produto</li>
		<li onclick="adicionaLogicaESubmita('BuscaRecurso')">Recurso</li>
		<li onclick="adicionaLogicaESubmita('BuscaAcervo')">Acervo</li>
		<li onclick="adicionaLogicaESubmita('BuscaFornecedor')">Fornecedor</li>
	</ul>
</li>
<li id="cad_reserva">Registrar
	<ul>
		<li onclick="adicionaLogicaESubmita('BuscaProdutoCompra')">Compra</li>
		<li onclick="adicionaLogicaESubmita('BuscaProdutoEmprestimo')">Emprestimo</li>
		<li onclick="adicionaLogicaESubmita('BuscaProdutoAtendimento')">Atendimento</li>
		<li onclick="adicionaLogicaESubmita('BuscaProdutoVenda')">Venda</li>
	</ul>
</li>
<li id="cad_reserva">Relat&oacute;rios
	<ul>
		<li onclick="adicionaLogicaESubmita('BuscaCompra')">Compra</li>
		<li onclick="adicionaLogicaESubmita('BuscaEmprestimo')">Emprestimo</li>
		<li onclick="adicionaLogicaESubmita('BuscaAtendimento')">Atendimento</li>
		<li>Venda</li>
	</ul>
<li onclick="adicionaLogicaESubmita('FazerLogOff')">Sair

<script type="text/javascript">
	//adiciona a logica e faz o submit no form
	function adicionaLogicaESubmita(logica){
		$("#logica").val(logica);
		$("#formulario").submit();
	};
</script>