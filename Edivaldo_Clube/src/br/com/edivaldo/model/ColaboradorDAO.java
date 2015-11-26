package br.com.edivaldo.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ColaboradorDAO {
	
	public ColaboradorDAO(Connection connect){
		this.con= connect;		
	}
	
	private Connection con;

	public void setContato(ColaboradorVO contato){	
		String sql = "insert into Colaborador (col_CEP, col_CPF, col_Ender, col_Fone, col_Nome, col_RG) "
				+ " values (?,?,?,?,?,?)";
		try {
			// prepared statement para inserção
			PreparedStatement stmt = con.prepareStatement(sql);
			// seta os valores
			stmt.setString(1,contato.getCep().isEmpty()?null:contato.getCep());
			stmt.setString(2,contato.getCpf().isEmpty()?null:contato.getCpf());
			stmt.setString(3,contato.getEndereco().isEmpty()?null:contato.getEndereco());
			stmt.setString(4,contato.getFone().isEmpty()?null:contato.getFone());
			stmt.setString(5,contato.getNome().isEmpty()?null:contato.getNome());
			stmt.setString(6,contato.getRg().isEmpty()?null:contato.getRg());
			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());;
		}
	}
	
	public List<ColaboradorVO> getContatos(){
	List<ColaboradorVO> contatos = new ArrayList<ColaboradorVO>();
	
		try {
			PreparedStatement stmt = con.prepareStatement("select * from Colaborador order by col_Nome");
			ResultSet rs = stmt.executeQuery();
		

		while (rs.next()) {

			// criando o objeto Contato
			ColaboradorVO contato = new ColaboradorVO();
			contato.setId(rs.getInt("col_ID"));
			contato.setNome(rs.getString("col_Nome"));
			contato.setRg(rs.getString("col_RG"));
			contato.setCep(rs.getString("col_CEP"));
			contato.setEndereco(rs.getString("col_Ender"));
			contato.setCpf(rs.getString("col_CPF"));
			contato.setFone(rs.getString("col_Fone"));

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
					"from Colaborador where col_ID=?");
			stmt.setInt(1, id);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public ColaboradorVO getContatoPorId(int id){
		try{
			PreparedStatement stmt = con.prepareStatement("select * from Colaborador where col_ID=?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			
			
			if(rs.next()){
				
				// criando o objeto Contato
				ColaboradorVO contato = new ColaboradorVO();
				contato.setId(rs.getInt("col_ID"));
				contato.setNome(rs.getString("col_Nome"));
				contato.setCep(rs.getString("col_CEP"));
				contato.setEndereco(rs.getString("col_Ender"));
				contato.setCpf(rs.getString("col_CPF"));
				contato.setFone(rs.getString("col_Fone"));
				contato.setRg(rs.getString("col_RG"));	
				
				return contato;
			}
			rs.close();
			stmt.close();
		} catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	public void altera(ColaboradorVO contato) {
		contato.setId(getContatoPorCPF(contato.getCpf()));
			
		String sql = "update Colaborador set col_CEP=?, col_CPF=?, col_Ender=?, col_Fone=?, col_Nome=?, col_RG=? where col_ID=?";
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1,contato.getCep().isEmpty()?null:contato.getCep());
			stmt.setString(2,contato.getCpf().isEmpty()?null:contato.getCpf());
			stmt.setString(3,contato.getEndereco().isEmpty()?null:contato.getEndereco());
			stmt.setString(4,contato.getFone().isEmpty()?null:contato.getFone());
			stmt.setString(5,contato.getNome().isEmpty()?null:contato.getNome());
			stmt.setString(6,contato.getRg().isEmpty()?null:contato.getRg());
			stmt.setInt(7, contato.getId());
			
			stmt.execute();
			stmt.close();
		 } catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public int getContatoPorCPF(String cpf){
		try{
			PreparedStatement stmt;
			
			stmt = con.prepareStatement("select col_ID from Colaborador where col_CPF=?");
			
			stmt.setString(1, cpf);
			ResultSet rs = stmt.executeQuery();
			

			while (rs.next()) {
				return rs.getInt("col_ID");

			}
			rs.close();
			stmt.close();
			} catch (Exception e){
				e.printStackTrace();
			}
		
			return 0;
	}

}


