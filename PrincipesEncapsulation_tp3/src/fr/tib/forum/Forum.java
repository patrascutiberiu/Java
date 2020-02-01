package fr.tib.forum;

import fr.tib.types.CategorieUtilisateur;
import fr.tib.utilisateur.Utilisateur;

import static fr.tib.outils.Outils.afficher;

import java.util.ArrayList;
import java.util.List;

import fr.tib.message.Message;
import fr.tib.msgUt.MessageUtilisateur;

public class Forum {
	List<MessageUtilisateur> ListUtil = new ArrayList();
	int compteur;

	public Forum(List<MessageUtilisateur> listMessages) {
		ListUtil = listMessages;
		compteur = listMessages.size();
	}

	public boolean ajouterUtilisateurMessages(Utilisateur _utilisateur, Message _message) {

		try {
			MessageUtilisateur newMessage = new MessageUtilisateur(_utilisateur, _message);
			ListUtil.add(newMessage);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public void getListeMessagesAuteur() {
		for (MessageUtilisateur m : ListUtil) {
			System.out.println(m.getMessage() + " " + m.getUtilisateur());
		}
	}

	public static void main(String[] args) {

		Utilisateur jean = new Utilisateur("Jean", "Dupont", CategorieUtilisateur.STANDARD);
		Utilisateur bernard = new Utilisateur("Bernard", "Morin", CategorieUtilisateur.STANDARD);
		Utilisateur nathalie = new Utilisateur("Nathalie", "Morin", CategorieUtilisateur.MODERATEUR);

		//afficher(jean);
		//afficher(bernard);
		//afficher(nathalie);

		Message msg1 = new Message("Java SE", "L'encapsulation est une propriété fondamentale");
		Message msg2 = new Message("Java SE", "L'heritage en est une autre");
		Message msg3 = new Message("Java SE", "Le polymorphisme est implicit en Java");
		Message msg4 = new Message("Java SE", "Les annotation sont pratiques en Java");
		Message msg5 = new Message("Java SE", "Aplication n-tiers");
		Message msg6 = new Message("Java SE", "Couche Web : Servlet et JSP");
		Message msg7 = new Message("Java SE", "JSF : Framework - Couche Présentation");
		Message msg8 = new Message("Java SE", "JPA - Hibernate");
		Message msg9 = new Message("Java SE", "JDBC");
		
		List<MessageUtilisateur> messages =  new ArrayList();
		MessageUtilisateur m1 = new MessageUtilisateur(jean, msg1);
		MessageUtilisateur m2 = new MessageUtilisateur(nathalie, msg3);
		MessageUtilisateur m3 = new MessageUtilisateur(jean, msg4);
		MessageUtilisateur m4 = new MessageUtilisateur(bernard, msg2);
		MessageUtilisateur m5 = new MessageUtilisateur(jean, msg5);
		messages.add(m1);
		messages.add(m2);
		messages.add(m3);
		messages.add(m4);
		messages.add(m5);
		
		Forum forum = new Forum(messages);
		forum.getListeMessagesAuteur();
		
		

		//afficher("Message 1", msg1);

		// int NBR_MESSAGES = 0;
		/// int compteur = 0;

		// int MessageUtilisateur[] = new int[NBR_MESSAGES];

	}

}
