package boucles;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {

		int cptmin=0,min,cptmax=0,max,nbr;

		System.out.println("0:Sortie, Entrez des nombres : ");
		nbr=(new Scanner(System.in)).nextInt();
		max = nbr;
		min = nbr;

		do {

			if (nbr >= max && nbr!=0) {

				if (max == nbr) {

					cptmax = cptmax + 1;

				}

				else {

					max = nbr;
					cptmax = 0;
					cptmax = cptmax + 1;

				}	


			}

			if (nbr <= min && nbr!=0) {

				if (min == nbr) {

					cptmin = cptmin + 1;

				}

				else {
					min = nbr;
					cptmin = 0;
					cptmin = cptmin + 1;

				}	


			}

			System.out.println("0:Sortie, Entrez des nombres : ");
			nbr=(new Scanner(System.in)).nextInt();


		} while (nbr != 0);
		if (max !=0 && min != 0) {
			System.out.println("Le plus grand nombre est " + max + " qui est aparru " + cptmax + " fois");
			System.out.println("Le plus petit nombre est " + min + " qui est aparru " + cptmin + " fois");
		}

	}
}
