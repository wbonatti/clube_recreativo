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
</ul></li>
<li>Pesquisar
<ul>
<li onclick="adicionaLogicaESubmita('BuscaSocio')">S&oacute;cio</li>
<li onclick="adicionaLogicaESubmita('BuscaColaborador')">Colaborador</li>
<li onclick="adicionaLogicaESubmita('BuscaServico')">Servi&ccedil;o</li>
<li onclick="adicionaLogicaESubmita('BuscaProduto')">Produto</li>
<li onclick="adicionaLogicaESubmita('BuscaRecurso')">Recurso</li>
<li onclick="adicionaLogicaESubmita('BuscaAcervo')">Acervo</li>
<li onclick="adicionaLogicaESubmita('BuscaFornecedor')">Fornecedor</li>
</ul></li>
<li id="cad_reserva">Registrar
<ul>
<li id="registrar_compra">Compra</li>
<li id="registrar_emprestimo">Emprestimo</li>
<li id="registrar_atendimento">Atendimento</li>
<li id="registrar_venda">Venda</li>
<li id="registrar_reserva">Reserva</li>
</ul></li>
<li id="cad_reserva">Relat&oacute;rios
<ul>
<li id="relatorio_compra">Compra</li>
<li id="relatorio_emprestimo">Emprestimo</li>
<li id="relatorio_atendimento">Atendimento</li>
<li id="relatorio_venda">Venda</li>
<li id="relatorio_reserva">Reserva</li>
</ul>
<li onclick="adicionaLogicaESubmita('FazerLogOff')">Sair

<script type="text/javascript">
	//adiciona a logica e faz o submit no form
	function adicionaLogicaESubmita(logica){
		$("#logica").val(logica);
		$("#formulario").submit();
	};
</script>