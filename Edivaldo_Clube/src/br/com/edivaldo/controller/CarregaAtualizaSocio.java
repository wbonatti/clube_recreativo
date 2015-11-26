package br.com.edivaldo.controller;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.SocioDAO;
import br.com.edivaldo.model.SocioVO;

public class CarregaAtualizaSocio implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		int id =Integer.parseInt(request.getParameter("id"));
		Connection con = (Connection)request.getAttribute("connection");
		SocioDAO dao = new SocioDAO(con);
		SocioVO lista = dao.getContatoPorId(id);
		SocioVO respo = dao.getContatoPorId(lista.getResponsavel());
		
		request.setAttribute("socio", lista);
		request.setAttribute("socios", respo);
		
		return "/WEB-INF/jsp/upd_socio.jsp";
	}

}
