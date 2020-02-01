package fr.tib.Banque;

public class Compte implements Cloneable{

    private String nom;
    private int numero;
	private double solde=0;
	
    public double getSolde() {
		return solde;
	}

	private int decouvert;
    
        public int getNumero() {
		return numero;
	}
    
    public Compte()
    {
        this.nom = "Technique";
        this.numero = 9999;
        this.solde = 99999;
        this.decouvert = 99;
    }

    public Compte(String _nom, int _numero, double _solde, int _decouvert)
    {
        this.nom = _nom;
        this.numero = _numero;
        this.solde = _solde;
        this.decouvert = _decouvert;
    }
    
    public Object clone() {
    	Object monCompte= null;
    	try {
			monCompte=super.clone();
		} catch (CloneNotSupportedException cnse) {
			cnse.printStackTrace(System.err);
		}
    	return monCompte;
    }

    public void Crediter(double _montant)
    {
        solde = solde + _montant;
    }

    public boolean Debiter(double _montant)
    {
        if (_montant > 0 && (solde - _montant > decouvert))
        {
            solde -= _montant;
            return true;
        }
        return false;
    }

    public boolean Transferer(Compte _compteTransfer, double _montant)
    {
        if (Debiter(_montant))
        {
            _compteTransfer.Crediter(_montant);
            return true;
        }
        return false;
    }

    public boolean Supperieur(Compte _autreCompte)
    {
        if (solde > _autreCompte.solde)
        {
            return true;
        }
        return false;
    }
    
    public String toString() {
    	return "Nom proprietaire compte : " + nom + " Numero compte : " + numero + " Solde : " + solde + " Decouvert autorise : " + decouvert + "\n";
	}
}
