package Entity;

import Package_ausiliario.Ruolo;

public class Credenziali {

	private String username;
	private String password;
	private Ruolo ruolo;
	private Cliente cliente;
	
	public Credenziali(String username, String password, Ruolo ruolo, Cliente cliente) {
		super();
		this.username = username;
		this.password = password;
		this.ruolo = ruolo;
		this.cliente = cliente;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Ruolo getRuolo() {
		return ruolo;
	}
	public void setRuolo(Ruolo ruolo) {
		this.ruolo = ruolo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
