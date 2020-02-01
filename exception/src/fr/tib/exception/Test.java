package fr.tib.exception;

import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numerateur = 10;
		int denominateur = 0;
		int resultat = 0;

		try {
			resultat = numerateur / denominateur;

			System.out.println("Suite du bloc try"); // Instruction jamais ex�cut�e
		} catch (ArithmeticException ae) {
			JOptionPane.showMessageDialog(null, ae.getMessage(), "Message de l'exception", JOptionPane.INFORMATION_MESSAGE);
			denominateur = 2;
			resultat = numerateur / denominateur;
		}

		JOptionPane.showMessageDialog(null,
				"Le r�sultat de la division de " + numerateur + " par " + denominateur + " est : " + resultat,
				"R�sultat", JOptionPane.INFORMATION_MESSAGE);

		System.out.println("Fin du programme");
		
		
	}

}
