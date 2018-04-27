package hello;

import java.math.BigDecimal;

public class TransactionMain {

	public static void main(String[] args) {
		// une transaction a deux variables d'instance
		// une transaction est de type String : débit ou crédit
		// une transaction a un montant de type double (toujours positif)
		// créer quatre transactions
		
		Transaction t1 = new Transaction("débit", new BigDecimal("10"));
		Transaction t2 = new Transaction("crédit", new BigDecimal("20"));
		Transaction t3 = new Transaction("débit", new BigDecimal("30"));
		Transaction t4 = new Transaction("crédit", new BigDecimal("15"));
		
		
		
		// System.out.println(t1.type + " " + t1.amount);
		 
		 Transaction[] transactions = new Transaction[4];
		 transactions[0]=t1;
		 transactions[1]=t2;
		 transactions[2]=t3;
		 transactions[3]=t4;
		 
		 //calculer le total des transactions
		 BigDecimal total = BigDecimal.ZERO;
		 		 
		 for (int i = 0; i < transactions.length; i++) {
			if (transactions[i].getType().equals("crédit")) {
				total = total.add(transactions[i].getAmount());
			} else {
				total = total.subtract(transactions[i].getAmount());
				
			}
		}
		 System.out.println("total des transactions : " + total);
		 
	}

}


