package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Entity.UnitaAbitativa;
import Package_ausiliario.EccezioneCliente;



public class DBCliente {
	private int codiceCliente;
	private String nome;
	private String cognome;
	private String codiceFiscale;
	
	
	ArrayList<DBUnitaAbitativa> unitaAbitative;
	
	///costruttori
	public DBCliente() {
		super();
		this.unitaAbitative = new ArrayList<DBUnitaAbitativa>();
	}
	//costruttore con ricerca mediante codiceCliente
	public DBCliente(int codiceCliente) {
		
		this.codiceCliente = codiceCliente;
		this.unitaAbitative = new ArrayList<DBUnitaAbitativa>();

		caricaDaDBwithCodiceCliente();
		caricaUnitaAbitativeDaDB();
	}
	//costruttore con ricerca mediante CF
	public DBCliente(String codiceFiscale) throws EccezioneCliente {
		
		this.codiceFiscale = codiceFiscale;
		this.unitaAbitative = new ArrayList<DBUnitaAbitativa>();

		caricaDaDBwithCodiceFiscale();
		caricaUnitaAbitativeDaDB();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	public int getCodiceCliente() {
		return codiceCliente;
	}
	public void setCodiceCliente(int codiceCliente) {
		this.codiceCliente = codiceCliente;
	}
	public ArrayList<DBUnitaAbitativa> getUnitaAbitative() {
		return unitaAbitative;
	}
	public void setUnitaAbitative(ArrayList<DBUnitaAbitativa> unitaAbitative) {
		this.unitaAbitative = unitaAbitative;
	}
	
	public void caricaDaDBwithCodiceCliente() {
		String query;
		query = "SELECT * FROM clienti WHERE codiceCliente='"+this.codiceCliente+"';";


			try {
				ResultSet rs = DBConnectionManager.selectQuery(query);
				
				if(rs.next()) { //se ho un risultato
					
					//mi vado a prendere i dati, accedendo tramite il nome dell'attributo-colonna
					this.setNome(rs.getString("nome"));
					this.setCognome(rs.getString("cognome"));
					this.setCodiceFiscale(rs.getString("codiceFiscale"));
					this.setCodiceCliente(rs.getInt("codiceCliente"));
				}else {
					this.codiceCliente = 0;
				}
			
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	public void caricaDaDBwithCodiceFiscale() throws EccezioneCliente {
		String query;
		query = "SELECT * FROM Clienti WHERE codiceFiscale='" + this.codiceFiscale + "';";

			try {				
				ResultSet rs = DBConnectionManager.selectQuery(query);				
				if(rs.next()) { //se ho un risultato
					
					//mi vado a prendere i dati, accedendo tramite il nome dell'attributo-colonna
					this.setNome(rs.getString("nome"));
					this.setCognome(rs.getString("cognome"));
					this.setCodiceFiscale(rs.getString("codiceFiscale"));
					this.setCodiceCliente(rs.getInt("codiceCliente"));
				}else {
					throw new EccezioneCliente("Cliente non presente nel database");
				}
			
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	
	private void caricaUnitaAbitativeDaDB() {
		String query;
		query = "SELECT * FROM Unita_Abitative WHERE Clienti_codiceCliente="+this.codiceCliente + ";";

			try {				
				ResultSet rs = DBConnectionManager.selectQuery(query);				
				while(rs.next()) { //se ho un risultato
					
					DBUnitaAbitativa unitaAbitativa = new DBUnitaAbitativa(rs.getInt("idUnitaAbitativa"),rs.getString("via"), rs.getString("numeroCivico"), rs.getString("numeroInterno"), rs.getString("citta"), rs.getString("codiceAvviamentoPostale"));
					unitaAbitativa.caricaFornitureDaDB();
					unitaAbitative.add(unitaAbitativa);				
				}
			
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
}
