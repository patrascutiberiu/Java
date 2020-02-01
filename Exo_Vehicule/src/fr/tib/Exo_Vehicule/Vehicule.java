package fr.tib.Exo_Vehicule;

public abstract class Vehicule extends Inventoriable{

	protected String marque;
	protected String nom;
	protected String identifiant;
	public Vehicule(String marque, String nom, String identifiant) {
		this.marque = marque;
		this.nom = nom;
		this.identifiant = identifiant;
	}
	@Override
	public String toString() {
		return "Vehicule [marque=" + marque + ", nom=" + nom + ", identifiant=" + identifiant + "]";
	}
	public abstract void planifierRevision();
	
	public abstract String getIdentifiant();
	
	public abstract String getInfosCompletes();
}
