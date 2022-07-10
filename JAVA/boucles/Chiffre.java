package boucles;

import java.util.Scanner;

public class Chiffre {

	public static void main(String[] args) {

		int nbr;

		do {

			System.out.println("Entrez 0,1,2 ou 3 : ");
			nbr=(new Scanner(System.in)).nextInt();


		} while (nbr != 0 && nbr !=1 && nbr !=2 && nbr !=3); //ou } while (nbr < 0 || nbr >3);

		System.out.println("Au revoir!"); 

	}

}
