package br.com.edivaldo.controller;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.ProdutoDAO;
import br.com.edivaldo.model.ProdutoVO;

public class CarregaAtualizaProduto implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		int id =Integer.parseInt(request.getParameter("id"));
		Connection con = (Connection)request.getAttribute("connection");
		ProdutoDAO dao = new ProdutoDAO(con);
		
		ProdutoVO lista = dao.getContatoPorId(id);
		
		request.setAttribute("produto", lista);
		
		return "cad_produto.jsp";
	}

}
