package alternatives;

import java.util.Scanner;

public class PlusGrand {

	public static void main(String[] args) {

		int nbr1,nbr2;

		System.out.println("Entrez le premier nombre :");
		nbr1=(new Scanner(System.in)).nextInt();
		System.out.println("Entrez le deuxieme nombre :");
		nbr2=(new Scanner(System.in)).nextInt();

		if(nbr1 < nbr2) {

			System.out.println(nbr1 + " est plus petit que " + nbr2);

		}
		else {

			if(nbr1 > nbr2) {

				System.out.println(nbr2 + " est plus petit que " + nbr1);

			} else

			{

				System.out.println(nbr1 + " est égal à " + nbr2 );

			}

		}

	}

}
