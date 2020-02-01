package fr.tib.voiture;

public abstract class Vehicule {

	private String marque;
	private String modele;
	private float carb;

	public abstract boolean demarrer();

	public abstract void arreter();

	public abstract void faireLePlein(float litreCarb);

	public Vehicule(String marque, String modele, float carb) {
		this.marque = marque;
		this.modele = modele;
		this.carb = carb;
	}

	public Vehicule(String marque, String modele) {
		this.marque = marque;
		this.modele = modele;
	}

	public String toString() {

		return "Je suis le vehicule " + this.getMarque() + " " + this.getModele();
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public float getCarb() {
		return carb;
	}

	public void setCarb(float carb) {
		this.carb = carb;
	}
}
