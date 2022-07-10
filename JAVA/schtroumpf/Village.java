package schtroumpf;

public class Village {

	public static void main(String[] args) {
		
		System.out.println("Pour le moment c'est calme");
		System.out.println("Il y'a " + Schtroumpf.getNb() + " Schtroumpfs");
		System.out.println("**************************************************");
		
		//Schtroumpf
		Schtroumpf unSchtroumpf;
		
		unSchtroumpf = new Schtroumpf();
		System.out.println("Voici un Schtroumpf");
		System.out.println("Il y'a " + Schtroumpf.getNb() + " Schtroumpfs");
		unSchtroumpf.dessine();
		unSchtroumpf.parle();
		System.out.println("**************************************************");
		
		//GrandSchtroumpf
		GrandSchtroumpf leChef;
		
		System.out.println("Voici le grand Schtroumpf");
		leChef = new GrandSchtroumpf("Grand Schtroumpf");
		System.out.println("Il y'a " + Schtroumpf.getNb() + " Schtroumpfs");
		leChef.dessine();
		leChef.parle();
		System.out.println("**************************************************");
		
		//Schtroumpfette
		Schtroumpfette laSchtroumpfette;
		
		System.out.println("Voici la Schtroumpfette");
		laSchtroumpfette = new Schtroumpfette();
		System.out.println("Il y'a " + Schtroumpf.getNb() + " Schtroumpfs");
		laSchtroumpfette.dessine();
		laSchtroumpfette.shopping();
		laSchtroumpfette.setNom("Schtroumpfette");
		laSchtroumpfette.parle();
		System.out.println("**************************************************");
		
		//SchtroumpfNoir
		SchtroumpfNoir leNoir;
		
		System.out.println("Voici le Schtroumpf noir, fuyez");
		leNoir = new SchtroumpfNoir();
		System.out.println("Il y'a " + Schtroumpf.getNb() + " Schtroumpfs");
		leNoir.dessine();
		leNoir.setNom("Schtroumpf Noir");
		leNoir.parle();
		leNoir.mordre();
		System.out.println("**************************************************");
		
		//SchtroumpfPeureux
		SchtroumpfPeureux lePeureux;
		
		System.out.println("Voici le Schtroumpf peureux, ne lui faites pas peur");
		lePeureux = new SchtroumpfPeureux();
		System.out.println("Il y'a " + Schtroumpf.getNb() + " Schtroumpfs");
		lePeureux.dessine();
		lePeureux.setNom("Schtroumpf Pereux");
		lePeureux.parle();
		lePeureux.peur();
		System.out.println("**************************************************");
		
	}

}
