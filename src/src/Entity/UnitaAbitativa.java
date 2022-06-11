package Entity;

import java.util.ArrayList;

import DAO.DBFornitura;

public class UnitaAbitativa {
	private String via;
	private String numeroCivico;
	private String numeroInterno;
	private String citta;
	private String codiceAvviamentoPostale;
	private ArrayList<Fornitura> forniture;
	
	
	public UnitaAbitativa(String via, String numeroCivico, String numeroInterno, String citta,
			String codiceAvviamentoPostale, ArrayList<Fornitura> forniture) {
		super();
		this.via = via;
		this.numeroCivico = numeroCivico;
		this.numeroInterno = numeroInterno;
		this.citta = citta;
		this.codiceAvviamentoPostale = codiceAvviamentoPostale;
		this.forniture = forniture;
	}
	
	public UnitaAbitativa() {
		this.forniture = new ArrayList<Fornitura>();
	}

	public void associaFornitura(Fornitura fornitura) {
		this.forniture.add(fornitura);
	}
	
	public void rimuoviFornitura(Fornitura fornitura) {
		this.forniture.remove(fornitura);
	}

	public void caricaForniture(ArrayList<DBFornitura> forniture) {
		for(int i = 0; i<forniture.size(); i++) {
			Fornitura fornitura = new Fornitura();
			fornitura.setId(forniture.get(i).getIdFornitura());
			fornitura.setTariffa(forniture.get(i).getTariffa());
			fornitura.setTipofornitura(forniture.get(i).getTipoFornitura());
			fornitura.setTipounitafornitura(forniture.get(i).getTipoUnitaFornitura());
			fornitura.caricaContatore(forniture.get(i).getContatore());
			fornitura.caricaFatture(forniture.get(i).getFatture());
			this.forniture.add(fornitura);
		}
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



	public String getCitta() {
		return citta;
	}



	public void setCitta(String citta) {
		this.citta = citta;
	}



	public String getCodiceAvviamentoPostale() {
		return codiceAvviamentoPostale;
	}



	public void setCodiceAvviamentoPostale(String codiceAvviamentoPostale) {
		this.codiceAvviamentoPostale = codiceAvviamentoPostale;
	}



	public String getNumeroInterno() {
		return numeroInterno;
	}
	
	public void setNumeroInterno(String numeroInterno) {
		this.numeroInterno = numeroInterno;
	}
	

	public ArrayList<Fornitura> getForniture() {
		return forniture;
	}



	public void setForniture(ArrayList<Fornitura> forniture) {
		this.forniture = forniture;
	}



	public boolean equals(UnitaAbitativa unitaAbitativa) {
		if(!unitaAbitativa.getVia().equals(this.via)) return false;
		if(!unitaAbitativa.getNumeroInterno().equals(this.numeroInterno)) return false;
		if(!unitaAbitativa.getNumeroCivico().equals(this.numeroCivico)) return false;
		if(!unitaAbitativa.getCitta().equals(this.citta)) return false;
		if(!unitaAbitativa.getCodiceAvviamentoPostale().equals(this.codiceAvviamentoPostale)) return false;
		return true;
		
	}
	


	@Override
	public String toString() {
		return "UnitaAbitativa [via=" + via + ", citta=" + citta + ", numeroCivico=" + numeroCivico
				+ ", codiceAvviamentoPostale=" + codiceAvviamentoPostale + ", numeroInterno=" + numeroInterno + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
