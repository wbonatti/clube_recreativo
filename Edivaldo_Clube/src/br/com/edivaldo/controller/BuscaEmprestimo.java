package br.com.edivaldo.controller;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.EmprestimoDAO;
import br.com.edivaldo.model.EmprestimoVO;

public class BuscaEmprestimo implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Connection con = (Connection)request.getAttribute("connection");
		List<EmprestimoVO> lista = new EmprestimoDAO(con).pesquisaRelatorio();
		
		request.setAttribute("Emprestimo", lista);
		
		return "/WEB-INF/jsp/rel_emprestimo.jsp";
	}

}
