package Assignations;

import java.util.Scanner;

public class Moyenne3Nombres {

	public static void main(String[] args) {

		int nb1,nb2,nb3;

		System.out.println("Entrez 3 nombres pour en faire la moyenne");
		nb1=(new Scanner(System.in)).nextInt();
		nb2=(new Scanner(System.in)).nextInt();
		nb3=(new Scanner(System.in)).nextInt();
		
		System.out.println("La moyenne des nombre " + nb1 + " " + nb2 + " " + nb3 + " est égal à " + ((nb1+nb2+nb3)/3));
		

	}

}
