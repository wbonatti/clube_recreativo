package br.com.edivaldo.controller;

import java.sql.Connection;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.EmprestimoDAO;
import br.com.edivaldo.model.EmprestimoVO;

public class RegistraEmprestimo implements Logica{
	
	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Connection con = (Connection)request.getAttribute("connection");

		int qtd = Integer.parseInt(request.getParameter("qtd"));
		switch(qtd){
		case 1:
			double itensValUnitario = Double.parseDouble(request.getParameter("valorUnitario"));
			EmprestimoVO compra = new EmprestimoVO();
			compra.setData(Calendar.getInstance());
			compra.setCompraValorTotal(itensValUnitario);
			compra.setColaborador(Integer.parseInt(request.getParameter("colaborador")));
			compra.setAcervo(Integer.parseInt(request.getParameter("acervo")));
			compra.setDataDevolucao(Calendar.getInstance()); 
			compra.getDataDevolucao().add(Calendar.DAY_OF_MONTH, 7);
			compra.setDataPrevisao(Calendar.getInstance()); 
			compra.getDataPrevisao().add(Calendar.DAY_OF_MONTH, 6);
			compra.setSocio(Integer.parseInt(request.getParameter("socio")));
			compra.setCompraQtdItem(1);
			compra.setItemValorUnitario(itensValUnitario);
			
			EmprestimoDAO dao = new EmprestimoDAO(con);
			dao.setContato(compra);
			break;
			
		case 2:
			double itensValUnitario1 = Double.parseDouble(request.getParameter("valorUnitario"));
			double itensValUnitario2 = Double.parseDouble(request.getParameter("valorUnitario2"));
			EmprestimoVO compra2 = new EmprestimoVO();
			compra2.setData(Calendar.getInstance());
			compra2.setCompraValorTotal(itensValUnitario1+itensValUnitario2);
			compra2.setColaborador(Integer.parseInt(request.getParameter("colaborador")));
			compra2.setAcervo(Integer.parseInt(request.getParameter("acervo")));
			compra2.setDataDevolucao(compra2.getData()); 
			compra2.getDataDevolucao().add(Calendar.DAY_OF_MONTH, 7);
			compra2.setDataPrevisao(compra2.getData()); 
			compra2.getDataPrevisao().add(Calendar.DAY_OF_MONTH, 6);
			compra2.setSocio(Integer.parseInt(request.getParameter("socio")));
			compra2.setCompraQtdItem(2);
			compra2.setItemValorUnitario(itensValUnitario1);
			
			EmprestimoVO compra3 = new EmprestimoVO();
			compra3.setData(Calendar.getInstance());
			compra3.setCompraValorTotal(itensValUnitario1+itensValUnitario2);
			compra3.setColaborador(Integer.parseInt(request.getParameter("colaborador2")));
			compra3.setAcervo(Integer.parseInt(request.getParameter("acervo2")));
			compra3.setDataDevolucao(compra3.getData()); 
			compra3.getDataDevolucao().add(Calendar.DAY_OF_MONTH, 7);
			compra3.setDataPrevisao(compra3.getData()); 
			compra3.getDataPrevisao().add(Calendar.DAY_OF_MONTH, 6);
			compra3.setSocio(Integer.parseInt(request.getParameter("socio2")));
			compra3.setCompraQtdItem(2);
			compra3.setItemValorUnitario(itensValUnitario2);
			
			EmprestimoDAO dao2 = new EmprestimoDAO(con);
			dao2.setContato(compra2, compra3);
			break;
			
		case 3: 
			double itensValUnitario3 = Double.parseDouble(request.getParameter("valorUnitario"));
			double itensValUnitario4 = Double.parseDouble(request.getParameter("valorUnitario2"));
			double itensValUnitario5 = Double.parseDouble(request.getParameter("valorUnitario3"));
			EmprestimoVO compra4 = new EmprestimoVO();
			compra4.setData(Calendar.getInstance());
			compra4.setCompraValorTotal(itensValUnitario4+itensValUnitario3+itensValUnitario5);
			compra4.setColaborador(Integer.parseInt(request.getParameter("colaborador")));
			compra4.setAcervo(Integer.parseInt(request.getParameter("acervo")));
			compra4.setDataDevolucao(compra4.getData()); 
			compra4.getDataDevolucao().add(Calendar.DAY_OF_MONTH, 7);
			compra4.setDataPrevisao(compra4.getData()); 
			compra4.getDataPrevisao().add(Calendar.DAY_OF_MONTH, 6);
			compra4.setSocio(Integer.parseInt(request.getParameter("socio")));
			compra4.setCompraQtdItem(3);
			compra4.setItemValorUnitario(itensValUnitario3);
			
			EmprestimoVO compra5 = new EmprestimoVO();
			compra5.setData(Calendar.getInstance());
			compra5.setCompraValorTotal(itensValUnitario4+itensValUnitario3+itensValUnitario5);
			compra5.setColaborador(Integer.parseInt(request.getParameter("colaborador2")));
			compra5.setAcervo(Integer.parseInt(request.getParameter("acervo2")));
			compra5.setDataDevolucao(compra5.getData()); 
			compra5.getDataDevolucao().add(Calendar.DAY_OF_MONTH, 7);
			compra5.setDataPrevisao(compra5.getData()); 
			compra5.getDataPrevisao().add(Calendar.DAY_OF_MONTH, 6);
			compra5.setSocio(Integer.parseInt(request.getParameter("socio2")));
			compra5.setCompraQtdItem(3);
			compra5.setItemValorUnitario(itensValUnitario4);
			
			EmprestimoVO compra6 = new EmprestimoVO();
			compra6.setData(Calendar.getInstance());
			compra6.setCompraValorTotal(itensValUnitario4+itensValUnitario3+itensValUnitario5);
			compra6.setColaborador(Integer.parseInt(request.getParameter("colaborador3")));
			compra6.setAcervo(Integer.parseInt(request.getParameter("acervo3")));
			compra6.setDataDevolucao(compra6.getData()); 
			compra6.getDataDevolucao().add(Calendar.DAY_OF_MONTH, 7);
			compra6.setDataPrevisao(compra6.getData()); 
			compra6.getDataPrevisao().add(Calendar.DAY_OF_MONTH, 6);
			compra6.setSocio(Integer.parseInt(request.getParameter("socio3")));
			compra6.setCompraQtdItem(3);
			compra6.setItemValorUnitario(itensValUnitario5);
			
			EmprestimoDAO dao3 = new EmprestimoDAO(con);
			dao3.setContato(compra4, compra5, compra6);
			break;
			
		case 4:
			double itensValUnitario6 = Double.parseDouble(request.getParameter("valorUnitario"));
			double itensValUnitario7 = Double.parseDouble(request.getParameter("valorUnitario2"));
			double itensValUnitario8 = Double.parseDouble(request.getParameter("valorUnitario3"));
			double itensValUnitario9 = Double.parseDouble(request.getParameter("valorUnitario4"));
			EmprestimoVO compra7 = new EmprestimoVO();
			compra7.setData(Calendar.getInstance());
			compra7.setCompraValorTotal(itensValUnitario6+itensValUnitario7+itensValUnitario8+itensValUnitario9);
			compra7.setColaborador(Integer.parseInt(request.getParameter("colaborador")));
			compra7.setAcervo(Integer.parseInt(request.getParameter("acervo")));
			compra7.setDataDevolucao(compra7.getData()); 
			compra7.getDataDevolucao().add(Calendar.DAY_OF_MONTH, 7);
			compra7.setDataPrevisao(compra7.getData()); 
			compra7.getDataPrevisao().add(Calendar.DAY_OF_MONTH, 6);
			compra7.setSocio(Integer.parseInt(request.getParameter("socio")));
			compra7.setCompraQtdItem(4);
			compra7.setItemValorUnitario(itensValUnitario6);
			
			EmprestimoVO compra8 = new EmprestimoVO();
			compra8.setData(Calendar.getInstance());
			compra8.setCompraValorTotal(itensValUnitario6+itensValUnitario7+itensValUnitario8+itensValUnitario9);
			compra8.setColaborador(Integer.parseInt(request.getParameter("colaborador2")));
			compra8.setAcervo(Integer.parseInt(request.getParameter("acervo2")));
			compra8.setDataDevolucao(compra8.getData()); 
			compra8.getDataDevolucao().add(Calendar.DAY_OF_MONTH, 7);
			compra8.setDataPrevisao(compra8.getData()); 
			compra8.getDataPrevisao().add(Calendar.DAY_OF_MONTH, 6);
			compra8.setSocio(Integer.parseInt(request.getParameter("socio2")));
			compra8.setCompraQtdItem(4);
			compra8.setItemValorUnitario(itensValUnitario7);
			
			EmprestimoVO compra9 = new EmprestimoVO();
			compra9.setData(Calendar.getInstance());
			compra9.setCompraValorTotal(itensValUnitario6+itensValUnitario7+itensValUnitario8+itensValUnitario9);
			compra9.setColaborador(Integer.parseInt(request.getParameter("colaborador3")));
			compra9.setAcervo(Integer.parseInt(request.getParameter("acervo3")));
			compra9.setDataDevolucao(compra9.getData()); 
			compra9.getDataDevolucao().add(Calendar.DAY_OF_MONTH, 7);
			compra9.setDataPrevisao(compra9.getData()); 
			compra9.getDataPrevisao().add(Calendar.DAY_OF_MONTH, 6);
			compra9.setSocio(Integer.parseInt(request.getParameter("socio3")));
			compra9.setCompraQtdItem(4);
			compra9.setItemValorUnitario(itensValUnitario8);
			
			EmprestimoVO compra10 = new EmprestimoVO();
			compra10.setData(Calendar.getInstance());
			compra10.setCompraValorTotal(itensValUnitario6+itensValUnitario7+itensValUnitario8+itensValUnitario9);
			compra10.setColaborador(Integer.parseInt(request.getParameter("colaborador4")));
			compra10.setAcervo(Integer.parseInt(request.getParameter("acervo4")));
			compra10.setDataDevolucao(compra10.getData()); 
			compra10.getDataDevolucao().add(Calendar.DAY_OF_MONTH, 7);
			compra10.setDataPrevisao(compra10.getData()); 
			compra10.getDataPrevisao().add(Calendar.DAY_OF_MONTH, 6);
			compra10.setSocio(Integer.parseInt(request.getParameter("socio4")));
			compra10.setCompraQtdItem(4);
			compra10.setItemValorUnitario(itensValUnitario9);
			
			EmprestimoDAO dao4 = new EmprestimoDAO(con);
			dao4.setContato(compra7, compra8, compra9, compra10);
			break;
			
		case 5:
			double itensValUnitario10 = Double.parseDouble(request.getParameter("valorUnitario"));
			double itensValUnitario11 = Double.parseDouble(request.getParameter("valorUnitario2"));
			double itensValUnitario12 = Double.parseDouble(request.getParameter("valorUnitario3"));
			double itensValUnitario13 = Double.parseDouble(request.getParameter("valorUnitario4"));
			double itensValUnitario14 = Double.parseDouble(request.getParameter("valorUnitario5"));
			EmprestimoVO compra11 = new EmprestimoVO();
			compra11.setData(Calendar.getInstance());
			compra11.setCompraValorTotal(itensValUnitario10+itensValUnitario11+itensValUnitario12+itensValUnitario13+itensValUnitario14);
			compra11.setColaborador(Integer.parseInt(request.getParameter("colaborador")));
			compra11.setAcervo(Integer.parseInt(request.getParameter("acervo")));
			compra11.setDataDevolucao(compra11.getData()); 
			compra11.getDataDevolucao().add(Calendar.DAY_OF_MONTH, 7);
			compra11.setDataPrevisao(compra11.getData()); 
			compra11.getDataPrevisao().add(Calendar.DAY_OF_MONTH, 6);
			compra11.setSocio(Integer.parseInt(request.getParameter("socio")));
			compra11.setCompraQtdItem(5);
			compra11.setItemValorUnitario(itensValUnitario10);
			
			EmprestimoVO compra12 = new EmprestimoVO();
			compra12.setData(Calendar.getInstance());
			compra12.setCompraValorTotal(itensValUnitario10+itensValUnitario11+itensValUnitario12+itensValUnitario13+itensValUnitario14);
			compra12.setColaborador(Integer.parseInt(request.getParameter("colaborador2")));
			compra12.setAcervo(Integer.parseInt(request.getParameter("acervo2")));
			compra12.setDataDevolucao(compra12.getData()); 
			compra12.getDataDevolucao().add(Calendar.DAY_OF_MONTH, 7);
			compra12.setDataPrevisao(compra12.getData()); 
			compra12.getDataPrevisao().add(Calendar.DAY_OF_MONTH, 6);
			compra12.setSocio(Integer.parseInt(request.getParameter("socio2")));
			compra12.setCompraQtdItem(5);
			compra12.setItemValorUnitario(itensValUnitario11);
			
			EmprestimoVO compra13 = new EmprestimoVO();
			compra13.setData(Calendar.getInstance());
			compra13.setCompraValorTotal(itensValUnitario10+itensValUnitario11+itensValUnitario12+itensValUnitario13+itensValUnitario14);
			compra13.setColaborador(Integer.parseInt(request.getParameter("colaborador3")));
			compra13.setAcervo(Integer.parseInt(request.getParameter("acervo3")));
			compra13.setDataDevolucao(compra13.getData()); 
			compra13.getDataDevolucao().add(Calendar.DAY_OF_MONTH, 7);
			compra13.setDataPrevisao(compra13.getData()); 
			compra13.getDataPrevisao().add(Calendar.DAY_OF_MONTH, 6);
			compra13.setSocio(Integer.parseInt(request.getParameter("socio3")));
			compra13.setCompraQtdItem(5);
			compra13.setItemValorUnitario(itensValUnitario12);
			
			EmprestimoVO compra14 = new EmprestimoVO();
			compra14.setData(Calendar.getInstance());
			compra14.setCompraValorTotal(itensValUnitario10+itensValUnitario11+itensValUnitario12+itensValUnitario13+itensValUnitario14);
			compra14.setColaborador(Integer.parseInt(request.getParameter("colaborador4")));
			compra14.setAcervo(Integer.parseInt(request.getParameter("acervo4")));
			compra14.setDataDevolucao(compra14.getData()); 
			compra14.getDataDevolucao().add(Calendar.DAY_OF_MONTH, 7);
			compra14.setDataPrevisao(compra14.getData()); 
			compra14.getDataPrevisao().add(Calendar.DAY_OF_MONTH, 6);
			compra14.setSocio(Integer.parseInt(request.getParameter("socio4")));
			compra14.setCompraQtdItem(5);
			compra14.setItemValorUnitario(itensValUnitario13);
			
			EmprestimoVO compra15 = new EmprestimoVO();
			compra15.setData(Calendar.getInstance());
			compra15.setCompraValorTotal(itensValUnitario10+itensValUnitario11+itensValUnitario12+itensValUnitario13+itensValUnitario14);
			compra15.setColaborador(Integer.parseInt(request.getParameter("colaborador5")));
			compra15.setAcervo(Integer.parseInt(request.getParameter("acervo5")));
			compra15.setDataDevolucao(compra15.getData()); 
			compra15.getDataDevolucao().add(Calendar.DAY_OF_MONTH, 7);
			compra15.setDataPrevisao(compra15.getData()); 
			compra15.getDataPrevisao().add(Calendar.DAY_OF_MONTH, 6);
			compra15.setSocio(Integer.parseInt(request.getParameter("socio5")));
			compra15.setCompraQtdItem(5);
			compra15.setItemValorUnitario(itensValUnitario14);
			
			EmprestimoDAO dao5 = new EmprestimoDAO(con);
			dao5.setContato(compra11, compra12, compra13, compra14, compra15);
			break;
		}
		
		return "/WEB-INF/jsp/cad_succ.jsp?logica=Compra&nome="+1;
	}

}
