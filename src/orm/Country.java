package orm;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Country {
	
	//instance fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="country_id")
	private Short id;
	
	private String country;
	@Column(name="last_update")
	private Instant lastUpdate;
	
	// getters and setters
	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Instant getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Instant lastUpdate) {
		this.lastUpdate = lastUpdate;
	}


}
