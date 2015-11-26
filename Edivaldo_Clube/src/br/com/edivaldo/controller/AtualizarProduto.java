package br.com.edivaldo.controller;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.ProdutoDAO;
import br.com.edivaldo.model.ProdutoVO;

public class AtualizarProduto implements Logica{
	
	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		ProdutoVO cliente = new ProdutoVO();
		cliente.setNome(request.getParameter("nome"));
		cliente.setCompra(converte(request.getParameter("compra")));
		cliente.setVenda(converte(request.getParameter("venda")));;
		
		Connection con = (Connection)request.getAttribute("connection");
		ProdutoDAO dao = new ProdutoDAO(con);
		
		dao.altera(cliente);
		
		return "/WEB-INF/jsp/upd_succ.jsp?logica=Produto&nome="+cliente.getNome();
	}
	private double converte(String valor){
		
		String arrey[]= new String[2];
		arrey= valor.split(",");
		valor= arrey[0]+"."+arrey[1];
		return Double.parseDouble(valor);
	}
}
