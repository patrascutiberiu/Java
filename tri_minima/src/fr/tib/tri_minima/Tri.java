package fr.tib.tri_minima;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Tri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int longueur = 0;
		int[] tableau;
		String resultat = "";
		int compteur = 1;

		try {
			longueur = Integer.parseInt(JOptionPane.showInputDialog(null, "Combien des nombres voulez-vous ranger ? ",
					"Tri � minima", JOptionPane.INFORMATION_MESSAGE));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ce n'est pas un nombre ", "Tri �  minima",
					JOptionPane.INFORMATION_MESSAGE);
		}

		tableau = new int[longueur];

		JOptionPane.showMessageDialog(null, "Entrez un nombre ", "Tri �  minima", JOptionPane.INFORMATION_MESSAGE);

		for (i = 0; i != longueur; i++) {
			tableau[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "n�  " + (compteur++) + " :",
					"Tri � minima", JOptionPane.INFORMATION_MESSAGE));
		}

		Arrays.sort(tableau);
		for (i = 0; i != longueur; i++) {
			JOptionPane.showMessageDialog(null, "Voici le tableau tri� par ordre croissant : " +tableau[i]+". ", "Tri �  minima",
					JOptionPane.INFORMATION_MESSAGE);
		}
		
	
		/*
		 * for (i = 0; i != longueur; i++) { resultat += ", " + tableau[i]; } resultat =
		 * resultat.substring(1, resultat.length() - 1);
		 * 
		 * JOptionPane.showMessageDialog(null,
		 * "Voici le tableau tri� par ordre croissant : " + resultat+".",
		 * "Tri �  minima", JOptionPane.INFORMATION_MESSAGE);
		 */

	}

}
