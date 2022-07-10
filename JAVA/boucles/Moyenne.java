package boucles;

import java.util.Scanner;

public class Moyenne {

	public static void main(String[] args) {

		double nbr,somme=0,cpt=0;
		
		do {
			
			System.out.println("0:Sortie, Donnez nous des nombres : ");
			nbr=(new Scanner(System.in)).nextInt();
			
			if (nbr != 0) {
				
				somme = somme + nbr;
				cpt++;
				
			}
			
		} while (nbr != 0);
		
		if (cpt != 0) {
			
			System.out.println("La moyenne est " + (somme/cpt));
			
		}
		
		else {
			
			System.out.println("Pas de nombres");
			
		}
		
	}

}
