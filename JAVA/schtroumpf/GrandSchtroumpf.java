package schtroumpf;

public class GrandSchtroumpf extends Schtroumpf{
	
	public void dessine() {
		System.out.println("Je suis bleu, j'ai une barbe blanche, et je suis habill� avec un short et un bonnet rouge!");
	}
	public void parle() {
		System.out.println("Je Schtroumpf le Schtroumpf et je suis le chef");
	}
    public GrandSchtroumpf(String aNom) {
        super(aNom);  // super fait r�f�rence � l'anc�tre direct
    }
}
