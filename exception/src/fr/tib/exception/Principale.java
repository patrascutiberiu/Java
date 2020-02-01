package fr.tib.exception;

import javax.swing.JOptionPane;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tailleTableau=0;
		String taille;
		int[] tableau;
		
		taille = JOptionPane.showInputDialog(null, "Veuillez entrer le nombre d'élts souhaité " , "Taille ? ",
				JOptionPane.INFORMATION_MESSAGE);
		
		tailleTableau= new Integer(taille);
		tableau = new int[tailleTableau];
		
		for(int i=0;i<tableau.length;i++) {
			tableau[i]=(int)(Math.random()*50+1);
		}
		
		afficher(tableau);
		  
	}

	public static void afficher(int[]tableau) {
		String resultat="";
		int taille=tableau.length;
		
		for(int i=0; i<tableau.length;i++) {
			resultat +="tableau "+i+" "+tableau[i]+" \n";
			System.out.println("tableau "+i+ " "+tableau[i]);
		}
		JOptionPane.showMessageDialog(null, resultat, "Tableau de "+taille+ " entiers", JOptionPane.INFORMATION_MESSAGE);
		
	}
}
