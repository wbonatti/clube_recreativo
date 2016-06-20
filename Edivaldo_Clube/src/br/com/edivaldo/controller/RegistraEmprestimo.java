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
			
			EmprestimoVO emprestimo = null;
			EmprestimoVO emprestimo2 = null;
			EmprestimoVO emprestimo3 = null;
			EmprestimoVO emprestimo4 = null;
			
			if(!quantidade.equals("")){
				emprestimo = new EmprestimoVO();
				montaObjeto(emprestimo, request, "1");
			}
			
			if(!quantidade2.equals("")){
				emprestimo2 = new EmprestimoVO();
				montaObjeto(emprestimo2, request, "2");
			}
			
			if(!quantidade3.equals("")){
				emprestimo3 = new EmprestimoVO();
				montaObjeto(emprestimo3, request, "3");
			}
			
			if(!quantidade4.equals("")){
				emprestimo4 = new EmprestimoVO();
				montaObjeto(emprestimo4, request, "4");
			}
			
			EmprestimoDAO dao = new EmprestimoDAO(con);
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
	
	private void montaObjeto(EmprestimoVO emprestimo, HttpServletRequest request, String objeto){
		emprestimo.setData(Calendar.getInstance());
		emprestimo.setColaborador(Integer.parseInt(request.getParameter("colab"+objeto)));
		emprestimo.setAcervo(Integer.parseInt(request.getParameter("acervo"+objeto)));
		emprestimo.setDataDevolucao(Calendar.getInstance()); 
		emprestimo.getDataDevolucao().add(Calendar.DAY_OF_MONTH, 7);
		emprestimo.setDataPrevisao(Calendar.getInstance()); 
		emprestimo.getDataPrevisao().add(Calendar.DAY_OF_MONTH, 6);
		emprestimo.setSocio(Integer.parseInt(request.getParameter("socio"+objeto)));
		emprestimo.setCompraQtdItem(1);
	}

}
