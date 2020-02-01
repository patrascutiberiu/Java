package fr.tib.jour_de_la_semaine_boite;

import javax.swing.JOptionPane;

public class Jour_de_la_semaine_boite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int jours=0;
		int mois=0;
		int annee=0;
		int resultat4;
		int valeurMois=0;
		int reste7;
		boolean test=false;
		

		
		do {
			try {
				do {
					jours = Integer.parseInt(JOptionPane.showInputDialog(null, 
							" introduisez un jour entre 1 et 30/31 : ", 
							"Jour",
							JOptionPane.INFORMATION_MESSAGE));
					test=true;
				}
				while(jours <1 || jours > 31);
			}
			catch(Exception e) {
				JOptionPane.showMessageDialog(null, 
						"Veuillez saisir un nombre SVP !","Jour de la semaine", 
						JOptionPane.WARNING_MESSAGE);
			}
		}
		while(!test);
		
		test=false;
		do {
			try {
				do {
				System.out.println();
				mois = Integer.parseInt(JOptionPane.showInputDialog(null, 
						" introduisez un mois entre 1 et 12: ",
						"Mois",
						JOptionPane.INFORMATION_MESSAGE));
				test=true;
				}
				while(mois <1 || mois >12);

			}
			catch(Exception e) {
				JOptionPane.showMessageDialog(null, 
						"Veuillez saisir un nombre SVP !",
						"Jour de la semaine", 
						JOptionPane.WARNING_MESSAGE);
			}
		}
		while(!test);
		
		test=false;
		do {
			try {
				do {

				annee = Integer.parseInt(JOptionPane.showInputDialog(null, 
						" introduisez le deux dernieres chiffre de l'année comprises entre 1900 et 2019 : ", 
						"Année",
						JOptionPane.INFORMATION_MESSAGE));
				test=true;
				}
				while(annee < 1900 || annee > 2019);

			}
			catch(Exception e) {
				JOptionPane.showMessageDialog(null, 
						"Veuillez saisir un nombre SVP !",
						"Jour de la semaine", 
						JOptionPane.WARNING_MESSAGE);
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
			default:
				valeurMois=-1;
				break;
				
		}
		
		reste7=(annee + resultat4 + valeurMois + jours) % 7;
		
		//System.out.println(" Le resultat du reste est :"+ reste7);
		
		switch(reste7) {			
			case 0:
				JOptionPane.showMessageDialog(null," C'est samedi !" );
				break;
			case 1:
				JOptionPane.showMessageDialog(null," C'est dimanche !" );
				break;
			case 2:
				JOptionPane.showMessageDialog(null," C'est lundi !" );
				break;
			case 3:
				JOptionPane.showMessageDialog(null," C'est mardi !" );
				break;
			case 4:
				JOptionPane.showMessageDialog(null," C'est mercredi !" );
				break;
			case 5:
				JOptionPane.showMessageDialog(null," C'est jeudi !" );
				break;
			case 6:
				JOptionPane.showMessageDialog(null," C'est vendredi !" );
				break;
			default:
				JOptionPane.showMessageDialog(null,"Non defini" );
				break;

		}
		
	}

}
