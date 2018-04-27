package hello;

public class Singleton {
	
	public static final Singleton INSTANCE = new Singleton();
	
	private Singleton() {}// accès au constructeur bloqué depuis les autres classes

	public static Singleton getInstance() {
		return INSTANCE;
	}

}
