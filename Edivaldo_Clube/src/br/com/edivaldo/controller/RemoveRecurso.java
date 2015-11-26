package br.com.edivaldo.controller;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.RecursoDAO;

public class RemoveRecurso implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Connection con = (Connection)request.getAttribute("connection");
		RecursoDAO dao = new RecursoDAO(con);
		dao.remove(Integer.parseInt(request.getParameter("id")));
		BuscaRecurso chama = new BuscaRecurso();
		return chama.executa(request, response);
	}
}