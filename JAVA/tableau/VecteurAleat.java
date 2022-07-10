package tableau;

import java.util.Random;
import java.util.Scanner;

public class VecteurAleat{

	public static void main(String[] args) {

		int cpt;
		Random r= new Random();

		int tab[] = new int[10];

		for (cpt=0;cpt < 10;cpt++) {

			tab[cpt]=r.nextInt(31);
			System.out.print(tab[cpt] + " ");

		}



	}

}