package br.com.edivaldo.controller;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.AcervoDAO;
import br.com.edivaldo.model.AcervoVO;

public class BuscaAcervo implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Connection con = (Connection)request.getAttribute("connection");
		List<AcervoVO> lista = new AcervoDAO(con).getContatos();
		request.setAttribute("acervo", lista);
		
		return "/WEB-INF/jsp/ret_acervo.jsp";
	}

}
