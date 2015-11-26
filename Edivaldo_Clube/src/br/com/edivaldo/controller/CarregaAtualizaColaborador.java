package br.com.edivaldo.controller;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.ColaboradorDAO;
import br.com.edivaldo.model.ColaboradorVO;

public class CarregaAtualizaColaborador implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		int id =Integer.parseInt(request.getParameter("id"));
		Connection con = (Connection)request.getAttribute("connection");
		ColaboradorDAO dao = new ColaboradorDAO(con);
		
		ColaboradorVO lista = dao.getContatoPorId(id);
		
		request.setAttribute("colaborador", lista);
		
		return "cad_colaborador.jsp";
	}

}
