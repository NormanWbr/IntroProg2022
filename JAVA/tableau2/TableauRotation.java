package tableau2;

import java.util.Random;

public class TableauRotation {

	public static void main(String[] args) {

		int l,c;
		int tab[][] = new int[3][3];
		Random r=new Random();
		
		//REMPLIR AUTOMATIQUEMENT LE TABLEAU
		System.out.println("Remplissage automatique du tableau ...");
		for (l=0;l<tab.length;l++) {
			for (c=0;c<tab[0].length;c++) {
				tab[l][c]=r.nextInt(100);
			}
		}
		
		//AFFICHER LE TABLEAU
		for (l=0;l<tab.length;l++) {
			for (c=0;c<tab[0].length;c++) {
				System.out.print(tab[l][c] + "\t");;
			}
			System.out.println();
		}
		
		//APPLIQUER LA ROTATION
		System.out.println("Rotation du tableau ...");
		for (l=0;l<tab.length;l++) {
			for (c=0;c<tab[0].length;c++) {
				
			}
		}
		
		//AFFICHER LE TABLEAU AVEC ROTATION
		for (l=0;l<tab.length;l++) {
			for (c=0;c<tab[0].length;c++) {
				System.out.print(tab[l][c] + "\t");;
			}
			System.out.println();
		}
	}
}
