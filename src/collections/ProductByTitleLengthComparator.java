package collections;

import java.util.Comparator;

public class ProductByTitleLengthComparator implements Comparator<Product>{
	// methods
	@Override
	public int compare(Product p1, Product p2) {
		if (p1.getTitle().length()>p2.getTitle().length()) {
			return 1;
		} else if (p1.getTitle().length()<p2.getTitle().length()) {
			return -1;
		} else {
			return 0;
		}
		
	}
	

}
