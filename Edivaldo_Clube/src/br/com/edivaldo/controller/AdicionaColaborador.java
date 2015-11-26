package br.com.edivaldo.controller;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.ColaboradorDAO;
import br.com.edivaldo.model.ColaboradorVO;

public class AdicionaColaborador implements Logica{
	
	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		ColaboradorVO cliente = new ColaboradorVO();
		
		cliente.setNome(request.getParameter("nome"));
		cliente.setEndereco(request.getParameter("endereco"));
		cliente.setCpf(request.getParameter("cpf"));
		cliente.setFone(request.getParameter("fone"));
		cliente.setCep(request.getParameter("cep"));
		cliente.setRg(request.getParameter("rg"));
		
		Connection con = (Connection)request.getAttribute("connection");
		ColaboradorDAO dao = new ColaboradorDAO(con);
		dao.setContato(cliente);
		
		return "/WEB-INF/jsp/cad_succ.jsp?logica=Colaborador&nome="+cliente.getNome();
	}

}
