package alternatives;

import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {

		int ope,nb1,nb2;

		System.out.println("1: Addition, 2: Soustraction, 3: Multiplication, 4:Division : ");
		ope=(new Scanner(System.in)).nextInt();

		if (ope >= 1 && ope <= 4) {

			System.out.println("Entre votre premier nombre");
			nb1=(new Scanner(System.in)).nextInt();
			System.out.println("Entre votre deuxième nombre");
			nb2=(new Scanner(System.in)).nextInt();
			if (ope == 1){

				System.out.println("Votre somme est : " + nb1 + " + " + nb2 + " = " + (nb1+nb2));

			}

			else {

				if (ope == 2 ){

					System.out.println("Votre soustraction est : " + nb1 + " - " + nb2 + " = " + (nb1-nb2));

				}

				else {

					if (ope == 3) {

						System.out.println("Votre multiplication est : " + nb1 + " * " + nb2 + " = " + (nb1*nb2));

					}

					else {

						if (nb2 != 0) {
							System.out.println("Votre division est : " + nb1 + " / " + nb2 + " = " + (nb1/nb2));
						}

						else {

							System.out.println("Impossible");
						}

					}

				}

			}


		}

		else {

			System.out.println("Pas de choix possible pour ce chiffre");


		}

	}

}
