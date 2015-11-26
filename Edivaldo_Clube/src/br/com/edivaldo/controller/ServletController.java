package br.com.edivaldo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/mvc")
public class ServletController extends HttpServlet{

	private static final long serialVersionUID = -4221105837760968939L;

	@Override
	protected void doPost(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		String parametro = arg0.getParameter("logica");
		String nomeDaClasse = "br.com.edivaldo.controller."+parametro;
		
		try{
			
			Class<?> classe = Class.forName(nomeDaClasse);
			Logica log = (Logica) classe.newInstance();
			
			String nomePagina = log.executa(arg0, arg1);
			arg0.getRequestDispatcher(nomePagina).forward(arg0, arg1);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
