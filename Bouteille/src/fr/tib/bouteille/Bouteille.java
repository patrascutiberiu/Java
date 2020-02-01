package fr.tib.bouteille;

import fr.tib.bouteille.ExceptionsBouteille;

public class Bouteille {

	private float volumeMax;
	private float volumeActuel;
	private boolean etatBouchon;

	public Bouteille() {
		this.volumeMax = 100;
		this.volumeActuel = 100;
		this.etatBouchon = false;
	}

	public Bouteille(float capaciteMax, float capaciteActuelle, boolean etatBouchon) {
		this.volumeMax = capaciteMax;
		this.volumeActuel = capaciteActuelle;
		this.etatBouchon = etatBouchon;
	}

	public Bouteille(Bouteille bouteilleACopie) {
		this(bouteilleACopie.volumeMax, bouteilleACopie.volumeActuel, bouteilleACopie.etatBouchon);

	};

	public float getVolumeMax() {
		return volumeMax;
	}

//	public void setVolumeMax(float capaciteMax) {
//		this.volumeMax = capaciteMax;
//	}

	public float getVolumeActuel() {
		return volumeActuel;
	}

//	public void setVolumeActuel(float capaciteActuelle) {
//		this.volumeActuel = capaciteActuelle;
//	}

	public boolean isEtatBouchon() {
		return etatBouchon;
	}

//	public void setEtatBouchon(boolean etatBouchon) {
//
//		this.etatBouchon = etatBouchon;
//	}

	public void ouvrir() {
		etatBouchon = true;
	}

	public void fermer() {
		etatBouchon = false;
	}

	public void remplir() throws ExceptionsBouteille {
		throw new ExceptionsBouteille("On ne peut pas remplir la bouteille au-dessous de la capacité maximale !");
	};

	public boolean remplir(float capaciteRemplir) throws ExceptionsBouteille {
		if (!etatBouchon) {
			throw new ExceptionsBouteille("La bouteille ne peut pas être remplie car elle est fermée !");
		} else if (volumeActuel + capaciteRemplir >= volumeMax) {
			throw new ExceptionsBouteille("On ne peut pas remplir la bouteille au-dessous de la capacité maximale !");
		} else {
			if ((volumeActuel + capaciteRemplir <= volumeMax) && etatBouchon) {
				volumeActuel = volumeActuel + capaciteRemplir;
				return true;
			}
		}
		return false;
	};

	public void vider() throws ExceptionsBouteille {
		vider(volumeActuel = 0);
	};

	public boolean vider(float capaciteVider) throws ExceptionsBouteille {
		if (!etatBouchon) {
			throw new ExceptionsBouteille("La bouteille ne peut pas être vidée car elle est fermée !");
		} else if (volumeActuel - capaciteVider < 0) {
			volumeActuel = volumeMax;
			throw new ExceptionsBouteille("On ne peut pas vider la bouteille en-dessous de la capacité minimale !");
		} else {
			if ((volumeActuel - capaciteVider >= 0)) {
				volumeActuel = volumeActuel - capaciteVider;
				return true;
			}
		}
		return false;
	};

//	public void remplir(float capaciteRemplir) {
//		if (!etatBouchon) {
//			System.out.println("Le buchon est fermé ");
//		} else {
//			if (volumeActuel + capaciteRemplir >= volumeMax) {
//				System.out.println("Le volume que vous voulez rajouter est supérieur à la capacité de la bouteille !");
//				System.out.println("Le volume actuel est égale avec le volume maximum !");
//				volumeActuel = volumeMax;
//			} else {
//				if (volumeActuel + capaciteRemplir <= 0) {
//					System.out.println("La bouteille est vide");
//					volumeActuel = 0;
//				} else {
//					volumeActuel = volumeActuel + capaciteRemplir;
//				}
//			}
//		}
//
//	};
//
//	public void vider() {
//		vider(volumeActuel = 0);
//	};
//
//	public void vider(float capaciteVider) {
//		if (!etatBouchon) {
//			System.out.println("Le buchon est fermé ");
//		} else {
//			if (volumeActuel - capaciteVider <= 0) {
//				System.out.println("La bouteille est vide");
//				volumeActuel = 0;
//			} else {
//				volumeActuel = volumeActuel - capaciteVider;
//			}
//		}
//	};

}
