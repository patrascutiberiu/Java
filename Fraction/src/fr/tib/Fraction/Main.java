package fr.tib.Fraction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Fraction maFraction = new Fraction(612, 22);

			System.out.println(maFraction);

			Fraction maFraction2 = new Fraction(11, 6);
			maFraction.pgcd();
			System.out.println(maFraction);

			boolean ok = maFraction.estInferieur(maFraction2);
			System.out.println("La fraction est :" + (ok ? "Inferieur" : "Superieur"));

			System.out.println("Addition\t" + maFraction.plus(maFraction2));
			System.out.println("Soustraction\t" + maFraction.moin(maFraction2));
			System.out.println("Multiplication\t" + maFraction.multiplie(maFraction2));

			try {
				System.out.println("Division\t" + maFraction.divise(maFraction2));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	
		System.out.println();

	}

}
