package Entity;

public class Contatore {

	private int lettura1;
	private int lettura2;
	
	public Contatore(int lettura1, int lettura2) {
		super();
		this.lettura1 = lettura1;
		this.lettura2 = lettura2;
	}
	
	public Contatore() {
		this.lettura1=0;
		this.lettura2=0;
	}
	
	public int getLettura1() {
		return lettura1;
	}
	public void setLettura1(int lettura1) {
		this.lettura1 = lettura1;
	}
	public int getLettura2() {
		return lettura2;
	}
	public void setLettura2(int lettura2) {
		this.lettura2 = lettura2;
	}
	
	
}
