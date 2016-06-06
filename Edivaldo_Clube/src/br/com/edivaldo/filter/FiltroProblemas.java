package br.com.edivaldo.filter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import br.com.edivaldo.connection.ConnectionFactory;

@WebFilter("/mvc")
public class FiltroProblemas implements Filter{
	public static String antigo;
	
	@Override
	public void destroy() {
		// TODO Stub de método gerado automaticamente
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		
		
		String logica = arg0.getParameter("logica");
	
		try {
		
			HttpServletRequest request = (HttpServletRequest) arg0;
			HttpSession sessao =  request.getSession();
			String usuario = (String) sessao.getAttribute("usuario");
			
		//verificar se esta logado 
			if(logica.equals("FazerLogin") || usuario != null){
				Connection conection = ConnectionFactory.getConnection();
				arg0.setAttribute("connection", conection);
				antigo= logica;
				arg2.doFilter(arg0,arg1);
				conection.close();
			}else{
				arg0.getRequestDispatcher("/login.jsp").forward(arg0, arg1);
			}
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Stub de método gerado automaticamente
		
	}

}
