package heritage;

public class AnimalMain {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.setName("medor");
		d.setAge(2);
		
		Cat c = new Cat();
		c.setName("felix");
		c.setAge(8);
		
		d.Bark();
		c.makeSound();
		d.makeSound();

		
		// subtilités de l'héritage
		Animal c2 = new Cat();
		c2.makeSound();
		Object c3 = new Cat();
		// c3.makeSound n'est pas valide
		
		Animal[] zoo = {c, d};
		System.out.println("zoo");
		for (int i = 0; i < zoo.length; i++) {
			zoo[i].makeSound();
		}
		
		// Animal a = new Animal(); impossible car la classe Animal est abstraite
	}

}
