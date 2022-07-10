package tableau2;

import java.util.Random;

public class SommeColonne {

	public static void main(String[] args) {

		int l,c;
		int somme1=0,somme2=0;
		int tab[][] = new int[3][4];
		Random r=new Random();

		for (l=0;l<tab.length;l++) {
			for (c=0;c<tab[0].length;c++) {

				
				tab[l][c] = r.nextInt(100);
				System.out.print(tab[l][c] + "\t");
				
				if (l==c) {

					somme1 = somme1 + 	tab[l][c];

				}

				if ((l+c) == 4) {

					somme2 = somme2 + 	tab[l][c];

				}
			}
			System.out.println();
		}
		
		System.out.println(somme1);
		System.out.println(somme2);
	}
}
