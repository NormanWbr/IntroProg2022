package Decouverte;

import java.util.Scanner;

public class LesSaisies {

	public static void main(String[] args) {
		
		int age;
		String prenom;
		boolean celibataire;
		double argent;
		char lettrePreferee;
		
		System.out.println("Bonjour !");
		System.out.print("Entrez votre pr�nom SVP :");
		prenom = (new Scanner(System.in)).nextLine();
		
		System.out.println("Bonjour " + prenom + " ! :-)");
		System.out.println("Entrez votre �ge :");
		age = (new Scanner(System.in)).nextInt();
		System.out.println("Etes vous c�libataire ? (true/false)");
		celibataire = (new Scanner(System.in)).nextBoolean();
		System.out.println("Combien gagnez vous ?");
		argent = (new Scanner(System.in)).nextDouble();
		System.out.println("Entrez votre caract�re pr�f�r�: ");
		lettrePreferee = (new Scanner(System.in)).nextLine().charAt(0);
		
		System.out.println("Vous vous appelez " + prenom + " vous avez " + age + " ans");
		System.out.println("Vous gagnez " + argent + " �");
		System.out.println("Vous �tes c�libataire : "+celibataire);
		System.out.println("Et votre caract�re pr�f�r� est " + lettrePreferee);
		
	}

}
