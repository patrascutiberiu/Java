package fr.tib.bouteille;

public class EcranAffichage {
	
	public static void affichage(Bouteille maBouteille) {
		System.out.println("Dans ma bouteille le volume actuel est de : " + maBouteille.getVolumeActuel()+
				" (l) \nLe volume maximum de la bouteille est de : " + maBouteille.getVolumeMax()+
				" (l) \nLe bouchon est "
                + (maBouteille.isEtatBouchon() ? "ouvert !\n" : "ferme !\n"));
	}
}
