package fr.tib.Banque;

import java.util.ArrayList;
import java.util.List;

public class Banque {
	
	private List<Compte> mesComptes;
	private String nom;
	private String ville;

	private void ajouteCompte(Compte unCompte) {
		mesComptes.add(unCompte);
	}

	public void ajouteCompte(String _nom, int _numero, double _solde, int _decouvert) {

		Compte nouveauxCompte = new Compte(_nom, _numero, _solde, _decouvert);
		ajouteCompte(nouveauxCompte);
	}

	public Banque(String _nom, String _ville) {
		mesComptes = new ArrayList<Compte>();
		this.nom = _nom;
		this.ville = _ville;
	}

	public Compte rendCompte(int _numCompte) {
		
		int i = 0;
		// verifica daca numarul cautat se gaseste in lista de conturi
		// cauta in lista de conturi pana cand intalneste numarul cautat in lista de conturi
		// ca sa nu ruleze la infinit, verifica si daca i < numarul total de conturi
		while (_numCompte != mesComptes.get(i).getNumero() && i < mesComptes.size()) {	
			i++;
		}
		// daca i este mai mic decat numarul total de conturi inseamna ca cautarea s-a oprit inainte de sfarsitul listei deci, 
		//contul cautat a fost gasit
		if (i < mesComptes.size()){
			return mesComptes.get(i);
		}
		else{
			return null;
		}
		
	}

	public void compteSup() {
		Compte monCompte = null;
		double max = 0;
		for (Compte compte : mesComptes) {
			if (compte.getSolde() > max) {
				monCompte = compte;
				max = compte.getSolde();
			}
		}
		monCompte.toString();
	}

	public String toString() {
		return "Nom de la banque : "+nom+", Ville :"+ville+"\n"+mesComptes.toString(); 
	}
}
