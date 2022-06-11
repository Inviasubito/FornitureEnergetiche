package Entity;

import Package_ausiliario.TipoFornitura;

public class Tariffa {
	
	private String citta;
	private TipoFornitura tipoFornitura;
	private double tariffa;
		
	public Tariffa(String citta, TipoFornitura tipoFornitura, double tariffa) {
		super();
		this.citta = citta;
		this.tipoFornitura = tipoFornitura;
		this.tariffa = tariffa;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public TipoFornitura getTipoFornitura() {
		return tipoFornitura;
	}

	public void setTipoFornitura(TipoFornitura tipoFornitura) {
		this.tipoFornitura = tipoFornitura;
	}

	public double getTariffa() {
		return tariffa;
	}

	public void setTariffa(double tariffa) {
		this.tariffa = tariffa;
	}
}