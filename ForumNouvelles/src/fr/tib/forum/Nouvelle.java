package fr.tib.forum;

import java.sql.Date;

public class Nouvelle {

	private String sujet;
	private String texte;
	private Date dateCreation;
	
	public Nouvelle(String sujet, String texte) {
		this.sujet = sujet;
		this.texte = texte;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public String getTexte() {
		return texte;
	}
	public void setTexte(String texte) {
		this.texte = texte;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	
	
	
}
