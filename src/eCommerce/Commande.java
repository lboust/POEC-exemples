package eCommerce;

public class Commande {
	// variables d'instance
	private Article[] listeDArticles;

	// contructeurs
	public Commande(int nbMaxArticleDansPanier) {
		this.listeDArticles = new Article[nbMaxArticleDansPanier];
	}
	// getters and setters

	public Article[] getListeDArticles() {
		return listeDArticles;
	}
	public void setListeDArticles(Article[] listeDArticles) {
		this.listeDArticles = listeDArticles;
	}
	
	//autres méthodes
	public double calculTotal() {

		double total = 0.0;
		for (int i = 0; i < listeDArticles.length; i++) {
			total += listeDArticles[i].getPrix();
		}
		return total;
	}
	// voir correction
	public void ajout(Commande commande, Article article, int i) {
		commande.listeDArticles[i] = article;
	}

}
