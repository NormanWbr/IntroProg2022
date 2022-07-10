package boucles;

import java.util.Scanner;

public class Intervalle {

	public static void main(String[] args) {

		int nbr1,nbr2,temp,somme=0;

		System.out.println("Donnez moi 2 nombre supérieur à 0 : ");
		nbr1=(new Scanner(System.in)).nextInt();
		nbr2=(new Scanner(System.in)).nextInt();

		if (nbr1 <=0 || nbr2 <= 0) {

			System.out.println("On a dit supérieur à 0");

		}

		else {

			if (nbr1 == nbr2){

				System.out.println("Egalité");

			}

			else {

				if (nbr1 > nbr2) {
					temp = nbr2;
					nbr2 = nbr1;
					nbr1 = temp;

				}



				while (nbr1 <= nbr2){

					somme = somme + nbr1;
					nbr1 = nbr1 + 1;

				}

				System.out.println(somme);

			}

		}

	}
}
