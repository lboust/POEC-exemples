package controledeFlux;

public class TableMultiplicationMain {

	public static void main(String[] args) {
		TableMultiplication table = new TableMultiplication();
		
		table.print(5, 20);// affiche 5*1 5*2 ... 5*20) et ne retourne pas de valeur
		table.print2(3);
	}

}
