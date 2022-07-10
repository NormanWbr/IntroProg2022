package schtroumpf;

public class FeteAuVillage {

	public static void main(String[] args) {
		
		Schtroumpf[] laTribu = new Schtroumpf[102];
		
		System.out.println("Nombre de Schtroumpfs : " + Schtroumpf.getNb());
		laTribu[0] = new GrandSchtroumpf("Grand Schtroumpf");
		laTribu[1] = new Schtroumpfette();
		laTribu[2] = new SchtroumpfNoir();
		laTribu[3] = new SchtroumpfPeureux();
		
		for (int i=4;i<laTribu.length;i++) {
			laTribu[i] = new Schtroumpf("Schtroumpf " + i);
		}
		
		System.out.println("Nombre de Schtroumpfs : " + Schtroumpf.getNb());
		
		for (int i=0;i<laTribu.length;i++) {
			laTribu[i].parle();
		}
		for (int i=laTribu.length-1;i>=0;i--) {
			laTribu[i].dessine();
		}
		
	}

}
