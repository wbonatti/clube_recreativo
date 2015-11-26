package br.com.edivaldo.controller;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.AtendimentoDAO;
import br.com.edivaldo.model.AtendimentoVO;

public class BuscaAtendimento implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Connection con = (Connection)request.getAttribute("connection");
		List<AtendimentoVO> lista = new AtendimentoDAO(con).pesquisaRelatorio();
		
		request.setAttribute("atendimento", lista);
		
		return "/WEB-INF/jsp/rel_atendimento.jsp";
	}

}
