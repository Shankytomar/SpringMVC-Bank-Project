package user.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import user.model.User;

@Repository
public class UserDao{
	@Autowired
	private HibernateTemplate HT;
	@Transactional
	public User getData(long accountnumber) {
		User u = this.HT.get(User.class,accountnumber);
		return u;
		
	}
	@Transactional
	public long saveLogin(User u) {
		long i = (Long)this.HT.save(u);
		return i;
	}
	@Transactional
	public void updatePin(User u) {
	       this.HT.update(u);
	}
	
}