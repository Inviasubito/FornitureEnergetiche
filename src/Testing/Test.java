package Testing;

import java.util.ArrayList;

public class Test {
	private String nome;
	private String cognome;
	private String codiceFiscale;
	private String via;
	private String numeroInterno;
	private String numeroCivico;
	private String codiceAvviamentoPostale;
	private String citta;
	private int tipoFornitura;
	
	
	
	

	public Test(String nome, String cognome, String codiceFiscale, String via, String numeroInterno,
			String numeroCivico, String codiceAvviamentoPostale, String citta, int tipoFornitura) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
		this.via = via;
		this.numeroInterno = numeroInterno;
		this.numeroCivico = numeroCivico;
		this.codiceAvviamentoPostale = codiceAvviamentoPostale;
		this.citta = citta;
		this.tipoFornitura = tipoFornitura;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Test> test_suits = new ArrayList<Test>();
		test_suits.add(new Test("Ciro", "Esposito","SPSCRI00E30F839P","Via Claudio","3B","23A","80124","Napoli",1 ));
		test_suits.add(new Test("Ciro", "Esposito","SPSCRI00E30F839P","Via Claudio","3B","23A","80124","Napoli",2 ));
		test_suits.add(new Test("Ciro", "Esposito","SPSCRI00E30F839P","Via Claudio","3B","23A","80124","Napoli",3 ));
		test_suits.add(new Test("Ciro", "Esposito","SPSCRI00E30F839P","","3B","23A","80124","Napoli",1 ));
		test_suits.add(new Test("Ciro", "Esposito","SPSCRI00E30F839P","Vi@ Claudio","3B","23A","80124","Napoli",1 ));
		test_suits.add(new Test("Ciro", "Esposito","SPSCRI00E30F839P","Via Claudio","3B","","80124","Napoli",1 ));
		test_suits.add(new Test("Ciro", "Esposito","SPSCRI00E30F839P","Via Claudio","3B","23@","80124","Napoli",1 ));
		test_suits.add(new Test("Ciro", "Esposito","SPSCRI00E30F839P","Via Claudio","3#","23A","80124","Napoli",1 ));
		test_suits.add(new Test("Ciro", "Esposito","SPSCRI00E30F839P","Via Claudio","3B","23A","80124","",1 ));
		test_suits.add(new Test("Ciro", "Esposito","SPSCRI00E30F839P","Via Claudio","3B","23A","80124","N@poli",1 ));
		test_suits.add(new Test("Ciro", "Esposito","SPSCRI00E30F839P","Via Claudio","3B","23A","80124","Napol1",1 ));
		test_suits.add(new Test("", "Esposito","SPSCRI00E30F839P","Via Claudio","3B","23A","80124","Napoli",1 ));
		test_suits.add(new Test("Cir*", "Esposito","SPSCRI00E30F839P","Via Claudio","3B","23A","80124","Napoli",1 ));
		test_suits.add(new Test("Ciro10", "Esposito","SPSCRI00E30F839P","Via Claudio","3B","23A","80124","Napoli",1 ));
		test_suits.add(new Test("Ciro", "","SPSCRI00E30F839P","Via Claudio","3B","23A","80124","Napoli",1 ));
		test_suits.add(new Test("Ciro", "Esposit*","SPSCRI00E30F839P","Via Claudio","3B","23A","80124","Napoli",1 ));
		test_suits.add(new Test("Ciro", "Esposito10","SPSCRI00E30F839P","Via Claudio","3B","23A","80124","Napoli",1 ));
		test_suits.add(new Test("Ciro", "Esposito","SPSCRI00E30F839","Via Claudio","3B","23A","80124","Napoli",1 ));
		test_suits.add(new Test("Ciro", "Esposito","SPSCRI00E30F839PP","Via Claudio","3B","23A","80124","Napoli",1 ));
		test_suits.add(new Test("Ciro", "Esposito","SPSCRI00E30F839#","Via Claudio","3B","23A","80124","Napoli",1 ));
		test_suits.add(new Test("Ciro", "Esposito","SPSCRI00E30F839P","Via Claudio","3B","23A","80124","Napoli",0 ));
	}

}
