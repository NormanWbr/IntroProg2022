package Assignations;

import java.util.Scanner;

public class Calculs {

	public static void main(String[] args) {

		int nbr1,nbr2;

		System.out.println("Entrez 1 nombres");
		nbr1=(new Scanner(System.in)).nextInt();
		System.out.println("Entrez 1 nombres");
		nbr2=(new Scanner(System.in)).nextInt();

		System.out.println("La somme de " + nbr1 + " + " + nbr2 + " est égal à " + (nbr1+nbr2));
		System.out.println("La différence de " + nbr1 + " - " + nbr2 + " est égal à " + (nbr1-nbr2));
		System.out.println("La produit de " + nbr1 + " x " + nbr2 + " est égal à " + (nbr1*nbr2));


		System.out.println();

	}

}
