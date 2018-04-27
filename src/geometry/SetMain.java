package geometry;

import java.util.HashSet;

public class SetMain {

	public static void main(String[] args) {
		HashSet<Shape> mySet = new HashSet<Shape>();
		mySet.add(new Rectangle());
		mySet.add(new Circle());
		
		System.out.println(mySet.size());
		
		Rectangle r1 = new Rectangle();
		
		mySet.add(r1);
		mySet.add(r1);
		System.out.println(mySet.size());
		
		for (Shape shape : mySet) {
			System.out.println(shape);
		}
		

	}

}
