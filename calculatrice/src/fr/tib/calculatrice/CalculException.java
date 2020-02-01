package fr.tib.calculatrice;

public class CalculException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public CalculException () {
		System.out.println("Divizion par zéro imposible ! ");
	}
	public CalculException (String message) {
		super(message);
	}

}
