package hello;

public class UtilNote {
	public double calcMoyenne(int[] tab) {
		double moyenne;
		int total;
		total = 0;
		for (int i = 0; i < tab.length; i++) {
			total = total + tab[i];
		}
		moyenne = 1.0 * total / tab.length;
		return moyenne;
	}

	public int findMin(int[] tab) {
		int min = tab[0];

		for (int i = 1; i < tab.length; i++) {
			if (tab[i] < min) {
				min = tab[i];
			}
		}
		return min;
	}

	public int findMax(int[] tab) {
		int max = tab[0];

		for (int i = 1; i < tab.length; i++) {
			if (tab[i] > max) {
				max = tab[i];
			}
		}
		return max;
	}

}
