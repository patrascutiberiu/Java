package fr.tib.calculatrice;

import fr.tib.calculatrice.Calculatrice;

public class AppCalculatrice {

	public static void main(String[] args) throws CalculException {
		// TODO Auto-generated method stub
		
		
		try {
			System.out.println(Calculatrice.calculer('+',1,2));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println(Calculatrice.calculer('-',2078,64));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println(Calculatrice.calculer('*',15,3));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println(Calculatrice.calculer('/',42,9));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println(Calculatrice.calculer('/',15,2)+Calculatrice.calculer('*',2,3));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("15 / 0 = "+Calculatrice.calculer('/',15,0));

		try {
			System.out.println("1!2= "+Calculatrice.calculer('!',1,2));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
