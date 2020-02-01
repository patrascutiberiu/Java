package fr.tib.collections;

public class Maillon {

	private String mot;
	private Maillon suivant;

	public Maillon(String mot, Maillon suivant) {
		this.mot = mot;
		this.suivant = suivant;
	}

	public String getMot() {
		return mot;
	}

	public void setMot(String mot) {
		this.mot = mot;
	}

	public Maillon getSuivant() {
		return suivant;
	}

	public void setSuivant(Maillon suivant) {
		this.suivant = suivant;
	}

	public static void afficherListe(Maillon maListe) {
		Maillon i = maListe;
		
		for(i=maListe;i!=null;i=i.getSuivant()) {
			System.out.println(i.getMot()+"-");
		}
	}

	
}
