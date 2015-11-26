package br.com.edivaldo.controller;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.ColaboradorDAO;

public class RemoveColaborador implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Connection con = (Connection)request.getAttribute("connection");
		ColaboradorDAO dao = new ColaboradorDAO(con);
		dao.remove(Integer.parseInt(request.getParameter("id")));
		BuscaColaborador chama = new BuscaColaborador();
		return chama.executa(request, response);
	}
}