package morpion;

import java.util.Scanner;

import java.util.Random;

public class TicTacToeComputerMain {

	public static void main(String[] args) {
		// créer un jeu de morpion qui peut se jouer contre l'ordinateur
		int size = 3;
		TTTGrid grid = new TTTGrid(size);

		ScoreTable TTTTable = new ScoreTable(2);

		grid.print();

		Scanner sc = new Scanner(System.in);

		System.out.println("Bienvenue dans le jeu du morpion");

		// présentation du joueur

		Player player1 = new Player();
		Player player2 = new Player();
		Player player = new Player();

		System.out.println("Quel est ton nom?");
		player1.setName(sc.next());

		System.out.println(player1.getName() + " choisis ton symbole (n'importe quelle lettre sauf O)");
		player1.setSymbol(sc.next().charAt(0));

		player2.setName("ordinateur");
		player2.setSymbol('O');

		player = player1;

		// boucle de jeu
		for (;;) {
			grid.setIsPlayAgain(false);
			grid.setIsGameOver(false);

			// placement du pion
			int colonne, ligne;

			if (player.equals(player1)) {
				System.out.println(player.getName() + " à toi de jouer");

				System.out.println("Quelle ligne?");

				ligne = sc.nextInt();

				System.out.println("Quelle colonne?");

				colonne = sc.nextInt();
				grid.put(player.getSymbol(), colonne, ligne);

			} else {
				// génération aléatoire de ligne et de colonne
				Random ligneAleatoire = new Random();
				Random colonneAleatoire = new Random();
				grid.put(player.getSymbol(), colonneAleatoire.nextInt(size), ligneAleatoire.nextInt(size));
			}
			// recherche du gagnant
			grid.whoWin();

			// enregistrement du score
			if (grid.getIsGameOver()) {
				if (player.equals(player1)) {
					TTTTable.addAPoint(0);
				} else {
					TTTTable.addAPoint(1);
				}
			}

			// affichage du score
			System.out.println(player1.getName() + "|" + player2.getName());
			TTTTable.display();

			// changement de joueur
			if (!grid.getIsPlayAgain()) {
				if (player.equals(player1)) {
					player = player2;
				} else {
					player = player1;
				}
			}
			// affichage de la grille
			grid.print();
			
			//regarde si la grille est pleine
			grid.Full();

		}
	}
}
