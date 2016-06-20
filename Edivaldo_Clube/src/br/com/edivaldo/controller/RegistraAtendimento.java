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

		String quantidade = "";
		String quantidade2 = "";
		String quantidade3 = "";
		String quantidade4 = "";
		
		try{
			quantidade = request.getParameter("colab1").trim();
			quantidade2 = request.getParameter("colab2").trim();
			quantidade3 = request.getParameter("colab3").trim();
			quantidade4 = request.getParameter("colab4").trim();
			
		}catch(Exception e){
			e.printStackTrace();
		}
			
			AtendimentoVO emprestimo = null;
			AtendimentoVO emprestimo2 = null;
			AtendimentoVO emprestimo3 = null;
			AtendimentoVO emprestimo4 = null;
			
			if(!quantidade.equals("")){
				emprestimo = new AtendimentoVO();
				montaObjeto(emprestimo, request, "1");
			}
			
			if(!quantidade2.equals("")){
				emprestimo2 = new AtendimentoVO();
				montaObjeto(emprestimo2, request, "2");
			}
			
			if(!quantidade3.equals("")){
				emprestimo3 = new AtendimentoVO();
				montaObjeto(emprestimo3, request, "3");
			}
			
			if(!quantidade4.equals("")){
				emprestimo4 = new AtendimentoVO();
				montaObjeto(emprestimo4, request, "4");
			}
			
			AtendimentoDAO dao = new AtendimentoDAO(con);
			if(emprestimo4 != null){
				dao.setContato(emprestimo);
				dao.setContato(emprestimo2);
				dao.setContato(emprestimo3);
				dao.setContato(emprestimo4);
			}else if(emprestimo3 != null){
				dao.setContato(emprestimo);
				dao.setContato(emprestimo);
				dao.setContato(emprestimo);
			}else if(emprestimo2 != null){
				dao.setContato(emprestimo);
				dao.setContato(emprestimo2);
			}else if(emprestimo != null){
				dao.setContato(emprestimo);
			}
		
		return "/WEB-INF/jsp/cad_succ.jsp?logica=Compra&nome="+1;
	}

	private void montaObjeto(AtendimentoVO atendimento, HttpServletRequest request, String objeto){
		atendimento.setData(Calendar.getInstance());
		atendimento.setColaborador(Integer.parseInt(request.getParameter("colab"+objeto)));
		atendimento.setServico(Integer.parseInt(request.getParameter("servico"+objeto)));
		atendimento.setSocio(Integer.parseInt(request.getParameter("socio"+objeto)));
		atendimento.setCompraQtdItem(1);
	}
	
}
