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

		int qtd = Integer.parseInt(request.getParameter("qtd"));
		switch(qtd){
		case 1:
			int itensCompra = Integer.parseInt(request.getParameter("quantidade").trim());
			double itensValUnitario = converte(request.getParameter("valorUnitario"));
			CompraVO compra = new CompraVO();
			compra.setData(Calendar.getInstance());
			compra.setCompraValorTotal(converte(request.getParameter("valorTotal")));
			compra.setProduto(Integer.parseInt(request.getParameter("produto")));
			compra.setFornecedor(Integer.parseInt(request.getParameter("fornecedor")));
			compra.setCompraQtdItem(itensCompra);
			compra.setItemQtd(itensCompra);
			compra.setItemValorUnitario(itensValUnitario);
			compra.setItemValorTotal(itensCompra*itensValUnitario);

			CompraDAO dao = new CompraDAO(con);
			dao.setContato(compra);
			break;
			
		case 2:
			int itensCompra2 = Integer.parseInt(request.getParameter("quantidade").trim());
			double itensValUnitario2 = converte(request.getParameter("valorUnitario"));
			int itensCompra3 = Integer.parseInt(request.getParameter("quantidade2").trim());
			double itensValUnitario3 = converte(request.getParameter("valorUnitario2"));
			CompraVO compra1 = new CompraVO();
			compra1.setData(Calendar.getInstance());
			compra1.setCompraValorTotal(converte(request.getParameter("valorTotal")));
			compra1.setProduto(Integer.parseInt(request.getParameter("produto")));
			compra1.setFornecedor(Integer.parseInt(request.getParameter("fornecedor")));
			compra1.setCompraQtdItem(itensCompra2+itensCompra3);
			compra1.setItemQtd(itensCompra2);
			compra1.setItemValorUnitario(itensValUnitario2);
			compra1.setItemValorTotal(itensCompra2*itensValUnitario2);
			
			CompraVO compra2 = new CompraVO();
			compra2.setData(Calendar.getInstance());
			compra2.setCompraValorTotal(converte(request.getParameter("valorTotal")));
			compra2.setProduto(Integer.parseInt(request.getParameter("produto2")));
			compra2.setFornecedor(Integer.parseInt(request.getParameter("fornecedor2")));
			compra2.setCompraQtdItem(itensCompra2+itensCompra3);
			compra2.setItemQtd(itensCompra3);
			compra2.setItemValorUnitario(itensValUnitario3);
			compra2.setItemValorTotal(itensCompra3*itensValUnitario3);;
						

			CompraDAO dao2 = new CompraDAO(con);
			dao2.setContato(compra1, compra2);
			break;
			
		case 3: 
			int itensCompra4 = Integer.parseInt(request.getParameter("quantidade").trim());
			double itensValUnitario4 = converte(request.getParameter("valorUnitario"));
			int itensCompra5 = Integer.parseInt(request.getParameter("quantidade2").trim());
			double itensValUnitario5 = converte(request.getParameter("valorUnitario2"));
			int itensCompra6 = Integer.parseInt(request.getParameter("quantidade3").trim());
			double itensValUnitario6 = converte(request.getParameter("valorUnitario3"));
			CompraVO compra3 = new CompraVO();
			compra3.setData(Calendar.getInstance());
			compra3.setCompraValorTotal(converte(request.getParameter("valorTotal")));
			compra3.setProduto(Integer.parseInt(request.getParameter("produto")));
			compra3.setFornecedor(Integer.parseInt(request.getParameter("fornecedor")));
			compra3.setCompraQtdItem(itensCompra4+itensCompra5+itensCompra6);
			compra3.setItemQtd(itensCompra4);
			compra3.setItemValorUnitario(itensValUnitario4);
			compra3.setItemValorTotal(itensCompra4*itensValUnitario4);
			
			CompraVO compra4 = new CompraVO();
			compra4.setData(Calendar.getInstance());
			compra4.setCompraValorTotal(converte(request.getParameter("valorTotal")));
			compra4.setProduto(Integer.parseInt(request.getParameter("produto2")));
			compra4.setFornecedor(Integer.parseInt(request.getParameter("fornecedor2")));
			compra4.setCompraQtdItem(itensCompra4+itensCompra5+itensCompra6);
			compra4.setItemQtd(itensCompra5);
			compra4.setItemValorUnitario(itensValUnitario5);
			compra4.setItemValorTotal(itensCompra5*itensValUnitario5);
			
			CompraVO compra5 = new CompraVO();
			compra5.setData(Calendar.getInstance());
			compra5.setCompraValorTotal(converte(request.getParameter("valorTotal")));
			compra5.setProduto(Integer.parseInt(request.getParameter("produto2")));
			compra5.setFornecedor(Integer.parseInt(request.getParameter("fornecedor2")));
			compra5.setCompraQtdItem(itensCompra4+itensCompra5+itensCompra6);
			compra5.setItemQtd(itensCompra6);
			compra5.setItemValorUnitario(itensValUnitario6);
			compra5.setItemValorTotal(itensCompra6*itensValUnitario6);						

			CompraDAO dao3 = new CompraDAO(con);
			dao3.setContato(compra3, compra4, compra5);
			break;
			
		case 4:
			int itensCompra7 = Integer.parseInt(request.getParameter("quantidade").trim());
			double itensValUnitario7 = converte(request.getParameter("valorUnitario"));
			int itensCompra8 = Integer.parseInt(request.getParameter("quantidade2").trim());
			double itensValUnitario8 = converte(request.getParameter("valorUnitario2"));
			int itensCompra9 = Integer.parseInt(request.getParameter("quantidade3").trim());
			double itensValUnitario9 = converte(request.getParameter("valorUnitario3"));
			int itensCompra10 = Integer.parseInt(request.getParameter("quantidade4").trim());
			double itensValUnitario10 = converte(request.getParameter("valorUnitario4"));
			CompraVO compra6 = new CompraVO();
			compra6.setData(Calendar.getInstance());
			compra6.setCompraValorTotal(converte(request.getParameter("valorTotal")));
			compra6.setProduto(Integer.parseInt(request.getParameter("produto")));
			compra6.setFornecedor(Integer.parseInt(request.getParameter("fornecedor")));
			compra6.setCompraQtdItem(itensCompra7+itensCompra8+itensCompra9+itensCompra10);
			compra6.setItemQtd(itensCompra7);
			compra6.setItemValorUnitario(itensValUnitario7);
			compra6.setItemValorTotal(itensCompra7*itensValUnitario7);
			
			CompraVO compra7 = new CompraVO();
			compra7.setData(Calendar.getInstance());
			compra7.setCompraValorTotal(converte(request.getParameter("valorTotal")));
			compra7.setProduto(Integer.parseInt(request.getParameter("produto2")));
			compra7.setFornecedor(Integer.parseInt(request.getParameter("fornecedor2")));
			compra7.setCompraQtdItem(itensCompra7+itensCompra8+itensCompra9+itensCompra10);
			compra7.setItemQtd(itensCompra8);
			compra7.setItemValorUnitario(itensValUnitario8);
			compra7.setItemValorTotal(itensCompra8*itensValUnitario8);
			
			CompraVO compra8 = new CompraVO();
			compra8.setData(Calendar.getInstance());
			compra8.setCompraValorTotal(converte(request.getParameter("valorTotal")));
			compra8.setProduto(Integer.parseInt(request.getParameter("produto2")));
			compra8.setFornecedor(Integer.parseInt(request.getParameter("fornecedor2")));
			compra8.setCompraQtdItem(itensCompra7+itensCompra8+itensCompra9+itensCompra10);
			compra8.setItemQtd(itensCompra9);
			compra8.setItemValorUnitario(itensValUnitario9);
			compra8.setItemValorTotal(itensCompra9*itensValUnitario9);
			
			CompraVO compra9 = new CompraVO();
			compra9.setData(Calendar.getInstance());
			compra9.setCompraValorTotal(converte(request.getParameter("valorTotal")));
			compra9.setProduto(Integer.parseInt(request.getParameter("produto2")));
			compra9.setFornecedor(Integer.parseInt(request.getParameter("fornecedor2")));
			compra9.setCompraQtdItem(itensCompra7+itensCompra8+itensCompra9+itensCompra10);
			compra9.setItemQtd(itensCompra10);
			compra9.setItemValorUnitario(itensValUnitario10);
			compra9.setItemValorTotal(itensCompra10*itensValUnitario10);

			CompraDAO dao4 = new CompraDAO(con);
			dao4.setContato(compra6, compra7, compra8, compra9);
			break;
			
		case 5:
			int itensCompra11 = Integer.parseInt(request.getParameter("quantidade").trim());
			double itensValUnitario11 = converte(request.getParameter("valorUnitario"));
			int itensCompra12 = Integer.parseInt(request.getParameter("quantidade2").trim());
			double itensValUnitario12 = converte(request.getParameter("valorUnitario2"));
			int itensCompra13 = Integer.parseInt(request.getParameter("quantidade3").trim());
			double itensValUnitario13 = converte(request.getParameter("valorUnitario3"));
			int itensCompra14 = Integer.parseInt(request.getParameter("quantidade4").trim());
			double itensValUnitario14 = converte(request.getParameter("valorUnitario4"));
			int itensCompra15 = Integer.parseInt(request.getParameter("quantidade5").trim());
			double itensValUnitario15 = converte(request.getParameter("valorUnitario5"));
			CompraVO compra10 = new CompraVO();
			compra10.setData(Calendar.getInstance());
			compra10.setCompraValorTotal(converte(request.getParameter("valorTotal")));
			compra10.setProduto(Integer.parseInt(request.getParameter("produto")));
			compra10.setFornecedor(Integer.parseInt(request.getParameter("fornecedor")));
			compra10.setCompraQtdItem(itensCompra11+itensCompra12+itensCompra13+itensCompra14+itensCompra15);
			compra10.setItemQtd(itensCompra11);
			compra10.setItemValorUnitario(itensValUnitario11);
			compra10.setItemValorTotal(itensCompra11*itensValUnitario11);
			
			CompraVO compra11 = new CompraVO();
			compra11.setData(Calendar.getInstance());
			compra11.setCompraValorTotal(converte(request.getParameter("valorTotal")));
			compra11.setProduto(Integer.parseInt(request.getParameter("produto2")));
			compra11.setFornecedor(Integer.parseInt(request.getParameter("fornecedor2")));
			compra11.setCompraQtdItem(itensCompra11+itensCompra12+itensCompra13+itensCompra14+itensCompra15);
			compra11.setItemQtd(itensCompra12);
			compra11.setItemValorUnitario(itensValUnitario12);
			compra11.setItemValorTotal(itensCompra12*itensValUnitario12);
			
			CompraVO compra12 = new CompraVO();
			compra12.setData(Calendar.getInstance());
			compra12.setCompraValorTotal(converte(request.getParameter("valorTotal")));
			compra12.setProduto(Integer.parseInt(request.getParameter("produto2")));
			compra12.setFornecedor(Integer.parseInt(request.getParameter("fornecedor2")));
			compra12.setCompraQtdItem(itensCompra11+itensCompra12+itensCompra13+itensCompra14+itensCompra15);
			compra12.setItemQtd(itensCompra13);
			compra12.setItemValorUnitario(itensValUnitario13);
			compra12.setItemValorTotal(itensCompra13*itensValUnitario13);
			
			CompraVO compra13 = new CompraVO();
			compra13.setData(Calendar.getInstance());
			compra13.setCompraValorTotal(converte(request.getParameter("valorTotal")));
			compra13.setProduto(Integer.parseInt(request.getParameter("produto2")));
			compra13.setFornecedor(Integer.parseInt(request.getParameter("fornecedor2")));
			compra13.setCompraQtdItem(itensCompra11+itensCompra12+itensCompra13+itensCompra14+itensCompra15);
			compra13.setItemQtd(itensCompra14);
			compra13.setItemValorUnitario(itensValUnitario14);
			compra13.setItemValorTotal(itensCompra14*itensValUnitario14);
			
			CompraVO compra14 = new CompraVO();
			compra14.setData(Calendar.getInstance());
			compra14.setCompraValorTotal(converte(request.getParameter("valorTotal")));
			compra14.setProduto(Integer.parseInt(request.getParameter("produto2")));
			compra14.setFornecedor(Integer.parseInt(request.getParameter("fornecedor2")));
			compra14.setCompraQtdItem(itensCompra11+itensCompra12+itensCompra13+itensCompra14+itensCompra15);
			compra14.setItemQtd(itensCompra15);
			compra14.setItemValorUnitario(itensValUnitario15);
			compra14.setItemValorTotal(itensCompra15*itensValUnitario15);

			CompraDAO dao5 = new CompraDAO(con);
			dao5.setContato(compra10, compra11, compra12, compra13, compra14);
			break;
		}
		
		return "/WEB-INF/jsp/cad_succ.jsp?logica=Compra&nome="+1;
	}

	private double converte(String valor){
		
		String arrey[]= new String[2];
		arrey= valor.split(",");
		valor= arrey[0]+"."+arrey[1];
		return Double.parseDouble(valor);
	}
}
