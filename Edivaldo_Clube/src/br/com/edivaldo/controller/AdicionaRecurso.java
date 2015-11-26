package br.com.edivaldo.controller;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.RecursoDAO;
import br.com.edivaldo.model.RecursoVO;

public class AdicionaRecurso implements Logica{
	
	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		RecursoVO cliente = new RecursoVO();
		
		cliente.setNome(request.getParameter("nome"));
		String valor = request.getParameter("valor");
		String arrey[]= new String[2];
		arrey= valor.split(",");
		valor= arrey[0]+"."+arrey[1];
		cliente.setValor(Double.parseDouble(valor));
		
		Connection con = (Connection)request.getAttribute("connection");
		RecursoDAO dao = new RecursoDAO(con);
		dao.setContato(cliente);
		
		return "/WEB-INF/jsp/cad_succ.jsp?logica=Recurso&nome="+cliente.getNome();
	}

}
