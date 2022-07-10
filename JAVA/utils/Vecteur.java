package utils;

import java.util.Random;
import java.util.Scanner;

public class Vecteur {

	//Permet d'afficher un tableau
	
	public static void affiche(int tab[]){
		for(int i=0;i<tab.length;i++){
			System.out.print(tab[i]+"\t");
		}
		System.out.println();
	}

	//Permet de remplir un vecteur aléatoirement
	
	public static void remplirRandom(int tab[]){

		Random r=new Random();

		for(int i=0;i<tab.length;i++){
			tab[i]=r.nextInt(100);
		}
		System.out.println();
	}

	//Permet de faire remplir un vecteur par l'utilisateur
	
	public static void remplir(int tab[]){

		System.out.println("Entrez un nombre temps qu'on vous le demande : ");

		for(int i=0;i<tab.length;i++){
			tab[i]=new Scanner(System.in).nextInt();
		}
		System.out.println();
	}

	//Permet de trier un vecteur
	
	public static void trier(int[] tab){
		int inter, i,j;
		boolean echange;
		j=tab.length -1;
		do{
			echange=false;
			for(i=0; i<=j-1; i++){
				if(tab[i]>tab[i+1]){
					inter=tab[i];
					tab[i]=tab[i+1];
					tab[i+1]= inter;
					echange=true;
				}
			}
			j=j-1;
		} while(j>=0 && echange==true);


	}
}