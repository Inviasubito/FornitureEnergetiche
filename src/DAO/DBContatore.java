package DAO;

public class DBContatore {
	private int lettura1;
	private int lettura2;
	
	//costruttore 
	public DBContatore() {
		super();
		this.lettura1 = 0;
		this.lettura2 = 0;
	}
	
	//set and get lettura1
	public int getLettura1() {
		return lettura1;
	}

	public void setLettura1(int lettura1) {
		this.lettura1 = lettura1;
	}
	
	//set and get lettura2
	public int getLettura2() {
		return lettura2;
	}

	public void setLettura2(int lettura2) {
		this.lettura2 = lettura2;
	}
		

}
