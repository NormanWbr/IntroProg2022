package Decouverte;

public class ExpressionsBooleennes {

	public static void main(String[] args) {

		int a=25, b=89;
		char x='x';
		String mot="Pomme";
		
		System.out.println("a=b?" + ( a==b));
		System.out.println("mot=POMME? " + mot.equals("POMME"));

		System.out.println("mot=POMME? " + mot.equalsIgnoreCase("POMME"));
		
		System.out.println("a<b? " + (a<b));
		System.out.println("a<=b? " + (a<=b));
		System.out.println("a>b? " + (a>b));
		System.out.println("a>=b? " + (a>=b));
		System.out.println("a<>? " + (a!=b));
		
		System.out.println("a=0 ou a<50 ?" + (a==0 || a<50));
		
		System.out.println("a=0 ou b=0 ?" + (a==0 && b==50));
		
		System.out.println(! mot.equalsIgnoreCase("Voiture"));
		
		System.out.println("a=0 ou exclusif b=0 ?" + (a==0 ^ b==0));
		
	}

}
