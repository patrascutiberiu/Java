package fr.tib.kiloutou;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan;

		int choixUtilisateur = 0;
		boolean test = false;
		boolean test2 = false;

		List<Voiture1> listeVoiture = new ArrayList<Voiture1>();
		Voiture1 maVoiture;

		maVoiture = new Voiture1("Peugeot", "307", 2098);
		listeVoiture.add(maVoiture);
		maVoiture = new Voiture1("Renault", "Espace", 1987);
		listeVoiture.add(maVoiture);
		maVoiture = new Voiture1("Lancia", "Dadra", 1203);
		listeVoiture.add(maVoiture);
		maVoiture = new Voiture1("BMW", "324d", 3049);
		listeVoiture.add(maVoiture);
		maVoiture = new Voiture1("Peugeot", "406", 1500);
		listeVoiture.add(maVoiture);
		maVoiture = new Voiture1("Ford", "Mondeo", 2500);
		listeVoiture.add(maVoiture);

		System.out.println("Liste voiture 1 non trier :");

		for (Voiture1 item : listeVoiture) {
			item.Affichage();
		}
		do {
			do {

				try {
					scan = new Scanner(System.in);
					System.out.println("Veuillez taper par quel ordre voulez-vous trier vos voitures :");
					System.out.println("[1] par la marque :");
					System.out.println("[2] par le modèle :");
					System.out.println("[3] par le numéro du série :");
					choixUtilisateur = scan.nextInt();
					test2 = true;
				} catch (Exception e) {
					System.out.println("Vous vous êtes trompé, veuillez saisir un nombre SVP !");
				}
			} while (!test2);

			switch (choixUtilisateur) {

			case 1:
				List<Voiture1> sortMarque = listeVoiture.stream().sorted(Comparator.comparing(Voiture1::getMarque))
						.collect(Collectors.toList());
				for (Voiture1 item : sortMarque) {
					item.Affichage();
				}
				test = true;
				break;
			case 2:
				List<Voiture1> sortModele = listeVoiture.stream().sorted(Comparator.comparing(Voiture1::getModele))
						.collect(Collectors.toList());
				for (Voiture1 item : sortModele) {
					item.Affichage();
				}
				test = true;
				break;
			case 3:
				List<Voiture1> sortNumero = listeVoiture.stream().sorted(Comparator.comparing(Voiture1::getNumSerie))
						.collect(Collectors.toList());
				for (Voiture1 item : sortNumero) {
					item.Affichage();
				}
				test = true;
				break;
			default:
				System.out.println("Tu es trop con pour ce siecle, veuillez tapper 1,2 ou 3!");
				break;
			}
		} while (!test);

		System.out.println("Liste voiture 2 non trier:");

		List<Voiture2> liste2 = new ArrayList<Voiture2>();
		Voiture2 maVoiture2;
		LocalDate d1 = LocalDate.now();
		d1 = LocalDate.of(1944, 2, 15);
		LocalDate d2 = LocalDate.now();
		d2 = LocalDate.of(1990, 7, 25);
		LocalDate d3 = LocalDate.now();
		d3 = LocalDate.of(1995, 5, 11);
		LocalDate d4 = LocalDate.now();
		d4 = LocalDate.of(1991, 12, 11);
		LocalDate d5 = LocalDate.now();
		d5 = LocalDate.of(1968, 9, 6);
		LocalDate d6 = LocalDate.now();
		d6 = LocalDate.of(2000, 3, 5);

		maVoiture2 = new Voiture2("Peugeot", "307", 2098, d1);
		liste2.add(maVoiture2);
		maVoiture2 = new Voiture2("Renault", "Espace", 1987, d2);
		liste2.add(maVoiture2);
		maVoiture2 = new Voiture2("Lancia", "Dadra", 1203, d3);
		liste2.add(maVoiture2);
		maVoiture2 = new Voiture2("BMW", "324d", 3049, d4);
		liste2.add(maVoiture2);
		maVoiture2 = new Voiture2("Peugeot", "406", 1500, d5);
		liste2.add(maVoiture2);
		maVoiture2 = new Voiture2("Ford", "Mondeo", 2500, d6);
		liste2.add(maVoiture2);

		for (Voiture2 item : liste2) {
			item.Affichage();
		}

	}

}
