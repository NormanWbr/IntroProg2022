package alternatives;

import java.util.Scanner;

public class CompareDix {

	public static void main(String[] args) {

		int a,b,temp;

		System.out.println("Donnez moi 2 nombres");
		a=(new Scanner(System.in)).nextInt();
		b=(new Scanner(System.in)).nextInt();

		if (a >= 10 && b >= 10) {

			System.out.println("La somme est : " + (a + b));

		}

		else {

			if (a < 10 && b < 10) {

				System.out.println("La multiplication est : " + (a * b));

			}

			else {

				if (a > b) {

					temp = b;
					b = a;
					a = temp;

				}

			}

		}



		System.out.println("La différence est : " + (b - a));

	}


}

