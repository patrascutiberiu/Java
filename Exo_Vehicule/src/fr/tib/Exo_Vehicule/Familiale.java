package fr.tib.Exo_Vehicule;

public class Familiale extends Vehicule {

	private int nombrePersonne;

	public Familiale(String marque, String nom, String identifiant, int nombrePersonne) {
		super(marque, nom, identifiant);
		this.nombrePersonne = nombrePersonne;
	}

	@Override
	public String toString() {
		return "Familiale [nombrePersonne=" + nombrePersonne + "]";
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
