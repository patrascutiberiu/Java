package fr.tib.voiture;

public class Scooter extends VehiculeAMoteur {

	public Scooter(String marque, String modele,float carb) {
		super(marque, modele,carb);
		
	}
	public void rouler(float consommation) throws Exception{
		if( ! getMoteur().isDemarre()) {
			getMoteur().demarrer();
		}	
	}

	
	public boolean demarrer() {
		
		return false;
	}

	
	public void arreter() {
		
		
	}

	
	public void faireLePlein(float litreCarb) {
		
		
	}


}

