package user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.dao.UserDao;
import user.model.User;



//@Service
//public class UserService {
//	@Autowired
//	private UserDao UD;
//	
//	public int createUser(User u) {
//		int i = this.UD.insertUser(u);
//		return i;
//	}
//	public List<User> show(){
//		List <User> userList = this.UD.showUser();
//		return userList;
//	}
//
//	public boolean find(User u) {
//		boolean i = this.UD.findUser(u);
//		return i;
//	}
//}
