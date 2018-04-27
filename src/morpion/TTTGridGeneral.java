package morpion;

public class TTTGridGeneral {
	// instance fields
	private char[][] grille;
	private int player;

	// getters and setters
	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}

	// constructeur
	public TTTGridGeneral(int n) {
			this.grille = new char[n][n];
		}

	// methods
	public void put(char c, int i, int j) {
		if (i < 0 || i > grille.length-1) {
			System.out.println("nombre non valide");
		} else if (j < 0 || j > grille.length-1) {
			System.out.println("nombre non valide");
		} else {
			grille[j][i] = c;
		}
	}

	public void print() {
		for (int k = 0; k < 4*grille.length+1; k++) {
			System.out.print("-");
		}
		System.out.println();
		for (int i = 0; i < grille.length; i++) {
			for (int j = 0; j < grille.length; j++) {
				System.out.print("|" + " " + this.grille[i][j] + " ");
			}
			System.out.print("|");
			System.out.println();
			for (int k = 0; k < 4*grille.length+1; k++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

	public void whoWin() {
		// verification sur une colonne
		for (int i = 0; i < grille.length; i++) {
			if (this.grille[0][i] != '\u0000') {
				if (this.grille[0][i] == (this.grille[1][i])) {
					if (this.grille[1][i] == this.grille[2][i]) {
						youWin();
						break;
					}
				}
			}
		}
		// verification sur une ligne
		for (int i = 0; i < grille.length; i++) {
			if (this.grille[i][0] != '\u0000') {
				if (this.grille[i][0] == (this.grille[i][1])) {
					if (this.grille[i][1] == this.grille[i][2]) {
						youWin();
						break;
					}
				}
			}

		}
		// verification sur la diagonale
		if (this.grille[0][0] != '\u0000') {
			if (this.grille[0][0] == (this.grille[1][1])) {
				if (this.grille[1][1] == this.grille[2][2]) {
					youWin();
				}
			}
		}

		// verification sur l'anti-diagonale
		if (this.grille[0][2] != '\u0000') {
			if (this.grille[0][2] == (this.grille[1][1])) {
				if (this.grille[1][1] == this.grille[2][0]) {
					youWin();
				}
			}
		}

	}

	private void youWin() {
		System.out.println("Joueur " + this.getPlayer() + " a gagné");
		for (int i = 0; i < grille.length; i++) {
			for (int j = 0; j < grille.length; j++) {
				this.grille[i][j] = '\u0000';
			}
		}
		this.print();

	}

}
