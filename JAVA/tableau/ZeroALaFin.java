package tableau;

import java.util.Scanner;

public class ZeroALaFin {

	public static void main(String[] args) {
		
		int i,cpt=0;
		int avant[] = new int[5];
		int apres[] = new int[5];

		for (i=0;i<avant.length;i++) {

			do {
				System.out.println("Entrez 10 chiffres entre 0 et 5 :");
				avant[i] = new Scanner(System.in).nextInt();
			} while (avant[i]<0 || avant[i]>5);
		}
		
		for (i=0;i<avant.length;i++) {

			System.out.print(avant[i] + "\t");

		}

		for (i=0;i<avant.length;i++) {

			if (avant[i] != 0) {
				
				apres[cpt] = avant[i];
				cpt++;
				
			}

		}
		
		System.out.println();
		
		for (i=0;i<apres.length;i++) {

			System.out.print(apres[i] + "\t");

		}
		
	}

}
