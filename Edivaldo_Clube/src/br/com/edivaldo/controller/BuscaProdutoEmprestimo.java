package br.com.edivaldo.controller;

import java.sql.Connection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.AcervoDAO;
import br.com.edivaldo.model.AcervoVO;
import br.com.edivaldo.model.ColaboradorDAO;
import br.com.edivaldo.model.ColaboradorVO;
import br.com.edivaldo.model.SocioDAO;
import br.com.edivaldo.model.SocioVO;

public class BuscaProdutoEmprestimo implements Logica{

	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		Connection con = (Connection)request.getAttribute("connection");
		List<SocioVO> lista = new SocioDAO(con).getContatos();
		List<ColaboradorVO> lista2 = new ColaboradorDAO(con).getContatos();
		List<AcervoVO> lista3 = new AcervoDAO(con).getContatos();
		
		
		request.setAttribute("socio", lista);
		request.setAttribute("Colaborador", lista2);
		request.setAttribute("acervo", lista3);
		
		return "/WEB-INF/jsp/cad_emprestimo.jsp";
	}

}
