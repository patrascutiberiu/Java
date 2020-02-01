package fr.tib.jeu_de_la_fourchette_bt;

import java.util.Random;

import javax.swing.JOptionPane;

public class Jeu_de_la_fourchette_bt {

	public static void main(String[] arg) {
		
		int ordi=0;
		int monChoix=0;
		int inf=0;
		int sup=100;
		int compteur=0;
		boolean test=false;
		boolean verifSaisie=false;
		
		Random rand = new Random();
		ordi= rand.nextInt(sup-inf+1)+inf;
		
		do {
			do {
				try {
					monChoix = Integer.parseInt(JOptionPane.showInputDialog(null,
							"Veuillez saisir un nombre entre "+inf+" et "+ sup + " :", 
							"Jeu de la fourchette",
							JOptionPane.INFORMATION_MESSAGE));
					verifSaisie=true;
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, 
							"Veuillez saisir un nombre SVP !", 
							"Jeu de la fourchette", 
							JOptionPane.WARNING_MESSAGE);
				}
			}
			while(!verifSaisie);
			
			compteur++;
			
			if(monChoix==ordi) {
				test=true;
			}
			else if(monChoix<ordi) {
				inf=monChoix;
			}
			else {
				sup=monChoix;
			}
		}
		while(!test);
		
		JOptionPane.showMessageDialog(null,
				"Bravo ! Vous avez trouvé le nombre : "+monChoix+" en "+compteur+" fois." );
	}
}

