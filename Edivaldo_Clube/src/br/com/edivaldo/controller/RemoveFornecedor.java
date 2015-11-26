package br.com.edivaldo.controller;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.FornecedorDAO;

public class RemoveFornecedor implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Connection con = (Connection)request.getAttribute("connection");
		FornecedorDAO dao = new FornecedorDAO(con);
		dao.remove(Integer.parseInt(request.getParameter("id")));
		BuscaFornecedor chama = new BuscaFornecedor();
		return chama.executa(request, response);
	}
}