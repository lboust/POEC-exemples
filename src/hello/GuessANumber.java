package hello;

import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {

		int nombreADeviner = 8;
		// ecrire un programme qui demande � l'utilisateur de deviner un nombre entre 1 et 10 
		// tant que l'utilisateur n'a pas devin�, �crire "perdu" puis demander � deviner
		// quand l'utilisateur a devin� le nombre, �crire "gagn�" et quitter
		int compteur=0;
		
		Scanner sc = new Scanner(System.in);

		int nombre;
		
		for (;;) {
			System.out.println("Devine un nombre entre 1 et 10");			
			compteur++;
			nombre=sc.nextInt();		
			if (nombre == nombreADeviner) {
				System.out.println("Gagn�");
				System.out.println("Tu as trouv� en "+compteur+" coup(s)");
				break;
			} else {
				System.out.println("Perdu");
				
			}

		}
	}

}
