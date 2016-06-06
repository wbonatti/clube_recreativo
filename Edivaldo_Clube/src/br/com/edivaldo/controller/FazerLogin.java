package br.com.edivaldo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FazerLogin implements Logica{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession sessao = request.getSession();
		
		String user = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		
		if(user.equalsIgnoreCase("wesley") && senha.equals("12345")){
			sessao.setAttribute("usuario", user);
		}else{
			return "/login.jsp?erro=1";
		}
		
		return "/inicio.jsp";
	}

}
