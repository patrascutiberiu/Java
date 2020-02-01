package fr.tib.voiture;

import fr.tib.exceptions.PanneEssenceException;

public class Voiture extends VehiculeAMoteur{

	public Voiture(String marque, String modele,float carb) {
		super(marque, modele, carb);
		getMoteur().setVolume_total(carb);
		getMoteur().setVolume_reservoir(carb);
		getMoteur().setDemarre(false);
	}

	
	public boolean demarrer() {
		if (getCarb() == 0) {
			System.out.println("Il n'y a plus de l'essance");
			return false;
		}
		System.out.println("Il reste "+getCarb()+" litres dans le réservoir ");
		System.out.println("je viens de consommer 1/10 litre pour démarrer .");
		return true;
	}

	
	public void arreter() {	
		getMoteur().arreter();
	}

	
	public void faireLePlein(float litreCarb) {
		System.out.println("Plein effectué avec " + litreCarb + " litres");
		float volActuel=moteur.getVolume_reservoir()+litreCarb;
		System.out.println("Le volume actuel est de :"+volActuel+ " litres");
	}
	
	public void rouler(float consommation) throws PanneEssenceException{
		float carburant = moteur.utiliser(consommation);
		if( ! getMoteur().isDemarre()) {
			getMoteur().demarrer();		
		}	
		else if(carburant==0) {
			getMoteur().arreter();
			System.out.println("Je suis en panne !\nJ'ai besoin de l'essence ! ");
		}
	}
}