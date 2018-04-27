package controledeFlux;

public class Mention {
	public static void main(String[] args) {
		int note = 16;

		if (note < 10) {
			System.out.println("peut mieux faire");
		} else if (note < 12) {
			System.out.println("passable");
		} else if (note < 14) {
			System.out.println("assez bien");
		} else if (note < 16) {
			System.out.println("bien");
		} else {
			System.out.println("tres bien");
		}

	}

}
