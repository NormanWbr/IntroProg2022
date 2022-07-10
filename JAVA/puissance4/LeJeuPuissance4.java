package puissance4;

import java.util.Scanner;

public class LeJeuPuissance4 {

	public static void main(String[] args) {

		char tab[][] = new char [6][7];
		int position[] = new int [2];
		
		char joueur;

		int col,j,nb;

		boolean suivant = true;
		
		boolean gagne;

		System.out.println("====================================");
		System.out.println("Bienvenue dans le jeu Puissance 4 !");
		System.out.println("====================================");

		//Boucle temps que le joueur rejoue
		do {
			
			int cpt = 0;
			boolean fini = false;

			//Procédure pour remplir le tableau de 0
			prcdfct.remplir(tab);

			//Procédure pour dessiner le tableau et l'afficher
			prcdfct.dessin(tab);

			//Boucle temps que la partie est en cours
			do {
				//Procédure pour jouer
				prcdfct.jouer(tab, 'O', position);
				cpt++;
				joueur = 'O';

				//Procédure pour dessiner le tableau et l'afficher
				prcdfct.dessin(tab);

				//Verifie si le joueur a gagné
				gagne = prcdfct.verif(tab, 'O', position);

				if (!gagne) {
					
					//Procédure pour jouer
					prcdfct.jouer(tab, 'X', position);
					cpt++;
					joueur = 'X';

					//Procédure pour dessiner le tableau et l'afficher
					prcdfct.dessin(tab);

					//Verifie si le joueur a gagné
					gagne = prcdfct.verif(tab, 'X', position);

				}
				
				//Affiche terminé si tableau remplis
				if (cpt == 42 && !gagne) {
					System.out.println("Le tableau est remplis!");
				}
				
				//Affiche gagné si gagnant
				if (gagne) {
					System.out.println("Le joueur " + joueur + " a gagné!");
					fini = true;
				}

			} while (!fini && cpt != 42);
			
			//Verifie si le joueur veux rejouer
			System.out.println("Voulez vous rejouer?" +"\n1: Oui" +"\n2: Non");
			nb = new Scanner(System.in).nextInt();

			if (nb == 2) {
				suivant = false;
			}

		} while (suivant);
		
		System.out.println("Le jeu est terminé");

	}
}
