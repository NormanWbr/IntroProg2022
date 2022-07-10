package alternatives;

import java.util.Scanner;

public class MinMaxTroisNombres {

	public static void main(String[] args) {

		int a,b,c,temp;
		String op2 = "<";
		String op1 = "<";
		
		System.out.println("Entrez 3 nombres à comparer");
		a=(new Scanner(System.in)).nextInt();
		b=(new Scanner(System.in)).nextInt();
		c=(new Scanner(System.in)).nextInt();

		if (a > b) {
			
			temp = a;
			a = b;
			b = temp;
			
		}
		
		if (b > c) {
			
			temp = b;
			b = c;
			
			c = temp;
			
			if (a > b) {
				
				temp = a;
				a = b;
				b = temp;
				
			}
			
		}
		
		if (a == b) {
		
			op1 = "=";
			
	}
		
		if (b == c) {
			
			op2 = "=";
			
		}
System.out.println(a + op1 + b + op2 + c);		
	}

}

