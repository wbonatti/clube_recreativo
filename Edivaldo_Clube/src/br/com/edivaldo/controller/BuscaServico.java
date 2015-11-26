package br.com.edivaldo.controller;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.ServicosDAO;
import br.com.edivaldo.model.ServicosVO;

public class BuscaServico implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Connection con = (Connection)request.getAttribute("connection");
		List<ServicosVO> lista = new ServicosDAO(con).getContatos();
		request.setAttribute("servico", lista);
		
		return "/WEB-INF/jsp/ret_servico.jsp";
	}

}
