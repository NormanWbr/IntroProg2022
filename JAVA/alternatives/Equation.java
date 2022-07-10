package alternatives;

import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {

		double a,b;
		
		System.out.println("Entre la valeur de a");
		a=(new Scanner(System.in)).nextDouble();
		System.out.println("Entre la valeur de b");
		b=(new Scanner(System.in)).nextDouble();
		
		if (a == 0 && b != 0) {
			
			System.out.println("Le calcul est impossible");
			
		}
		else {
			
			if (a == 0 && b == 0){
				
				System.out.println("x est égal à tout");
				
			}
			
			else {
				
				System.out.println("x est égal à " + -b/a);
				
			}
		}
		
	}

}
