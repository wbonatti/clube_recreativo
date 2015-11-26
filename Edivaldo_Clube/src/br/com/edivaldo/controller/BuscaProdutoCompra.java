package br.com.edivaldo.controller;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.FornecedorDAO;
import br.com.edivaldo.model.FornecedorVO;
import br.com.edivaldo.model.ProdutoDAO;
import br.com.edivaldo.model.ProdutoVO;

public class BuscaProdutoCompra implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Connection con = (Connection)request.getAttribute("connection");
		List<ProdutoVO> lista = new ProdutoDAO(con).getContatos();
		List<FornecedorVO> lista2 = new FornecedorDAO(con).getContatos();
		request.setAttribute("produto", lista);
		request.setAttribute("fornecedor", lista2);
		
		return "/WEB-INF/jsp/cad_compra.jsp";
	}

}
