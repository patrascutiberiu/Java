package fr.tib.kiloutou;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Voiture2 extends Vehicule {

	public Voiture2(String _marque, String _modele, int _numSerie, LocalDate _miseEnCirculation) {
		this.setMarque(_marque);
		this.setModele(_modele);
		this.setNumSerie(_numSerie);
		this.setMiseEnCirculation(_miseEnCirculation);
	}

	public void Affichage() {
		System.out.println("Marque : " + this.getMarque() + " Modele : " + this.getModele() + " Numero serie "
				+ this.getNumSerie() + " Date de mise en circulation: " + this.getMiseEnCirculation());
	}

	private static final String DATE_PATTERN = "dd.MM.yyyy";

	// formater la date

	private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(DATE_PATTERN);

	// conversion d'une LOCALEDATE en string, utilisation du format DATE_PATTERN

	public static String format(LocalDate date) {
		if (date == null) {
			return null;
		}
		return DATE_FORMATTER.format(date);
	}

	public static LocalDate parse(String dateString) {
		try {
			return DATE_FORMATTER.parse(dateString, LocalDate::from);
		} catch (DateTimeParseException e) {
			return null;
		}
	}



}
