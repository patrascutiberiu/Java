package fr.tib.tableau_exo2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Tableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan;

		String phrase = null;
		int compteur = 0;
		char caractere;
		boolean test = false;

		do {
			// scan = new Scanner(System.in);
			// System.out.println(" Veuillez saisir une phrase terminée par un point : ");
			// phrase = scan.next();
			phrase = JOptionPane.showInputDialog(null, " Veuillez saisir une phrase terminée par un point : ",
					"Tableau", JOptionPane.INFORMATION_MESSAGE);

			char[] ch = phrase.toCharArray();

			int len = ch.length - 1;
			if (ch[len] == '.') {
				test = true;
			} else {
				JOptionPane.showMessageDialog(null, " Vous vous êtes trompé, la phrase ne contient pas un point ! ",
						"Tableau", JOptionPane.INFORMATION_MESSAGE);

			}
		} while (!test);

		System.out.println(phrase);

		String caractereS = JOptionPane.showInputDialog(null, " Veuillez saisir une lettre  ", "Tableau",
				JOptionPane.INFORMATION_MESSAGE);
		caractere = caractereS.charAt(0);
		System.out.println(caractere);
		
		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) == caractere) {
				compteur++;
				JOptionPane.showMessageDialog(null, " Le caractère se trouve à la position : " + (i + 1), "Tableau",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
		if (compteur > 0) {
			JOptionPane.showMessageDialog(null, " La lettre ( " + caractere + " ) est présente " + compteur + " fois .",
					"Tableau", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "La lettre n'est pas présente", "Tableau",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}

}
