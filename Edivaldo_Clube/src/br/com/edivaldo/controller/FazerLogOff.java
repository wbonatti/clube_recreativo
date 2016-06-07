package br.com.edivaldo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FazerLogOff implements Logica {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession sessao = request.getSession();

		sessao.setAttribute("usuario", null);

		return "/login.jsp";

	}

}
