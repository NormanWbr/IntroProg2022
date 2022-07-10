package animalerie;

public class animal {
	
	private static int nb;
	private static String nom;
	
	public static int getNb() {
		return nb;
	}

	public static String getNom() {
		return nom;
	}

	public static void setNom(String nom) {
		animal.nom = nom;
	}

	public void patte() {
		System.out.println("J'ai 4 pattes");
	}
	
	public void dent() {
		System.out.println("J'ai 42 dents");
	}
	
	public void pelage() {
		System.out.println("J'ai un pelage court");
	}
	
	public void nourriture() {
		System.out.println("Je mange des croquettes ou de la patée");
	}
	
	public animal() {
		nb++;
	}
	

}
