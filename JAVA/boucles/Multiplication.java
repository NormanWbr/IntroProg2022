package boucles;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {

		int nbr,somme = 0,cpt = 0;

		System.out.println("Entrez votre nombre pour en faire la table : ");
		nbr=(new Scanner(System.in)).nextInt();


		while (cpt < 10) {
			System.out.println((nbr + somme));
			somme = somme + nbr;
			cpt = cpt + 1;

		}
	}
}
