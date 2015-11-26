package br.com.edivaldo.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RecursoDAO {
	public RecursoDAO(Connection connect){
		this.con= connect;		
	}
	
	private Connection con;

	public void setContato(RecursoVO contato){
		
		
		String sql = "insert into Recurso (rec_nome, rec_VlReserva) "
				+ " values (?,?)";
		try {
			// prepared statement para inserção
			PreparedStatement stmt = con.prepareStatement(sql);
			// seta os valores
			stmt.setString(1,contato.getNome().isEmpty()?null:contato.getNome());
			stmt.setDouble(2,contato.getValor()==0?null:contato.getValor());
			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());;
		}
	}
	public List<RecursoVO> getContatos(){
		
		List<RecursoVO> contatos = new ArrayList<RecursoVO>();
		
			try {
				PreparedStatement stmt = con.prepareStatement("select * from Recurso order by rec_Nome");
				ResultSet rs = stmt.executeQuery();
			

			while (rs.next()) {

				// criando o objeto Contato 
				RecursoVO contato = new RecursoVO();
				contato.setId(rs.getInt("rec_ID"));
				contato.setNome(rs.getString("rec_nome"));
				contato.setValor(rs.getDouble("rec_VlReserva"));

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
						"from Recurso where rec_ID=?");
				stmt.setInt(1, id);
				stmt.execute();
				stmt.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		
		public RecursoVO getContatoPorId(int id){
					
			try{
				PreparedStatement stmt = con.prepareStatement("select * from Recurso where rec_ID=?");
				stmt.setInt(1, id);
				ResultSet rs = stmt.executeQuery();
				
				
				if(rs.next()){
					
					// criando o objeto Contato 
					RecursoVO contato = new RecursoVO();
					contato.setId(rs.getInt("rec_ID"));
					contato.setNome(rs.getString("rec_nome"));
					contato.setValor(rs.getDouble("rec_VlReserva"));
					
					return contato;
				}
				rs.close();
				stmt.close();
			} catch (Exception e){
				e.printStackTrace();
			}
			return null;
		}
		
		public void altera(RecursoVO contato) {
			
					
				contato.setId(getContatoPorCPF(contato.getNome()));
				
			String sql = "update Recurso set rec_nome=?, rec_VlReserva=? where rec_ID=?";
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
				
				stmt = con.prepareStatement("select rec_ID from Recurso where rec_Nome=?");
				
				stmt.setString(1, cpf);
				ResultSet rs = stmt.executeQuery();
				

				while (rs.next()) {
					return rs.getInt("rec_ID");

				}
				rs.close();
				stmt.close();
				} catch (Exception e){
					e.printStackTrace();
				}
			
				return 0;
		}

}


