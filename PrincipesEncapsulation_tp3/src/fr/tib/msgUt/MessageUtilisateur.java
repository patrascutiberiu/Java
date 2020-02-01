package fr.tib.msgUt;

import fr.tib.message.Message;
import fr.tib.utilisateur.Utilisateur;

public class MessageUtilisateur {

	private Utilisateur utilisateur;
	private Message message;

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public MessageUtilisateur(Utilisateur utilisateur, Message message) {
		this.utilisateur = utilisateur;
		this.message = message;
	}

}
