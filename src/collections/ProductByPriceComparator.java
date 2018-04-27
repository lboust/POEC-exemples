package collections;

import java.util.Comparator;

public class ProductByPriceComparator implements Comparator<Product> {

	@Override
	public int compare(Product arg0, Product arg1) {
		if (arg0.getPrice() < arg1.getPrice()) {
			return -1;			
		} else if (arg0.getPrice() > arg1.getPrice()) {
			return 1;
		} else {
			return 0;
		}
		
	}
	
}
