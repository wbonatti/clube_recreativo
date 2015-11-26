package br.com.edivaldo.controller;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.FornecedorDAO;
import br.com.edivaldo.model.FornecedorVO;

public class AdicionaFornecedor implements Logica{
	
	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		FornecedorVO cliente = new FornecedorVO();
		
		cliente.setNome(request.getParameter("nome"));
		cliente.setFone(request.getParameter("fone"));
		cliente.setCnpj(request.getParameter("cnpj"));		

		Connection con = (Connection)request.getAttribute("connection");
		FornecedorDAO dao = new FornecedorDAO(con);
		dao.setContato(cliente);
		
		return "/WEB-INF/jsp/cad_succ.jsp?logica=Fornecedor&nome="+cliente.getNome();
	}

}
