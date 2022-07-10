package jeux;

import java.util.Scanner;

public class PileOuFace {

	public static void main(String[] args) {

		int choix = 0;
		int tab [] = new int [6];
		boolean fin = false;

		System.out.println("Bienvenue dans le jeu Pile ou Face");

		do {
			
			System.out.println("1: Réinitialiser");
			System.out.println("2: Jouer");
			System.out.println("3: Afficher les statistiques");
			System.out.println("4: Quitter le programme");
			System.out.println("*******************************************************");
			
			choix = 0;
			choix = new Scanner(System.in).nextInt();
		 
		switch (choix) {

		case 1:
			utils.reinit(tab);
			break;
		case 2:
			utils.jouer(tab);
			break;
		case 3:
			utils.stats(tab);
			break;
		case 4:
			System.out.println("Vous avez choisi de quitter le programme");
			fin = true;
			break;
		default:
			System.out.println("Vous n'avez fait aucun choix possible");
			System.out.println("*******************************************************");
		}
		
		} while (!fin);

	}

}
