package eCommerce;

import java.util.Scanner;

public class ECommerceMain {

	public static void main(String[] args) {
		// accueil
		System.out.println("Bonjour!");
		System.out.println("Bienvenue sur notre site de e-comerce");
		System.out.println();
		//articles proposes
		System.out.println("Nous vous proposons des articles : ");
		Article a1 = new Article("Fleur", 2.50);
		Article a2 = new Article("Chocolat", 1.00);
		Article a3 = new Article("Cahier", 4.50);
		Article vide = new Article(null, 0.0);

		
		System.out.println(a1.getTitre() + ", prix unitaire : "+a1.getPrix());
	
		System.out.println(a2.getTitre() + ", prix unitaire : "+a2.getPrix());

		System.out.println(a3.getTitre() + ", prix unitaire : "+a3.getPrix());
		System.out.println();


		//preparation de la commande
		Commande maCommande = new Commande(5);

		//maCommande.setListeDArticles(new Article[5]);
		//initialisation de la commande
		
		for (int i = 0; i < 5; i++) {
			maCommande.ajout(maCommande, vide, i);
		}
		
		System.out.println("Vous pouvez commander jusqu'à cinq articles");
		System.out.println();
		
		//propositions d'articles
		int indicePanier = 0;
		//Premier article
		System.out.println("Combien de " + a1.getTitre() + " voulez-vous ajouter au panier?");
		Scanner sc = new Scanner(System.in);
		int quantite=sc.nextInt();				
		for (int i = 0; i < quantite; i++) {
			maCommande.ajout(maCommande, a1, i);
		}

		indicePanier = quantite;

		//Deuxieme article
		System.out.println("Combien de " + a2.getTitre() + " voulez-vous ajouter au panier?");
		quantite=sc.nextInt();	
		for (int i = indicePanier; i < (indicePanier+quantite); i++) {
			maCommande.ajout(maCommande, a2, i);			
		}

		indicePanier += quantite;

		
		//troisieme article
		System.out.println("Combien de " + a3.getTitre() + " voulez-vous ajouter au panier?");
		quantite=sc.nextInt();
		for (int i = indicePanier; i < (indicePanier+quantite); i++) {
			maCommande.ajout(maCommande, a3, i);
		}

		indicePanier += quantite;

		
		//calcul du montant de la commande
		double montantTotal = maCommande.calculTotal();
		System.out.println("Total de la commande : "+montantTotal);

	}

}
