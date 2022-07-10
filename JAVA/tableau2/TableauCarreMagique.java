package tableau2;

import java.util.Scanner;

public class TableauCarreMagique {

	public static void main(String[] args) {

		int l,c,etalon=0,somme=0,sommeb=0;
		int tab[][] = new int[3][3];
		boolean carre = true;

		System.out.println("Entrez des nombres pour faire un carré magique");

		//REMPLIR LE TABLEAU
		for (l=0;l<tab.length;l++) {
			for (c=0;c<tab[0].length;c++) {
				tab[l][c] = new Scanner(System.in).nextInt();
			}
		}

		//CALCULER L'ETALON POUR LES COMPARAISONS
		for (c=0;c<tab.length;c++) {
			etalon = etalon + tab[0][c];
		}

		//CALCULER ET COMPARER LES LIGNES AVEC L'ETALON
		while (l<tab.length-1 && carre) {
			for (c=0;c<tab.length;c++) {
				somme = somme + tab[l][c];
			}
			if (etalon != somme) {

				carre = false;
			}
			somme = 0;
			l++;
		}

		c=0;

		//CALCULER ET COMPARER LES COLONNES AVEC L'ETALON
		while (c<tab[0].length-1 && carre) {
			for (l=0;l<tab.length;l++) {
				somme = somme + tab[l][c];
			}
			if (somme != etalon) {
				carre = false;
			}
			somme = 0;
			c++;
		}

		l=0;

		//CALCULER ET COMPARER LES DIAGONALES AVEC L'ETALON
		while (l<tab.length && carre) {
			somme = somme + tab[l][c];
			sommeb = sommeb + tab[l][tab.length-1-l];
			l++;
		}
		if (somme != etalon || sommeb != etalon) {
			carre = false;
		}

		//AFFICHER LE TABLEAU
		for (l=0;l<tab.length;l++) {
			for (c=0;c<tab[0].length;c++) {
				System.out.print(tab[l][c] + "\t");;
			}
			System.out.println();
		}

		//AFFICHER SI CARRE MAGIQUE OU PAS
		if (carre) {
			System.out.println("Le carré est magique");
		}
		else {
			System.out.println("Le carré est pas magique");
		}
	}
}
