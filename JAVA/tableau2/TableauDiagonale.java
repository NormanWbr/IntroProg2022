package tableau2;

import java.util.Scanner;

public class TableauDiagonale {

	public static void main(String[] args) {

		int l,c,taille,nbr;
		System.out.println("Entrez la taille de votre tableau carré : ");
		taille = new Scanner(System.in).nextInt();
		int tab[][] = new int[taille][taille];

		System.out.println("Entrez le nombre pour remplir le tableau : ");
		nbr = new Scanner(System.in).nextInt();

		for (l=0;l<tab.length;l++) {
			for (c=0;c<tab[0].length;c++) {

				tab[l][c] = nbr;

				if (l == c || (l + c) == 4) {

					tab[l][c] = 0;

				}

			}
		}

		for (l=0;l<tab.length;l++) {
			for (c=0;c<tab[0].length;c++) {
				System.out.print(tab[l][c] + "\t");
			}
			System.out.println();
		}

	}

}
