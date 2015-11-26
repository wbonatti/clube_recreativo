package br.com.edivaldo.controller;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.FornecedorDAO;
import br.com.edivaldo.model.FornecedorVO;

public class CarregaAtualizaFornecedor implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		int id =Integer.parseInt(request.getParameter("id"));
		Connection con = (Connection)request.getAttribute("connection");
		FornecedorDAO dao = new FornecedorDAO(con);
		
		FornecedorVO lista = dao.getContatoPorId(id);
		
		request.setAttribute("fornecedor", lista);
		
		return "cad_fornecedor.jsp";
	}

}
