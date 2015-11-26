package br.com.edivaldo.controller;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.RecursoDAO;
import br.com.edivaldo.model.RecursoVO;

public class CarregaAtualizaRecurso implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		int id =Integer.parseInt(request.getParameter("id"));
		Connection con = (Connection)request.getAttribute("connection");
		RecursoDAO dao = new RecursoDAO(con);
		
		RecursoVO lista = dao.getContatoPorId(id);
		
		request.setAttribute("recurso", lista);
		
		return "cad_recurso.jsp";
	}

}
