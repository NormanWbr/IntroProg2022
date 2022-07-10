package puissance4;

import java.util.Scanner;

public class prcdfct {

	public static void remplir(char [][] tab) {

		for (int l=0;l<tab.length;l++) {
			for (int c=0;c<tab[0].length;c++) {
				tab[l][c] = ' ';
			}
		}
	}

	public static void dessin(char [][] tab) {

		System.out.println();

		for (int l=0;l<tab.length;l++) {
			for (int c=0;c<tab[0].length;c++) {
				System.out.print("|" + tab[l][c]);
			}
			System.out.println("|");
		}
		for (int l=0;l<15;l++) {
			System.out.print("=");
		}
		System.out.println();
		for (int l=1;l<=7;l++) {
			System.out.print("|");
			System.out.print(l);
		}
		System.out.println("|");

		System.out.println();

	}

	public static void jouer(char [][] tab, char p, int [] position) {

		int col;
		boolean pose = false;

		do {
			do {
				System.out.println("Joueur " + p + " entrez votre colonne");
				col = new Scanner(System.in).nextInt();
			} while (col <1 || col > 7);

			for (int i = tab.length-1;i >= 0 && !pose;i--) {
				if (tab[i][col-1] == ' ') {
					tab[i][col-1] = p;
					pose = true;
					position[0] = i;
					position[1] = col-1;
				}
			}
			if (!pose) {
				System.out.println("=================================================");
				System.out.println("/!\\PLUS DE PLACE DANS LA COLONNE RECOMMENCEZ/!\\");
				System.out.println("=================================================");
			}
		} while (!pose);

	}

	public static boolean verif(char [][] tab, char p, int [] position) {

		int l,i,c,cpt=0;
		
		boolean gagne = false;

		//Initialise la position du pion posé
		l = position[0];
		c = position[1];

		//Test les lignes
		for (i=c;i>=0 && tab[l][i] == p;i--) {
				cpt++;
		}

		for (i=c+1;i<tab[0].length && tab[l][i] == p;i++) {
				cpt++;
		}

		//Test les colonnes
		if (cpt < 4) {
			cpt = 0;
			for (i=l;i>=0 && tab[i][c] == p;i--) {
					cpt++;
			}

			for (i=l+1;i<tab.length && tab[i][c] == p;i++) {
					cpt++;

			}

		}

		//Test les diagonales principales
		
		if (cpt < 4) {
			cpt = 0;
			while ( l >= 0 && c >= 0 && tab[l][c]==p) {
					cpt++;
					l--;
					c--;
			}
			l = position[0]+1;
			c = position[1]+1;
			while (l <tab.length && c <tab[0].length && tab[l][c]==p) {
					cpt++;
					l++;
					c++;
			}
		}

		//Test les diagonales secondaires
		
		if (cpt < 4) {
			cpt = 0;
			l = position[0];
			c = position[1];
			while (c>=0 && l < tab.length && tab[l][c]==p) {
					cpt++;
					c--;
					l++;
			}
			l = position[0]-1;
			c = position[1]+1;
			while (c<tab[0].length && l>=0 && tab[l][c]==p) {
					cpt++;
					c++;
					l--;
			}
		}


		//Verifie si 4 pions sont allignés
		if (cpt >= 4) {
			gagne = true;
		}

		return gagne;

	}

}
