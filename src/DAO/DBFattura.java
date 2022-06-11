package DAO;

import java.util.Date;

public class DBFattura {
	private Date data;
	double importo;
	int consumi;
	
	//costruttore
	public DBFattura(Date data, double importo, int consumi) {
		super();
		this.data = data;
		this.importo = importo;
		this.consumi = consumi;
	}
	
	//costrutturo nullo
	public DBFattura() {
		super();
	}
	
	//set and get data
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	// set and get importo
	public double getImporto() {
		return importo;
	}
	public void setImporto(double importo) {
		this.importo = importo;
	}
	
	//set and get Consumi
	public int getConsumi() {
		return consumi;
	}
	public void setConsumi(int consumi) {
		this.consumi = consumi;
	}
	
	
}
