package fr.tib.kiloutou;

public class Voiture1 extends Vehicule {

	private String marque;
	private String modele;
	private int numSerie;

	public Voiture1(String marque, String modele, int numSerie) {
		this.marque = marque;
		this.modele = modele;
		this.numSerie = numSerie;
	}

	public void Affichage() {
		System.out.println("Marque : " + marque + " Modele : " + modele + " Numero serie " + numSerie);
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

	public int getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}

}
