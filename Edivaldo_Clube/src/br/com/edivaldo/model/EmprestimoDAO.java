package br.com.edivaldo.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class EmprestimoDAO {
	
	public EmprestimoDAO(Connection connect){
		this.con= connect;		
	}
		
	private Connection con;

	private String sql = "insert into Emprestimo (emp_Data, emp_Qtd, emp_VlTotal, soc_ID, col_ID, fat_ID, itf_seq, emp_DtPrev, emp_DtDev) "
			+ " values (?,?,?,?,?,?,?,?,?)";
	
	public void setContato(EmprestimoVO contato){		
		try {
			// prepared statement para inserção
			PreparedStatement stmt = con.prepareStatement(sql);
			// seta os valores
			contato.setFatura(getIdFatura(contato.getSocio()));
			contato.setFaturaSequencia(getSeqFatura(contato.getFatura())+1);
			insereFatura(contato);

			stmt.setDate(1,new Date(contato.getData().getTimeInMillis()));
			stmt.setInt(2,contato.getCompraQtdItem());
			stmt.setDouble(3,contato.getCompraValorTotal());
			stmt.setInt(4,contato.getSocio());
			stmt.setInt(5,contato.getColaborador());
			stmt.setInt(6,contato.getFatura());
			stmt.setInt(7,contato.getFaturaSequencia());
			stmt.setDate(8,new Date(contato.getDataPrevisao().getTimeInMillis()));
			stmt.setDate(9,new Date(contato.getDataDevolucao().getTimeInMillis()));
			stmt.execute();
			stmt.close();
			
			contato.setId(getIdContato());
			insereItemEmprestimo(contato,1);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void insereItemEmprestimo(EmprestimoVO contato, int qtd){		
		String sql2 = "insert into ItemEmprestimo ( emp_ID, ite_Seq, ite_Valor, acv_ID) values (?,?,?,?)";
		try {			
			contato.setId(getIdContato());
			PreparedStatement stmt2 = con.prepareStatement(sql2);
			stmt2.setInt(1,contato.getId());
			stmt2.setInt(2,qtd);
			stmt2.setDouble(3,contato.getItemValorUnitario());
			stmt2.setInt(4,contato.getAcervo());
			stmt2.execute();
			stmt2.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void insereFatura(EmprestimoVO contato){		
		String sql2 = "insert into ItemFatura (fat_ID, itf_Seq, itf_Descr, itf_Valor) values (?,?,?,?)";
		try {			
			PreparedStatement stmt2 = con.prepareStatement(sql2);
			stmt2.setInt(1,contato.getFatura());
			stmt2.setInt(2,contato.getFaturaSequencia());
			stmt2.setString(3,"Emprestimos");
			stmt2.setDouble(4,contato.getCompraValorTotal());
			stmt2.execute();
			stmt2.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	
	public void setContato(EmprestimoVO contato, EmprestimoVO contato2){		
		try {
			// prepared statement para inserção
			PreparedStatement stmt = con.prepareStatement(sql);
			// seta os valores
			contato.setFatura(getIdFatura(contato.getSocio()));
			contato.setFaturaSequencia(getSeqFatura(contato.getFatura())+1);
			contato2.setFatura(contato.getFatura());
			contato2.setFaturaSequencia(contato.getFaturaSequencia()+1);
			insereFatura(contato);
			
			stmt.setDate(1, new Date(contato.getData().getTimeInMillis()));
			stmt.setInt(2,contato.getCompraQtdItem());
			stmt.setDouble(3,contato.getCompraValorTotal());
			stmt.setInt(4, contato.getSocio());
			stmt.setInt(5, contato.getColaborador());
			stmt.setInt(6, contato.getFatura());
			stmt.setInt(7, contato.getFaturaSequencia());
			stmt.setDate(8, new Date(contato.getDataPrevisao().getTimeInMillis()));
			stmt.setDate(9, new Date(contato.getDataDevolucao().getTimeInMillis()));
			stmt.execute();
			stmt.close();

			contato.setId(getIdContato());
			contato2.setId(contato.getId());
			insereItemEmprestimo(contato,1);
			insereItemEmprestimo(contato2,2);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void setContato(EmprestimoVO contato, EmprestimoVO contato2, EmprestimoVO contato3){
		try {
			// prepared statement para inserção
			PreparedStatement stmt = con.prepareStatement(sql);
			// seta os valores
			contato.setFatura(getIdFatura(contato.getSocio()));
			contato.setFaturaSequencia(getSeqFatura(contato.getFatura())+1);
			contato2.setFatura(contato.getFatura());
			contato2.setFaturaSequencia(contato.getFaturaSequencia()+1);
			contato3.setFatura(contato.getFatura());
			contato3.setFaturaSequencia(contato.getFaturaSequencia()+2);
			insereFatura(contato);

			stmt.setDate(1, new Date(contato.getData().getTimeInMillis()));
			stmt.setInt(2,contato.getCompraQtdItem());
			stmt.setDouble(3,contato.getCompraValorTotal());
			stmt.setInt(4, contato.getSocio());
			stmt.setInt(5, contato.getColaborador());
			stmt.setInt(6, contato.getFatura());
			stmt.setInt(7, contato.getFaturaSequencia());
			stmt.setDate(8, new Date(contato.getDataPrevisao().getTimeInMillis()));
			stmt.setDate(9, new Date(contato.getDataDevolucao().getTimeInMillis()));
			stmt.execute();
			stmt.close();

			contato.setId(getIdContato());
			contato2.setId(contato.getId());
			contato3.setId(contato.getId());			
			insereItemEmprestimo(contato,1);
			insereItemEmprestimo(contato2,2);
			insereItemEmprestimo(contato3,3);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void setContato(EmprestimoVO contato, EmprestimoVO contato2, EmprestimoVO contato3, EmprestimoVO contato4){
		try {
			// prepared statement para inserção
			PreparedStatement stmt = con.prepareStatement(sql);
			// seta os valores
			contato.setFatura(getIdFatura(contato.getSocio()));
			contato.setFaturaSequencia(getSeqFatura(contato.getFatura())+1);
			contato2.setFatura(contato.getFatura());
			contato2.setFaturaSequencia(contato.getFaturaSequencia()+1);
			contato3.setFatura(contato.getFatura());
			contato3.setFaturaSequencia(contato.getFaturaSequencia()+2);
			contato4.setFatura(contato.getFatura());
			contato4.setFaturaSequencia(contato.getFaturaSequencia()+3);
			insereFatura(contato);
					
			stmt.setDate(1, new Date(contato.getData().getTimeInMillis()));
			stmt.setInt(2,contato.getCompraQtdItem());
			stmt.setDouble(3,contato.getCompraValorTotal());
			stmt.setInt(4, contato.getSocio());
			stmt.setInt(5, contato.getColaborador());
			stmt.setInt(6, contato.getFatura());
			stmt.setInt(7, contato.getFaturaSequencia());
			stmt.setDate(8, new Date(contato.getDataPrevisao().getTimeInMillis()));
			stmt.setDate(9, new Date(contato.getDataDevolucao().getTimeInMillis()));
			stmt.execute();
			stmt.close();

			contato.setId(getIdContato());
			contato2.setId(contato.getId());
			contato3.setId(contato.getId());
			contato4.setId(contato.getId());
			insereItemEmprestimo(contato,1);
			insereItemEmprestimo(contato2,2);
			insereItemEmprestimo(contato3,3);
			insereItemEmprestimo(contato4,4);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void setContato(EmprestimoVO contato, EmprestimoVO contato2, EmprestimoVO contato3, EmprestimoVO contato4, EmprestimoVO contato5){
		try {
			// prepared statement para inserção
			PreparedStatement stmt = con.prepareStatement(sql);
			// seta os valores
			contato.setFatura(getIdFatura(contato.getSocio()));
			contato.setFaturaSequencia(getSeqFatura(contato.getFatura())+1);
			contato2.setFatura(contato.getFatura());
			contato2.setFaturaSequencia(contato.getFaturaSequencia()+1);
			contato3.setFatura(contato.getFatura());
			contato3.setFaturaSequencia(contato.getFaturaSequencia()+2);
			contato4.setFatura(contato.getFatura());
			contato4.setFaturaSequencia(contato.getFaturaSequencia()+3);
			contato5.setFatura(contato.getFatura());
			contato5.setFaturaSequencia(contato.getFaturaSequencia()+4);
			insereFatura(contato);

			stmt.setDate(1, new Date(contato.getData().getTimeInMillis()));
			stmt.setInt(2,contato.getCompraQtdItem());
			stmt.setDouble(3,contato.getCompraValorTotal());
			stmt.setInt(4, contato.getSocio());
			stmt.setInt(5, contato.getColaborador());
			stmt.setInt(6, contato.getFatura());
			stmt.setInt(7, contato.getFaturaSequencia());
			stmt.setDate(8, new Date(contato.getDataPrevisao().getTimeInMillis()));
			stmt.setDate(9, new Date(contato.getDataDevolucao().getTimeInMillis()));
			stmt.execute();
			stmt.close();

			contato.setId(getIdContato());
			contato2.setId(contato.getId());
			contato3.setId(contato.getId());
			contato4.setId(contato.getId());
			contato5.setId(contato.getId());
			insereItemEmprestimo(contato,1);
			insereItemEmprestimo(contato2,2);
			insereItemEmprestimo(contato3,3);
			insereItemEmprestimo(contato4,4);
			insereItemEmprestimo(contato5,5);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public int getIdContato(){
		
		
		try{
			PreparedStatement stmt;
			
				stmt = con.prepareStatement("select MAX(emp_ID) from Emprestimo");
				
			ResultSet rs = stmt.executeQuery();
			
				rs.next();
				int var =rs.getInt(1);

				rs.close();
			stmt.close();
			return var;
			} catch (Exception e){
				e.printStackTrace();
			}
		
			return 0;
	}
	
	public int getIdFatura(int valor){
		
		
		try{
			PreparedStatement stmt;
			
				stmt = con.prepareStatement("select fat_ID from Fatura Where soc_ID=?");
				stmt.setInt(1, valor);
			ResultSet rs = stmt.executeQuery();
			
				if(rs.first()){
					int var =rs.getInt(1);
					rs.close();
					stmt.close();
					return var;
				}else{
					 int pqp;
						PreparedStatement stmt2 = con.prepareStatement("select soc_Resp from Socio Where soc_ID=?");
						stmt2.setInt(1, valor);
						ResultSet rs2 = stmt2.executeQuery();				
						rs2.next();
						pqp = rs2.getInt(1);
						rs.close();
						stmt.close();
						PreparedStatement stmt3 = con.prepareStatement("select fat_ID from Fatura Where soc_ID=?");
						stmt3.setInt(1, pqp);
					ResultSet rs3 = stmt3.executeQuery();
						rs3.next();
						pqp = rs3.getInt(1);
						rs3.close();
						stmt3.close();
						return pqp;
				}
			} catch (Exception e){
				e.printStackTrace();
			}
		
			return 0;
	}

	public int getSeqFatura(int valor){
		
		
		try{
			PreparedStatement stmt;
			
				stmt = con.prepareStatement("select MAX(itf_Seq) from ItemFatura Where fat_ID=?");
				stmt.setInt(1, valor);
			ResultSet rs = stmt.executeQuery();
			
				rs.next();
				int var =rs.getInt(1);

				rs.close();
			stmt.close();
			return var;
			} catch (Exception e){
				e.printStackTrace();
			}
		
			return 0;
	}
	
	public List<EmprestimoVO> pesquisaRelatorio(){
		List<EmprestimoVO> listas = new ArrayList<EmprestimoVO>();
		try{
			PreparedStatement stmt;
			
				stmt = con.prepareStatement("select col_Nome, soc_Nome, emp_Data, emp_DtDev, emp_VlTotal from Emprestimo natural join Colaborador natural join Socio");
				
			ResultSet rs = stmt.executeQuery();
			
				while(rs.next()){
					Calendar cal = Calendar.getInstance();
					Calendar cal2 = Calendar.getInstance();
					EmprestimoVO compra = new EmprestimoVO();
					compra.setNomeColaborador(rs.getString("col_Nome"));
					compra.setNomeSocio(rs.getString("soc_Nome"));
					cal.setTime(rs.getDate("emp_Data"));
					compra.setData(cal);
					cal2.setTime(rs.getDate("emp_DtDev"));
					compra.setDataDevolucao(cal2);					
					compra.setCompraValorTotal(rs.getDouble("emp_VlTotal"));
					
					listas.add(compra);
				}				
				rs.close();
				stmt.close();
				return listas;
			} catch (Exception e){
				e.printStackTrace();
			}
		
			return null;
	}
}