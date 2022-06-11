package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Entity.Cliente;
import Package_ausiliario.TipoFornitura;
import Package_ausiliario.TipoUnitaFornitura;


public class DBFornitura {
	private int idFornitura;
	private TipoFornitura tipoFornitura;
	private TipoUnitaFornitura tipoUnitaFornitura;
	private double tariffa;
	
	//attributi associazioni
	private DBContatore contatore;
	private ArrayList<DBFattura> fatture;
	
	//costruttore
	public DBFornitura(int idFornitura, TipoFornitura tipoFornitura, TipoUnitaFornitura tipoUnitaFornitura,
			double tariffa) {
		super();
		this.idFornitura = idFornitura;
		this.tipoFornitura = tipoFornitura;
		this.tipoUnitaFornitura = tipoUnitaFornitura;
		this.tariffa = tariffa;
		contatore = new DBContatore();
		fatture = new ArrayList<DBFattura>();
	}
	public DBFornitura() {
		contatore = new DBContatore();
		fatture = new ArrayList<DBFattura>();
	}
	
	
	//set and get IdFornitura
	public int getIdFornitura() {
		return idFornitura;
	}
	public void setIdFornitura(int idFornitura) {
		this.idFornitura = idFornitura;
	}
	// set and get tipoFornitura
	public TipoFornitura getTipoFornitura() {
		return tipoFornitura;
	}
	public void setTipoFornitura(TipoFornitura tipoFornitura) {
		this.tipoFornitura = tipoFornitura;
	}
	//set and get tipoUnitaFornitura
	public TipoUnitaFornitura getTipoUnitaFornitura() {
		return tipoUnitaFornitura;
	}
	public void setTipoUnitaFornitura(TipoUnitaFornitura tipoUnitaFornitura) {
		this.tipoUnitaFornitura = tipoUnitaFornitura;
	}
	
	//set and get tariffa;
	public double getTariffa() {
		return tariffa;
	}
	public void setTariffa(double tariffa) {
		this.tariffa = tariffa;
	}
	
	
	public void caricaContatoreDaDB() {
		//contatore = new DBContatore();
		String query = new String("select * from Contatori where Forniture_idFornitura="+this.idFornitura+";");
		try {
			ResultSet rs = DBConnectionManager.selectQuery(query);
			
			if(rs.next()) {
				this.contatore.setLettura1(rs.getInt("lettura1"));
				this.contatore.setLettura2(rs.getInt("lettura2"));			
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void caricaFattureDaDB() {
		//fatture = new ArrayList<DBFattura>();
		String query = new String("select * from Fatture where Forniture_idFornitura="+this.idFornitura+";");
		try {
			ResultSet rs = DBConnectionManager.selectQuery(query);
			
			while(rs.next()) {
				DBFattura fattura = new DBFattura(rs.getDate("data"), rs.getDouble("importo") , rs.getInt("consumi"));
				fatture.add(fattura);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//for test
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBFornitura forn = new DBFornitura();
		forn.setIdFornitura(1);
		forn.caricaContatoreDaDB();
		forn.caricaFattureDaDB();

		
			

	}
	*/
	
	

	
	
}
