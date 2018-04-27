package morpion;

import java.util.Scanner;


public class TicTacToeMain {

	public static void main(String[] args) {
		// créer un jeu de morpion qui peut se jouer à deux joueurs

		// 1) créer la classe grille selon :
		// plateau de jeu
		TTTGrid grid = new TTTGrid(3);

		ScoreTable TTTTable = new ScoreTable(3);

		// 2) créer une méthode print qui permet d'afficher la grille
		grid.print();

		Scanner sc = new Scanner(System.in);

		System.out.println("Bienvenue dans le jeu du morpion");

		// présentation des joueurs

		Player player1 = new Player();
		Player player2 = new Player();
		Player player = new Player();

		System.out.println("Joueur 1 quel est ton nom?");
		player1.setName(sc.next());

		System.out.println(player1.getName() + " choisis ton symbole (X ou O)");
		player1.setSymbol(sc.next().charAt(0));

		System.out.println("Joueur 2 quel est ton nom?");
		player2.setName(sc.next());

		System.out.println(player2.getName() + " choisis ton symbole (X ou O)");
		player2.setSymbol(sc.next().charAt(0));

		player = player1;

		// boucle de jeu
		for (;;) {
			grid.setIsPlayAgain(false);
			grid.setIsGameOver(false);

			// placement du pion
			System.out.println(player.getName() + " à toi de jouer");

			System.out.println("Quelle ligne?");

			int ligne = sc.nextInt();

			System.out.println("Quelle colonne?");

			int colonne = sc.nextInt();

			grid.put(player.getSymbol(), colonne, ligne);

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

			// affichage de la grille
			grid.print();

			// changement de joueur
			if (!grid.getIsPlayAgain()) {
				if (player.equals(player1)) {
					player = player2;
				} else {
					player = player1;
				}
			}
		}
	}
}
