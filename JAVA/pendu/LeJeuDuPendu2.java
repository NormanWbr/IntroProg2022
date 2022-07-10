package pendu;

import java.util.Random;
import java.util.Scanner;

public class LeJeuDuPendu2 {

	public static void main(String[] args) {
		//Création d'un tableau pré-remplis
		String liste[] = {"pomme","poire","banane","orange","abricot","clementine","ananas","fraise","kiwi"};
		//Création d'une variable aléatoire
		Random r=new Random();
		//Création de différentes variables
		int nb=0;
		int i;
		int essai = 0;

		boolean fin = false;
		boolean stop = false;
		boolean trouve = false;

		String mot;

		char lettre;

		//Boucle pour le jeu
		do {
			
			nb=0;
			essai = 0;

			stop = false;
			trouve = false;

			//choisi un mot aléatoire et le tranforme en vecteur
			mot = liste[r.nextInt(liste.length)];
			
			//Affiche le mot pour le debug
			System.out.println(mot);
			
			char[] pendu = mot.toCharArray();
			char cherche[] = new char[mot.length()];

			System.out.println("Le mot a été sélectionné !");
			//Remplis le vecteur de _
			for (i=0;i<cherche.length;i++) {
				cherche[i] = '_';
				System.out.print(cherche[i] + " ");
			}

			//Boucle pour le mot
			do {
				//Recupere une lettre par l'utilisateur
				System.out.println("Entrez une lettre pour deviner le mot");
				lettre = new Scanner(System.in).nextLine().charAt(0);
				lettre=Character.toLowerCase(lettre);

				//Verifie si une lettre est dans le vecteur
				for (i=0;i<cherche.length;i++) {
					if (lettre == pendu[i]) {
							cherche[i] = pendu[i];
							trouve = true;
					}
				}
				
				//Compte le nobmre de lettres trouvées
				for (i=0;i<cherche.length;i++) {
					if (cherche[i] != '_') {
						nb++;
					}
				}
				
				//Reset le cpt si les lettres n'omt pas toutes été trouvées
				if (nb != cherche.length) {
					nb = 0;
				}
				
				//Ne rentre pas si une lettre a ete trouvee
				if (trouve == false) {
					essai++;
					System.out.println("La lettre n'est pas dans le mot");
				}
				else{
					System.out.println("La lettre était dans le mot");
				}
				
				dessin.pendu(essai);
				
				//Affiche le vecteur avec lettre trouvee
				for (i=0;i<cherche.length;i++) {
					System.out.print(cherche[i] + " ");
				}
				
				System.out.println();
				//Ajoute +1 si l'utilisateur a donne une mauvaise lettre et l'affiche
				if (essai == 6) {
					fin = true;
					System.out.println("Vous n'avez pas trouvé");
				}
				
				//Verifie si toutes les lettes ont été trouvée
				if (nb == cherche.length) {
					System.out.println("Vous avez trouvé le bon mot");
					dessin.victoire();
					fin = true;
				}
				trouve = false;
			} while (!fin);
			
			//Affiche le mot qui devais etre trouve
			System.out.println("Le mot était " + mot);
			essai=0;

			//Boucle pour obliger a entrer 1 ou 2
			do {
				System.out.println("Voulez vous continuez de jouer ?" + "/n1:Oui" + "/n2:Non");
				nb = new Scanner(System.in).nextInt();
			} while (nb != 1 && nb != 2);
			
			//Sort de la boucle si choix est 2
			if (nb == 2) {
				stop = true;
			}
			fin = false;
		} while (!stop);
		System.out.println("Le jeu est terminé !");
	}
}
