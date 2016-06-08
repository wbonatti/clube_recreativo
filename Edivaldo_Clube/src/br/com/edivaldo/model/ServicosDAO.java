package br.com.edivaldo.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServicosDAO {
	public ServicosDAO(Connection connect){
		this.con= connect;		
	}
	
	private Connection con;

	public void setContato(ServicosVO contato){
		
		
		String sql = "insert into Servico (svc_Descr, svc_Valor) "
				+ " values (?,?)";
		try {
			// prepared statement para inserção
			PreparedStatement stmt = con.prepareStatement(sql);
			// seta os valores
			stmt.setString(1,contato.getNome() == null?null:contato.getNome());
			stmt.setDouble(2,contato.getValor()==0?null:contato.getValor());
			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<ServicosVO> getContatos(){
		
		List<ServicosVO> contatos = new ArrayList<ServicosVO>();
		
			try {
				PreparedStatement stmt = con.prepareStatement("select * from Servico order by svc_Descr");
				ResultSet rs = stmt.executeQuery();
			

			while (rs.next()) {

				// criando o objeto Contato
				ServicosVO contato = new ServicosVO();
				contato.setId(rs.getInt("svc_ID"));
				contato.setNome(rs.getString("svc_Descr"));
				contato.setValor(rs.getDouble("svc_Valor"));

				// adicionando o objeto à lista
				contatos.add(contato);
			}
			rs.close();
			stmt.close();
			} catch (Exception e){
				e.printStackTrace();
			}
						
			return contatos;
		} 	
		public void remove(int id){
			
			try {
				PreparedStatement stmt = con.prepareStatement("delete " +
						"from Servico where svc_ID=?");
				stmt.setInt(1, id);
				stmt.execute();
				stmt.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		
		public ServicosVO getContatoPorId(int id){
					
			try{
				PreparedStatement stmt = con.prepareStatement("select * from Servico where svc_ID=?");
				stmt.setInt(1, id);
				ResultSet rs = stmt.executeQuery();
				
				
				if(rs.next()){
					
					// criando o objeto Contato
					ServicosVO contato = new ServicosVO();
					contato.setId(rs.getInt("svc_ID"));
					contato.setNome(rs.getString("svc_Descr"));
					contato.setValor(rs.getDouble("svc_Valor"));
					
					return contato;
				}
				rs.close();
				stmt.close();
			} catch (Exception e){
				e.printStackTrace();
			}
			return null;
		}
		
		public void altera(ServicosVO contato) {
			
					
				contato.setId(getContatoPorCPF(contato.getNome()));
				
			String sql = "update Servico set svc_Descr=?, svc_Valor=? where svc_ID=?";
			try {
				PreparedStatement stmt = con.prepareStatement(sql);
				
				stmt.setString(1,contato.getNome().isEmpty()?null:contato.getNome());
				stmt.setDouble(2,contato.getValor()==0?null:contato.getValor());
				stmt.setInt(3, contato.getId());
				
				stmt.execute();
				stmt.close();
			 } catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		
		public int getContatoPorCPF(String cpf){
			
			
			try{
				PreparedStatement stmt;
				
				stmt = con.prepareStatement("select svc_ID from Servico where svc_Descr=?");
				
				stmt.setString(1, cpf);
				ResultSet rs = stmt.executeQuery();
				

				while (rs.next()) {
					return rs.getInt("svc_ID");

				}
				rs.close();
				stmt.close();
				} catch (Exception e){
					e.printStackTrace();
				}
			
				return 0;
		}

	
}


