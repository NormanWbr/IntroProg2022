package pendu;

public class dessin {

	public static void pendu(int cpt) {

		switch (cpt){

		case 0:
			System.out.println(" +-------+");
			System.out.println(" |   |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println("==========");
			break;
		case 1:
			System.out.println(" +-------+");
			System.out.println(" |   |");
			System.out.println(" |   O");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println("==========");
			break;
		case 2:
			System.out.println(" +-------+");
			System.out.println(" |   |");
			System.out.println(" |   O");
			System.out.println(" |   |");
			System.out.println(" |");
			System.out.println("==========");
			break;
		case 3:
			System.out.println(" +-------+");
			System.out.println(" |   |");
			System.out.println(" |   O");
			System.out.println(" |  /|");
			System.out.println(" |");
			System.out.println("==========");
			break;
		case 4:
			System.out.println(" +-------+");
			System.out.println(" |   |");
			System.out.println(" |   O");
			System.out.println(" |  /|\\");
			System.out.println(" |");
			System.out.println("==========");
			break;
		case 5:
			System.out.println(" +-------+");
			System.out.println(" |   |");
			System.out.println(" |   O");
			System.out.println(" |  /|\\");
			System.out.println(" |  /");
			System.out.println("==========");
			break;
		case 6:
			System.out.println(" +-------+");
			System.out.println(" |   |");
			System.out.println(" |   O");
			System.out.println(" |  /|\\");
			System.out.println(" |  / \\");
			System.out.println("==========");

		}
		
	}
	
	public static void victoire() {
		
		System.out.println("\\O/");
		System.out.println(" |");
		System.out.println("/ \\");
		
	}
	
}
