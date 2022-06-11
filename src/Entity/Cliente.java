package Entity;


import java.util.ArrayList;

import DAO.DBCliente;
import Package_ausiliario.EccezioneCliente;

public class Cliente {
	
	private String nome;
	private String cognome;
	private String codiceFiscale;
	private int codiceCliente;
	ArrayList<UnitaAbitativa> unitaAbitative;
	
	public Cliente() {
		DBCliente cliente = new DBCliente();
		this.nome = "";
		this.cognome = "";
		this.codiceFiscale = "";
		this.codiceCliente = 0;
		this.unitaAbitative = new ArrayList<UnitaAbitativa>();
	}
	
	public Cliente(String nome, String cognome, String codiceFiscale) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
		this.unitaAbitative = new ArrayList<UnitaAbitativa>();
	}
	//Interaction with DAO
	public Cliente(int codiceCliente) {
		DBCliente cliente = new DBCliente(codiceCliente);
		this.nome = cliente.getNome();
		this.cognome = cliente.getCognome();
		this.codiceFiscale = cliente.getCodiceFiscale();
		this.codiceCliente = cliente.getCodiceCliente();
		this.unitaAbitative = new ArrayList<UnitaAbitativa>();
	}
	
	public Cliente(String codiceFiscale) throws EccezioneCliente {
		DBCliente cliente = new DBCliente(codiceFiscale);
		this.nome = cliente.getNome();
		this.cognome = cliente.getCognome();
		this.codiceFiscale = cliente.getCodiceFiscale();
		this.codiceCliente = cliente.getCodiceCliente();
		this.unitaAbitative = new ArrayList<UnitaAbitativa>();
	}
	
	public void caricaUnitaAbitative() {
		
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	public void setCodiceCliente(int codiceCliente) {
		this.codiceCliente = codiceCliente;
	}
	public void setUnitaAbitative(ArrayList<UnitaAbitativa> unitaAbitative) {
		this.unitaAbitative = unitaAbitative;
	}
	public String getNome() {
		return nome;
	}
	public String getCognome() {
		return cognome;
	}
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public int getCodiceCliente() {
		return codiceCliente;
	}
	public ArrayList<UnitaAbitativa> getUnitaAbitative() {
		return unitaAbitative;
	}
	
	public void associaUnitaAbitative(UnitaAbitativa unitaAbitativa) {
			unitaAbitative.add(unitaAbitativa);
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", codice fiscale=" + codiceFiscale + ", codice cliente=" + codiceCliente
				+ "]";
	}
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub

		Cliente cliente1 = new Cliente((int)1);
		System.out.println(cliente1);
		
		Cliente cliente2 = new Cliente(2);
		if(cliente2.getCodiceCliente() != 0)	System.out.println(cliente2);
		else	System.out.println("Il cliente non esiste");
		
		Cliente cliente3 = new Cliente("GRNSFN01B23F93VZ");
		System.out.println(cliente3);
		
		Cliente cliente4 = new Cliente("GRNSFN01B23F93VA");
		
		if(cliente4.getCodiceFiscale() != null)	System.out.println(cliente4);
		else	System.out.println("Il cliente non esiste" + cliente4);

	}
	
	

}
