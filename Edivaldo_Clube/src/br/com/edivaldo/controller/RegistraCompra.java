package br.com.edivaldo.controller;

import java.sql.Connection;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.CompraDAO;
import br.com.edivaldo.model.CompraVO;

public class RegistraCompra implements Logica{
	
	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Connection con = (Connection)request.getAttribute("connection");

		int quantidade = 0;
		int quantidade2 = 0;
		int quantidade3 = 0;
		int quantidade4 = 0;
		
		try{
			quantidade = Integer.parseInt(request.getParameter("qtd1").trim());
			quantidade2 = Integer.parseInt(request.getParameter("qtd2").trim());
			quantidade3 = Integer.parseInt(request.getParameter("qtd3").trim());
			quantidade4 = Integer.parseInt(request.getParameter("qtd4").trim());
			
		}catch(Exception e){
			e.printStackTrace();
		}
			
			CompraVO compra = null;
			CompraVO compra2 = null;
			CompraVO compra3 = null;
			CompraVO compra4 = null;
			
			if(quantidade != 0){
				compra = new CompraVO();
				montaObjeto(compra, request, quantidade, "1");
				compra.setCompraValorTotal(compra.getItemValorTotal());
			}
			
			if(quantidade2 != 0){
				compra2 = new CompraVO();
				montaObjeto(compra2, request, quantidade, "2");
				compra2.setCompraValorTotal(compra.getCompraValorTotal()+compra2.getItemValorTotal());
				compra.setCompraValorTotal(compra.getItemValorTotal()+compra2.getCompraValorTotal());
			}
			
			if(quantidade3 != 0){
				compra3 = new CompraVO();
				montaObjeto(compra3, request, quantidade, "3");
				compra3.setCompraValorTotal(compra.getItemValorTotal()+compra2.getItemValorTotal()+compra3.getItemValorTotal());
				compra2.setCompraValorTotal(compra.getItemValorTotal()+compra2.getItemValorTotal()+compra3.getItemValorTotal());
				compra.setCompraValorTotal(compra.getItemValorTotal()+compra2.getItemValorTotal()+compra3.getItemValorTotal());
			}
			
			if(quantidade4 != 0){
				compra4 = new CompraVO();
				montaObjeto(compra4, request, quantidade, "4");
				compra4.setCompraValorTotal(compra.getItemValorTotal()+compra2.getItemValorTotal()+compra3.getItemValorTotal()+compra4.getItemValorTotal());
				compra3.setCompraValorTotal(compra.getItemValorTotal()+compra2.getItemValorTotal()+compra3.getItemValorTotal()+compra4.getItemValorTotal());
				compra2.setCompraValorTotal(compra.getItemValorTotal()+compra2.getItemValorTotal()+compra3.getItemValorTotal()+compra4.getItemValorTotal());
				compra.setCompraValorTotal(compra.getItemValorTotal()+compra2.getItemValorTotal()+compra3.getItemValorTotal()+compra4.getItemValorTotal());
			}
			
			CompraDAO dao = new CompraDAO(con);
			if(compra4 != null){
				dao.setContato(compra);
				dao.setContato(compra2);
				dao.setContato(compra3);
				dao.setContato(compra4);
			}else if(compra3 != null){
				dao.setContato(compra);
				dao.setContato(compra2);
				dao.setContato(compra3);
			}else if(compra2 != null){
				dao.setContato(compra);
				dao.setContato(compra2);
			}else if(compra != null){
				dao.setContato(compra);
			}

		return "/WEB-INF/jsp/cad_succ.jsp?logica=Compra&nome="+1;
	}

	private double converte(String valor){
		
		String arrey[]= new String[2];
		arrey= valor.split(",");
		valor= arrey[0]+"."+arrey[1];
		return Double.parseDouble(valor);
	}
	
	private void montaObjeto(CompraVO compra, HttpServletRequest request, int itensCompra, String objeto){
		double itensValUnitario = converte(request.getParameter("preco"+objeto));
		compra.setData(Calendar.getInstance());
		compra.setProduto(Integer.parseInt(request.getParameter("prod"+objeto)));
		compra.setFornecedor(Integer.parseInt(request.getParameter("forn"+objeto)));
		compra.setCompraQtdItem(itensCompra);
		compra.setItemQtd(itensCompra);
		compra.setItemValorUnitario(itensValUnitario);
		compra.setItemValorTotal(itensCompra*itensValUnitario);
	}
}
