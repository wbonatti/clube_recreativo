package br.com.edivaldo.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
	public ProdutoDAO(Connection connect){
		this.con= connect;		
	}
	
	private Connection con;
	
	public void setContato(ProdutoVO contato){
		
		
		String sql = "insert into Produto (prd_Nome, prd_PrCusto, prd_PrVenda) "
				+ " values (?,?,?)";
		try {
			// prepared statement para inserção
			PreparedStatement stmt = con.prepareStatement(sql);
			// seta os valores
			stmt.setString(1,contato.getNome().isEmpty()?null:contato.getNome());
			stmt.setDouble(2,contato.getCompra()==0?null:contato.getCompra());
			stmt.setDouble(3,contato.getVenda()==0?null:contato.getVenda());
			
			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());;
		}
	}
	public List<ProdutoVO> getContatos(){
		
		List<ProdutoVO> contatos = new ArrayList<ProdutoVO>();
		
			try {
				PreparedStatement stmt = con.prepareStatement("select * from Produto order by prd_Nome");
				ResultSet rs = stmt.executeQuery();
			

			while (rs.next()) {

				// criando o objeto Contato
				ProdutoVO contato = new ProdutoVO();
				contato.setId(rs.getInt("prd_ID"));
				contato.setNome(rs.getString("prd_Nome"));
				contato.setCompra(rs.getDouble("prd_PrCusto"));
				contato.setVenda(rs.getDouble("prd_PrVenda"));

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
						"from Produto where prd_ID=?");
				stmt.setInt(1, id);
				stmt.execute();
				stmt.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		
		public ProdutoVO getContatoPorId(int id){
					
			try{
				PreparedStatement stmt = con.prepareStatement("select * from Produto where prd_ID=?");
				stmt.setInt(1, id);
				ResultSet rs = stmt.executeQuery();
				
				
				if(rs.next()){
					
					// criando o objeto Conta
					ProdutoVO contato = new ProdutoVO();
					contato.setId(rs.getInt("prd_ID"));
					contato.setNome(rs.getString("prd_Nome"));
					contato.setCompra(rs.getDouble("prd_PrCusto"));
					contato.setVenda(rs.getDouble("prd_PrVenda"));
					return contato;
				}
				rs.close();
				stmt.close();
			} catch (Exception e){
				e.printStackTrace();
			}
			return null;
		}
		
		public void altera(ProdutoVO contato) {
			
					
				contato.setId(getContatoPorCPF(contato.getNome()));
				
			String sql = "update Produto set prd_Nome=?, prd_PrCusto=?, prd_PrVenda=? where prd_id=?";
			try {
				PreparedStatement stmt = con.prepareStatement(sql);
				
				stmt.setString(1,contato.getNome().isEmpty()?null:contato.getNome());
				stmt.setDouble(2,contato.getCompra()==0?null:contato.getCompra());
				stmt.setDouble(3,contato.getVenda()==0?null:contato.getVenda());
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
				
				stmt = con.prepareStatement("select prd_ID from Produto where prd_Nome=?");
				
				stmt.setString(1, cpf);
				ResultSet rs = stmt.executeQuery();
				

				while (rs.next()) {
					return rs.getInt("prd_ID");

				}
				rs.close();
				stmt.close();
				} catch (Exception e){
					e.printStackTrace();
				}
			
				return 0;
		}

}


