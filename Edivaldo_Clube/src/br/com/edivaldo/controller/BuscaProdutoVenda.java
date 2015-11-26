package br.com.edivaldo.controller;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.SocioDAO;
import br.com.edivaldo.model.SocioVO;
import br.com.edivaldo.model.ColaboradorDAO;
import br.com.edivaldo.model.ColaboradorVO;
import br.com.edivaldo.model.ProdutoDAO;
import br.com.edivaldo.model.ProdutoVO;

public class BuscaProdutoVenda implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Connection con = (Connection)request.getAttribute("connection");
		List<ProdutoVO> lista = new ProdutoDAO(con).getContatos();
		List<ColaboradorVO> lista2 = new ColaboradorDAO(con).getContatos();
		List<SocioVO> lista3 = new SocioDAO(con).getContatos();
		request.setAttribute("produto", lista);
		request.setAttribute("colaborador", lista2);
		request.setAttribute("socio", lista3);
		
		return "/WEB-INF/jsp/cad_venda.jsp";
	}

}
