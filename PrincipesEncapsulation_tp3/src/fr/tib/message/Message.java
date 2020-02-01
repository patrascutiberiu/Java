package fr.tib.message;

//import java.sql.Date;
import java.util.Date;
import java.text.DateFormat;

import fr.tib.forum.Forum;
import fr.tib.msgUt.MessageUtilisateur;
import fr.tib.utilisateur.Utilisateur;

public class Message {

	private String titre;
	private String texte;
	private Date dateCreation;
	//private Utilisateur utilisateur;

	//public static final Forum forum = new Forum();



	public Message(String titre, String texte) {

		this.titre = titre;
		this.texte = texte;
		this.dateCreation = new Date();

		//quelque chose
		//ajouterUtilisateurMessages(utilisateur);
		
	}
	
	

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}

	public String getDateCreation() {
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
		return df.format(dateCreation);
	}

	@Override
	public String toString() {
		return titre + " -- " + texte + "\nDate de création : " + getDateCreation();
	}

}
