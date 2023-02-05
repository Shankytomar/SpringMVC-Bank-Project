package user.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userdata")
public class NewUser {
	
	@Override
	public String toString() {
		return "NewUser [accountNumber=" + accountNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + ", city=" + city + ", phone=" + phone + ", panNumber=" + panNumber
				+ ", adhaar=" + adhaar + ", email=" + email + "]";
	}
	@Id 
	@Column(name="accountnumber")
	private long accountNumber;

	@Column(name="firstname")
	private String firstName;
	
	@Column(name="lastname")
	private String lastName;
	
	@Column(name="address")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="panNumber")
	private String panNumber;
	
	@Column(name="adhaar")
	private long adhaar;
	
	@Column(name="email")
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public long getAdhaar() {
		return adhaar;
	}
	public void setAdhaar(long adhaar) {
		this.adhaar = adhaar;
	}

	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
}
