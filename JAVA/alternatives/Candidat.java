package alternatives;

import java.util.Scanner;

public class Candidat {

	public static void main(String[] args) {

		int age;
		String prenom;

		System.out.println("Entrez votre pr�nom :");
		prenom=(new Scanner(System.in)).nextLine();
		System.out.println("Entrez votre �ge :");
		age=(new Scanner(System.in)).nextInt();

		if ((prenom.equalsIgnoreCase("Isabelle"))){

			System.out.println("Vous n'�tes pas s�l�ctionn�");

		}

		else {

			if(age > 50 || age < 20) {

				System.out.println("Vous n'�tes pas concern�");

			}

			else{


				if ((age < 31 && age > 19) && (age != 25 && age != 26)){

					System.out.println("Formation A");

				}

				else {

					if ((age < 51 && age > 30) && !(age < 48 && age > 39)){

						System.out.println("Formation B");


					}

					else {

						System.out.println("Formation C");

					}

				}



			}



		}

	}

}
