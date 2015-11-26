package br.com.edivaldo.controller;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.AcervoDAO;

public class RemoveAcervo implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Connection con = (Connection)request.getAttribute("connection");
		AcervoDAO dao = new AcervoDAO(con);
		dao.remove(Integer.parseInt(request.getParameter("id")));
		BuscaAcervo chama = new BuscaAcervo();
		return chama.executa(request, response);
	}

}

