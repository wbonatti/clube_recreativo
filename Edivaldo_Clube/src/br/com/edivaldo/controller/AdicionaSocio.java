package br.com.edivaldo.controller;

import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.edivaldo.model.SocioDAO;
import br.com.edivaldo.model.SocioVO;

public class AdicionaSocio implements Logica{
	
	@Override
	public String executa(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		SimpleDateFormat patern = new SimpleDateFormat("dd/MM/yyyy");

		String nome = request.getParameter("nome");
		String tipo = request.getParameter("tipo");
		String endereco = request.getParameter("endereco");
		String cpf = request.getParameter("cpf");
		String fone = request.getParameter("fone");
		String cep = request.getParameter("cep");
		String rg = request.getParameter("rg");
		int responsavel = request.getParameter("responsavel").isEmpty()? 0:Integer.parseInt(request.getParameter("responsavel")); 
		Calendar dataExpira = Calendar.getInstance();

		if(!request.getParameter("expiracao").isEmpty()){
		
		try {
			Date data = patern.parse(request.getParameter("expiracao"));
			dataExpira.setTime(data);
		} catch (ParseException e) {
			return "/WEB-INF/jsp/cad_socio_err.jsp?nome="+nome+",desc="+e.getMessage();
		}
		}
		else{
			dataExpira.setTime(patern.parse("18/12/1993"));
		}
		
		SocioVO cliente = new SocioVO();
		cliente.setNome(nome);
		cliente.setTipo(tipo);
		cliente.setEndereco(endereco);
		cliente.setCpf(cpf);
		cliente.setFone(fone);
		cliente.setCep(cep);
		cliente.setRg(rg);
		cliente.setResponsavel(responsavel);
		cliente.setDataExpiracao(dataExpira);
		
		Connection con = (Connection)request.getAttribute("connection");
		SocioDAO dao = new SocioDAO(con);
		
		dao.setContato(cliente);
		
		return "/WEB-INF/jsp/cad_succ.jsp?logica=Socio&nome="+nome;
	}

}
