package hello;

public class UtilNoteMain {

	public static void main(String[] args) {
		UtilNote utilNote = new UtilNote();
		int[] notes = { 18, 20, 2, 14, 7, 10 };
		
		double moyenne = utilNote.calcMoyenne(notes);
		System.out.println(moyenne);

		int min = utilNote.findMin(notes);
		System.out.println(min);
		
		int max = utilNote.findMax(notes);
		System.out.println(max);
	}

}
