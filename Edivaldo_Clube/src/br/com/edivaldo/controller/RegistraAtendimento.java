package br.com.edivaldo.controller;

import java.sql.Connection;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.AtendimentoDAO;
import br.com.edivaldo.model.AtendimentoVO;

public class RegistraAtendimento implements Logica{
	
	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Connection con = (Connection)request.getAttribute("connection");

		int qtd = Integer.parseInt(request.getParameter("qtd"));
		switch(qtd){
		case 1:
			double itensValUnitario = Double.parseDouble(request.getParameter("valorUnitario"));
			AtendimentoVO compra = new AtendimentoVO();
			compra.setData(Calendar.getInstance());
			compra.setCompraValorTotal(itensValUnitario);
			compra.setColaborador(Integer.parseInt(request.getParameter("colaborador")));
			compra.setServico(Integer.parseInt(request.getParameter("servico")));
			compra.setSocio(Integer.parseInt(request.getParameter("socio")));
			compra.setCompraQtdItem(1);
			compra.setItemValorUnitario(itensValUnitario);
			
			AtendimentoDAO dao = new AtendimentoDAO(con);
			dao.setContato(compra);
			break;
			
		case 2:
			double itensValUnitario1 = Double.parseDouble(request.getParameter("valorUnitario"));
			double itensValUnitario2 = Double.parseDouble(request.getParameter("valorUnitario2"));
			AtendimentoVO compra2 = new AtendimentoVO();
			compra2.setData(Calendar.getInstance());
			compra2.setCompraValorTotal(itensValUnitario1+itensValUnitario2);
			compra2.setColaborador(Integer.parseInt(request.getParameter("colaborador")));
			compra2.setServico(Integer.parseInt(request.getParameter("servico")));
			compra2.setSocio(Integer.parseInt(request.getParameter("socio")));
			compra2.setCompraQtdItem(2);
			compra2.setItemValorUnitario(itensValUnitario1);
			
			AtendimentoVO compra3 = new AtendimentoVO();
			compra3.setData(Calendar.getInstance());
			compra3.setCompraValorTotal(itensValUnitario1+itensValUnitario2);
			compra3.setColaborador(Integer.parseInt(request.getParameter("colaborador2")));
			compra3.setServico(Integer.parseInt(request.getParameter("servico2")));
			compra3.setSocio(Integer.parseInt(request.getParameter("socio2")));
			compra3.setCompraQtdItem(2);
			compra3.setItemValorUnitario(itensValUnitario2);
			
			AtendimentoDAO dao2 = new AtendimentoDAO(con);
			dao2.setContato(compra2, compra3);
			break;
			
		case 3: 
			double itensValUnitario3 = Double.parseDouble(request.getParameter("valorUnitario"));
			double itensValUnitario4 = Double.parseDouble(request.getParameter("valorUnitario2"));
			double itensValUnitario5 = Double.parseDouble(request.getParameter("valorUnitario3"));
			AtendimentoVO compra4 = new AtendimentoVO();
			compra4.setData(Calendar.getInstance());
			compra4.setCompraValorTotal(itensValUnitario4+itensValUnitario3+itensValUnitario5);
			compra4.setColaborador(Integer.parseInt(request.getParameter("colaborador")));
			compra4.setServico(Integer.parseInt(request.getParameter("servico")));
			compra4.setSocio(Integer.parseInt(request.getParameter("socio")));
			compra4.setCompraQtdItem(3);
			compra4.setItemValorUnitario(itensValUnitario3);
			
			AtendimentoVO compra5 = new AtendimentoVO();
			compra5.setData(Calendar.getInstance());
			compra5.setCompraValorTotal(itensValUnitario4+itensValUnitario3+itensValUnitario5);
			compra5.setColaborador(Integer.parseInt(request.getParameter("colaborador2")));
			compra5.setServico(Integer.parseInt(request.getParameter("servico2")));
			compra5.setSocio(Integer.parseInt(request.getParameter("socio2")));
			compra5.setCompraQtdItem(3);
			compra5.setItemValorUnitario(itensValUnitario4);
			
			AtendimentoVO compra6 = new AtendimentoVO();
			compra6.setData(Calendar.getInstance());
			compra6.setCompraValorTotal(itensValUnitario4+itensValUnitario3+itensValUnitario5);
			compra6.setColaborador(Integer.parseInt(request.getParameter("colaborador3")));
			compra6.setServico(Integer.parseInt(request.getParameter("servico3")));
			compra6.setSocio(Integer.parseInt(request.getParameter("socio3")));
			compra6.setCompraQtdItem(3);
			compra6.setItemValorUnitario(itensValUnitario5);
			
			AtendimentoDAO dao3 = new AtendimentoDAO(con);
			dao3.setContato(compra4, compra5, compra6);
			break;
			
		case 4:
			double itensValUnitario6 = Double.parseDouble(request.getParameter("valorUnitario"));
			double itensValUnitario7 = Double.parseDouble(request.getParameter("valorUnitario2"));
			double itensValUnitario8 = Double.parseDouble(request.getParameter("valorUnitario3"));
			double itensValUnitario9 = Double.parseDouble(request.getParameter("valorUnitario4"));
			AtendimentoVO compra7 = new AtendimentoVO();
			compra7.setData(Calendar.getInstance());
			compra7.setCompraValorTotal(itensValUnitario6+itensValUnitario7+itensValUnitario8+itensValUnitario9);
			compra7.setColaborador(Integer.parseInt(request.getParameter("colaborador")));
			compra7.setServico(Integer.parseInt(request.getParameter("servico")));
			compra7.setSocio(Integer.parseInt(request.getParameter("socio")));
			compra7.setCompraQtdItem(4);
			compra7.setItemValorUnitario(itensValUnitario6);
			
			AtendimentoVO compra8 = new AtendimentoVO();
			compra8.setData(Calendar.getInstance());
			compra8.setCompraValorTotal(itensValUnitario6+itensValUnitario7+itensValUnitario8+itensValUnitario9);
			compra8.setColaborador(Integer.parseInt(request.getParameter("colaborador2")));
			compra8.setServico(Integer.parseInt(request.getParameter("servico2")));
			compra8.setSocio(Integer.parseInt(request.getParameter("socio2")));
			compra8.setCompraQtdItem(4);
			compra8.setItemValorUnitario(itensValUnitario7);
			
			AtendimentoVO compra9 = new AtendimentoVO();
			compra9.setData(Calendar.getInstance());
			compra9.setCompraValorTotal(itensValUnitario6+itensValUnitario7+itensValUnitario8+itensValUnitario9);
			compra9.setColaborador(Integer.parseInt(request.getParameter("colaborador3")));
			compra9.setServico(Integer.parseInt(request.getParameter("servico3")));
			compra9.setSocio(Integer.parseInt(request.getParameter("socio3")));
			compra9.setCompraQtdItem(4);
			compra9.setItemValorUnitario(itensValUnitario8);
			
			AtendimentoVO compra10 = new AtendimentoVO();
			compra10.setData(Calendar.getInstance());
			compra10.setCompraValorTotal(itensValUnitario6+itensValUnitario7+itensValUnitario8+itensValUnitario9);
			compra10.setColaborador(Integer.parseInt(request.getParameter("colaborador4")));
			compra10.setServico(Integer.parseInt(request.getParameter("servico4")));
			compra10.setSocio(Integer.parseInt(request.getParameter("socio4")));
			compra10.setCompraQtdItem(4);
			compra10.setItemValorUnitario(itensValUnitario9);
			
			AtendimentoDAO dao4 = new AtendimentoDAO(con);
			dao4.setContato(compra7, compra8, compra9, compra10);
			break;
			
		case 5:
			double itensValUnitario10 = Double.parseDouble(request.getParameter("valorUnitario"));
			double itensValUnitario11 = Double.parseDouble(request.getParameter("valorUnitario2"));
			double itensValUnitario12 = Double.parseDouble(request.getParameter("valorUnitario3"));
			double itensValUnitario13 = Double.parseDouble(request.getParameter("valorUnitario4"));
			double itensValUnitario14 = Double.parseDouble(request.getParameter("valorUnitario5"));
			AtendimentoVO compra11 = new AtendimentoVO();
			compra11.setData(Calendar.getInstance());
			compra11.setCompraValorTotal(itensValUnitario10+itensValUnitario11+itensValUnitario12+itensValUnitario13+itensValUnitario14);
			compra11.setColaborador(Integer.parseInt(request.getParameter("colaborador")));
			compra11.setServico(Integer.parseInt(request.getParameter("servico")));
			compra11.setSocio(Integer.parseInt(request.getParameter("socio")));
			compra11.setCompraQtdItem(5);
			compra11.setItemValorUnitario(itensValUnitario10);
			
			AtendimentoVO compra12 = new AtendimentoVO();
			compra12.setData(Calendar.getInstance());
			compra12.setCompraValorTotal(itensValUnitario10+itensValUnitario11+itensValUnitario12+itensValUnitario13+itensValUnitario14);
			compra12.setColaborador(Integer.parseInt(request.getParameter("colaborador2")));
			compra12.setServico(Integer.parseInt(request.getParameter("servico2")));
			compra12.setSocio(Integer.parseInt(request.getParameter("socio2")));
			compra12.setCompraQtdItem(5);
			compra12.setItemValorUnitario(itensValUnitario11);
			
			AtendimentoVO compra13 = new AtendimentoVO();
			compra13.setData(Calendar.getInstance());
			compra13.setCompraValorTotal(itensValUnitario10+itensValUnitario11+itensValUnitario12+itensValUnitario13+itensValUnitario14);
			compra13.setColaborador(Integer.parseInt(request.getParameter("colaborador3")));
			compra13.setServico(Integer.parseInt(request.getParameter("servico3")));
			compra13.setSocio(Integer.parseInt(request.getParameter("socio3")));
			compra13.setCompraQtdItem(5);
			compra13.setItemValorUnitario(itensValUnitario12);
			
			AtendimentoVO compra14 = new AtendimentoVO();
			compra14.setData(Calendar.getInstance());
			compra14.setCompraValorTotal(itensValUnitario10+itensValUnitario11+itensValUnitario12+itensValUnitario13+itensValUnitario14);
			compra14.setColaborador(Integer.parseInt(request.getParameter("colaborador4")));
			compra14.setServico(Integer.parseInt(request.getParameter("servico4")));
			compra14.setSocio(Integer.parseInt(request.getParameter("socio4")));
			compra14.setCompraQtdItem(5);
			compra14.setItemValorUnitario(itensValUnitario13);
			
			AtendimentoVO compra15 = new AtendimentoVO();
			compra15.setData(Calendar.getInstance());
			compra15.setCompraValorTotal(itensValUnitario10+itensValUnitario11+itensValUnitario12+itensValUnitario13+itensValUnitario14);
			compra15.setColaborador(Integer.parseInt(request.getParameter("colaborador5")));
			compra15.setServico(Integer.parseInt(request.getParameter("servico5")));
			compra15.setSocio(Integer.parseInt(request.getParameter("socio5")));
			compra15.setCompraQtdItem(5);
			compra15.setItemValorUnitario(itensValUnitario14);
			
			AtendimentoDAO dao5 = new AtendimentoDAO(con);
			dao5.setContato(compra11, compra12, compra13, compra14, compra15);
			break;
		}
		
		return "/WEB-INF/jsp/cad_succ.jsp?logica=Compra&nome="+1;
	}

}
