package user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction")
public class Transaction {
	@Id
	@Column(name="id")
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="accountnumber")
	private long accountnumber; 
	@Column(name="deposit")
	private float deposit;
	@Column(name="withdrawal")
	private float withdrawl;
	@Column(name="balance")
	private float balance;
	public long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public float getDeposit() {
		return deposit;
	}
	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}
	public float getWithdrawl() {
		return withdrawl;
	}
	public void setWithdrawl(float withdrawl) {
		this.withdrawl = withdrawl;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", accountnumber=" + accountnumber + ", deposit=" + deposit + ", withdrawl="
				+ withdrawl + ", balance=" + balance + "]";
	}
	

}
