package orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.ForeignKey;

@Entity
@Table(name="customer")
public class Customer {
	//instance fields	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="customer_id")
	private Short id;
	
/*	@Column(name="address_id")
	private long address_id;*/
	
	@ManyToOne
	@JoinColumn(name="address_id", foreignKey=@ForeignKey(name="fk_customer_address"))
	private Address address;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="store_id")
	private Long storeId;
	
	//getters and setters
	public Short getId() {
		return id;
	}
	public void setId(Short id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getStoreId() {
		return storeId;
	}
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}
/*	public long getAddress_id() {
		return address_id;
	}
	public void setAddress_id(long address_id) {
		this.address_id = address_id;
	}*/
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}


}
