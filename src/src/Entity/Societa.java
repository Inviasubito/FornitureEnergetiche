package Entity;

public class Societa {
	private static Societa societa;
	
	private Societa() {
		
	}
	
	public Societa getSocieta() {
		if (societa == null) {
			societa = new Societa();
		}
		return societa;
	}
	
	public boolean creareFornitura() {
		
		
		
		return true;
	}
}
