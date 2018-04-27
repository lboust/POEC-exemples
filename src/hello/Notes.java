package hello;
import java.text.DecimalFormat;

public class Notes {

	public static void main(String[] args) {

		int[] notes = {18, 20, 2, 14, 7, 10 };

		// calculer la moyenne des notes
		
		double moyenne;
		int total;
		total = 0;
		for (int i = 0; i < notes.length; i++) {
			total = total + notes[i];
		}
		moyenne = 1.0 * total  / notes.length;
		//moyenne = (double) total/notes.length; 
		// "cast"
		DecimalFormat precisionQuatre = new DecimalFormat("0.0000");
	
		System.out.println("moyenne : " + precisionQuatre.format(moyenne));

		// trouver la plus petite note

		int min = notes[0];

		for (int i = 1; i < notes.length; i++) {
			if (notes[i] < min) {
				min = notes[i];
			}
		}
		System.out.println("min : " + min);

		// trouver la plus grande note

		int max = notes[0];

		for (int i = 1; i < notes.length; i++) {
			if (notes[i] > max) {
				max = notes[i];
			}
		}
		System.out.println("max : " + max);

		// calculer la variance
		
		double varAux = 0;
		double var;

		for (int i = 0; i < notes.length; i++) {
			varAux = varAux + (notes[i] - moyenne) * (notes[i] - moyenne);
		}
		System.out.println(varAux);
		var = varAux / (notes.length -1 ) * 1.0;
		System.out.println("variance : " + precisionQuatre.format(var));

		// calculer l'écart-type

		double ecartType = Math.sqrt(var);
		System.out.println("ecart-type : " + precisionQuatre.format(ecartType));

	}

}
