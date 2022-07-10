package boucles;

public class Pairs {

	public static void main(String[] args) {

		int cpt = 0,nbr = -1;
		
		while (cpt < 20) {
			nbr = nbr + 1;
			if ((nbr%2) == 0 && nbr != 0) {
				
				System.out.println(nbr);
				cpt = cpt + 1;
			}
			
		}

	}

}
