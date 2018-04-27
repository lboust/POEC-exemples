package heritage;

public abstract class Animal {
	// instance fields
	protected String name;
	private int age;
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//methods
	
	public void makeSound() {
		System.out.println("...");
	}
}
