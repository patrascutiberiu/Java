package fr.tib.Exo_Vehicule;

public class Citadine extends Vehicule{

	private int autonomie;

	public Citadine(String marque, String nom, String identifiant, int autonomie) {
		// Sollicitation du constructeur de la classe abstraite 
		// Vehicule dont le r�le se limite � valoriser les v.i.
		super(marque, nom, identifiant);
		this.autonomie = autonomie;
	}

	@Override
	public String toString() {
		return super.toString()+"-"+"- Mon autonomie est de "+ autonomie+" kms";
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
