package br.com.edivaldo.controller;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.ProdutoDAO;
import br.com.edivaldo.model.ProdutoVO;

public class BuscaProduto implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Connection con = (Connection)request.getAttribute("connection");
		List<ProdutoVO> lista = new ProdutoDAO(con).getContatos();
		request.setAttribute("produto", lista);
		
		return "/WEB-INF/jsp/ret_produto.jsp";
	}

}
