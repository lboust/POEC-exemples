package controledeFlux;

public class Search {

	public static void main(String[] args) {

		int[] data = { 1, 3, 10, 7, 99 };
		// ecrire un programme qui cherche si le nombre 10 est présent dans le tableau
		boolean present = false;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == 10) {
				present = true;
				break; // "early exit" -> bonne pratique
			}
		}
		
		if (present) {
			System.out.println("Touvé");
		} else {
			System.out.println("Pas trouvé");
		}
		
	}

}
