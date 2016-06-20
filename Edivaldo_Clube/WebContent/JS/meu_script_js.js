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
	$(".valor").inputmask("[9]{7},99", { placeholder:" ", 'greedy' : false});
	$(".inteiro").inputmask("9{15}",{placeholder:" ",clearMaskOnLostFocus: true});


/*	--------------------------------------------------------------------------------------
										PESQUISAS
--------------------------------------------------------------------------------------*/
	submitaForm = function(){
		$("#formulario").submit();
	}
	
	prepara_rm_contato = function(idse, logica){ 
		$("#resposta_banco").html('Deseja realmente excluir?').dialog({
			width: 400,
			buttons: [
				{
					text: "Sim",
					click: function() {
						$( this ).dialog( "close" );
						$("#logica").val(logica);
						$("#id").val(idse);
						submitaForm();
					}
				},
				{
					text: "Cancelar",
					click: function() {
						$( this ).dialog( "close" );
					}
				}
			]
		});
	}
	
	prepara_edit_contato =  function(id, logica){
		$("#logica").val(logica);
		$("#id").val(id);
		submitaForm();
	}
	
	var limpar = function(){
		$("form input").prop( "disabled", false );
		$("select").prop("disabled", false);
		$("#total").prop("disabled",true);
	};
	
	$("#limpar").click(limpar);

/*	--------------------------------------------------------------------------------------
											CADASTROS
	--------------------------------------------------------------------------------------*/
	
	$("form input:radio").on("change", function(){
		
		if($("input#socioT").is(":checked")){	
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
		//valida os campos 
		submitaForm();
	});
	
	$("#CadastroColab").on("click",function(){
		submitaForm();
	});
	
	$("#CadastroService").on("click",function(){
		submitaForm();
	});
	
	$("#CadastroProduto").on("click",function(){
		submitaForm();
	});
	
	$("#CadastroRecurso").on("click",function(){
		submitaForm();
	});
	
	$("#CadastroAcervo").on("click", function(){
		submitaForm();
	});
	
	$("#CadastroFornecedor").on("click",function(){
		submitaForm();
	});
	
/*	--------------------------------------------------------------------------------------
											Registrar
--------------------------------------------------------------------------------------*/
	
$(".carregaValor").blur(function(){
	var valor = 0.0;
	
	$("table tr:visible").each(function(){
		var qtd = $(this).find(".quantidade").val().trim();
		var val = $(this).find(".carregaValor").val().trim();
		
		valor += qtd*trocaPonto(val);
	});
	
	$("#total").val(trocaPonto(valor));
	
});

function trocaPonto(valor){
	var localValue = valor.toString();
	
	if(localValue.indexOf(",") > 0){
		return localValue.replace(',','.');
	}else{
		if(localValue.indexOf(".") < 0){
			return acrescentaPontoZero(localValue);
		}
		return localValue.replace('.',',');
	}
}

function acrescentaPontoZero(valor){
	valor += ",00";
	return valor;
}

$("#include").click(function(){
	var qtdHabilitada = $("table tr:visible").length;
	
	qtdHabilitada += 1;
	
	if(qtdHabilitada < 5){
		$("table #"+qtdHabilitada).show();
	}else{
		$(this).hide();
	}
});
 
$("#RegistraCompra").on("click",function(){
	submitaForm();
});

$("#RegistraEmprestimo").on("click",function(){
	submitaForm();
});

$("#RegistraAtendimento").on("click",function(){
	submitaForm();
});

$(".filtroTela").keyup(function(){
	var campoBsuca = $(this).val();
	
	if(campoBsuca != ''){
		$("table tr").each(function(i){
			if(i != 0){
				if($(this).find(".nome").text().indexOf(campoBsuca) < 0){
					$(this).hide();
				}
			}
		});
	}else{
		$("table tr").each(function(i){
			$(this).show();
		});
	}
	
});

});