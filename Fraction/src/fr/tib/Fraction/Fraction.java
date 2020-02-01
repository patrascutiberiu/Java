package fr.tib.Fraction;


public class Fraction {

	private int numerateur;
	private int denominateur; 

	public Fraction() {
		denominateur = 1;
	}

	
	public Fraction(int _numerateur) {
		numerateur = _numerateur;
		denominateur = 1;
	}

	public Fraction(int _numerateur, int _denomenateur) {
		numerateur = _numerateur;
		denominateur = _denomenateur;
	}

	public Fraction(Fraction _copieFraction) {
		numerateur = _copieFraction.numerateur;
		denominateur = _copieFraction.denominateur;
	}

	public Fraction(Fraction[] mafr) {
		
	}
	public String toString() {

		if (denominateur == 1) {
			return "Numerateur : " + numerateur;
		} else if (denominateur < 0) {
			denominateurNegatif();
			return "Numerateur : " + numerateur + " Denomenateur : " + denominateur;
		} 
		else if (denominateur == 0) {
			throw new IllegalArgumentException("Fraction invalide ! Denominateur = 0 !");
		}
		else {
			return "Numerateur : " + numerateur + " Denomenateur : " + denominateur;
		}
	}
	
	private void denominateurNegatif() {
		numerateur=numerateur*-1;
		denominateur=denominateur*-1;
	}

	public void oppose() {
		numerateur = numerateur * -1;
	}

	public void inverse() {
		int inverse;
		inverse = numerateur;
		numerateur = denominateur;
		denominateur = inverse;
	}

	public boolean estEgale(Fraction _autreFraction) {
		return (double) (numerateur * _autreFraction.denominateur) == (double) (_autreFraction.numerateur
				* denominateur);
	}

	public boolean estInferieur(Fraction _autreFraction) {
		return (double) (numerateur * _autreFraction.denominateur) < (double) (_autreFraction.numerateur
				* denominateur);
	}

	public boolean estSuperieur(Fraction _autreFraction) {
		return (double) (numerateur * _autreFraction.denominateur) > (double) (_autreFraction.numerateur
				* denominateur);
	}
	
	private int GetPgcd() {

		int a = this.numerateur;
		int b = this.denominateur;

		int pgcd = 1;

		if (a != 0 && b != 0) {
			if (a < 0) {
				a = -a;
			}
			if (b < 0) {
				b = -b;
			}
			while (a != b) {
				if (a < b) {
					b = b - a;
				} else {
					a = a - b;
				}
				pgcd = a;
			}
		}
		return pgcd;
	}

	private void reduire() {
		if (numerateur < 0 && denominateur < 0) {
			numerateur = numerateur * -1;
			denominateur = denominateur * -1;
		} else if (denominateur < 0) {
			numerateur = numerateur * -1;
			denominateur = denominateur * -1;
		} else {
			int pgcd = this.GetPgcd();
			numerateur = numerateur / pgcd;
			denominateur = denominateur / pgcd;
		}
	}
	
	public void pgcd() {
		  
		reduire();
	}

	public Fraction plus(Fraction _autreFraction) {
		int numPlus;
		int denumPlus;

		numPlus = numerateur * _autreFraction.denominateur + _autreFraction.numerateur * denominateur;
		denumPlus = denominateur * _autreFraction.denominateur;

		return new Fraction(numPlus, denumPlus);
	}

	public Fraction moin(Fraction _autreFraction) {
		int numMoin;
		int denumMoin;

		numMoin = numerateur * _autreFraction.denominateur - _autreFraction.numerateur * denominateur;
		denumMoin = denominateur * _autreFraction.denominateur;

		return new Fraction(numMoin, denumMoin);
	}

	public Fraction multiplie(Fraction _autreFraction) {
		
		return produitSimplifier(_autreFraction);
	}

	public Fraction divise(Fraction _autreFraction) {

		_autreFraction.inverse();

		if (denominateur == 0) {
			throw new IllegalArgumentException("Impossible de faire la division par 0 !");
		} else {
			return produitSimplifier(_autreFraction);
		}

	}
	
	private Fraction produitSimplifier(Fraction _autreFraction) {
		int newNum;
		int newDenum;
		
		newNum = numerateur * _autreFraction.numerateur;
		newDenum = denominateur * _autreFraction.denominateur;
		
		return new Fraction(newNum, newDenum);
	}

}
