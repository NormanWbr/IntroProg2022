package boucles;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {

		double nbr1,nbr2,cpt=0;
		
		System.out.println("Entrez votre premier nombre");
		nbr1=(new Scanner(System.in)).nextInt();
		System.out.println("Entrez votre deuxi�me nombre");
		nbr2=(new Scanner(System.in)).nextInt();
		
		while (nbr1 >= nbr2 && nbr2 !=0) {
			
			nbr1 = nbr1 - nbr2;
			cpt = cpt + 1;
			
		}
		
		if (nbr2 == 0) {
			
			System.out.println("Pas de division par 0");
		}
		
		else {
		
			System.out.println("Le r�sultat de " + nbr1 + "/" + nbr2 + " est �gal � " + cpt);
			
		}
	}

}
