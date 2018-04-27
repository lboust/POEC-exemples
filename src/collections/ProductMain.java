package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class ProductMain {

	public static void main(String[] args) {
		
		Product p1 = new Product("voiture rouge", 3000);
		Product p2 = new Product("voiture rouge", 5000);
		
		System.out.println(p1 == p2);
		//s'il y a unicité de la voiture rouge
		// surcharge de la méthode equals
		System.out.println(p1.equals(p2)); 
		
		HashSet<Product> productsSet = new HashSet<Product>();		
		productsSet.add(p1);
		productsSet.add(p2);
		System.out.println(productsSet.size());
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		System.out.println(p1.toString()); // méthode surchargée


		ProductByTitleLengthComparator comparatorByTitle = new ProductByTitleLengthComparator();
		System.out.println(comparatorByTitle.compare(p1, p2));
		
		Product p3 = new Product("voiture blanche", 3000);
		System.out.println(comparatorByTitle.compare(p1, p3));
		
		ProductByPriceComparator comparatorByPrice = new ProductByPriceComparator();
		System.out.println(comparatorByPrice.compare(p1,  p2));
		System.out.println(comparatorByPrice.compare(p1,  p3));
		
		ArrayList<Product> productsList = new ArrayList<Product>();
		
		productsList.add(p1);
		productsList.add(p2);
		productsList.add(p3);
		productsList.add(p3);
		
		productsList.sort(comparatorByPrice);
		System.out.println(productsList);
		productsList.sort(comparatorByTitle);
		System.out.println(productsList);
		productsSet.add(p3);
		
		ArrayList<Product> anotherProductList = new ArrayList<Product>(productsSet);
		anotherProductList.sort(comparatorByPrice);
		System.out.println(anotherProductList);
		
		TreeSet<Product> productsTreeSet= new TreeSet<Product>(comparatorByPrice);
		productsTreeSet.add(p1);
		productsTreeSet.add(p1);
		productsTreeSet.add(p3);
		System.out.println("TreeSet");
		System.out.println(productsTreeSet);
		productsTreeSet.add(p3);
		System.out.println(productsTreeSet);
		
		
	}



}
