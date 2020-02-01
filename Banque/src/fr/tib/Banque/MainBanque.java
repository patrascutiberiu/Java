package fr.tib.Banque;

public class MainBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banque maBanque= new Banque("LA banque postal","Mulhouse");
		maBanque.ajouteCompte("tib", 1, 1000, -500);
		maBanque.ajouteCompte("seb", 2, 2000, 0);
		System.out.println(maBanque);

	}

}
