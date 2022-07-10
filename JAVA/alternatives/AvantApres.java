package alternatives;

import java.util.Scanner;

public class AvantApres {

	public static void main(String[] args) {

		int jour,mois,annee;
		int jourd,moisd,anneed;
		int jourh,moish,anneeh;

		System.out.println("Entrez votre jour de naissance");
		jour=(new Scanner(System.in)).nextInt();
		System.out.println("Entrez votre mois de naissance");
		mois=(new Scanner(System.in)).nextInt();
		System.out.println("Entrez votre année de naissance");
		annee=(new Scanner(System.in)).nextInt();
		
		jourd = jour;
		jourh = jour;
		moisd = mois;
		moish = mois;
		anneed = annee;
		anneeh = annee;

		if ( jour == 28 && mois == 2 && (annee%400 == 0) || ((annee%4 == 0) && (annee%100!=0))){

			jourd = 29;
			moisd = 2;

		}

		else {

			if ((jour == 28 && mois == 2 && (annee%400 != 0) || ((annee%4 != 0) && (annee%100 == 0))) || (jour > 30 && (mois != 2 &&  mois != 12)) || (jour > 29 && mois == 4) || (jour > 29 && mois == 6) || (jour > 29 && mois == 9) || (jour > 29 && mois == 11) || (jour > 28 && mois == 2)){

				jourd = 1;
				moisd = moisd + 1;

			}
			
			else {
				
				if (jour == 31 && mois == 12) {
					
					jourd = 1;
					moisd = 1;
					anneed = anneed + 1;
					System.out.println("test");
					
				}
				
				else {
					
					jourd = jourd + 1;
					
				}
				
			}

		}
		
		System.out.println("Votre date de naissance est " + jour + "/" + mois + "/" + annee);
		System.out.println("La veille de votre date de naissance est " + jourh + "/" + moish + "/" + anneeh);
		System.out.println("Le lendemain de votre date de naissance est " + jourd + "/" + moisd + "/" + anneed);
		
	}

}

