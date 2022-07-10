package animalerie;

import schtroumpf.Schtroumpf;

public class magasin {

	public static void main(String[] args) {
		
		System.out.println("Pour le moment le magasin est vide");
		System.out.println("Il y'a " + animal.getNb() + " animal.aux");
		System.out.println("**************************************************");
		
		berger unChien;
		
		unChien = new berger();
		
		System.out.println("Nous avons reçu un chien");
		unChien.patte();
		unChien.dent();
		unChien.pelage();
		unChien.nourriture();
		unChien.parle();
		unChien.garde();
		System.out.println("**************************************************");
		
		System.out.println("Pour le moment le magasin est vide");
		System.out.println("Il y'a " + animal.getNb() + " animal.aux");
		System.out.println("**************************************************");
		
		bichon deuxChien;
		
		deuxChien = new bichon();
		
		System.out.println("Nous avons reçu un chien");
		deuxChien.patte();
		deuxChien.dent();
		deuxChien.pelage();
		deuxChien.nourriture();
		deuxChien.parle();
		deuxChien.calin();
		System.out.println("**************************************************");
		
		
		
	}
	
}
