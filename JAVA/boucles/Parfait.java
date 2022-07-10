package boucles;

public class Parfait {

	public static void main(String[] args) {

		int nbr=2;
		int div=1;
		int somme=0;
		
		while (nbr < 4000) {
		
			while (div < nbr) {
				
				if (nbr%div == 0) {
					
					somme = somme + div;
					div++;
					
				}
				
				else {
					
					div++;
					
				}
				
			}
			
			if (somme == nbr) {
				
				System.out.println(somme);
				
			}
			nbr++;
			div = 1;
			somme = 0;
			
		}

	}

}
