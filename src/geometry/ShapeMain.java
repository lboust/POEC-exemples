package geometry;

import java.text.DecimalFormat;

public class ShapeMain {

	public static void main(String[] args) {
		
		//Creer une classe rectangle qui contient une méthode calcArea
		//public int calcArea(int width, int height)
		
		Rectangle monRectangle = new Rectangle(-8, 50);
		//monRectangle.setWidth( 10);
		//monRectangle.setHeight( 50);		
		double calcul=monRectangle.calcArea();
		DecimalFormat precision = new DecimalFormat("0.00");
		System.out.println(precision.format(calcul));
		
		Rectangle r2 = new Rectangle(40, 70);
		//r2.setHeight(40);
		//r2.setWidth(70);
		System.out.println(precision.format(r2.calcArea()));
		
		Circle c= new Circle();
		c.r = 4;
		System.out.println(precision.format(c.calcArea()));
		
		Shape[] tab = {r2, c};
		
		for (int i = 0; i < tab.length; i++) {
			Shape o = tab[i];
			System.out.println(precision.format(o.calcArea()));
		}
		
	}

}
