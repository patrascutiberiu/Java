package com.tib.entites;

public class Personne {

	private String nom;
	private String societe;

	public Personne(String nom, String societe) {
		super();
		this.nom = nom;
		this.societe = societe;
		//societe = validerSociete(entrepriseValidate).toUpperCase();
	}

	private String validerSociete(String entrepriseValidate) {
		if (entrepriseValidate.length() <= 30 && entrepriseValidate == "?") {
			System.out.println("bla bla bla" + entrepriseValidate);
		}
		return entrepriseValidate;
	}

	public Personne(String nom) {
		super();
		this.nom = nom;
		this.societe = "je ne suis pas employé d'une entreprise";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSociete() {
		return societe;
	}

	public void setSociete(String societe) {
		this.societe = societe;
	}

	private static final String PAS_DE_SOCIETE = "?";

	public void quitteSociete() {
		if (societe == PAS_DE_SOCIETE) {
			afficher();
			System.out.println("Je ne suis pas salarié : impossible de quitter la société");
			System.exit(1);
		}
		societe = PAS_DE_SOCIETE;
	}

	public void afficher() {
		System.out.println("Je m'appelle : " + nom + " je travaille chez : " + societe);
	}

}
