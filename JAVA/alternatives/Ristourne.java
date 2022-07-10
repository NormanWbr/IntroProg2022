package alternatives;

import java.util.Scanner;

public class Ristourne {

	public static void main(String[] args) {

		int eft;
		double mnt;
		
			System.out.println("Entrez le montant de vos achats : ");
			mnt=(new Scanner(System.in)).nextDouble();
			System.out.println("Combien avez vous d'enfants : ");
			eft=(new Scanner(System.in)).nextInt();
			
			if ((mnt > 50 && eft >= 3) || (mnt > 100)) {
				
				System.out.println("Vous devez payer : " + (mnt*0.9));
				
			}
			
			else {
				
				System.out.println("Vous devez payer : " + (mnt*0.95));
				
			}
	}

}
