package com.tib.application;

import com.tib.entites.Personne;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("Passage dans main");

		Personne martin = new Personne("Martin", "?");
		Personne dupont = new Personne("Dupont");

		martin.afficher();
		dupont.afficher();

		Personne durand = new Personne("Durand", "J2E SA");
		durand.afficher();
		durand.quitteSociete();
		durand.afficher();
		durand.setSociete("EJB Corporate");
		durand.afficher();
		durand.setSociete("EJB Corporate");
		durand.afficher();
	
	}

}
