package br.com.edivaldo.controller;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.ServicosDAO;

public class RemoveServico implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Connection con = (Connection)request.getAttribute("connection");
		ServicosDAO dao = new ServicosDAO(con);
		dao.remove(Integer.parseInt(request.getParameter("id")));
		BuscaServico chama = new BuscaServico();
		return chama.executa(request, response);
	}
}