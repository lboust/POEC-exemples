package hello;

import java.math.BigDecimal;

public class Transaction {
	// variables d'instance
	private String type;	
	private BigDecimal amount;
	
	// constructeurs
	public Transaction(String type, BigDecimal amount) {
		this.type = type;
		this.amount = amount;
	}
	
	// getters and setters
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
