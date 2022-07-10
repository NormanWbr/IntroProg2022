package tableau;

import java.util.Random;
import java.util.Scanner;

import utils.Vecteur;

public class Tri {

	public static void main(String[] args) {
		
		int tab[] = new int[10];
		
		//Vecteur.remplir(tab);
		Vecteur.remplirRandom(tab);
		Vecteur.affiche(tab);
		System.out.println();
		Vecteur.trier(tab);
		Vecteur.affiche(tab);

	}

}
