package br.com.edivaldo.controller;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.ColaboradorDAO;
import br.com.edivaldo.model.ColaboradorVO;

public class BuscaColaborador implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Connection con = (Connection)request.getAttribute("connection");
		List<ColaboradorVO> lista = new ColaboradorDAO(con).getContatos();
		request.setAttribute("colaborador", lista);
		
		return "/WEB-INF/jsp/ret_colaborador.jsp";
	}

}
