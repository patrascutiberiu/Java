package fr.tib.lecture_fichier;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Principale {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		String saisie;
		FileReader fileReader = new FileReader("lafontaine.txt");

		Scanner scan;
		scan = new Scanner(System.in);
		
		System.out.println("Quel fichier souhaitez-vous lire ?");
		saisie=scan.next();

//		if (saisie == fileReadere) {
//			
//		} else {
//
//		}

	}

}
