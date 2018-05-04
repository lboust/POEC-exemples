package orm;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class City {
	//Instance fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="city_id")
	private Short id;
	
	@ManyToOne
	@JoinColumn(name="country_id", foreignKey=@ForeignKey(name="fk_city_country"))
	private Country country;
	
	private String city;
	
	@Column(name="last_update")
	private Instant lastUpdate;

	//getters and setters
	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Instant getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Instant lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
}
