package br.com.edivaldo.controller;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.CompraDAO;
import br.com.edivaldo.model.CompraVO;

public class BuscaCompra implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Connection con = (Connection)request.getAttribute("connection");
		List<CompraVO> lista = new CompraDAO(con).pesquisaRelatorio();
		
		request.setAttribute("compra", lista);
		
		return "/WEB-INF/jsp/rel_compra.jsp";
	}

}
