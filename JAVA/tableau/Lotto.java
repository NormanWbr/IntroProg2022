package tableau;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {

		int i,j,nbr;
		boolean trouve = true;
		int lotto[] = new int [6];
		Random r=new Random();

		for (i=0;i<lotto.length;i++) {	
			nbr = r.nextInt(1,45);
			lotto[i]=nbr;
			trouve=true;
			while (trouve) {
			for (j=0;j<lotto.length;j++) {
					if (nbr == lotto[j] && i != j) {
						trouve=true;
						lotto[i] = r.nextInt(1,45);
					}

					else {

						trouve=false;

					}
				}

			}
		}

			for (i=0;i<lotto.length;i++) {
				System.out.print(lotto[i] + "\t");
			}

	}

}
