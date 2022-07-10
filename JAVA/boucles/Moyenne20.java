package boucles;

import java.util.Scanner;

public class Moyenne20 {

	public static void main(String[] args) {

		int cpt1=0,cpt2=0;
		double nbr, somme=0;
		
		while (cpt1 < 5) {
			
			System.out.println("Entrez un nombre");
			nbr=(new Scanner(System.in)).nextInt();
			cpt1 = cpt1 + 1;
			if (nbr >= 10 && nbr <=20) {
				
				somme = somme + nbr;
				cpt2 = cpt2 + 1;
				
			}
			
		}

		if (cpt2 !=0) {
			
			System.out.println("La moyenne est de : " + (somme/cpt2));
			
		}
		
		else {
			
			System.out.println("Pas de nombres entre 10 et 20");
			
		}
		
	}

}
