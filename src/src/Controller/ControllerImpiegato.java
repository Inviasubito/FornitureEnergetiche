package Controller;

public class ControllerImpiegato {

	private static ControllerImpiegato controllerImpiegato;
	
	private ControllerImpiegato() { }
	
	public static ControllerImpiegato getControllerImpiegato() {
		if (controllerImpiegato == null) {
			controllerImpiegato = new ControllerImpiegato();
		}
		return controllerImpiegato;
	}
	
	public boolean creareFornitura() {
		return false; } // qua devo mettere per forza sta cosa 
						// altrimenti mi caga il cazzo con gli errori
		
}