package br.com.edivaldo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CarregaAdicionaServico implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		return "/cad_servicos.jsp";
	}

}
