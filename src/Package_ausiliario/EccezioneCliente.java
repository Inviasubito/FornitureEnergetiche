package Package_ausiliario;


public class EccezioneCliente extends Exception{
	private String message;
	
	public EccezioneCliente(String message) {
		// TODO Auto-generated constructor stub
		this.message = message;
	}
	
	public String toString() {return message;}

}
