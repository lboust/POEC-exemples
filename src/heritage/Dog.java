package heritage;

public class Dog extends Animal{
	//method
	public void Bark() {
		System.out.println("ouaf");
	}
	
	public void debug() {
		System.out.println(name);
	}

	@Override
	public void makeSound() {
		super.makeSound(); // renvoie "..."
		Bark();
	}
	
	
}
