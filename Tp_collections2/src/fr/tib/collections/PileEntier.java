package fr.tib.collections;

public class PileEntier {

	private int[] pile;
	private int index_sommmet = 0;
	private int taille_pille;

	public PileEntier(int taille_pille) {
		pile = new int[taille_pille];
		this.setTaille_pille(taille_pille);
	}

	public void empiler(int nouveauM) {
		if (index_sommmet < taille_pille) {
			pile[index_sommmet++] = nouveauM;
		}
	}

	public int depiler() {
		if (index_sommmet != 0) {
			return pile[--index_sommmet];
		} else {
			return 0;
		}
	}

	public void reinitialiser() {
		index_sommmet = 0;
	}

	public boolean pileVide() {
		return (index_sommmet == 0);
	}

	public boolean pilePleine() {
		return (index_sommmet == taille_pille);
	}

	public int getTaille_pille() {
		return taille_pille;
	}

	public void setTaille_pille(int taille_pille) {
		this.taille_pille = taille_pille;
	}
}
