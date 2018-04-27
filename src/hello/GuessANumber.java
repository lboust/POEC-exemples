package hello;

import java.util.Scanner;

public class GuessANumber {

	public static void main(String[] args) {

		int nombreADeviner = 8;
		// ecrire un programme qui demande à l'utilisateur de deviner un nombre entre 1 et 10 
		// tant que l'utilisateur n'a pas deviné, écrire "perdu" puis demander à deviner
		// quand l'utilisateur a deviné le nombre, écrire "gagné" et quitter
		int compteur=0;
		
		Scanner sc = new Scanner(System.in);

		int nombre;
		
		for (;;) {
			System.out.println("Devine un nombre entre 1 et 10");			
			compteur++;
			nombre=sc.nextInt();		
			if (nombre == nombreADeviner) {
				System.out.println("Gagné");
				System.out.println("Tu as trouvé en "+compteur+" coup(s)");
				break;
			} else {
				System.out.println("Perdu");
				
			}

		}
	}

}
