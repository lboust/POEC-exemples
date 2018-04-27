package eCommerce;

public class CommandeAvance {
	// variables d'instance
	LignCommande[] listeDeCommandes;

	// méthodes

	public double calculTotal() {

		double total = 0.0;
		for (int i = 0; i < listeDeCommandes.length; i++) {
			System.out.println(listeDeCommandes[i].quantiteCommande);
			System.out.println(listeDeCommandes[i].articleCommande.getPrix());
			total += (listeDeCommandes[i].quantiteCommande)*(listeDeCommandes[i].articleCommande.getPrix());
		}
		return total;
	}

	public void ajout(CommandeAvance commande, LignCommande lc, int i) {
		commande.listeDeCommandes[i] = lc;
	}

}
