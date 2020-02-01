package fr.tib.utilitaires;

import javax.swing.JOptionPane;

import fr.tib.entites.Personne;

public class Outils {

	public static void afficher(Personne _personne) {
		JOptionPane.showMessageDialog(null, _personne.toString(), _personne.getPrenom(), JOptionPane.INFORMATION_MESSAGE);
	}

	public static void afficher(String _titre, Personne _perso, Personne _persotwo) {
		JOptionPane.showMessageDialog(null, _perso.toString() + "\n" + _persotwo.toString(), _titre,
				JOptionPane.INFORMATION_MESSAGE);

	}
	
	/*public static void afficher(String _nom,Personne _personne) {
		JOptionPane.showMessageDialog(null, _personne.toString(), _nom.toString(), JOptionPane.INFORMATION_MESSAGE);

	}
	*/
}
