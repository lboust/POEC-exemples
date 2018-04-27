package hello;

public class Singleton {
	
	public static final Singleton INSTANCE = new Singleton();
	
	private Singleton() {}// acc�s au constructeur bloqu� depuis les autres classes

	public static Singleton getInstance() {
		return INSTANCE;
	}

}
