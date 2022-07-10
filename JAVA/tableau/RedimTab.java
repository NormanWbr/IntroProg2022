package tableau;

import java.util.Scanner;

public class RedimTab {

	public static void main(String[] args) {

		int i,cpt=0,cpt2=0;
		int avant[] = new int[10];
		
		for (i=0;i<avant.length;i++) {

			do {
				System.out.println("Entrez 10 chiffres entre 0 et 5 :");
				avant[i] = new Scanner(System.in).nextInt();
			} while (avant[i]<0 || avant[i]>5);
		}
		
		for (i=0;i<avant.length;i++) {

			System.out.print(avant[i] + "\t");
			if (avant[i] != 0) {
				
				cpt2++;
				
			}
			
			
		}
		
		int apres[] = new int[cpt2];
		
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
