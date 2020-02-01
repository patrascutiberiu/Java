package fr.tib.forum;

public interface IModerateurForum {

	public boolean supprimerNouvelle(Nouvelle n);
	public void banirUnAbonne(Abonne a);
	public int ajouterAbonne(Abonne a);
	public void listerAbonnes();
}
