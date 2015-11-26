package br.com.edivaldo.controller;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.RecursoDAO;
import br.com.edivaldo.model.RecursoVO;

public class BuscaRecurso implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Connection con = (Connection)request.getAttribute("connection");
		List<RecursoVO> lista = new RecursoDAO(con).getContatos();
		request.setAttribute("recurso", lista);
		
		return "/WEB-INF/jsp/ret_recurso.jsp";
	}

}
