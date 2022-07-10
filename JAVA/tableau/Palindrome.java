package tableau;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		int i;
		boolean pala = true;
		String mot="";
		
		System.out.println("Entrez votre mot : ");
		mot = new Scanner(System.in).nextLine().toLowerCase();
		
		char[] tabCar = mot.toCharArray();
		
		for (i=0;i<tabCar.length/2 && pala;i++) {
			
			if (tabCar[i] != tabCar[tabCar.length-i-1]) {
				
				pala = false;
				
			}
			
		}
		
		if (pala) {
			
			System.out.println("Pala");
			
		}
		
		else {
			
			System.out.println("Pas pala");
			
		}

	}

}
