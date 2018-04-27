package hello;

public class PersonneMain {

	public static void main(String[] args) {
		Personne p1 = new Personne("Lorraine", "Boust", 23);


		// M�thodes d'encapsulation
		p1.setPrenom("Lorraine"); // pour �crire
		System.out.println(p1.getPrenom()); // pour lire

		p1.setNom("Boust");
		System.out.println(p1.getNom());

		p1.setAge(23);
		System.out.println(p1.getAge());

		// fullname donne prenom + " " + nom
		System.out.println(p1.getFullname());
		

	}

}
