package br.com.edivaldo.controller;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.FornecedorDAO;
import br.com.edivaldo.model.FornecedorVO;

public class AtualizarFornecedor implements Logica{
	
	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		FornecedorVO cliente = new FornecedorVO();
		cliente.setNome(request.getParameter("nome"));
		cliente.setCnpj(request.getParameter("cnpj"));
		cliente.setFone(request.getParameter("fone"));
		
		Connection con = (Connection)request.getAttribute("connection");
		FornecedorDAO dao = new FornecedorDAO(con);
		
		dao.altera(cliente);
		
		return "/WEB-INF/jsp/upd_succ.jsp?logica=Fornecedor&nome="+cliente.getNome();
	}

}
