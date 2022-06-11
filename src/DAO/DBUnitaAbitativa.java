package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Package_ausiliario.TipoFornitura;
import Package_ausiliario.TipoUnitaFornitura;

public class DBUnitaAbitativa {
	private int idUnitaAbitativa;
	private String via;
	private String numeroCivico;
	private String numeroInterno;
	private String citta;
	private String codiceAvviamentoPostale;
	
	
	private ArrayList<DBFornitura> forniture;
	
	public DBUnitaAbitativa(int idUnitaAbitativa, String via, String numeroCivico, String numeroInterno, String citta, String codiceAvviamentoPostale) {
		super();
		this.idUnitaAbitativa = idUnitaAbitativa;
		this.via = via;
		this.numeroCivico = numeroCivico;
		this.numeroInterno = numeroInterno;
		this.codiceAvviamentoPostale = codiceAvviamentoPostale;
		this.citta = citta;
		forniture = new ArrayList<DBFornitura>();
	}
	public DBUnitaAbitativa() {
		forniture = new ArrayList<DBFornitura>();
	}
	
	public int getIdUnitaAbitativa() {
		return idUnitaAbitativa;
	}
	public void setIdUnitaAbitativa(int id) {
		this.idUnitaAbitativa = id;
	}
	public String getVia() {
		return via;
	}
	public void setVia(String via) {
		this.via = via;
	}
	public String getNumeroCivico() {
		return numeroCivico;
	}
	public void setNumeroCivico(String numeroCivico) {
		this.numeroCivico = numeroCivico;
	}
	public String getNumeroInterno() {
		return numeroInterno;
	}
	public void setNumeroInterno(String numeroInterno) {
		this.numeroInterno = numeroInterno;
	}
	public String getCodiceAvviamentoPostale() {
		return codiceAvviamentoPostale;
	}
	public void setCodiceAvviamentoPostale(String codiceAvviamentoPostale) {
		this.codiceAvviamentoPostale = codiceAvviamentoPostale;
	}
	public String getCitta() {
		return citta;
	}
	public void setCitta(String citta) {
		this.citta = citta;
	}
	
	public void caricaFornitureDaDB() {
		//fatture = new ArrayList<DBFattura>();
		String query = new String("select * from Forniture where Unita_Abitative_idUnitaAbitativa="+this.idUnitaAbitativa+";");
		try {
			ResultSet rs = DBConnectionManager.selectQuery(query);
			
			while(rs.next()) {
				DBFornitura fornitura = new DBFornitura(rs.getInt("idFornitura"), TipoFornitura.values()[ rs.getInt("tipoFornitura")], TipoUnitaFornitura.values()[ rs.getInt("tipoUnitaFornitura")], rs.getDouble("tariffa"));
				fornitura.caricaContatoreDaDB();
				fornitura.caricaFattureDaDB();
				forniture.add(fornitura);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//test
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBUnitaAbitativa un = new DBUnitaAbitativa();
		un.setIdUnitaAbitativa(1);
		un.caricaFornitureDaDB();
		
		System.out.println(un.forniture.get(0).getIdFornitura());

		
			

	}
	*/
	
	
	

}
