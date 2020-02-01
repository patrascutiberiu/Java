package fr.tib.login;

public class Utilisateur {

	private String nom;
	private String login;
	private String motDePasse;
	public int niveauAcces;
	public String mail;
	private String qualification;
	
	public Utilisateur(String nom, String login, String motDePasse, int niveauAcces, String mail,
			String qualification) {
		this.nom = nom;
		this.login = login;
		this.motDePasse = motDePasse;
		this.niveauAcces = niveauAcces;
		this.mail = mail;
		this.qualification = qualification;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
}
