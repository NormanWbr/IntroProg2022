package Decouverte;

public class Exe03 {

	public static void main(String[] args) {
		
		int nb1,nb2;
		int nb3 =56;
		System.out.println("nb3 = " + nb3);
		nb1 = 789;
		System.out.print("nb1 vaut ");
		System.out.print(nb1);
		System.out.print(" et voil�");
		
		System.out.println();
		nb2 = 17;
		System.out.println(nb1 + "+" + nb2 + "= " + (nb1+nb2));
		System.out.println(nb1 + "-" + nb2 + "= " + (nb1-nb2));
		System.out.println(nb2 + "x" + nb3 + "= " + (nb2*nb3));
		System.out.println(nb3 + "/" + nb2 + "= " + (nb3/nb2));
		System.out.println(nb3 + "/" + nb2 + "= " + (nb2/nb3));
		System.out.println(nb3 + "mod" + nb2 + "= " + (nb3%nb2));
		
		System.out.println((nb3/nb2) + "x" + nb2 + "+" + (nb3%nb2) + "= " + nb3);
		System.out.println("2 exposant 3 = " + Math.pow(2, 3));
		System.out.println("Racine carr�e de 10 = " + Math.pow(10,0.5));
		System.out.println("0.2 exposant 3 = " + Math.pow(0.2, 3));
		System.out.println("Racine carr�e de 64 = " + Math.pow(64,0.5));
		System.out.println(Math.PI);
		System.out.println(Math.sqrt(10000));
		
	}

}
