package DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import Package_ausiliario.EccezioneTariffa;
import Package_ausiliario.TipoFornitura;

public class DBTariffa {
	
	private String citta;
	private TipoFornitura tipoFornitura;
	private double tariffa;
		
	public DBTariffa(String citta, TipoFornitura tipoFornitura, double tariffa) {
		super();
		this.citta = citta;
		this.tipoFornitura = tipoFornitura;
		this.tariffa = tariffa;
	}
	
	public DBTariffa(String citta, TipoFornitura tipoFornitura) throws EccezioneTariffa {
		this.citta = citta;
		this.tipoFornitura = tipoFornitura;
		caricaDaDBwithCittaAndTipoFornitura();
		
	}
	
	public void caricaDaDBwithCittaAndTipoFornitura() throws EccezioneTariffa {
		String query = "SELECT * FROM Tariffe WHERE citta='"+this.citta+"' AND tipoFornitura=" + this.tipoFornitura.ordinal() +";";


			try {
				ResultSet rs = DBConnectionManager.selectQuery(query);
				
				if(rs.next()) { //se ho un risultato
					
					//mi vado a prendere i dati, accedendo tramite il nome dell'attributo-colonna
					this.tariffa = rs.getDouble("tariffa");
				}else {
					throw new EccezioneTariffa("Tariffa not found");
				}
			
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		DBTariffa tariffa = null;
	try {
		tariffa = new DBTariffa("NAPOLI" , TipoFornitura.ENERGIA_ELETTRICA);
		System.out.println(tariffa.getTariffa());
	} catch (EccezioneTariffa e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	}
}
