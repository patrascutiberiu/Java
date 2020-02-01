package fr.tib.kiloutou;

import java.time.LocalDate;

public class Vehicule {

	private String marque;
	private String modele;
	private int numSerie;
	private LocalDate miseEnCirculation;

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

	public LocalDate getMiseEnCirculation() {
		return miseEnCirculation;
	}

	public void setMiseEnCirculation(LocalDate miseEnCirculation) {
		this.miseEnCirculation = miseEnCirculation;
	}
}
