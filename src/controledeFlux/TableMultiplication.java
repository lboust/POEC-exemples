package controledeFlux;

public class TableMultiplication {

	public void print(int i, int j) {

		for (int k = 1; k <= j; k++) {
			System.out.println(i + " x " + k + " = " + i * k);
		}
	}

	public void print2(int i) {
		// premiere ligne
		for (int j = 0; j <= i; j++) {
			System.out.print(j + " ");
		}
		System.out.println();
		// suite
		for (int k = 1; k <= i; k++) {
			// premiere colonne
			System.out.print(k + " ");
			// autres colonnes
			for (int j = 1; j <= i; j++) {
				System.out.print(j * k + " ");
			}
			System.out.println();
		}

	}

}
