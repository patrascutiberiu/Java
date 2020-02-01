package fr.tib.jeu_de_la_fourchette_console;

import java.util.Random;
import java.util.Scanner;

public class Jeu_de_la_fourchette_csl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ordi=0;
		int monChoix=0;
		int inf=0;
		int sup=100;
		int compteur=0;
		boolean test=false;
		boolean verifSaisie=false;
		
		Scanner scan;
		
		Random rand= new Random();
		ordi = rand.nextInt(sup-inf +1)+inf;
		
		//System.out.println("Le nombre choisit par l'ordi est : "+ordi);
		
		System.out.println("Le numero à recherche se trouve entre 0 et 100 .");
		
		do {
			do {
				try {
					scan= new Scanner(System.in);
					System.out.println("Veuillez saisir un nombre entre "+inf+" et "+sup+" :");
					monChoix=scan.nextInt();
					verifSaisie=true;
				}
				catch(Exception e){
					System.out.println("Veuillez saisir un nombre SVP");
				}
			}
			while(!verifSaisie);
			
			compteur++;
			
			if(monChoix == ordi) {
				test=true;
			}
			else if(monChoix < ordi) {
				inf=monChoix;
			}
			else {
				sup=monChoix;
			}
		}
		while(!test);
		
		System.out.println("Bravo ! Vous avez trouvé le nombre : "+monChoix+" en "+compteur+" fois." );
	}

}
