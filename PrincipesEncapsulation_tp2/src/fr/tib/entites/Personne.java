package fr.tib.entites;

import fr.tib.application.Adresse;

public class Personne {

	private String prenom;
	private String nom;
	private int age;
	private Adresse adresse;

	@Override
	public String toString() {
		return prenom + " " + nom + " " + age + " " + " ans, habite au " + adresse;
	}

	public Personne(String prenom, String nom, int age, Adresse adresse) {
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.adresse = adresse;
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
}
