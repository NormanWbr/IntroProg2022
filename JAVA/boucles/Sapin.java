package boucles;

import java.util.Scanner;

public class Sapin {

	public static void main(String[] args) {

		int nbr,cpt1,cpt2,cpt3;
		String etl = "*";
		cpt3 = 1;
				
		System.out.println("Entrez la grandeur de vos beaux dessins");
		nbr=(new Scanner(System.in)).nextInt();
		
		
		//demi-sapin
		for(cpt1=1;cpt1 <= nbr;cpt1++) {
			
			System.out.println();
			
			for(cpt2=1;cpt2<=cpt3;cpt2++) {
				
				System.out.print(etl);
				
			}
			
			cpt3 = cpt3 + 1;
			
		}
		
		//demi-sapin
		

	}

}
