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
	
	
	public Cliente(String nome, String cognome, String codiceFiscale) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
	}
	//Interaction with DAO
	public Cliente(int codiceCliente) {
		DBCliente cliente = new DBCliente(codiceCliente);
		this.nome = cliente.getNome();
		this.cognome = cliente.getCognome();
		this.codiceFiscale = cliente.getCodiceFiscale();
		this.codiceCliente = cliente.getCodiceCliente();
	}
	
	public Cliente(String codiceFiscale) throws EccezioneCliente {
		DBCliente cliente = new DBCliente(codiceFiscale);
		this.nome = cliente.getNome();
		this.cognome = cliente.getCognome();
		this.codiceFiscale = cliente.getCodiceFiscale();
		this.codiceCliente = cliente.getCodiceCliente();
		
	}
	
	private void caricaUnitaAbitative() {
		
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

		Cliente cliente1 = new Cliente(1);
		System.out.println(cliente1);
		
		Cliente cliente2 = null;
		try {
			cliente2 = new Cliente("GRNSFN01B23F831Z");
		} catch (EccezioneCliente e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cliente2);
		
		
		Cliente cliente3 = null;
		try {
			cliente3 = new Cliente("GRNSFN01B23F831P");
		} catch (EccezioneCliente e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cliente3);
		


	}
	
	

}
