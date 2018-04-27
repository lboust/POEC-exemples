package heritage;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedList;

import hello.Transaction;

public class ListMain {

	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		myList.add(new Cat());
		myList.add(new Cat());
		myList.add(new Dog());
		myList.add(new Transaction("débit", new BigDecimal(10)));
		
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));			
		}
		
		LinkedList<Cat> ListOfCats = new LinkedList<Cat>();
		
		ListOfCats.add(new Cat());
		ListOfCats.add(new Cat());
		ListOfCats.add(new Cat());
		for (int i = 0; i < ListOfCats.size(); i++) {
			System.out.println(ListOfCats.get(i));			
		}
		
		for (Cat cat : ListOfCats) {
			System.out.println(cat);
		}
		
		
		
		

	}

}
