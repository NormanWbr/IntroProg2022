package schtroumpf;

public class Schtroumpf {
	
	private static int nb;
	
	private String nom="Schtroumpf";

	public static int getNb() {
		return nb;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void dessine() {
		System.out.println("Je suis bleu, habillé avec un short et un bonnet blanc !");
	}
	
	public void parle() {
		System.out.println("Je Schtroumpf le Schtroumpf");
	}
	
	public Schtroumpf() {
		nb++;
	}
	
	 public Schtroumpf(String aNom) {
	        // constructeur overloadé 
	        nb++;
	        setNom(aNom);
	 
	  }

}
