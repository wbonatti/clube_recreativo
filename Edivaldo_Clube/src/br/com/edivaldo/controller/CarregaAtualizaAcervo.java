package br.com.edivaldo.controller;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.AcervoDAO;
import br.com.edivaldo.model.AcervoVO;

public class CarregaAtualizaAcervo implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		int id =Integer.parseInt(request.getParameter("id"));
		Connection con = (Connection)request.getAttribute("connection");
		AcervoDAO dao = new AcervoDAO(con);
		
		AcervoVO lista = dao.getContatoPorId(id);
		
		request.setAttribute("acervo", lista);
		
		return "cad_acervo.jsp";
	}

}
