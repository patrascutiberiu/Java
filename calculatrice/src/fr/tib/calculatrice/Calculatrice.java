package fr.tib.calculatrice;

public class Calculatrice {

	private char operateur;
	private double var1;
	private double var2=1;

	public Calculatrice(char operateur, double var1, double var2) {
		this.operateur = operateur;
		this.var1 = var1;
		this.var2 = var2;
	}

	public char getOperateur() {
		return operateur;
	}

	public void setOperateur(char operateur) {
		this.operateur = operateur;
	}

	public double getVar1() {
		return var1;
	}

	public void setVar1(double var1) {
		this.var1 = var1;
	}

	public double getVar2() {
		return var2;
	}

	public void setVar2(double var2) {
		this.var2 = var2;
	}

	public static double calculer(char operateur, double var1, double var2) {
		double resultat = 0;

		switch (operateur) {

		case '+':
			resultat = var1 + var2;
			return resultat;
		case '-':
			resultat = var1 - var2;
			return resultat;
		case '*':
			resultat = var1 * var2;
			return resultat;
		case '/':
			try {
				resultat = var1/var2;
				if (resultat == Double.POSITIVE_INFINITY) {
					throw new ArithmeticException();
				}
				else
				{
					return resultat;
				}
				
			} catch (ArithmeticException e) {				
				System.out.println("Division imposible par zéro ! ");
			}
		default:
			return 0;
		}
	}
}
