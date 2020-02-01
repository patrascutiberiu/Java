package fr.tib.login;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import fr.tib.login.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean test = false;

		ArrayList<Utilisateur> mesUsers = new ArrayList<Utilisateur>();

		mesUsers.add(new Utilisateur("Delon", "Adelon", "leclandessiciliens", 3, "adelon@gmail.com", "emp"));
		mesUsers.add(new Utilisateur("Belmondo", "Bbel", "leprofessionnel", 2, "belmondo@gmail.com", "cadre"));
		mesUsers.add(new Utilisateur("demo", "User", "user", 3, "", "emp"));
		mesUsers.add(new Utilisateur("Patrascu", "Gabriel", "sourisdent", 1, "patrascu@gmail.com", "cadre"));
		mesUsers.add(new Utilisateur("Charvet", "Johnny", "taulier", 2, "cjohnny@gmail.com", "cadre"));

		String login = JOptionPane.showInputDialog(null, "Veuillez saisir votre login svp : ", "Login",
				JOptionPane.INFORMATION_MESSAGE);
		String motDePasse = JOptionPane.showInputDialog(null,
				"Veuillez saisir votre mot de passe ( " + login + " ) svp : ", "Login",
				JOptionPane.INFORMATION_MESSAGE);

		for (int i = 0; i < mesUsers.size(); i++) {

			if (mesUsers.get(i).getLogin().equals(login) && (mesUsers.get(i).getMotDePasse().equals(motDePasse))) {
				test = true;
			}
		}

		if (!test) {
			JOptionPane.showMessageDialog(null,
					"Vous n'êtes pas autorisé à vous connecter !" + "\n Contactez votre administrateur système. ",
					"Login", JOptionPane.WARNING_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Bravo : ( " + login + " ) tu est bien connecter sur ton espace !",
					"Login", JOptionPane.INFORMATION_MESSAGE);
		}

	}

}
