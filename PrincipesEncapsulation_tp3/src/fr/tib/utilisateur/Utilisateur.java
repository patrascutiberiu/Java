package fr.tib.utilisateur;

import fr.tib.types.CategorieUtilisateur;

public class Utilisateur {

	private String prenom;
	private String nom;
	private CategorieUtilisateur statut;

	public Utilisateur(String prenom, String nom, CategorieUtilisateur statut) {

		this.prenom = prenom;
		this.nom = nom;
		this.statut = statut;

	}

	@Override
	public String toString() {
		return "Utilisateur : " + prenom + " " + nom + ", " + statut;
	}

	// public static final Forum forum = new Forum();

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public CategorieUtilisateur getStatut() {
		return statut;
	}

	public void setStatut(CategorieUtilisateur statut) {
		this.statut = statut;
	}

}
