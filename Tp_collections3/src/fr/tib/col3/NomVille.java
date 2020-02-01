package fr.tib.col3;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class NomVille {

	private String nom;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public NomVille(String nom) {
		this.nom = nom;
	}

	public void afficher(ArrayList<NomVille> maListe) {
			JOptionPane.showMessageDialog(null,getNom(),"Ville ?",JOptionPane.INFORMATION_MESSAGE);
	}
}
