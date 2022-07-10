package Assignations;

import java.util.Scanner;

public class CercleCirconferenceAire {

	public static void main(String[] args) {
		
		double r;
		
		System.out.println("Entrez le rayon de votre cercle :");
		r=(new Scanner(System.in)).nextDouble();
		
		System.out.println("La circonférence de votre cercle est 2 * pi * " + r + " = " + (2*Math.PI*r));
		System.out.println("L'aire de votre cercle est pi * " + r + "²" + " = " + Math.PI*(r*r));

	}

}
