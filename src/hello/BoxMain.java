package hello;

import eCommerce.Article;

public class BoxMain {

	public static void main(String[] args) {
		Box<Article> b1 = new Box();
		
		b1.setElement(new Article("article", 10));
		
		Box<String> b2 = new Box();
		
		b2.setElement("string");

	}

}
