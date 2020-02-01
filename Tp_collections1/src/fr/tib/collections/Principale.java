package fr.tib.collections;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] tableau;
		int tailleTableau = 0;

		try {
			tailleTableau = Integer.parseInt(JOptionPane.showInputDialog(null,
					"Veuillez saisir le nombre d'éléments pour votre tableau : ", "Taille ? ", JOptionPane.INFORMATION_MESSAGE));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Veuillez saisir un entier", "Entier", JOptionPane.WARNING_MESSAGE);
		}

		tableau = new int[tailleTableau];

		for (int i = 0; i < tableau.length; i++) {
			tableau[i] = (int) (Math.random() * 50 + 1);
		}
		afficher(tableau);

		//trier en appelant la methode()
		//trier(tableau);
		
		//trier par la methode .sort()
		Arrays.sort(tableau);
		
		afficher(tableau);
	}

	public static void afficher(int[] tableau) {
		String resultat = "";
		int taille = tableau.length;
		for (int i = 0; i < tableau.length; i++) {
			resultat = resultat + "Tableau [" + i + "]=" + tableau[i] + "\n";
		}
		JOptionPane.showMessageDialog(null, resultat, "Tableau de " + taille + " entiers",
				JOptionPane.INFORMATION_MESSAGE);

	}

	public static void trier(int[] tableau) {
		int i, j, cle;
		for (i = 1; i < tableau.length; i++) {
			cle = tableau[i];
			j = i;
			while ((j >= 1) && (tableau[j - 1] > cle)) {

				tableau[j] = tableau[j - 1];
				j = j - 1;
			}
			tableau[j] = cle;
		}
	}
}
