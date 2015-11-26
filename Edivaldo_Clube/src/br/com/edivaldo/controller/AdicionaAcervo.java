package br.com.edivaldo.controller;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.AcervoDAO;
import br.com.edivaldo.model.AcervoVO;

public class AdicionaAcervo implements Logica{
	
	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		AcervoVO cliente = new AcervoVO();
		
		cliente.setDescricao(request.getParameter("descricao"));
		String valor = request.getParameter("valor");
		String arrey[]= new String[2];
		arrey= valor.split(",");
		valor= arrey[0]+"."+arrey[1];
		cliente.setValor(Double.parseDouble(valor));
		
		Connection con = (Connection)request.getAttribute("connection");
		AcervoDAO dao = new AcervoDAO(con);
		dao.setContato(cliente);
		
		return "/WEB-INF/jsp/cad_succ.jsp?logica=Acervo&nome="+cliente.getDescricao();
	}

}
