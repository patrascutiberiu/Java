package fr.tib.nombre_des_jeaunes_console;

import java.util.Scanner;

public class Nombre_des_jeaunes_console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ciffres=0;
		int compteur=0;
		int compteur2=0;
		boolean test=false;
		
		Scanner scan;
		for(int i=0; i<2;i++)
		{
			do {
				try {
					scan=new Scanner(System.in);
					System.out.println("Veuillez donner l'âge de la personne numero "+(i+1)+" s'il vous plaît : ");
					ciffres=scan.nextInt();
					test=true;
				}
				catch(Exception e){
					System.out.println("Veuillez saisir un nombre SVP");
				}	
			}
			while(!test);
			
			if(ciffres < 20) {
				compteur++;
			}
			else {
				compteur2++;
			}
			
		}
		if(compteur==2) {
			System.out.println("TOUTES LES PERSONNES ONT MOINS DE 20 ANS !");
		}
		else if(compteur==0) {
			System.out.println(" Toutes les personnes ont 20 ans ou plus.");
		}
		else {
			System.out.println("Les nombres de jeunes est :  "+ compteur);
		}
		
		
	}

}
