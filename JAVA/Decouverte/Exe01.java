package Decouverte;


public class Exe01 {

	public static void main (String[]args) {
		int nb1 = 1;
		int nb2 = 5;
		System.out.println("nb1=" + nb1);
		System.out.println("nb2=" + nb2);
		nb1 = nb1 + nb2;
		nb2 = nb1 + nb2;
		System.out.println(nb1 + " " + nb2);
		nb1 = nb1 + nb2;
		System.out.println(nb1);
	}

}

