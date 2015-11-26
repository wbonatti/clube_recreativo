package br.com.edivaldo.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AcervoDAO {
	
	public AcervoDAO(Connection connect){
		this.con= connect;	
	}
	
	private Connection con;
	
	public void setContato(AcervoVO contato){		
		String sql = "insert into Acervo (acv_Descr, acv_VlEmpr) "
				+ " values (?,?)";
		try {
			// prepared statement para inserção
			PreparedStatement stmt = con.prepareStatement(sql);
			// seta os valores
			stmt.setString(1,contato.getDescricao().isEmpty()?null:contato.getDescricao());
			stmt.setDouble(2,contato.getValor()==0?null:contato.getValor());
			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());;
		}
	}
	public List<AcervoVO> getContatos(){
		List<AcervoVO> contatos = new ArrayList<AcervoVO>();
		
			try {
				PreparedStatement stmt = con.prepareStatement("select * from Acervo order by acv_Descr");
				ResultSet rs = stmt.executeQuery();
			

			while (rs.next()) {

				// criando o objeto Contato 
				AcervoVO contato = new AcervoVO();
				contato.setId(rs.getInt("acv_ID"));
				contato.setDescricao(rs.getString("acv_Descr"));
				contato.setValor(rs.getDouble("acv_VlEmpr"));

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
						"from Acervo where acv_ID=?");
				stmt.setInt(1, id);
				stmt.execute();
				stmt.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		
		public AcervoVO getContatoPorId(int id){	
			try{
				PreparedStatement stmt = con.prepareStatement("select * from Acervo where acv_ID=?");
				stmt.setInt(1, id);
				ResultSet rs = stmt.executeQuery();
				
				
				if(rs.next()){
					
					// criando o objeto Contato 
					AcervoVO contato = new AcervoVO();
					contato.setId(rs.getInt("acv_ID"));
					contato.setDescricao(rs.getString("acv_Descr"));
					contato.setValor(rs.getDouble("acv_VlEmpr"));
					
					return contato;
				}
				rs.close();
				stmt.close();
			} catch (Exception e){
				e.printStackTrace();
			}
			return null;
		}
		
		public void altera(AcervoVO contato) {
				contato.setId(getContatoPorCPF(contato.getDescricao()));
				
			String sql = "update Acervo set acv_Descr=?, acv_VlEmpr=? where acv_ID=?";
			try {
				PreparedStatement stmt = con.prepareStatement(sql);
				
				stmt.setString(1,contato.getDescricao().isEmpty()?null:contato.getDescricao());
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
				
				stmt = con.prepareStatement("select acv_ID from Acervo where acv_Descr=?");
				
				stmt.setString(1, cpf);
				ResultSet rs = stmt.executeQuery();
				

				while (rs.next()) {
					return rs.getInt("acv_ID");

				}
				rs.close();
				stmt.close();
				} catch (Exception e){
					e.printStackTrace();
				}
			
				return 0;
		}

}


