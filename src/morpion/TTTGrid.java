package morpion;

public class TTTGrid {
	// instance fields
	private char[][] grille;
	private boolean isPlayAgain;
	private boolean isGameOver;

	// getters and setters

	public boolean getIsGameOver() {
		return isGameOver;
	}

	public void setIsGameOver(boolean isGameOver) {
		this.isGameOver = isGameOver;
	}

	public boolean getIsPlayAgain() {
		return isPlayAgain;
	}

	public void setIsPlayAgain(boolean isPlayAgain) {
		this.isPlayAgain = isPlayAgain;
	}

	// constructeur
	public TTTGrid(int n) {
		grille = new char[n][n];
	}

	// methods
	// remplissage de la grille
	public void put(char c, int i, int j) {
		if (this.grille[j][i] != '\u0000') {
			System.out.println("case déjà prise");
			isPlayAgain = true;
		} else {
			if (i < 0 || i > grille.length - 1) {
				System.out.println("nombre non valide");
				isPlayAgain = true;
			} else {
				if (j < 0 || j > grille.length - 1) {
					System.out.println("nombre non valide");
					isPlayAgain = true;
				} else {
					this.grille[j][i] = c;
				}
			}
		}
	}

	// affichage de la grille
	public void print() {
		StringBuilder gridString = new StringBuilder();
		for (int k = 0; k < 4 * grille.length + 1; k++) {
			gridString.append("-");
		}
		gridString.append("\n");
		System.out.println();
		for (int i = 0; i < grille.length; i++) {
			for (int j = 0; j < grille.length; j++) {
				gridString.append("|" + " " + this.grille[i][j] + " ");
			}
			gridString.append("|");
			gridString.append("\n");
			for (int k = 0; k < 4 * grille.length + 1; k++) {
				gridString.append("-");
			}
			gridString.append("\n");
		}
		System.out.println(gridString);
	}

	// determination du gagnant
	public void whoWin() {
		checkColumn();
		checkLine();
		if (checkDiag() || checkColumn() || checkLine()) {
			System.out.println("Game over");
			for (int i = 0; i < grille.length; i++) {
				for (int j = 0; j < grille.length; j++) {
					this.grille[i][j] = '\u0000';
				}
			}
		}
	}

	// verification sur les diagonales
	private boolean checkDiag() {
		boolean isEqual;
		if (this.grille[0][0] != '\u0000') {
			isEqual = true;
			for (int j = 0; j < grille.length - 1; j++) {
				if (this.grille[j][j] != this.grille[j + 1][j + 1]) {
					isEqual = false;
				}
			}
			if (isEqual) {
				this.setIsGameOver(true);
			}
		}

		// verification sur l'anti-diagonale
		if (this.grille[0][grille.length - 1] != '\u0000') {
			// System.out.println("ici");
			isEqual = true;
			for (int j = 0; j < grille.length - 1; j++) {
				if (this.grille[j][grille.length - j - 1] != this.grille[j + 1][grille.length - j - 2]) {
					isEqual = false;
				}
			}
			if (isEqual) {
				this.setIsGameOver(true);
			}
		}
		return this.getIsGameOver();
	}

	// verification sur une ligne
	private boolean checkLine() {
		boolean isEqual;

		for (int i = 0; i < grille.length; i++) {
			if (this.grille[i][0] != '\u0000') {
				isEqual = true;
				for (int j = 0; j < grille.length - 1; j++) {
					if (this.grille[i][j] != this.grille[i][j + 1]) {
						isEqual = false;
					}
				}
				if (isEqual) {
					this.setIsGameOver(true);
					break;
				}
			}
		}
		return this.getIsGameOver();
	}

	// verification sur une colonne
	private boolean checkColumn() {
		boolean isEqual;
		for (int j = 0; j < grille.length; j++) {
			if (this.grille[0][j] != '\u0000') {
				isEqual = true;
				for (int i = 0; i < grille.length - 1; i++) {
					if (this.grille[i][j] != this.grille[i + 1][j]) {
						isEqual = false;
						break;
					}
				}
				if (isEqual) {
					this.setIsGameOver(true);
					break;
				}
			}
		}
		return this.getIsGameOver();
	}

	public void IsFull() {
		
	}

	public void Full() {
		for (int i = 0; i < grille.length; i++) {
			for (int j = 0; j < grille.length; j++) {
				
			}
		}
		
	}
	
	
}
