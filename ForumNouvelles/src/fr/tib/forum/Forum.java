package fr.tib.forum;

import java.sql.Date;
import java.util.Arrays;

public class Forum {

	private Date dateCreation;
	private String nom;

	Arrays Nouvelle;
	Arrays Abonne;

	public Forum(String nom) {
		this.nom = nom;
	}

	public Forum() {
		
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public boolean ajouterNouvelle(Nouvelle n) {
		return true;
	}

	public void consulterNouvelle(int i) {

	}

	public void repondreNouvelle(int i) {

	}

	public boolean supprimerNouvelle(Nouvelle n) {
		return true;
	}

	public void bannirUnAbonne(Abonne a) {

	}

	public int ajouterAbonne(Abonne a) {
		return 0;
	}

	public void listerAbonnes() {

	}
}
