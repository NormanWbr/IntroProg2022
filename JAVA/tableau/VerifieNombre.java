package tableau;

import java.util.Scanner;

public class VerifieNombre {

	public static void main(String[] args) {

		boolean trouve = false;
		int i,nbr;
		int tab[] = new int[2];

		for (i=0;i<tab.length;i++) {

			System.out.println("Entrez 10 nombres à la suite :");
			tab[i] = new Scanner(System.in).nextInt();

		}


		do {

			System.out.println("Entrez un nombre à trouver");
			nbr=new Scanner(System.in).nextInt();

			for (i=0;i<tab.length && !trouve;i++) {

				if (tab[i] == nbr){

					trouve = true;
					System.out.println("Trouvé à la position : " + i);

				}

			}

			if (!trouve) {
				
				System.out.println("Pas trouvé! Recommence!");
				
			}

			
		} while (!trouve);

	}

}
