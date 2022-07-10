package Decouverte;

public class Transtypage {

	public static void main(String[] args) {
		
		int nb1 = 7;
		int nb2 = 13;
		double nb3;
		nb3 = nb2/(double)nb1;
		
		System.out.println(nb2 + "/" + nb1 + "= " + (nb2/nb1));
		System.out.println(nb2 + "/" + nb1 + "= " + nb3);
		System.out.println(nb2 + "/" + nb1 + "= " + (13/7));
		System.out.println(nb2 + "/" + nb1 + "= " + (13.0/7));

	}

}
