package geometry;

public class Rectangle implements Shape {
	//variables d'instance
	private int width;
	private int height;
	
	// constructor
	/**
	 * Construit un rectangle � partir de la largeur et de sa hauteur
	 * @param width : largeur du rectangle
	 * @param height : hauteur du rectangle
	 * @throws IllegalArgumentException si width ou height n�gative
	 */
	public Rectangle (int width, int height) {
		if (width <0) {
			//jetter une exception
			throw new IllegalArgumentException("width must be positive");
		}
		if (height <0) {
			//jetter une exception
		}
	}
	
	public Rectangle() {
		super();
	}

	//m�thodes
	public double calcArea() {
		double result = width*height;
		return result;
	}

	// getters and setters
	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}
	

}
