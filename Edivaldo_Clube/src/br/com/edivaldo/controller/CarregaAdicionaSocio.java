package br.com.edivaldo.controller;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.SocioDAO;
import br.com.edivaldo.model.SocioVO;

public class CarregaAdicionaSocio implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Connection con = (Connection)request.getAttribute("connection");
		List<SocioVO> lista = new SocioDAO(con).getTitulares();
		
		request.setAttribute("socio", lista);
		
		return "/WEB-INF/jsp/cad_socio.jsp";
	}

}
