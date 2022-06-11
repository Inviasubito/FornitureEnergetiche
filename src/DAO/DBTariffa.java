package DAO;

import Package_ausiliario.TipoFornitura;

public class DBTariffa {
	private String citta;
	private TipoFornitura tipoFornitura;
	private double tariffa;
		
	public DBTariffa(String citta, TipoFornitura tipoFornitura, double tariffa) {
		super();
		this.citta = citta;
		this.tipoFornitura = tipoFornitura;
		this.tariffa = tariffa;
	}
	
	
}
