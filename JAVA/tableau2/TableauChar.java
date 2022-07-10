package tableau2;

import java.util.Scanner;

public class TableauChar {

	public static void main(String[] args) {

		int c,l;
		char [][] tab= {{'a','a','a','a'},{'b','b','b','b'},{'c','c','c','c'},{'d','d','d','d'},{'e','e','e','e'}};
		char let;
		
		for (l=0;l<tab.length;l++) {
			for (c=0;c<tab[0].length;c++) {
				
				System.out.print(tab[l][c]);
				
			}
			System.out.println();
		}
		
		System.out.println("Entrez un caractère à remplacer : ");
		let = new Scanner(System.in).nextLine().charAt(0);
		
		for (l=0;l<tab.length;l++) {
			for (c=0;c<tab[0].length;c++) {
				
				if (l==0) {
					
					tab[l][c] = let;
					
				}
				
				if (c==1 || c ==3) {
					
					tab[l][c] = let;
					
				}
				
				System.out.print(tab[l][c]);
				
			}
			System.out.println();
		}	

	}

}
