package tableau;

public class VecteurInit2 {

	public static void main(String[] args) {

		int i,j,cpt=0;
		double nbr=0;
		int tab[] = new int[20];

		for (i=0;i<20;i++) {
			tab[i] = i*2;
			if((i%4)==0)
				System.out.println(tab[i]+"\t");
			else
				System.out.print(tab[i]+"\t");

		}

	}

}