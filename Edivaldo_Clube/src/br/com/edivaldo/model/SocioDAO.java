package br.com.edivaldo.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class SocioDAO {
	public SocioDAO(Connection connect){
		this.con= connect;		
	}
	
	private Connection con;

	public void setContato(SocioVO contato){
		
		
		String sql = "insert into Socio (soc_CEP, soc_CPF, soc_Ender, soc_Expira, soc_Fone, soc_Nome, soc_Resp, soc_RG, soc_Tipo) "
				+ " values (?,?,?,?,?,?,?,?,?)";
		try {
			// prepared statement para inserção
			PreparedStatement stmt = con.prepareStatement(sql);
			// seta os valores
			stmt.setString(1,contato.getCep().isEmpty()?null:contato.getCep());
			stmt.setString(2,contato.getCpf().isEmpty()?null:contato.getCpf());
			stmt.setString(3,contato.getEndereco().isEmpty()?null:contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataExpiracao().getTimeInMillis()));
			stmt.setString(5,contato.getFone());
			stmt.setString(6,contato.getNome());
			stmt.setInt(7,contato.getResponsavel());
			stmt.setString(8,contato.getRg().isEmpty()?null:contato.getRg());
			stmt.setString(9,contato.getTipo());
			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e.getMessage());;
		}
	}
		public List<SocioVO> getTitulares(){
			
			
			List<SocioVO> contatos = new ArrayList<SocioVO>();
			try{
				PreparedStatement stmt = con.prepareStatement("select * from Socio where soc_Tipo = 'T'");
				ResultSet rs = stmt.executeQuery();
				

				while (rs.next()) {

					// criando o objeto Contato
					SocioVO contato = new SocioVO();
					contato.setId(rs.getInt("soc_ID"));
					contato.setNome(rs.getString("soc_Nome"));
					contato.setCep(rs.getString("soc_CEP"));
					contato.setEndereco(rs.getString("soc_Ender"));
					contato.setCpf(rs.getString("soc_CPF"));
					contato.setFone(rs.getString("soc_Fone"));
					contato.setTipo(rs.getString("soc_Tipo"));

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
		
		public List<SocioVO> getContatos(){
			
			SimpleDateFormat padrao = new SimpleDateFormat("dd/MM/yyyy");

			
			List<SocioVO> contatos = new ArrayList<SocioVO>();
			try{
				PreparedStatement stmt = con.prepareStatement("select * from Socio order by soc_Nome");
				ResultSet rs = stmt.executeQuery();
				
				while (rs.next()) {

					// criando o objeto Contato
					SocioVO contato = new SocioVO();
					contato.setId(rs.getInt("soc_ID"));
					contato.setNome(rs.getString("soc_Nome"));
					contato.setCep(rs.getString("soc_CEP"));
					contato.setEndereco(rs.getString("soc_Ender"));
					contato.setCpf(rs.getString("soc_CPF"));
					contato.setFone(rs.getString("soc_Fone"));
					contato.setTipo(rs.getString("soc_Tipo"));
					contato.setRg(rs.getString("soc_RG"));
					contato.setResponsavel(rs.getString("soc_Resp")==null?0:rs.getInt("soc_Resp"));					
					Calendar data = Calendar.getInstance();
					data.setTime(rs.getString("soc_Expira")==null?padrao.parse("18/12/1993"):rs.getDate("soc_Expira"));
					contato.setDataExpiracao(data);

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
	
		public void remove(int id) {
			
						
			try {
				PreparedStatement stmt = con.prepareStatement("delete "+"from Socio where soc_ID=?");
				stmt.setInt(1, id);
				stmt.execute();
				stmt.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
			
		}
		public SocioVO getContatoPorId(int id){
			
			SimpleDateFormat padrao = new SimpleDateFormat("dd/MM/yyyy");
			
			try{
				PreparedStatement stmt = con.prepareStatement("select * from Socio where soc_ID=?");
				stmt.setInt(1, id);
				ResultSet rs = stmt.executeQuery();
				
				
				if(rs.next()){
					
					// criando o objeto Contato
					SocioVO contato = new SocioVO();
					contato.setId(rs.getInt("soc_ID"));
					contato.setNome(rs.getString("soc_Nome"));
					contato.setCep(rs.getString("soc_CEP"));
					contato.setEndereco(rs.getString("soc_Ender"));
					contato.setCpf(rs.getString("soc_CPF"));
					contato.setFone(rs.getString("soc_Fone"));
					contato.setTipo(rs.getString("soc_Tipo"));
					contato.setRg(rs.getString("soc_RG"));
					contato.setResponsavel(rs.getString("soc_Resp")==null?0:rs.getInt("soc_Resp"));					
					Calendar data = Calendar.getInstance();
					data.setTime(rs.getString("soc_Expira")==null?padrao.parse("18/12/1993"):rs.getDate("soc_Expira"));
					contato.setDataExpiracao(data);
					
					return contato;
				}
				rs.close();
				stmt.close();
			} catch (Exception e){
				e.printStackTrace();
			}
			return null;
		}
		
		public void altera(SocioVO contato) {
			
					
			if(contato.getTipo().equals("T")){
				contato.setId(getContatoPorCPF(contato.getCpf(),"T"));
			}else{
				contato.setId(getContatoPorCPF(contato.getRg(),"D"));
			}
			String sql = "update Socio set soc_CEP=?, soc_CPF=?, soc_Ender=?, soc_Expira=?, soc_Fone=?, soc_Nome=?, soc_RG=?, soc_Tipo=? where soc_ID=?";
			try {
				PreparedStatement stmt = con.prepareStatement(sql);
				
				stmt.setString(1,contato.getCep().isEmpty()?null:contato.getCep());
				stmt.setString(2,contato.getCpf().isEmpty()?null:contato.getCpf());
				stmt.setString(3,contato.getEndereco().isEmpty()?null:contato.getEndereco());
				stmt.setDate(4, new Date(contato.getDataExpiracao().getTimeInMillis()));
				stmt.setString(5,contato.getFone());
				stmt.setString(6,contato.getNome());
				stmt.setString(7,contato.getRg().isEmpty()?null:contato.getRg());
				stmt.setString(8,contato.getTipo());
				stmt.setInt(9,contato.getId());
				
				stmt.execute();
				stmt.close();
			 } catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		
		public int getContatoPorCPF(String cpf, String l){
			
			
			try{
				PreparedStatement stmt;
				
				if(l.equals("T")){
					stmt = con.prepareStatement("select soc_ID from Socio where soc_CPF=?");
				}else{
					stmt = con.prepareStatement("select soc_ID from Socio where soc_RG=?");
				}
				stmt.setString(1, cpf);
				ResultSet rs = stmt.executeQuery();
				

				while (rs.next()) {
					return rs.getInt("soc_ID");

				}
				rs.close();
				stmt.close();
				} catch (Exception e){
					e.printStackTrace();
				}
			
				return 0;
		}
		
public ResultSet getContatosTeste(){
			
			SimpleDateFormat padrao = new SimpleDateFormat("dd/MM/yyyy");

			
			List<SocioVO> contatos = new ArrayList<SocioVO>();
			try{
				PreparedStatement stmt = con.prepareStatement("select * from Socio order by soc_Nome");
				ResultSet rs = stmt.executeQuery();
				
				while (rs.next()) {

					// criando o objeto Contato
					SocioVO contato = new SocioVO();
					contato.setId(rs.getInt("soc_ID"));
					contato.setNome(rs.getString("soc_Nome"));
					contato.setCep(rs.getString("soc_CEP"));
					contato.setEndereco(rs.getString("soc_Ender"));
					contato.setCpf(rs.getString("soc_CPF"));
					contato.setFone(rs.getString("soc_Fone"));
					contato.setTipo(rs.getString("soc_Tipo"));
					contato.setRg(rs.getString("soc_RG"));
					contato.setResponsavel(rs.getString("soc_Resp")==null?0:rs.getInt("soc_Resp"));					
					Calendar data = Calendar.getInstance();
					data.setTime(rs.getString("soc_Expira")==null?padrao.parse("18/12/1993"):rs.getDate("soc_Expira"));
					contato.setDataExpiracao(data);

					// adicionando o objeto à lista
					contatos.add(contato);
				}
				return rs;
				} catch (Exception e){
					e.printStackTrace();
				}
							
				return null;
		} 

}


