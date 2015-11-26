package br.com.edivaldo.controller;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.ServicosDAO;
import br.com.edivaldo.model.ServicosVO;
import br.com.edivaldo.model.ColaboradorDAO;
import br.com.edivaldo.model.ColaboradorVO;
import br.com.edivaldo.model.SocioDAO;
import br.com.edivaldo.model.SocioVO;

public class BuscaProdutoAtendimento implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Connection con = (Connection)request.getAttribute("connection");
		List<SocioVO> lista = new SocioDAO(con).getContatos();
		List<ColaboradorVO> lista2 = new ColaboradorDAO(con).getContatos();
		List<ServicosVO> lista3 = new ServicosDAO(con).getContatos();
		
		
		request.setAttribute("socio", lista);
		request.setAttribute("Colaborador", lista2);
		request.setAttribute("servico", lista3);
		
		return "/WEB-INF/jsp/cad_atendimento.jsp";
	}

}
