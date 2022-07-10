package tableau;

import java.util.Random;
import java.util.Scanner;

public class ZeroALaFinCaca {

	public static void main(String[] args) {

		int i;
		int tab[] = new int[10];

		for (i=0;i<tab.length;i++) {

			do {
				System.out.println("Entrez 10 chiffres entre 0 et 5 :");
				tab[i] = new Scanner(System.in).nextInt();
			} while (tab[i]<0 || tab[i]>5);
		}

		for (i=0;i<tab.length;i++) {

			System.out.print(tab[i] + "\t");

		}

		for (i=0;i<tab.length;i++) {

			if (tab[i]==0) {
				tab[i] = tab[tab.length-i-1];
				tab[tab.length-i-1] = 0;
			}

		}
		
		System.out.println();
		for (i=0;i<tab.length;i++) {
			System.out.print(tab[i] + "\t");

		}

	}

}
