package br.com.edivaldo.controller;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.SocioDAO;

public class RemoveSocio implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Connection con = (Connection)request.getAttribute("connection");
		SocioDAO dao = new SocioDAO(con);
		dao.remove(Integer.parseInt(request.getParameter("id")));
		BuscaSocio chama = new BuscaSocio();
		return chama.executa(request, response);
	}

}

