package fr.tib.jeu_du_pendu;

import javax.swing.JOptionPane;

public class Pendu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String motChoisit;
		char saisieJoueur;
		int compteur = 6;
		int compteur2 = 0;
		boolean lettreTrouve = false;

		do {
			motChoisit = JOptionPane.showInputDialog(null,
					"Joueur 1, veuillez choisir un mot d'au moins 5 caractères : ", "Jeu du Pendu",
					JOptionPane.INFORMATION_MESSAGE);
		} while (motChoisit.length() < 5);

		motChoisit = motChoisit.toLowerCase();

		char[] motSecret = motChoisit.toCharArray();
		char[] motTrouve = motChoisit.toCharArray();

		for (int i = 1; i < motChoisit.length() - 1; i++) {
			motSecret[i] = '_';
		}

		do {

			String str="";
			for (int i = 0; i < motSecret.length; i++) {
				str += motSecret[i];
			}
			JOptionPane.showMessageDialog(null, str, "Jeu du Pendu", JOptionPane.INFORMATION_MESSAGE);

			
			String caractereS = JOptionPane.showInputDialog(null, "\nVeuillez saisir une lettre : ", "Jeu du pendu",
					JOptionPane.INFORMATION_MESSAGE);
			saisieJoueur = caractereS.charAt(0);

			for (int i = 0; i < motChoisit.length(); i++) {
				if (saisieJoueur == motChoisit.charAt(i)) {
					motSecret[i] = saisieJoueur;
					lettreTrouve = true;
				}
			}
			if (!lettreTrouve) {
				compteur--;
			}
			compteur2 = 0;
			for (int i = 0; i < motTrouve.length; i++) {
				if (motTrouve[i] == motSecret[i]) {
					compteur2++;
				}
			}

		} while (compteur > 0 && compteur2 < motSecret.length);
		if (compteur2 == motSecret.length) {
			JOptionPane.showMessageDialog(null, "Vous avez trouvé le mot secret : " + motChoisit, "Jeu du Pendu",
					JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Vous avez perdu !", "Jeu du Pendu", JOptionPane.INFORMATION_MESSAGE);
		}

	}

}
