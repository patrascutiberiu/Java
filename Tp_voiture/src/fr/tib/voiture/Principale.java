package fr.tib.voiture;

public class Principale {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Voiture laguna = new Voiture("Renault", "Laguna", 30.0f);
		System.out.println(laguna);
		laguna.demarrer();
		laguna.rouler(25);
		laguna.arreter();
		laguna.faireLePlein(20);
		laguna.rouler(4);
		
		
		

		
	}
}
