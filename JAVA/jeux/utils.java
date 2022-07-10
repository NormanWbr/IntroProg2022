package jeux;

import java.util.Random;
import java.util.Scanner;

public class utils {

	public static void jouer(int[] tab) {

		int choix,nb,nbcons = 0;
		boolean fin = false;
		boolean cons = false;

		System.out.println("Vous avez choisi de jouer");
		System.out.println("*******************************************************");

		do {

			do {
				System.out.println("Choisi ta face :");
				System.out.println("1:Pile");
				System.out.println("2:Face");
				System.out.println("*******************************************************");
				choix = new Scanner(System.in).nextInt();
			} while (choix !=1 && choix != 2);

			if (choix == 1) {
				System.out.println("Vous avez choisi Pile !");
				System.out.println("*******************************************************");
			}
			else {
				System.out.println("Vous avez choisi Face !");
				System.out.println("*******************************************************");
			}

			tab[0]++;
			nb = pileface();

			if  (nb == 1) {
				tab[2]++;
			}
			else {
				tab[3]++;
			}

			if (choix == nb) {

				System.out.println("Vous avez trouv�!");
				System.out.println("*******************************************************");
				nbcons++;
				tab[1]++;

			}
			else {
				System.out.println("Vous n'avez pas trouv� !");
				System.out.println("*******************************************************");
				nbcons = 0;
			}
			
			if (nbcons > tab[5]) {
				tab[5] = nbcons;
			}



			choix = 0;

			do {
				System.out.println("Voulez vous continuer ?");
				System.out.println("1:Oui");
				System.out.println("2:Non");
				System.out.println("*******************************************************");
				choix = new Scanner(System.in).nextInt();
			} while (choix !=1 && choix != 2);

			if (choix == 2) {
				fin = true;
				System.out.println("Vous avez fini !");
				System.out.println("*******************************************************");
			}
			else {
				System.out.println("Vous continuez !");
				System.out.println("*******************************************************");
				
			}


		} while (!fin);

	}



	public static void reinit(int[] tab) {

		int i;
		
		System.out.println("Vous avez choisi de r�initialiser vos donn�es");
		System.out.println("*******************************************************");
		
		if (tab[0] > 0) {
			
			for (i=0;i<tab.length;i++) {
				tab[i] = 0;
			}
			
			System.out.println("Donn�es r�initalis�es !");
			System.out.println("*******************************************************");
			
		}
		
		else {
			System.out.println("Vous n'avez jamais jou� ! Impossible de r�initialiser vos donn�es !");
			System.out.println("*******************************************************");
		}

	}

	public static void stats(int[] tab) {

		System.out.println("Vous avez choisi d'afficher vos statistiques");
		System.out.println("*******************************************************");

		if (tab[1] > 0) {

			System.out.println("Vous avez jou� : " + tab[0] + " fois !");
			System.out.println("Vous avez jou� et r�ussi : " + tab[1] + " fois !");
			System.out.println("Le pourcentage de r�ussite est : " + ((tab[1]*100)/tab[0]) + " %");
			System.out.println("Le pourcentage de Pile est : " + ((tab[2]*100)/tab[0]) + " %");
			System.out.println("Le pourcentage de Face est : " + ((tab[3]*100)/tab[0]) + " %");
			System.out.println("Le nombre de r�ussites cons�cutives est : " + tab[5]);
			System.out.println("*******************************************************");

		}

		else {
			System.out.println("Vous n'avez pas encore jou� !");
			System.out.println("*******************************************************");
		}


	}

	public static int pileface() {

		int pf;

		Random r = new Random();

		pf = r.nextInt(1,3);

		if (pf == 1) {
			System.out.println("La pi�ce est tomb�e sur Pile !");
			System.out.println("*******************************************************");
		}
		else {
			System.out.println("La pi�ce est tomb�e sur Face !");
			System.out.println("*******************************************************");
		}


		return pf;


	}

}
