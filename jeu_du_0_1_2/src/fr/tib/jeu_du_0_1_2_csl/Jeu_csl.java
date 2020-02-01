package fr.tib.jeu_du_0_1_2_csl;

import java.util.Random;
import java.util.Scanner;


public class Jeu_csl {

	public static void main(String[] args) {
		
		int choixOrdi=0;
		int choixJoueur=0;
		int dif=0;
		int pointOrdi=0;
		int pointJoueur=0;
		int nbManches=0;

		
		Scanner scan;
		Random rand = new Random();
		
		//choixOrdi=(int)(Math.random()*3);
		
		do {
			scan = new Scanner(System.in);
			
			choixOrdi=rand.nextInt(3);
			System.out.println("Le nombre choisit par l'ordi est : "+choixOrdi);
			
			
			System.out.println("Veuillez choisir un nombre entre 0, 1 et 2 ou tappez un nombre nagatif pour arreter le jeux : ");
			choixJoueur = scan.nextInt();
			
			nbManches++;
			
			dif=Math.abs(choixOrdi-choixJoueur);
			if(dif==2) {
				if(choixJoueur > choixOrdi) {
					choixJoueur++;
				}
				else {
					choixOrdi++;
				}
			}
			else if(dif==1) {
				if(choixJoueur < choixOrdi) {
					pointJoueur++;
				}
				else {
					pointOrdi++;
				}
			}
			else {
				System.out.println("Egalitée, aucun point n'est pas marqué");
			}
			System.out.println("Votre score est de : "+pointJoueur+" point, score machine est de : "+pointOrdi+" manche numero : "+ nbManches);
			
		}
		while(pointOrdi <10 && pointJoueur <10 && choixJoueur >=0);
		
		scan.close();
		
		if(pointJoueur==10) {
			System.out.println("Bravo vous avez gagné en "+nbManches+ " manches");
		}
		else if(pointOrdi==10) {
			System.out.println("Désole vous avez perdu, la machine a gagne en "+nbManches+" manches");
		}
		else {
			System.out.println("Vous avez arreter le jeux  au bout de : "+nbManches+" manches, votre score est : "+pointJoueur+" points et le score de la machine est : "+pointOrdi+" points");
		}
		
	}
}
