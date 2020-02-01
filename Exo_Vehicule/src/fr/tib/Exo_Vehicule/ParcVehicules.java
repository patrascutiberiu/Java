package fr.tib.Exo_Vehicule;

public class ParcVehicules {

	public void enregistrer(Inventoriable vehicule) {
		stockerDansLaBase(vehicule.getIdentifiant()+vehicule.getInfosCompletes());
	}
}
