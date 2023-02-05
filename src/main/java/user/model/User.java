package user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="logintable")
public class User{
	
	@Id
	@Column(name="accountnumber")
	private long accountnumber;
	
	@Column(name="password")
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	@Override
	public String toString() {
		return "User [accountnumber=" + accountnumber + ",  password=" + password + "]";
	}
	
	
	
}