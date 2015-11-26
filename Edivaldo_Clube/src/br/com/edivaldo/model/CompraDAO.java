package br.com.edivaldo.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CompraDAO {
	
	public CompraDAO(Connection connect){
		this.con= connect;		
	}
		
	private Connection con;

	String sql = "insert into Compra (com_Data, com_QtItens, com_VlTotal, for_ID) "
			+ " values (?,?,?,?)";
	String sql2 = "insert into ItemCompra (itc_Seq, com_ID, itc_Qtd, itc_VlUnit, itc_VlTotal, prd_ID) "
			+ " values (?,?,?,?,?,?)";
	public void setContato(CompraVO contato){		
		try {
			// prepared statement para inserção
			PreparedStatement stmt = con.prepareStatement(sql);
			// seta os valores
			stmt.setDate(1, new Date(contato.getData().getTimeInMillis()));
			stmt.setInt(2,contato.getCompraQtdItem());
			stmt.setDouble(3,contato.getCompraValorTotal());
			stmt.setInt(4, contato.getFornecedor());
			stmt.execute();
			stmt.close();
			
			contato.setId(getIdContato());
			
			PreparedStatement stmt2 = con.prepareStatement(sql2);
			stmt2.setInt(1,1);
			stmt2.setInt(2,contato.getId());
			stmt2.setInt(3,contato.getItemQtd());
			stmt2.setDouble(4, contato.getItemValorUnitario());
			stmt2.setDouble(5, contato.getCompraValorTotal());
			stmt2.setInt(6, contato.getProduto());
			stmt2.execute();
			stmt2.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void setContato(CompraVO contato, CompraVO contato2){		
		try {
			// prepared statement para inserção
			PreparedStatement stmt = con.prepareStatement(sql);
			// seta os valores
			stmt.setDate(1, new Date(contato.getData().getTimeInMillis()));
			stmt.setInt(2,contato.getCompraQtdItem());
			stmt.setDouble(3,contato.getCompraValorTotal());
			stmt.setInt(4, contato.getFornecedor());
			stmt.execute();
			stmt.close();
			
			contato.setId(getIdContato());
			
			PreparedStatement stmt2 = con.prepareStatement(sql2);
			stmt2.setInt(1,1);
			stmt2.setInt(2,contato.getId());
			stmt2.setInt(3,contato.getItemQtd());
			stmt2.setDouble(4, contato.getItemValorUnitario());
			stmt2.setDouble(5, contato.getItemValorTotal());
			stmt2.setInt(6, contato.getProduto());
			stmt2.execute();
			stmt2.close();
			
			PreparedStatement stmt3 = con.prepareStatement(sql2);
			stmt3.setInt(1,2);
			stmt3.setInt(2,contato.getId());
			stmt3.setInt(3,contato2.getItemQtd());
			stmt3.setDouble(4, contato2.getItemValorUnitario());
			stmt3.setDouble(5, contato2.getItemValorTotal());
			stmt3.setInt(6, contato2.getProduto());
			stmt3.execute();
			stmt3.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void setContato(CompraVO contato, CompraVO contato2, CompraVO contato3){
		try {
			// prepared statement para inserção
			PreparedStatement stmt = con.prepareStatement(sql);
			// seta os valores
			stmt.setDate(1, new Date(contato.getData().getTimeInMillis()));
			stmt.setInt(2,contato.getCompraQtdItem());
			stmt.setDouble(3,contato.getCompraValorTotal());
			stmt.setInt(4, contato.getFornecedor());
			stmt.execute();
			stmt.close();
			
			contato.setId(getIdContato());
			
			PreparedStatement stmt2 = con.prepareStatement(sql2);
			stmt2.setInt(1,1);
			stmt2.setInt(2,contato.getId());
			stmt2.setInt(3,contato.getItemQtd());
			stmt2.setDouble(4, contato.getItemValorUnitario());
			stmt2.setDouble(5, contato.getItemValorTotal());
			stmt2.setInt(6, contato.getProduto());
			stmt2.execute();
			stmt2.close();
			
			PreparedStatement stmt3 = con.prepareStatement(sql2);
			stmt3.setInt(1,2);
			stmt3.setInt(2,contato.getId());
			stmt3.setInt(3,contato2.getItemQtd());
			stmt3.setDouble(4, contato2.getItemValorUnitario());
			stmt3.setDouble(5, contato2.getItemValorTotal());
			stmt3.setInt(6, contato2.getProduto());
			stmt3.execute();
			stmt3.close();

			PreparedStatement stmt4 = con.prepareStatement(sql2);
			stmt4.setInt(1,3);
			stmt4.setInt(2,contato.getId());
			stmt4.setInt(3,contato3.getItemQtd());
			stmt4.setDouble(4, contato3.getItemValorUnitario());
			stmt4.setDouble(5, contato3.getItemValorTotal());
			stmt4.setInt(6, contato3.getProduto());
			stmt4.execute();
			stmt4.close();		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public void setContato(CompraVO contato, CompraVO contato2, CompraVO contato3, CompraVO contato4){
		try {
			// prepared statement para inserção
			PreparedStatement stmt = con.prepareStatement(sql);
			// seta os valores
			stmt.setDate(1, new Date(contato.getData().getTimeInMillis()));
			stmt.setInt(2,contato.getCompraQtdItem());
			stmt.setDouble(3,contato.getCompraValorTotal());
			stmt.setInt(4, contato.getFornecedor());
			stmt.execute();
			stmt.close();
			
			contato.setId(getIdContato());
			
			PreparedStatement stmt2 = con.prepareStatement(sql2);
			stmt2.setInt(1,1);
			stmt2.setInt(2,contato.getId());
			stmt2.setInt(3,contato.getItemQtd());
			stmt2.setDouble(4, contato.getItemValorUnitario());
			stmt2.setDouble(5, contato.getItemValorTotal());
			stmt2.setInt(6, contato.getProduto());
			stmt2.execute();
			stmt2.close();
			
			PreparedStatement stmt3 = con.prepareStatement(sql2);
			stmt3.setInt(1,2);
			stmt3.setInt(2,contato.getId());
			stmt3.setInt(3,contato2.getItemQtd());
			stmt3.setDouble(4, contato2.getItemValorUnitario());
			stmt3.setDouble(5, contato2.getItemValorTotal());
			stmt3.setInt(6, contato2.getProduto());
			stmt3.execute();
			stmt3.close();

			PreparedStatement stmt4 = con.prepareStatement(sql2);
			stmt4.setInt(1,3);
			stmt4.setInt(2,contato.getId());
			stmt4.setInt(3,contato3.getItemQtd());
			stmt4.setDouble(4, contato3.getItemValorUnitario());
			stmt4.setDouble(5, contato3.getItemValorTotal());
			stmt4.setInt(6, contato3.getProduto());
			stmt4.execute();
			stmt4.close();
			
			PreparedStatement stmt5 = con.prepareStatement(sql2);
			stmt5.setInt(1,4);
			stmt5.setInt(2,contato.getId());
			stmt5.setInt(3,contato4.getItemQtd());
			stmt5.setDouble(4, contato4.getItemValorUnitario());
			stmt5.setDouble(5, contato4.getItemValorTotal());
			stmt5.setInt(6, contato4.getProduto());
			stmt5.execute();
			stmt5.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void setContato(CompraVO contato, CompraVO contato2, CompraVO contato3, CompraVO contato4, CompraVO contato5){
		try {
			// prepared statement para inserção
			PreparedStatement stmt = con.prepareStatement(sql);
			// seta os valores
			stmt.setDate(1, new Date(contato.getData().getTimeInMillis()));
			stmt.setInt(2,contato.getCompraQtdItem());
			stmt.setDouble(3,contato.getCompraValorTotal());
			stmt.setInt(4, contato.getFornecedor());
			stmt.execute();
			stmt.close();
			
			contato.setId(getIdContato());
			
			PreparedStatement stmt2 = con.prepareStatement(sql2);
			stmt2.setInt(1,1);
			stmt2.setInt(2,contato.getId());
			stmt2.setInt(3,contato.getItemQtd());
			stmt2.setDouble(4, contato.getItemValorUnitario());
			stmt2.setDouble(5, contato.getItemValorTotal());
			stmt2.setInt(6, contato.getProduto());
			stmt2.execute();
			stmt2.close();
			
			PreparedStatement stmt3 = con.prepareStatement(sql2);
			stmt3.setInt(1,2);
			stmt3.setInt(2,contato.getId());
			stmt3.setInt(3,contato2.getItemQtd());
			stmt3.setDouble(4, contato2.getItemValorUnitario());
			stmt3.setDouble(5, contato2.getItemValorTotal());
			stmt3.setInt(6, contato2.getProduto());
			stmt3.execute();
			stmt3.close();

			PreparedStatement stmt4 = con.prepareStatement(sql2);
			stmt4.setInt(1,3);
			stmt4.setInt(2,contato.getId());
			stmt4.setInt(3,contato3.getItemQtd());
			stmt4.setDouble(4, contato3.getItemValorUnitario());
			stmt4.setDouble(5, contato3.getItemValorTotal());
			stmt4.setInt(6, contato3.getProduto());
			stmt4.execute();
			stmt4.close();
			
			PreparedStatement stmt5 = con.prepareStatement(sql2);
			stmt5.setInt(1,4);
			stmt5.setInt(2,contato.getId());
			stmt5.setInt(3,contato4.getItemQtd());
			stmt5.setDouble(4, contato4.getItemValorUnitario());
			stmt5.setDouble(5, contato4.getItemValorTotal());
			stmt5.setInt(6, contato4.getProduto());
			stmt5.execute();
			stmt5.close();
			
			PreparedStatement stmt6 = con.prepareStatement(sql2);
			stmt6.setInt(1,5);
			stmt6.setInt(2,contato.getId());
			stmt6.setInt(3,contato5.getItemQtd());
			stmt6.setDouble(4, contato5.getItemValorUnitario());
			stmt6.setDouble(5, contato5.getItemValorTotal());
			stmt6.setInt(6, contato5.getProduto());
			stmt6.execute();
			stmt6.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public int getIdContato(){
		
		
		try{
			PreparedStatement stmt;
			
				stmt = con.prepareStatement("select MAX(com_ID) from Compra");
				
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
	
	public List<CompraVO> pesquisaRelatorio(){
		List<CompraVO> listas = new ArrayList<CompraVO>();
		try{
			PreparedStatement stmt;
			
				stmt = con.prepareStatement("select for_Nome, com_Data, itc_Qtd, itc_VlTotal, prd_Nome from Compra natural join Fornecedor natural join ItemCompra natural join Produto");
				
			ResultSet rs = stmt.executeQuery();
			
				while(rs.next()){
					Calendar cal = Calendar.getInstance();
					CompraVO compra = new CompraVO();
					compra.setCompraQtdItem(rs.getInt("itc_Qtd"));
					compra.setCompraValorTotal(rs.getDouble("itc_VlTotal"));
					cal.setTime(rs.getDate("com_Data"));
					compra.setData(cal);
					compra.setNomeFornecedor(rs.getString("for_Nome"));
					compra.setNomeProduto(rs.getString("prd_Nome"));

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