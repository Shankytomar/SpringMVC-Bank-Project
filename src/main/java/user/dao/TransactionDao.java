package user.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import user.model.Transaction;
import user.model.User;

@Repository
public class TransactionDao {
	@Autowired
	private HibernateTemplate HT;
	@Transactional
	public int saveTransaction(Transaction T) {
		int i = (Integer)this.HT.save(T);
		System.out.println("transaction saved "+i);
		return i;
	}
	
	public List<Transaction> loadTransactions() {
		List<Transaction> LT = this.HT.loadAll(Transaction.class);
		return LT; 
	}
	
	@SuppressWarnings("unchecked")
	public Transaction deposit(Transaction t) {
		//get last entry 
		@SuppressWarnings("deprecation")
		List<Transaction> tl = (List<Transaction>) this.HT.find("from Transaction t where t.accountnumber="+t.getAccountnumber()+" order by t.id desc");
		// if t is first entry in database
		if(tl.isEmpty()) {
			t.setBalance(t.getDeposit());
			return t;
		}
		else {
			//fetch balance
			float bal = tl.get(0).getBalance();
			//set new balance
			bal = bal+ t.getDeposit();
			t.setBalance(bal);
			return t;
		}
	}
	
	@SuppressWarnings("deprecation")
	public Transaction withdrawal(Transaction t) {
		
		//get all transactions of an account number
		System.out.println("withdrawal run");
		@SuppressWarnings("unchecked")
		List<Transaction> tl = (List<Transaction>) this.HT.find("from Transaction t where t.accountnumber="+t.getAccountnumber()+" order by t.id desc");
		System.out.println("list prepared");
		// if t is first entry in database
		if(tl.isEmpty()) {
			System.out.println("list is empty");
			 t.setBalance(0);
			return t;
		}
		
		else {
			//last entry and fetch balance
			float bal = tl.get(0).getBalance();
			System.out.println("bal fetched ="+bal);
		
			//check amount withdrawal < balance
			if(bal > t.getWithdrawl()) {
				    //set new balance
					bal = bal- t.getWithdrawl();
					t.setBalance(bal);
					return t;
				}
		
			else {
					//transaction with no balance
				    t.setBalance(0);
					return t;
		}
		}
	}
	
	@SuppressWarnings("deprecation")
	public String balance(User u) {
		@SuppressWarnings("unchecked")
		List<Transaction> tl = (List<Transaction>) this.HT.find("from Transaction t where t.accountnumber="+u.getAccountnumber()+" order by t.id desc");
		String bal = Double.toString(tl.get(0).getBalance());
		return bal;
	}
	

}
