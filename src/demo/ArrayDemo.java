package demo;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] tab = {1, 2, 3, 4};
		System.out.println( tab  [0]);
		System.out.println( tab  [3]);
		tab[2]=7;
		System.out.println( tab[2]);
		System.out.println( tab.length);
		
		String[] tableauDeString = {"Hello", "World"};
		System.out.println(tableauDeString[0]);
		System.out.println(tableauDeString[1]);
		
	
		int[] tabDeTailleVar = new int[6];
		System.out.println(tabDeTailleVar[0]);

		for (int i = 0; i < tabDeTailleVar.length; i++) {
			System.out.println(tabDeTailleVar[i]);
		}
			
		String[] tabDeTaille4 = new String[4];
		System.out.println(tabDeTaille4[0]);

		for (int i = 0; i < tabDeTaille4.length; i++) {
			System.out.println(tabDeTaille4[i]);
		}
		
		Boolean[] tabDeTaille5 = new Boolean[5];
		System.out.println(tabDeTaille5[0]);

		for (int i = 0; i < tabDeTaille5.length; i++) {
			System.out.println(tabDeTaille5[i]);
		}
		
	}

}
