package br.com.edivaldo.controller;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.FornecedorDAO;
import br.com.edivaldo.model.FornecedorVO;

public class BuscaFornecedor implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Connection con = (Connection)request.getAttribute("connection");
		List<FornecedorVO> lista = new FornecedorDAO(con).getContatos();
		request.setAttribute("fornecedor", lista);
		
		return "/WEB-INF/jsp/ret_fornecedor.jsp";
	}

}
