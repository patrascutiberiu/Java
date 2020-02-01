package fr.tib.voiture;

public abstract class VehiculeAMoteur extends Vehicule {

	Moteur moteur = new Moteur();
	
	public VehiculeAMoteur(String marque, String modele,float carb) {
		super(marque, modele, carb);
	}
	
	public Moteur getMoteur() {
		return moteur;
	}
	
	public boolean demarrer() {
		return moteur.demarrer();
	}
	public void arreter() {
		moteur.arreter();
	}
	
	public void faireLePlein(float litreCarb) {
		
		this.arreter();
		moteur.faireLePlain(litreCarb);
		moteur.setDemarre(true);		
	}	
}
