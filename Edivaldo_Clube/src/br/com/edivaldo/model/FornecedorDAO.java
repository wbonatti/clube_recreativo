package br.com.edivaldo.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FornecedorDAO {
	public FornecedorDAO(Connection connect){
		this.con= connect;		
	}
	
	private Connection con;
	
	public void setContato(FornecedorVO contato){
		
		
		String sql = "insert into Fornecedor (for_Nome, for_CNPJ, for_Fone) "
				+ " values (?,?,?)";
		try {
			// prepared statement para inserção
			PreparedStatement stmt = con.prepareStatement(sql);
			// seta os valores
			stmt.setString(1,contato.getNome().isEmpty()?null:contato.getNome());
			stmt.setString(2,contato.getCnpj().isEmpty()?null:contato.getCnpj());
			stmt.setString(3,contato.getFone().isEmpty()?null:contato.getFone());
			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());;
		}
	}
	public List<FornecedorVO> getContatos(){
		
		List<FornecedorVO> contatos = new ArrayList<FornecedorVO>();
		
			try {
				PreparedStatement stmt = con.prepareStatement("select * from Fornecedor order by for_Nome");
				ResultSet rs = stmt.executeQuery();
			

			while (rs.next()) {

				// criando o objeto Contato
				FornecedorVO contato = new FornecedorVO();
				contato.setId(rs.getInt("for_ID"));
				contato.setNome(rs.getString("for_Nome"));
				contato.setCnpj(rs.getString("for_CNPJ"));
				contato.setFone(rs.getString("for_Fone"));

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
						"from Fornecedor where for_ID=?");
				stmt.setInt(1, id);
				stmt.execute();
				stmt.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		
		public FornecedorVO getContatoPorId(int id){
					
			try{
				PreparedStatement stmt = con.prepareStatement("select * from Fornecedor where for_ID=?");
				stmt.setInt(1, id);
				ResultSet rs = stmt.executeQuery();
				
				
				if(rs.next()){
					
					// criando o objeto Contato
					FornecedorVO contato = new FornecedorVO();
					contato.setId(rs.getInt("for_ID"));
					contato.setNome(rs.getString("for_Nome"));
					contato.setCnpj(rs.getString("for_CNPJ"));
					contato.setFone(rs.getString("for_Fone"));
					
					return contato;
				}
				rs.close();
				stmt.close();
			} catch (Exception e){
				e.printStackTrace();
			}
			return null;
		}
		
		public void altera(FornecedorVO contato) {
			
					
				contato.setId(getContatoPorCPF(contato.getCnpj()));
				
			String sql = "update Fornecedor set for_Nome=?, for_CNPJ=?, for_Fone=? where for_ID=?";
			try {
				PreparedStatement stmt = con.prepareStatement(sql);
				
				stmt.setString(1,contato.getNome().isEmpty()?null:contato.getNome());
				stmt.setString(2,contato.getCnpj().isEmpty()?null:contato.getCnpj());
				stmt.setString(3,contato.getFone().isEmpty()?null:contato.getFone());
				stmt.setInt(4, contato.getId());
				
				stmt.execute();
				stmt.close();
			 } catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		
		public int getContatoPorCPF(String cpf){
			
			
			try{
				PreparedStatement stmt;
				
				stmt = con.prepareStatement("select for_ID from Fornecedor where for_CNPJ=?");
				
				stmt.setString(1, cpf);
				ResultSet rs = stmt.executeQuery();
				

				while (rs.next()) {
					return rs.getInt("for_ID");

				}
				rs.close();
				stmt.close();
				} catch (Exception e){
					e.printStackTrace();
				}
			
				return 0;
		}

}


