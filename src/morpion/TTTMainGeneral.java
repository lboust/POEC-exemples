package morpion;

import java.util.Scanner;

public class TTTMainGeneral {

	public static void main(String[] args) {
		TTTGridGeneral grid = new TTTGridGeneral(4);
		Scanner sc = new Scanner(System.in);
		
		grid.setPlayer(1);
		
		for (;;) {
			System.out.println("joueur " + grid.getPlayer() + " à vous de jouer");
			
			System.out.println("Quelle ligne?");
			
			int ligne = sc.nextInt();
			
			System.out.println("Quelle colonne?");
			
			int colonne = sc.nextInt();
			
			if (grid.getPlayer()%2 ==1) {
				grid.put('X', colonne, ligne);
			} else {
				grid.put('O', colonne, ligne);
			}			
			grid.print();
			grid.whoWin();
			grid.setPlayer((grid.getPlayer()%2)+1);
		}
	}

}
