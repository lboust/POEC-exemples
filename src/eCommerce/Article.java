package eCommerce;


public class Article {
	//variables d'instance
	private String titre;
	private double prix;
	
	// constructeur
	public Article(String titre, double prix) {
		this.titre = titre; 
		this.prix = prix;
	}
	
	
	//getters and setters
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
}
