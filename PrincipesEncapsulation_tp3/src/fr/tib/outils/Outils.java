package fr.tib.outils;

import javax.swing.JOptionPane;

import fr.tib.message.Message;
import fr.tib.utilisateur.Utilisateur;

public class Outils {

	public static void afficher(Utilisateur _ut) {
		JOptionPane.showMessageDialog(null, _ut.toString(), _ut.getPrenom(), JOptionPane.INFORMATION_MESSAGE);
	}

	public static void afficher(String _str, Message _msg) {
		JOptionPane.showMessageDialog(null, _msg.toString(), _str,
				JOptionPane.INFORMATION_MESSAGE);
	}
}
