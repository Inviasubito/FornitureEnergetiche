package Entity;

public class UnitaAbitativa {
	private String via;
	private String numeroCivico;
	private String numeroInterno;
	private String citta;
	private String codiceAvviamentoPostale;
	private Cliente proprietario;
	
	public UnitaAbitativa(String via, String numeroCivico, String numeroInterno , String citta , String codiceAvviamentoPostale) {
		super();
		this.via = via;
		this.citta = citta;
		this.numeroCivico = numeroCivico;
		this.codiceAvviamentoPostale = codiceAvviamentoPostale;
		this.numeroInterno = numeroInterno;
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
	
	public Cliente getProprietario() {
		return this.proprietario;
	}



	public boolean equals(UnitaAbitativa unitaAbitativa) {
		if(!unitaAbitativa.getVia().equals(this.via)) return false;
		if(!unitaAbitativa.getNumeroInterno().equals(this.numeroInterno)) return false;
		if(!unitaAbitativa.getNumeroCivico().equals(this.numeroCivico)) return false;
		if(!unitaAbitativa.getCitta().equals(this.citta)) return false;
		if(!unitaAbitativa.getCodiceAvviamentoPostale().equals(this.codiceAvviamentoPostale)) return false;
		return true;
		
	}
	

	public void associaCliente(Cliente cliente) {
		this.proprietario = cliente;
	
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
