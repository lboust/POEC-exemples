package controledeFlux;

public class FizzBuzz {

	public static void main(String[] args) {
		//System.out.println("fizz " + 3);
		/*pour tous les nombres de 0  à 100 inclus, 
		 * affiche "nombre FIZZ" si nombre est multiple de 3
		 * affiche "nombre BUZZ si le nombre est multiple de 5
		 * affiche "nombre FIZZBUZZ" si nombre est multiple de 3 et de 5
		*/
		/*
		for (int i = 0; i < 101; i++) {
			if (((i % 3) == 0)&&(( i % 5 ) == 0 )) {
				System.out.println(i + " FIZZBUZZ");
			} else if (( i % 3 ) == 0 ) {
				System.out.println(i + " FIZZ");
			} else if (( i % 5 ) == 0 ) {
				System.out.println(i + " BUZZ");
			}
		}
		*/
		for (int i = 0; i < 101; i++) {
			if (((i % 3) == 0)&&(( i % 5 ) == 0 )) {
				System.out.println(i + " FIZZBUZZ");
				continue;
			} 
			if (( i % 3 ) == 0 ) {
				System.out.println(i + " FIZZ");
			} 
			if (( i % 5 ) == 0 ) {
				System.out.println(i + " BUZZ");
			}
		}
	}

}
