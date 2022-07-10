package tableau;

import java.util.Scanner;

public class DoubleNombre {

	public static void main(String[] args) {

		int tab[] = new int[10];
		int i;

		for (i=0;i<tab.length;i++) {

			System.out.println("Entrez un nombre tant qu'on vous le demande");
			tab[i] = new Scanner(System.in).nextInt();

		}
		for (i=0;i<tab.length;i++) {

			System.out.print(tab[i] + " ");

		}
		System.out.println();
		for (i=0;i<tab.length;i++) {

			tab[i] = tab[i] * 2;
			System.out.print(tab[i] + " ");

		}

	}

}
