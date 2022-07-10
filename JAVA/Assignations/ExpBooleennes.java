package Assignations;

import java.util.Scanner;

public class ExpBooleennes {

	public static void main(String[] args) {
		
		int nbr;
		
		System.out.println("Entrez un nombre entier:");
		nbr=(new Scanner(System.in)).nextInt();
		
		System.out.println(nbr + " est compris entre 5 et 10 " + (nbr>=5 & nbr <=10));
		System.out.println(nbr + " est compris entre 5 et 99, et est différent de 10 " + (nbr>=5 & nbr <=99 & nbr != 10));
		System.out.println(nbr + " est pas compris entre 6 et 85 " + (nbr<6 || nbr>85));
		System.out.println(nbr + " est compris entre 1 et 18 ou entre 65 et 90 " + ((nbr>=1 & nbr <=18) || (nbr>=65 & nbr <=90)));
		System.out.println(nbr + " est une année bissextile " + ((nbr%400 == 0) || (nbr%4 == 0) & (nbr%100!=0)));
	}

}
