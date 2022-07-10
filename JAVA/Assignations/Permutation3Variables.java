package Assignations;

import java.util.Scanner;

public class Permutation3Variables {

	public static void main(String[] args) {
		
		int a,b,c,temp;
		
		System.out.println("Entrez vos 3 nombres à permuter");	
		a=(new Scanner(System.in)).nextInt();
		b=(new Scanner(System.in)).nextInt();
		c=(new Scanner(System.in)).nextInt();
		
		System.out.println("Vos nombres sont " + a + ", " + b + ", " + c);
		
		temp = c;
		c = b;
		b = a;
		a = temp;
		
		
		System.out.println("Vos nombres sont " + a + ", " + b + ", " + c);
		
	}

}
