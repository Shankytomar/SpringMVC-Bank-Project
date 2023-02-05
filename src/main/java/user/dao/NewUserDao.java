package user.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import user.model.NewUser;

@Repository
public class NewUserDao {
	@Autowired
	private HibernateTemplate HT;
	
	@Transactional
	public String createUser(NewUser nu) {
		long i = (Long)this.HT.save(nu);
		System.out.println(i);
		if(i==0) {
			return "error in creating account";
		}
		return "account created"+i;
	}

}
