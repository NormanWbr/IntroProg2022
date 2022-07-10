package boucles;

import java.util.Scanner;

public class Choix {

	public static void main(String[] args) {

		int nbr;
		String choix1="",choix2="",fin="oui";

		while (fin.equalsIgnoreCase("Oui")) {
			
			System.out.println("1: Mademoiselle, 2:Madame, 3:Monsieur");
			nbr=(new Scanner(System.in)).nextInt();

			if (nbr <=3 && nbr >= 1) {

				if (nbr == 1){

					choix1 = "Mademoiselle";

				}

				else {

					if (nbr == 2) {

						choix1 = "Madame";

					}

					else {

						choix1 = "Monsieur";

					}

				}

			}

			else {

				System.out.println("Pas de choix possible");

			}		

			if (nbr <=3 && nbr >= 1) {

				System.out.println("1: Matin, 2:Après-midi, 3:Soirée");
				nbr=(new Scanner(System.in)).nextInt();

				if (nbr <=3 && nbr >= 1) {

					if (nbr == 1 ) {

						choix2 = "Bonjour";

					}

					else {

						if (nbr == 2) {

							choix2 = "Bon après-midi";

						}

						else {

							if(nbr == 3) {

								choix2 = "Bonsoir";

							}

						}

					}

				}

				else {

					System.out.println("Pas de choix possible");

				}


			}
			
			System.out.println(choix2 + " " + choix1);

			System.out.println("Voulez vous continuer? Oui/Non");
			fin=(new Scanner(System.in)).nextLine();

		}

		
		System.out.println("fin");
		
	}

}
