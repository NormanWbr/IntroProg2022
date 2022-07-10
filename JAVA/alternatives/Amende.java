package alternatives;

import java.util.Scanner;

public class Amende {

	public static void main(String[] args) {

		int vit,lim,dif;

		System.out.println("Entrez la limitation de vitesse : ");
		lim=(new Scanner(System.in)).nextInt();
		System.out.println("Entrez votre vitesse : ");
		vit=(new Scanner(System.in)).nextInt();
		dif = vit-lim;	
		if (dif > 0 && dif <= 20) {

			System.out.println("Amende de 50€ dans tes dents");

		}

		else {

			if (dif > 20 && dif <= 30) {

				System.out.println("Amende de 100€ dans tes dents");

			}

			else {

				if (dif > 30 && dif <= 50) {

					System.out.println("Amende de 200€ dans tes dents");

				}

				else {

					if (dif > 50) {

						System.out.println("Plus de permis le looser");

					}

					else {

						System.out.println("Tu as encore ton permis le winner");

					}

				}

			}

		}

	}





}

