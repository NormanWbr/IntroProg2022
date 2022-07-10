package boucles;

public class Fibonacci {

	public static void main(String[] args) {

		int nbr1=0,nbr2=1,nbr3,cpt=0;
		
		System.out.println(nbr1 + "\n" + nbr2);
		
		while (cpt < 18) {
			
			nbr3 = nbr1 + nbr2;
			nbr1 = nbr2;
			nbr2 = nbr3;
			
			cpt = cpt + 1;
			
			System.out.println(nbr3);
			
		}

	}

}
