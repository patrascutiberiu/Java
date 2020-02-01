package fr.tib.Exo_Vehicule;

public class Utilitare extends Vehicule {

	private int poidsTotale;

	public Utilitare(String marque, String nom, String identifiant, int poidsTotale) {
		super(marque, nom, identifiant);
		this.poidsTotale = poidsTotale;
	}

	@Override
	public String toString() {
		return "Utilitare [poidsTotale=" + poidsTotale + "]";
	}

	public void planifierRevision() {
		// D�finition obligatoire de la m�thode abstraite
		System.out.println("Planifier r�vision pour Citadine");
	}

	@Override
	public String getIdentifiant() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getInfosCompletes() {
		// TODO Auto-generated method stub
		return null;
	}
}
