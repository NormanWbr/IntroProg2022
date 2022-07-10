package alternatives;

import java.util.Scanner;

public class DecomposeArgent {

	public static void main(String[] args) {

		int somme,reste;

		System.out.println("Entrez la somme à décomposer :");
		somme=(new Scanner(System.in)).nextInt();

		if (somme >= 500) {

			reste = somme % 500;
			System.out.println("Vous avez " + (somme - reste)/500 + " billets de 500€");
			somme = reste;
		}
		if (somme >= 200) {

			reste = somme % 200;
			System.out.println("Vous avez " + (somme - reste)/200 + " billets de 200€");
			somme = reste;
		}

		if (somme >= 100) {

			reste = somme % 100;
			System.out.println("Vous avez " + (somme - reste)/100 + " billets de 100€");
			somme = reste;
		}

		if (somme >= 50) {

			reste = somme % 50;
			System.out.println("Vous avez " + (somme - reste)/50 + " billets de 50€");
			somme = reste;
		}

		if (somme >= 20) {

			reste = somme % 20;
			System.out.println("Vous avez " + (somme - reste)/20 + " billets de 20€");
			somme = reste;
		}

		if (somme >= 10) {

			reste = somme % 10;
			System.out.println("Vous avez " + (somme - reste)/10 + " billets de 5€");
			somme = reste;
		}

		if (somme >= 5) {

			reste = somme % 5;
			System.out.println("Vous avez " + (somme - reste)/5 + " billets de 5€");
			somme = reste;
		}
		
		if (somme >= 2) {

			reste = somme % 2;
			System.out.println("Vous avez " + (somme - reste)/2 + " pièces de 2€");
			somme = reste;
		}
		
		if (somme >= 1) {

			reste = somme % 1;
			System.out.println("Vous avez " + (somme - reste)/1 + " pièces de 1€");
			somme = reste;
		}
		


	}


}


