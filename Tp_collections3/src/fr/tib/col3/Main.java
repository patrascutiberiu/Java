package fr.tib.col3;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String reponse;
		String nom = null;

		ArrayList<NomVille> maListe = new ArrayList<NomVille>();
		NomVille saisie;
		do {
			nom = JOptionPane.showInputDialog(null, "Veuillez saisie une ville :", "Ville ?",
					JOptionPane.INFORMATION_MESSAGE);
			reponse = JOptionPane.showInputDialog(null, "Avez-vous fini ? (o/n) ", "Message",
					JOptionPane.INFORMATION_MESSAGE);
			saisie = new NomVille(nom);
			maListe.add(saisie);

		} while (!reponse.equals("o"));

		for (NomVille item : maListe) {
			item.afficher(maListe);
		}

	}

}
