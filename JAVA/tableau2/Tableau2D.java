package tableau2;

import java.util.Scanner;

public class Tableau2D {

	public static void main(String[] args) {

		int l,c;
		int tab[][] = new int[10][20];

		System.out.println("Entrez des nombres temps qu'on vous le demande");
		System.out.println();

		for (l=0;l<tab.length;l++) {
			for (c=0;c<tab[0].length;c++) {
				
				do {

					tab[l][c] = new Scanner(System.in).nextInt();

				} while (tab[l][c] < 10 || tab[l][c] > 20);
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

