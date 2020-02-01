package fr.tib.principale;

import javax.swing.JOptionPane;

import fr.tib.application.Adresse;
import fr.tib.entites.Personne;
import static fr.tib.utilitaires.Outils.afficher;

public class Principale {

	public static void main(String[] args) {

		Adresse ad1 = new Adresse(2, "rue Victor Hugo", 75008, "Paris");
		Adresse ad2 = new Adresse(17, "rue de la Republique", 44000, "Nantes");
		Adresse ad3 = new Adresse(55, "Bld de la Libération", 59000, "Lille");

		Personne p1 = new Personne("Jean", "Dupont", 30, ad3);
		Personne p2 = new Personne("Bernard", "Morin", 45, ad1);
		Personne p3 = new Personne("NAthalie", "Durand", 35, ad2);

//		System.out.println(p1.toString());
//		System.out.println(p2.toString());
//		System.out.println(p3.toString());

		//JOptionPane.showMessageDialog(null, p1, p1.getPrenom(), JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, p2, p2.getPrenom(), JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, p3, p3.getPrenom(), JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, p1, p1.getPrenom(),JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null,p2 + "\n" + p3,"Vive  les mariés !!", JOptionPane.INFORMATION_MESSAGE);
		
		//afficher la personne sole par la classe outils
		//Outils.afficherSolo(p1);
		//afficher les personnes marie par la classe outils
		//Outils.afficherMarie("Vive les mariés !", p3, p2);
		
		//afficher les personne en important les propriétés statique de la classe Outils
		afficher(p1);
		afficher(p2);
		afficher(p3);
		
		p1.setAdresse(new Adresse(24, "rue PVC ", 75015, "Paris"));
		
		afficher(p1);
		
		p3.setAdresse(ad1);
		
		afficher(p3);
		
		afficher("Vive les mariés !", p3, p2);

		afficher(p1);
		
	}


}
