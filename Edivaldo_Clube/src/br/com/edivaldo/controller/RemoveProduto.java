package br.com.edivaldo.controller;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.ProdutoDAO;

public class RemoveProduto implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Connection con = (Connection)request.getAttribute("connection");
		ProdutoDAO dao = new ProdutoDAO(con);
		dao.remove(Integer.parseInt(request.getParameter("id")));
		BuscaProduto chama = new BuscaProduto();
		return chama.executa(request, response);
	}
}