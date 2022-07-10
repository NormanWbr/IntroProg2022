package boucles;

import java.util.Scanner;

public class PPCMetPGCD {

	public static void main(String[] args) {

		double div,pgcd,nbr1,nbr2;

		System.out.println("Entrez votre premier nombre");
		nbr1=(new Scanner(System.in)).nextInt();
		System.out.println("Entrez votre deuxième nombre");
		nbr2=(new Scanner(System.in)).nextInt();

		if(nbr1 > nbr2) {

			nbr1=nbr2+nbr1;
			nbr2=nbr1-nbr2;
			nbr1=nbr1-nbr2;
			div = nbr1;

		}

		div = nbr2;


		while (nbr1 % div != 0 || nbr2 % div != 0) {

			div--;

		}

		pgcd = div;
		div = nbr2;
		
		while (nbr2/nbr1 % 1 != 0) {
		
			nbr2 = nbr2 + div;
			
		}

			System.out.println("Le PGCD est : " + pgcd + " le PPCM est : " + nbr2);
	}


}
