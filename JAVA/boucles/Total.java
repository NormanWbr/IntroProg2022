package boucles;

import java.util.Scanner;

public class Total {

	public static void main(String[] args) {

		int nbr,somme=0;

		do {
			
			System.out.println("Entrez un nombre. Entrez 0 pour stopper : ");
			nbr=(new Scanner(System.in)).nextInt();
			somme = somme + nbr;


		} while (nbr != 0);
		
		System.out.println("La somme de vos nombres est : " + somme);

	}

}
