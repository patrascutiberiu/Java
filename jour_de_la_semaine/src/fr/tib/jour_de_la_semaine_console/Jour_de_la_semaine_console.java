package fr.tib.jour_de_la_semaine_console;

import java.util.Scanner;

public class Jour_de_la_semaine_console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int jours=0;
		int mois=0;
		int annee=0;
		int resultat4;
		int valeurMois=0;
		int reste7;
		boolean test=false;
		
		Scanner scan;
		
		do {
			try {
				do {
					scan= new Scanner(System.in);
					System.out.println(" introduisez un jour entre 1 et 30/31 : ");
					jours=scan.nextInt();
					test=true;
				}
				while(jours <1 || jours > 31);
			}
			catch(Exception e) {
				System.out.println("Veuillez saisir un nombre SVP");
			}
		}
		while(!test);
		
		test=false;
		do {
			try {
				do {
				scan= new Scanner(System.in);
				System.out.println(" introduisez un mois entre 1 et 12: ");
				mois=scan.nextInt();
				test=true;
				}
				while(mois <1 || mois >12);

			}
			catch(Exception e) {
				System.out.println("Veuillez saisir un nombre SVP");
			}
		}
		while(!test);
		
		test=false;
		do {
			try {
				do {
				scan= new Scanner(System.in);
				System.out.println(" introduisez le deux dernieres chiffre de l'année comprises entre 1900 et 2019 : ");
				annee=scan.nextInt();
				test=true;
				}
				while(annee < 1900 || annee > 2019);

			}
			catch(Exception e) {
				System.out.println("Veuillez saisir un nombre SVP");
			}
		}
		while(!test);
		
		resultat4= annee /4;
		
		switch(mois) {
			case 1:
				if(annee % 4==0) {
					valeurMois=0;
				}
				else {
					valeurMois=1;
				}
				break;
			case 2:
				if(annee % 4==0) {
					valeurMois=3;
				}
				else {
					valeurMois=4;
				}
				break;
			case 3:
				valeurMois=4;
				break;
			case 4:
				valeurMois=0;
				break;
			case 5:
				valeurMois=2;
				break;
			case 6:
				valeurMois=5;
				break;
			case 7:
				valeurMois=0;
				break;
			case 8:
				valeurMois=3;
				break;
			case 9:
				valeurMois=6;
				break;
			case 10:
				valeurMois=1;
				break;
			case 11:
				valeurMois=4;
				break;
			case 12:
				valeurMois=6;
				break;
				
		}
		
		reste7=(annee + resultat4 + valeurMois + jours) % 7;
		
		//System.out.println(" Le resultat du reste est :"+ reste7);
		
		switch(reste7) {
			case 0:
				System.out.println(" C'est samedi !");
				break;
			case 1:
				System.out.println(" C'est dimanche !");
				break;
			case 2:
				System.out.println(" C'est lundi !");
				break;
			case 3:
				System.out.println(" C'est mardi !");
				break;
			case 4:
				System.out.println(" C'est mercredi !");
				break;
			case 5:
				System.out.println(" C'est jeudi !");
				break;
			case 6:
				System.out.println(" C'est vendredi !");
				break;
			default:
				System.out.println("Non defini !");
				break;
			
		}
		
	}

}
