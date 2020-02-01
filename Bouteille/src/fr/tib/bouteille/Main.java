package fr.tib.bouteille;

import fr.tib.bouteille.Bouteille;
import fr.tib.bouteille.ExceptionsBouteille;

import fr.tib.bouteille.EcranAffichage;

public class Main {

	public static void main(String[] args) throws ExceptionsBouteille {

		try {
			Bouteille maBouteille = new Bouteille(10, 5, true);

			EcranAffichage.affichage(maBouteille);
			//maBouteille.remplir(20);
			EcranAffichage.affichage(maBouteille);
			maBouteille.vider();
			EcranAffichage.affichage(maBouteille);
			maBouteille.fermer();
			maBouteille.remplir(10);
			EcranAffichage.affichage(maBouteille);
			
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
