package Entity;

import java.util.Date;

public class Fattura {
	
	private Date data;
	private double importo;
	private int consumi;
	
	public Fattura(Date data, double importo, int consumi) {
		super();
		this.data = data;
		this.importo = importo;
		this.consumi = consumi;
	}
	
	public Fattura() {
		this.data = new Date();
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public double getImporto() {
		return importo;
	}
	public void setImporto(double importo) {
		this.importo = importo;
	}
	public int getConsumi() {
		return consumi;
	}
	public void setConsumi(int consumi) {
		this.consumi = consumi;
	}
	
	
}
