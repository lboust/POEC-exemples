package collections;

public class Product {
	// instance field
	private String title;
	private int price;
	
	//constructor
	public Product(String title, int price) {
		this.title = title;
		this.price = price;
	}

	// getter and setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (price != other.price)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[" + title + ", " + price + "]";
	}
	
	

/*	@Override
	public boolean equals(Object o) { // equals sur type Product défini à partir du equals sur chaîne de caractères
		if (! (o instanceof Product)) {
			return false;			
		}
		Product p = (Product) o; // cast
		return this.title.equals((p).getTitle());		
				
	}

	@Override
	public int hashCode() {
		return this.title.hashCode();
	}*/
	
}
