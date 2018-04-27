package eCommerce;

import java.util.Scanner;

public class ECommerceAvanceMain2 {

	public static void main(String[] args) {
		// accueil
		System.out.println("Bonjour!");
		System.out.println("Bienvenue sur notre site de e-comerce");
		System.out.println();
		// articles proposes
		System.out.println("Nous vous proposons des articles : ");
		Article a1 = new Article("Fleur", 2.50);
		Article a2 = new Article("Chocolat", 1.00);
		Article a3 = new Article("Cahier", 4.50);


		System.out.println(a1.getTitre() + ", prix unitaire : "+a1.getPrix());

		System.out.println(a2.getTitre() + ", prix unitaire : "+a2.getPrix());

		System.out.println(a3.getTitre() + ", prix unitaire : "+a3.getPrix());
		System.out.println();


		// preparation de la commande
		CommandeAvance maCommande = new CommandeAvance();

		maCommande.listeDeCommandes = new LignCommande[5];
		// initialisation de la commande
		LignCommande vide = new LignCommande();
		vide.articleCommande = null;
		vide.quantiteCommande = 0;

		for (int i = 0; i < 5; i++) {
			maCommande.ajout(maCommande, vide, i);
		}

		System.out.println("Vous pouvez commander jusqu'à cinq articles");
		System.out.println();

		// propositions d'articles
		// int indicePanier = 0;
		int quantite = 0;
		Scanner sc = new Scanner(System.in);
		for (;;) {
			System.out.println("Quel article voulez-vous commander?");
			System.out.println("Pour " + a1.getTitre() + " Tapez 1");
			System.out.println("Pour " + a2.getTitre() + " Tapez 2");
			System.out.println("Pour " + a3.getTitre() + " Tapez 3");
			System.out.println("Pour aucun Tapez 0");
			int choix = sc.nextInt();
			if (choix != 0) {
				System.out.println("Combien en voulez-vous?");
				quantite = sc.nextInt();
			}

			if (choix == 1) {
				maCommande.listeDeCommandes[0].articleCommande = a1;
				maCommande.listeDeCommandes[0].quantiteCommande = quantite;
				//maCommande.ajout(maCommande, ListeDeCommandes,  0);
			} else if (choix == 2) {
				maCommande.listeDeCommandes[0].articleCommande = a2;
				maCommande.listeDeCommandes[0].quantiteCommande = quantite;
			} else if (choix == 3) {
				maCommande.listeDeCommandes[0].articleCommande = a3;
				maCommande.listeDeCommandes[0].quantiteCommande = quantite;
			} else {
				break;
			}
		}

		// calcul du montant de la commande
		// afficher le tableau recapitulatif
		
		double montantTotal = maCommande.calculTotal();
		System.out.println("Total de la commande : " + montantTotal);

	}

}
