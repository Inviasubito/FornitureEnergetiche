package Entity;

import java.util.ArrayList;

import DAO.DBFattura;
import DAO.DBContatore;
import Package_ausiliario.TipoFornitura;
import Package_ausiliario.TipoUnitaFornitura;

public class Fornitura {
	private int id;
	private TipoFornitura tipofornitura;
	private double tariffa;
	private TipoUnitaFornitura tipounitafornitura;
	private ArrayList<Fattura> fatture;
	private Contatore contatore;
	
	public Fornitura() {
		this.id = 0;
		this.tariffa = 0.0;		
		this.contatore = new Contatore();
		this.fatture = new ArrayList<Fattura>();
	}
	
	public Fornitura(int id, TipoFornitura tipofornitura, double tariffa, TipoUnitaFornitura tipounitafornitura, ArrayList<Fattura> fatture) {
		super();
		this.id = id;
		this.tipofornitura = tipofornitura;
		this.tariffa = tariffa;
		this.tipounitafornitura = tipounitafornitura;
		this.contatore = new Contatore();
		this.fatture = fatture;
	}
	
	public void associaFattura(Fattura fattura) {	
		this.fatture.add(fattura); 
	}
	
	public void rimuoviFattura(Fattura fattura) {	
		this.fatture.remove(fattura); 
	}
	
	public void caricaContatore(DBContatore contatore) {
		this.contatore.setLettura1(contatore.getLettura1());
		this.contatore.setLettura2(contatore.getLettura2());
	}
	
	public void caricaFatture(ArrayList<DBFattura> fatture) {
		for(int i = 0; i<fatture.size(); i++) {
			Fattura fattura = new Fattura();
			fattura.setConsumi(fatture.get(i).getConsumi());
			fattura.setData(fatture.get(i).getData());
			fattura.setImporto(fatture.get(i).getImporto());
			this.fatture.add(fattura);
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TipoFornitura getTipofornitura() {
		return tipofornitura;
	}

	public void setTipofornitura(TipoFornitura tipofornitura) {
		this.tipofornitura = tipofornitura;
	}

	public double getTariffa() {
		return tariffa;
	}

	public void setTariffa(double tariffa) {
		this.tariffa = tariffa;
	}

	public TipoUnitaFornitura getTipounitafornitura() {
		return tipounitafornitura;
	}

	public void setTipounitafornitura(TipoUnitaFornitura tipounitafornitura) {
		this.tipounitafornitura = tipounitafornitura;
	}

	public ArrayList<Fattura> getFatture() {
		return fatture;
	}

	public Contatore getContatore() {
		return contatore;
	}

	public void setContatore(Contatore contatore) {
		this.contatore = contatore;
	}
}
