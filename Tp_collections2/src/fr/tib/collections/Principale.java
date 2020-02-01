package fr.tib.collections;

import fr.tib.collections.Maillon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valeur = 1;
		boolean test = false;

		PileEntier maPile = new PileEntier(5);

		// do {
//			try {
//				valeur = Integer.parseInt(JOptionPane.showInputDialog(null, "Veuillez saisir un entier SVP : ",
//						"Valeur ? ", JOptionPane.INFORMATION_MESSAGE));
//				test=true;
//			} catch (Exception e) {
//				JOptionPane.showMessageDialog(null, "Veuillez saisir un entier", "Entier", JOptionPane.WARNING_MESSAGE);
//			}
//
//		} while (!test);

		System.out.println("Etat de la pille--> " + (maPile.pileVide() == true ? "vide" : "pas vide"));
		System.out.println("Etat de la pille--> " + (maPile.pilePleine() == true ? "pleine" : "pas pleine"));

		for (int i = 0; i < 10; i++) {
			maPile.empiler((int) (Math.random() * 15));
		}

		maPile.reinitialiser();

		while (!maPile.pilePleine()) {
			maPile.empiler(valeur++);
		}

		System.out.println(
				"Après les empilement, état de la pile--> " + (maPile.pileVide() == true ? "vide" : "pas vide"));
		System.out.println(
				"Après les empilement, état de la pile--> " + (maPile.pilePleine() == true ? "pleine" : "pas pleine"));

		String vueMaPile = "";

		while (!maPile.pileVide()) {
			String message;
			message = "|" + maPile.depiler() + "|\n";
			System.out.println(message);
			vueMaPile += message;
		}
		JOptionPane.showMessageDialog(null, "Voici le contenu de la pile : \n" + vueMaPile, "maPile",
				JOptionPane.INFORMATION_MESSAGE);

		String[] phrase = new String[] { "Les", "liste", "doublement chaînée", "en", "Java", "ce n'est qu'une",
				"question", "de", "références" };
String str="";
		for (String maListe : phrase) {
			 System.out.println(maListe+"");
			 
			 
			 
			 
			 JOptionPane.showMessageDialog(null, maListe,"",JOptionPane.INFORMATION_MESSAGE);
		}
		
		JOptionPane.showMessageDialog(null, str,"",JOptionPane.INFORMATION_MESSAGE);
	}
}
