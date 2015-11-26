package br.com.edivaldo.controller;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.ServicosDAO;
import br.com.edivaldo.model.ServicosVO;

public class CarregaAtualizaServico implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		int id =Integer.parseInt(request.getParameter("id"));
		Connection con = (Connection)request.getAttribute("connection");
		ServicosDAO dao = new ServicosDAO(con);
		
		ServicosVO lista = dao.getContatoPorId(id);
		
		request.setAttribute("servico", lista);
		
		return "cad_servicos.jsp";
	}

}
