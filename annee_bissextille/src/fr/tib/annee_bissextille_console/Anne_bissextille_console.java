package fr.tib.annee_bissextille_console;

import java.util.Scanner;

public class Anne_bissextille_console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int saisieUt=0;
		boolean test=false;
		
		Scanner scan;
		
		do {
			try {
				scan = new Scanner(System.in);
				System.out.println("Veuillez saisir l'année : ");
				saisieUt= scan.nextInt();
				test=true;
			}
			catch(Exception e){
				System.out.println("Veuillez saisir un nombre SVP");
			}	
		}   
		while(!test);
		
	    
	    if(saisieUt % 4 != 0) {
	    	System.out.println("L'année est non bissextile . ");
	    }
	    else {
	    	if(saisieUt % 100 != 0) {
	    		System.out.println("L'annéé est bissextile . ");
	    	}
	    	else {
	    		if(saisieUt %400==0) {
	    			System.out.println("L'année est non bissextile . ");
	    		}
	    		else {
	    			System.out.println("L'annéé est bissextile . ");
	    		}
	    	}
	    }
		
		
	}

}
