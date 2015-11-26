jQuery(document).ready(function() {
	
	$(".data").datepicker({
		changeMonth: true,
		changeYear: true,
		monthNamesShort: [ "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" ],
		yearRange: "1900:2015",
		dateFormat: "dd/mm/yyyy",
		dayNames: ["Domingo", "Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sábado"],
		dayNamesMin: ["Dom","Seg", "Ter", "Qua", "Qui", "Sex", "Sab"],
		});

	$(".data").inputmask("date",{ "clearIncomplete": true });
	$("#cpf").inputmask("999.999.999-99",{ "clearIncomplete": true });
	$("#cnpj").inputmask("99.999.999/9999-99",{ "clearIncomplete": true });
	$("#cep").inputmask("99999-999",{ "clearIncomplete": true });
	$("#fone").inputmask('(99) 9999[9]-9999', {skipOptionalPartCharacter: "-", "clearIncomplete": true});
	$(".botao").button();
	$("#menu").menu();
	$("table").css("margin-left",($("article").width()/2)-(($("table").width()+2)/2));
	$(".valor").inputmask("[9]{7},99", { placeholder:" ", 'greedy' : false});
	$(".inteiro").inputmask("9{15}",{placeholder:" ",clearMaskOnLostFocus: true});

	
/*	--------------------------------------------------------------------------------------
									CHAMA CADASTRO
--------------------------------------------------------------------------------------*/
	
	$("#cad_socio_titular").on("click",function(){
		$.ajax({
			type: "POST",
			url: "mvc",
			data: { logica: "CarregaAdicionaSocio"},
		})
		.done(function( msg ) {
			$("article").html(msg);			
		});
	});
		
	$("#cad_colaborador").on("click",function(){
		$.ajax({
			type: "POST",
			url: "cad_colaborador.jsp",
		})
		.done(function( msg ) {
			$("article").html(msg);	
		});
	});
	
	$("#cad_servicos").on("click",function(){
		$.ajax({
			type: "POST",
			url: "cad_servicos.jsp",
		})
		.done(function( msg ) {
			$("article").html(msg);		
		});
	});
	
	$("#cad_produto").on("click",function(){
		$.ajax({
			type: "POST",
			url: "cad_produto.jsp",
		})
		.done(function( msg ) {
			$("article").html(msg);		
		});
	});
	
	$("#cad_recurso").on("click",function(){
		$.ajax({
			type: "POST",
			url: "cad_recurso.jsp",
		})
		.done(function( msg ) {
			$("article").html(msg);			
		});
	});
	
	$("#cad_acervo").on("click",function(){
		$( "#limpar" ).trigger( "click" );
		$.ajax({
			type: "POST",
			url: "cad_acervo.jsp",
			cache: true,
		})
		.done(function( msg ) {
				$("article").html(msg);	
		});
	});
	
	$("#cad_fornecedor").on("click",function(){
		$.ajax({
			type: "POST",
			url: "cad_fornecedor.jsp",
		})
		.done(function( msg ) {
			$("article").html(msg);			
		});
	});

/*	--------------------------------------------------------------------------------------
										PESQUISAS
--------------------------------------------------------------------------------------*/

	$("#pesquisa_socio").on("click",function(){
		$.ajax({
			type: "POST",
			url: "mvc",
			data:{logica:"BuscaSocio"}
		})
		.done(function( msg ) {
			$("article").html(msg);
		});
	});
	
	$("#pesquisa_colaborador").on("click",function(){
		$.ajax({
			type: "POST",
			url: "mvc",
			data:{ logica:"BuscaColaborador"}
		})
		.done(function( msg ) {
			$("article").html(msg);			
		});
	});
	
	$("#pesquisa_servico").on("click",function(){
		$.ajax({
			type: "POST",
			url: "mvc",
			data:{ logica:"BuscaServico"}
		})
		.done(function( msg ) {
			$("article").html(msg);			
		});
	});

	$("#pesquisa_produto").on("click",function(){
		$.ajax({
			type: "POST",
			url: "mvc",
			data:{ logica:"BuscaProduto"}
		})
		.done(function( msg ) {
			$("article").html(msg);			
		});
	});
	
	$("#pesquisa_recurso").on("click",function(){
		$.ajax({
			type: "POST",
			url: "mvc",
			data:{ logica:"BuscaRecurso"}
		})
		.done(function( msg ) {
			$("article").html(msg);			
		});
	});

	$("#pesquisa_acervo").on("click",function(){
		$.ajax({
			type: "POST",
			url: "mvc",
			data:{ logica:"BuscaAcervo"}
		})
		.done(function( msg ) {
			$("article").html(msg);			
		});
	});
	
	$("#pesquisa_fornecedor").on("click",function(){
		$.ajax({
			type: "POST",
			url: "mvc",
			data:{ logica:"BuscaFornecedor"}
		})
		.done(function( msg ) {
			$("article").html(msg);			
		});
	});
	
	$("#registrar_compra").on("click",function(){
		$.ajax({
			type: "POST",
			url: "mvc",
			data:{ logica:"BuscaProdutoCompra"}
		})
		.done(function( msg ) {
			$("article").html(msg);			
		});
	});
	
	$("#registrar_venda").on("click",function(){
		$.ajax({
			type: "POST",
			url: "mvc",
			data:{ logica:"BuscaProdutoVenda"}
		})
		.done(function( msg ) {
			$("article").html(msg);			
		});
	});
	
	$("#registrar_emprestimo").on("click",function(){
		$.ajax({
			type: "POST",
			url: "mvc",
			data:{ logica:"BuscaProdutoEmprestimo"}
		})
		.done(function( msg ) {
			$("article").html(msg);			
		});
	});
	
	$("#registrar_atendimento").on("click",function(){
		$.ajax({
			type: "POST",
			url: "mvc",
			data:{ logica:"BuscaProdutoAtendimento"}
		})
		.done(function( msg ) {
			$("article").html(msg);			
		});
	});
	
	$("#relatorio_compra").on("click",function(){
		$.ajax({
			type: "POST",
			url: "mvc",
			data:{ logica:"BuscaCompra"}
		})
		.done(function( msg ) {
			$("article").html(msg);			
		});
	});
	
	$("#relatorio_emprestimo").on("click",function(){
		$.ajax({
			type: "POST",
			url: "mvc",
			data:{ logica:"BuscaEmprestimo"}
		})
		.done(function( msg ) {
			$("article").html(msg);			
		});
	});
	
	$("#relatorio_atendimento").on("click",function(){
		$.ajax({
			type: "POST",
			url: "mvc",
			data:{ logica:"BuscaAtendimento"}
		})
		.done(function( msg ) {
			$("article").html(msg);			
		});
	});
	
	var limpar = function(){
		$("form input").prop( "disabled", false );
		$("select").prop("disabled", false);
		$("#total").prop("disabled",true);
	};
	
	$("#limpar").click(limpar);

/*	--------------------------------------------------------------------------------------
											CADASTROS
	--------------------------------------------------------------------------------------*/
	
	$("form input:radio").on("click", function(){
		
		if($("input#socioT:checked").val()?true:false){	
			$("#cpf").prop( "disabled", false );
			$("#cep").prop( "disabled", false );
			$("#endereco").prop( "disabled", false );
			
			$("#rg").prop( "disabled", true );
			$("#resp").prop( "disabled", true );
			$("#dataExpira").prop( "disabled", true );
		}else{				
			$("#rg").prop( "disabled", false );
			$("#resp").prop( "disabled", false );
			$("#dataExpira").prop( "disabled", false );
			
			$("#cpf").prop( "disabled", true );
			$("#cep").prop( "disabled", true );
			$("#endereco").prop( "disabled", true );	
		}
		
	});
	
	$("#CadastroSocio").on("click",function(){
		var logicaO= recebeValCampo("logica");
		var cepO= recebeValCampo("cep");
		var cpfO= recebeValCampo("cpf");
		var enderecoO= recebeValCampo("endereco");
		var expiracaoO= recebeValCampo("dataExpira");
		var foneO= recebeValCampo("fone");
		var nomeO= recebeValCampo("nome");
		var responsavelO= $("#resp option:selected").val();
		var rgO= recebeValCampo("rg");
		var tipoO= $("input:checked").val();
				
		if(tipoO=='T'){
			responsavelO=0;
			expiracaoO='';
			rgO='';
		}
		else{
			cepO='';
			endereco='';
			cpf='';
		}
		if(tipoO=='T'||tipoO=='D'){
		$.ajax({
			type: "POST",
			url: "mvc",
			data: { logica: logicaO, cep: cepO, cpf: cpfO, endereco: enderecoO, expiracao: expiracaoO, fone: foneO, nome: nomeO, responsavel: responsavelO, rg: rgO, tipo: tipoO}
			})
		.done(function( msg ) {
			$("#resposta_banco").html(msg).dialog();
		});}else{
			$("#resposta_banco").html("Preencha os campos corretamente!").dialog();
		}
	});
	
	$("#CadastroColab").on("click",function(){
		var logicaO= recebeValCampo("logica");
		var cepO= recebeValCampo("cep");
		var cpfO= recebeValCampo("cpf");
		var enderecoO= recebeValCampo("endereco");
		var foneO= recebeValCampo("fone");
		var nomeO= recebeValCampo("nome");
		var rgO= recebeValCampo("rg");
				
		$.ajax({
			type: "POST",
			url: "mvc",
			data: { logica: logicaO, cep: cepO, cpf: cpfO, endereco: enderecoO, fone: foneO, nome: nomeO, rg: rgO}
			})
		.done(function( msg ) {
			$("#resposta_banco").html(msg).dialog();
		});
	});
	
	$("#CadastroService").on("click",function(){
		var logicaO= recebeValCampo("logica");
		var descO= recebeValCampo("descricao");
		var valO= recebeValCampo("valor");
				
		$.ajax({
			type: "POST",
			url: "mvc",
			data: { logica: logicaO, nome: descO, valor: valO}
			})
		.done(function( msg ) {
			$("#resposta_banco").html(msg).dialog();
		});
	});
	
	$("#CadastroProduto").on("click",function(){
		var logicaO= recebeValCampo("logica");
		var descO= recebeValCampo("nome");
		var compraO= recebeValCampo("compra");
		var vendaO= recebeValCampo("venda");
				
		$.ajax({
			type: "POST",
			url: "mvc",
			data: { logica: logicaO, nome: descO, compra: compraO, venda: vendaO}
			})
		.done(function( msg ) {
			$("#resposta_banco").html(msg).dialog();
		});
	});
	
	$("#CadastroRecurso").on("click",function(){
		var logicaO= recebeValCampo("logica");
		var descO= recebeValCampo("nome");
		var valO= recebeValCampo("valor");
				
		$.ajax({
			type: "POST",
			url: "mvc",
			data: { logica: logicaO, nome: descO, valor: valO}
			})
		.done(function( msg ) {
			$("#resposta_banco").html(msg).dialog();
		});
	});
	
	$("#CadastroAcervo").on("click", function(){
		var logicaO= recebeValCampo("logica");
		var descO= recebeValCampo("descricao");
		var valO= recebeValCampo("valor");
				
		$.ajax({
			type: "POST",
			url: "mvc",
			data: { logica: logicaO, descricao: descO, valor: valO}
			})
		.done(function( msg ) {
			$("#resposta_banco").html(msg).dialog();
		});
	});
	
	$("#CadastroFornecedor").on("click",function(){
		var logicaO= recebeValCampo("logica");
		var cnpjO= recebeValCampo("cnpj");
		var foneO= recebeValCampo("fone");
		var nomeO= recebeValCampo("nome");
				
		$.ajax({
			type: "POST",
			url: "mvc",
			data: { logica: logicaO, cnpj: cnpjO, fone: foneO, nome: nomeO}
			})
		.done(function( msg ) {
			$("#resposta_banco").html(msg).dialog();
		});
	});
	
	function recebeValCampo(campo){
		
		if($("#"+campo).val()==''){
			return null;
		}else{
			return $("#"+campo).val();
		}
	}
	
/*	--------------------------------------------------------------------------------------
											Registrar
--------------------------------------------------------------------------------------*/
	
	var carregaValor = function(){
		var qual = $("tr").length-1;
		var sobra = 0;
		if($("h2").text()=="Realizar Venda"){
			qual=qual-1;
			for (var int = 1; int <= qual; int++) {
				var val= $("#"+int+" ."+$("#"+int+" .prod option:selected").text()).text();
				var qtd = $("#"+int+" .quantidade").val();
				
				sobra = sobra+(parseFloat(qtd)*parseFloat(val));
			}
			$("#total").val(corrige(String(sobra)));
		}
		else{
			for (var int = 1; int <= qual; int++) {
				var qt = $("#"+int+" .quantidade").val();
				$("#"+int+" .quantidade").prop("disabled",true);
				var val = valida($("#"+int+" .unidade").val());
				sobra = sobra+(parseFloat(qt)*parseFloat(val));
			}
				$("#total").val(corrige(String(sobra)));
			}
	};
	
$(".unidade").blur(carregaValor);

function valida(num){
	var elo = "";
	for (var int = 0; int < num.length; int++) {
		if(num[int]==','){
			elo=elo+'.';
			continue;
		}
		elo=elo+num[int];
	}
	return elo;
};

function corrige(num){
	var elo = "";
	for (var int = 0; int < num.length; int++) {
		if(num[int]=='.'){
			elo=elo+',';
			continue;
		}
		elo=elo+num[int];
	}
	return elo;
};

$("#include").click(function(){
	var qual = ($("tr").length)-1;
	if($("h2").text()=="Realizar Venda"){
		qual=qual-1;
	}
	if(qual<5){
		if($("#"+qual+" .quantidade").val()!="" && $("#"+qual+" .unidade").val()!=""){
			$("#principal-table tbody").append("<tr id="+(qual+1)+">"+$(".tr_include").html()+"</tr>");
			if($("h2").text()=="Realizar Compra"||$("h2").text()=="Realizar Venda"){
			$.getScript("JS/meu_script_js.js");
		}}
	}else{
		$(this).hide();
	}
});

$("#RegistraCompra").on("click",function(){
	var contador = $("tr").length-1;
	switch(contador){
	case 1:
		$.ajax({
			type: "POST",
			url: "mvc",
			data: { logica: "RegistraCompra", qtd: "1", fornecedor: $("#1 .forn option:selected").val(), produto: $("#1 .prod option:selected").val(), valorTotal: recebeValCampo("total"), valorUnitario: recebeValCampo("1 .unidade"), quantidade: recebeValCampo("1 .quantidade")}
			});
		break;
	case 2: 
		$.ajax({
			type: "POST",
			url: "mvc",
			data: { logica: "RegistraCompra", qtd: "2", fornecedor: $("#1 .forn option:selected").val(), fornecedor2: $("#2 .forn option:selected").val(), produto: $("#1 .prod option:selected").val(), produto2: $("#2 .prod option:selected").val(), valorTotal: recebeValCampo("total"), valorUnitario: recebeValCampo("1 .unidade"), valorUnitario2: recebeValCampo("2 .unidade"), quantidade: recebeValCampo("1 .quantidade"), quantidade2: recebeValCampo("2 .quantidade")}
			});
		break;
	case 3: 
		$.ajax({
			type: "POST",
			url: "mvc",
			data: { logica: "RegistraCompra", qtd: "3", fornecedor: $("#1 .forn option:selected").val(), fornecedor2: $("#2 .forn option:selected").val(), fornecedor3: $("#3 .forn option:selected").val(), produto: $("#1 .prod option:selected").val(), produto2: $("#2 .prod option:selected").val(), produto3: $("#3 .prod option:selected").val(), valorTotal: recebeValCampo("total"), valorUnitario: recebeValCampo("1 .unidade"), valorUnitario2: recebeValCampo("2 .unidade"), valorUnitario3: recebeValCampo("3 .unidade"), quantidade: recebeValCampo("1 .quantidade"), quantidade2: recebeValCampo("2 .quantidade"), quantidade3: recebeValCampo("3 .quantidade")}
			});
		break;
	case 4: 
		$.ajax({
			type: "POST",
			url: "mvc",
			data: { logica: "RegistraCompra", qtd: "4", fornecedor: $("#1 .forn option:selected").val(), fornecedor2: $("#2 .forn option:selected").val(), fornecedor3: $("#3 .forn option:selected").val(), fornecedor4: $("#4 .forn option:selected").val(), produto: $("#1 .prod option:selected").val(), produto2: $("#2 .prod option:selected").val(), produto3: $("#3 .prod option:selected").val(), produto4: $("#4 .prod option:selected").val(), valorTotal: recebeValCampo("total"), valorUnitario: recebeValCampo("1 .unidade"), valorUnitario2: recebeValCampo("2 .unidade"), valorUnitario3: recebeValCampo("3 .unidade"), valorUnitario4: recebeValCampo("4 .unidade"), quantidade: recebeValCampo("1 .quantidade"), quantidade2: recebeValCampo("2 .quantidade"), quantidade3: recebeValCampo("3 .quantidade"), quantidade4: recebeValCampo("4 .quantidade")}
			});
		break;
	case 5: 
		$.ajax({
			type: "POST",
			url: "mvc",
			data: { logica: "RegistraCompra", qtd: "5", fornecedor: $("#1 .forn option:selected").val(), fornecedor2: $("#2 .forn option:selected").val(), fornecedor3: $("#3 .forn option:selected").val(), fornecedor4: $("#4 .forn option:selected").val(), fornecedor5: $("#5 .forn option:selected").val(), produto: $("#1 .prod option:selected").val(), produto2: $("#2 .prod option:selected").val(), produto3: $("#3 .prod option:selected").val(), produto4: $("#4 .prod option:selected").val(), produto5: $("#5 .prod option:selected").val(), valorTotal: recebeValCampo("total"), valorUnitario: recebeValCampo("1 .unidade"), valorUnitario2: recebeValCampo("2 .unidade"), valorUnitario3: recebeValCampo("3 .unidade"), valorUnitario4: recebeValCampo("4 .unidade"), valorUnitario5: recebeValCampo("5 .unidade"), quantidade: recebeValCampo("1 .quantidade"), quantidade2: recebeValCampo("2 .quantidade"), quantidade3: recebeValCampo("3 .quantidade"),quantidade4: recebeValCampo("4 .quantidade"),quantidade5: recebeValCampo("5 .quantidade")}
			});
		break;
	}
});

$("#RegistraEmprestimo").on("click",function(){
	var contador = $("tr").length-1;
	switch(contador){
	case 1:
		$.ajax({
			type: "POST",
			url: "mvc",
			data: { logica: "RegistraEmprestimo", qtd: "1", colaborador: $("#1 .colaborador option:selected").val(), socio: $("#1 .socio option:selected").val(),  acervo: $("#1 .acervo option:selected").val(), valorUnitario: $("#1 ."+$("#1 .acervo option:selected").text()).text()}
			});
		break;
	case 2: 
		$.ajax({
			type: "POST",
			url: "mvc",
			data: { logica: "RegistraEmprestimo", qtd: "2", colaborador: $("#1 .colaborador option:selected").val(), colaborador2: $("#2 .colaborador option:selected").val(), socio: $("#1 .socio option:selected").val(), socio2: $("#2 .socio option:selected").val(),  acervo: $("#1 .acervo option:selected").val(), acervo2: $("#2 .acervo option:selected").val(), valorUnitario: $("#1 ."+$("#1 .acervo option:selected").text()).text(), valorUnitario2: $("#2 ."+$("#2 .acervo option:selected").text()).text()}
			});
		break;
	case 3: 
		$.ajax({
			type: "POST",
			url: "mvc",
			data: { logica: "RegistraEmprestimo", qtd: "3", colaborador: $("#1 .colaborador option:selected").val(), colaborador2: $("#2 .colaborador option:selected").val(), colaborador3: $("#3 .colaborador option:selected").val(), socio: $("#1 .socio option:selected").val(), socio2: $("#2 .socio option:selected").val(), socio3: $("#3 .socio option:selected").val(),  acervo: $("#1 .acervo option:selected").val(), acervo2: $("#2 .acervo option:selected").val(), acervo3: $("#3 .acervo option:selected").val(), valorUnitario: $("#1 ."+$("#1 .acervo option:selected").text()).text(), valorUnitario2: $("#2 ."+$("#2 .acervo option:selected").text()).text(), valorUnitario3: $("#3 ."+$("#3 .acervo option:selected").text()).text()}
			});
		break;
	case 4: 
		$.ajax({
			type: "POST",
			url: "mvc",
			data: { logica: "RegistraEmprestimo", qtd: "4", colaborador: $("#1 .colaborador option:selected").val(), colaborador2: $("#2 .colaborador option:selected").val(), colaborador3: $("#3 .colaborador option:selected").val(), colaborador4: $("#4 .colaborador option:selected").val(), socio: $("#1 .socio option:selected").val(), socio2: $("#2 .socio option:selected").val(), socio3: $("#3 .socio option:selected").val(), socio4: $("#4 .socio option:selected").val(),  acervo: $("#1 .acervo option:selected").val(), acervo2: $("#2 .acervo option:selected").val(), acervo3: $("#3 .acervo option:selected").val(), acervo4: $("#4 .acervo option:selected").val(), valorUnitario: $("#1 ."+$("#1 .acervo option:selected").text()).text(), valorUnitario2: $("#2 ."+$("#2 .acervo option:selected").text()).text(), valorUnitario3: $("#3 ."+$("#3 .acervo option:selected").text()).text(), valorUnitario4: $("#4 ."+$("#4 .acervo option:selected").text()).text()}
			});
		break;
	case 5: 
		$.ajax({
			type: "POST",
			url: "mvc",
			data: { logica: "RegistraEmprestimo", qtd: "5", colaborador: $("#1 .colaborador option:selected").val(), colaborador2: $("#2 .colaborador option:selected").val(), colaborador3: $("#3 .colaborador option:selected").val(), colaborador4: $("#4 .colaborador option:selected").val(), colaborador5: $("#5 .colaborador option:selected").val(), socio: $("#1 .socio option:selected").val(), socio2: $("#2 .socio option:selected").val(), socio3: $("#3 .socio option:selected").val(), socio4: $("#4 .socio option:selected").val(), socio5: $("#5 .socio option:selected").val(),  acervo: $("#1 .acervo option:selected").val(), acervo2: $("#2 .acervo option:selected").val(), acervo3: $("#3 .acervo option:selected").val(), acervo4: $("#4 .acervo option:selected").val(), acervo5: $("#5 .acervo option:selected").val(), valorUnitario: $("#1 ."+$("#1 .acervo option:selected").text()).text(), valorUnitario2: $("#2 ."+$("#2 .acervo option:selected").text()).text(), valorUnitario3: $("#3 ."+$("#3 .acervo option:selected").text()).text(), valorUnitario4: $("#4 ."+$("#4 .acervo option:selected").text()).text(), valorUnitario5: $("#5 ."+$("#5 .acervo option:selected").text()).text()}
			});
		break;
	}
});

$("#RegistraAtendimento").on("click",function(){
	var contador = $("tr").length-1;
	switch(contador){
	case 1:
		$.ajax({
			type: "POST",
			url: "mvc",
			data: { logica: "RegistraAtendimento", qtd: "1", colaborador: $("#1 .colaborador option:selected").val(), socio: $("#1 .socio option:selected").val(),  servico: $("#1 .servico option:selected").val(), valorUnitario: $("#1 ."+$("#1 .servico option:selected").text()).text()}
			});
		break;
	case 2: 
		$.ajax({
			type: "POST",
			url: "mvc",
			data: { logica: "RegistraAtendimento", qtd: "2", colaborador: $("#1 .colaborador option:selected").val(), colaborador2: $("#2 .colaborador option:selected").val(), socio: $("#1 .socio option:selected").val(), socio2: $("#2 .socio option:selected").val(),  servico: $("#1 .servico option:selected").val(), servico2: $("#2 .servico option:selected").val(), valorUnitario: $("#1 ."+$("#1 .servico option:selected").text()).text(), valorUnitario2: $("#2 ."+$("#2 .servico option:selected").text()).text()}
			});
		break;
	case 3: 
		$.ajax({
			type: "POST",
			url: "mvc",
			data: { logica: "RegistraAtendimento", qtd: "3", colaborador: $("#1 .colaborador option:selected").val(), colaborador2: $("#2 .colaborador option:selected").val(), colaborador3: $("#3 .colaborador option:selected").val(), socio: $("#1 .socio option:selected").val(), socio2: $("#2 .socio option:selected").val(), socio3: $("#3 .socio option:selected").val(),  servico: $("#1 .servico option:selected").val(), servico2: $("#2 .servico option:selected").val(), servico3: $("#3 .servico option:selected").val(), valorUnitario: $("#1 ."+$("#1 .servico option:selected").text()).text(), valorUnitario2: $("#2 ."+$("#2 .servico option:selected").text()).text(), valorUnitario3: $("#3 ."+$("#3 .servico option:selected").text()).text()}
			});
		break;
	case 4: 
		$.ajax({
			type: "POST",
			url: "mvc",
			data: { logica: "RegistraAtendimento", qtd: "4", colaborador: $("#1 .colaborador option:selected").val(), colaborador2: $("#2 .colaborador option:selected").val(), colaborador3: $("#3 .colaborador option:selected").val(), colaborador4: $("#4 .colaborador option:selected").val(), socio: $("#1 .socio option:selected").val(), socio2: $("#2 .socio option:selected").val(), socio3: $("#3 .socio option:selected").val(), socio4: $("#4 .socio option:selected").val(),  servico: $("#1 .servico option:selected").val(), servico2: $("#2 .servico option:selected").val(), servico3: $("#3 .servico option:selected").val(), servico4: $("#4 .servico option:selected").val(), valorUnitario: $("#1 ."+$("#1 .servico option:selected").text()).text(), valorUnitario2: $("#2 ."+$("#2 .servico option:selected").text()).text(), valorUnitario3: $("#3 ."+$("#3 .servico option:selected").text()).text(), valorUnitario4: $("#4 ."+$("#4 .servico option:selected").text()).text()}
			});
		break;
	case 5: 
		$.ajax({
			type: "POST",
			url: "mvc",
			data: { logica: "RegistraAtendimento", qtd: "5", colaborador: $("#1 .colaborador option:selected").val(), colaborador2: $("#2 .colaborador option:selected").val(), colaborador3: $("#3 .colaborador option:selected").val(), colaborador4: $("#4 .colaborador option:selected").val(), colaborador5: $("#5 .colaborador option:selected").val(), socio: $("#1 .socio option:selected").val(), socio2: $("#2 .socio option:selected").val(), socio3: $("#3 .socio option:selected").val(), socio4: $("#4 .socio option:selected").val(), socio5: $("#5 .socio option:selected").val(),  servico: $("#1 .servico option:selected").val(), servico2: $("#2 .servico option:selected").val(), servico3: $("#3 .servico option:selected").val(), servico4: $("#4 .servico option:selected").val(), servico5: $("#5 .servico option:selected").val(), valorUnitario: $("#1 ."+$("#1 .servico option:selected").text()).text(), valorUnitario2: $("#2 ."+$("#2 .servico option:selected").text()).text(), valorUnitario3: $("#3 ."+$("#3 .servico option:selected").text()).text(), valorUnitario4: $("#4 ."+$("#4 .servico option:selected").text()).text(), valorUnitario5: $("#5 ."+$("#5 .servico option:selected").text()).text()}
			});
		break;
	}
});

$("#RegistraVenda").on("click",function(){
	var contador = $("tr").length-1;
	switch(contador){
	case 1:
		$.ajax({
			type: "POST",
			url: "mvc",
			data: { logica: "RegistraVenda", qtd: "1", colaborador: $("#1 .forn option:selected").val(), produto: $("#1 .prod option:selected").val(), valorTotal: recebeValCampo("total"), valorUnitario: $("#1 ."+$("#1 .prod option:selected").text()).text(), quantidade: recebeValCampo("1 .quantidade"), socio: $(".socio option:selected").val()}
			});
		break;
	case 2: 
		$.ajax({
			type: "POST",
			url: "mvc",
			data: { logica: "RegistraVenda", qtd: "2", colaborador: $("#1 .forn option:selected").val(), colaborador2: $("#2 .forn option:selected").val(), produto: $("#1 .prod option:selected").val(), produto2: $("#2 .prod option:selected").val(), valorTotal: recebeValCampo("total"), valorUnitario: $("#1 ."+$("#1 .prod option:selected").text()).text(), valorUnitario2: $("#2 ."+$("#2 .prod option:selected").text()).text(), quantidade: recebeValCampo("1 .quantidade"), quantidade2: recebeValCampo("2 .quantidade"), socio: $(".socio option:selected").val()}
			});
		break;
	case 3: 
		$.ajax({
			type: "POST",
			url: "mvc",
			data: { logica: "RegistraVenda", qtd: "3", colaborador: $("#1 .forn option:selected").val(), colaborador2: $("#2 .forn option:selected").val(), colaborador3: $("#3 .forn option:selected").val(), produto: $("#1 .prod option:selected").val(), produto2: $("#2 .prod option:selected").val(), produto3: $("#3 .prod option:selected").val(), valorTotal: recebeValCampo("total"), valorUnitario: $("#1 ."+$("#1 .prod option:selected").text()).text(), valorUnitario2: $("#2 ."+$("#2 .prod option:selected").text()).text(), valorUnitario3: $("#3 ."+$("#3 .prod option:selected").text()).text(), quantidade: recebeValCampo("1 .quantidade"), quantidade2: recebeValCampo("2 .quantidade"), quantidade3: recebeValCampo("3 .quantidade"), socio: $(".socio option:selected").val()}
			});
		break;
	case 4: 
		$.ajax({
			type: "POST",
			url: "mvc",
			data: { logica: "RegistraVenda", qtd: "4", colaborador: $("#1 .forn option:selected").val(), colaborador2: $("#2 .forn option:selected").val(), colaborador3: $("#3 .forn option:selected").val(), colaborador4: $("#4 .forn option:selected").val(), produto: $("#1 .prod option:selected").val(), produto2: $("#2 .prod option:selected").val(), produto3: $("#3 .prod option:selected").val(), produto4: $("#4 .prod option:selected").val(), valorTotal: recebeValCampo("total"), valorUnitario: $("#1 ."+$("#1 .prod option:selected").text()).text(), valorUnitario2: $("#2 ."+$("#2 .prod option:selected").text()).text(), valorUnitario3: $("#3 ."+$("#3 .prod option:selected").text()).text(), valorUnitario4: $("#4 ."+$("#4 .prod option:selected").text()).text(), quantidade: recebeValCampo("1 .quantidade"), quantidade2: recebeValCampo("2 .quantidade"), quantidade3: recebeValCampo("3 .quantidade"), quantidade4: recebeValCampo("4 .quantidade"), socio: $(".socio option:selected").val()}
			});
		break;
	case 5: 
		$.ajax({
			type: "POST",
			url: "mvc",
			data: { logica: "RegistraVenda", qtd: "5", colaborador: $("#1 .forn option:selected").val(), colaborador2: $("#2 .forn option:selected").val(), colaborador3: $("#3 .forn option:selected").val(), colaborador4: $("#4 .forn option:selected").val(), colaborador5: $("#5 .forn option:selected").val(), produto: $("#1 .prod option:selected").val(), produto2: $("#2 .prod option:selected").val(), produto3: $("#3 .prod option:selected").val(), produto4: $("#4 .prod option:selected").val(), produto5: $("#5 .prod option:selected").val(), valorTotal: recebeValCampo("total"), valorUnitario: $("#1 ."+$("#1 .prod option:selected").text()).text(), valorUnitario2: $("#2 ."+$("#2 .prod option:selected").text()).text(), valorUnitario3: $("#3 ."+$("#3 .prod option:selected").text()).text(), valorUnitario4: $("#4 ."+$("#4 .prod option:selected").text()).text(), valorUnitario5: $("#5 ."+$("#5 .prod option:selected").text()).text(), quantidade: recebeValCampo("1 .quantidade"), quantidade2: recebeValCampo("2 .quantidade"), quantidade3: recebeValCampo("3 .quantidade"), quantidade4: recebeValCampo("4 .quantidade"), quantidade5: recebeValCampo("5 .quantidade"), socio: $(".socio option:selected").val()}
			});
		break;
	}
});


});