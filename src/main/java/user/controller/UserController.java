package user.controller;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import user.business.Business;
import user.dao.NewUserDao;
import user.dao.TransactionDao;
import user.dao.UserDao;
import user.model.NewUser;
import user.model.Transaction;
import user.model.User;




@Controller
public class UserController {
	
	@Autowired
	private Business B;
	
	@Autowired
	private UserDao UD;
	 
	@Autowired
	private NewUserDao NUD;
	
	@Autowired
	private TransactionDao TD;
	
	@RequestMapping("/")
	public String Home() {
		
		return "homepage";
	}
	
	@RequestMapping(value="/loginprocess",method= RequestMethod.POST)
	public String process(@ModelAttribute User u, @RequestParam("view") String v,Model m ) {
		
		User u1 = this.UD.getData(u.getAccountnumber());
		if(!(Objects.isNull(u1)))
		    {
		
			if(u.getAccountnumber() == u1.getAccountnumber() && u.getPassword().equals(u1.getPassword()) ) {
			         System.out.println("value matched");
			         m.addAttribute("accountnumber", u1.getAccountnumber());
		             return v;
	           }
		        System.out.println("error");
		        return "loginpage";
		}
		System.out.println("error");
        return "loginpage";
}
	@RequestMapping("/createUserButton")
	public String CreateButtonform() {
		return "signuppage";
	}
	@RequestMapping("/loginUserButton")
	public String LoginButtonform() {
		return "loginpage";
	}
	@RequestMapping("/homebutton")
	public String homebutton() {
		return "homepage";
	}
	
	@RequestMapping(value="/signupprocess" ,method= RequestMethod.POST)
	public String CreateAccount(@ModelAttribute NewUser nu,User u ,Model m) {
		//verify credentials
		//generate accountno. and set to newuser and user object
		nu.setAccountNumber(this.B.generateAccountNumber(nu.getAdhaar(),nu.getPanNumber()));
		u.setAccountnumber(nu.getAccountNumber());
		//generate and set password to user object
		u.setPassword(B.generatePassword());
		// IS USER ALREADY EXIST CHECH IN logintable
		// database code
		 this.NUD.createUser(nu);
		 
		 this.UD.saveLogin(u);
		
		System.out.println(nu);
		System.out.println(u);
		//
		m.addAttribute("user",u);
		return "successpage";
	}
	
	@RequestMapping("/deposit")
	public String depositPage(Model m) {
		String v="/depositpage";
		m.addAttribute("view",v);
		return "loginpage";
	}
	
	@RequestMapping("/depositpage")
	public String depositProcess(@ModelAttribute Transaction t , Model m) {
		TD.saveTransaction(TD.deposit(t));
		System.out.println("deposit process");
		String msg = "Amount deposited";
		m.addAttribute("msg",msg);
		return "success2";
		
	}
	
	@RequestMapping("/withdrawal")
	public String withdrawalPage(Model m) {
		String v="/withdrawal";
		m.addAttribute("view",v);
		return "loginpage";
	}
	@RequestMapping("/withdrawalpage")
	public String withdrawalProcess(@ModelAttribute Transaction t,Model m ) {
		System.out.println("t ="+t);
		Transaction t1 = TD.withdrawal(t);
		System.out.println(t1);
		System.out.println("witdrawal completed");
		// means balance is not updated (0 == 0) 
		if(t1.getBalance() == 0)
		{ 
			System.out.println("t1 bal= "+t1.getBalance()+" t bal= "+t.getBalance());
			System.out.println("not sufficient balance in account");
			String msg = "not sufficient balance in account";
			m.addAttribute("msg",msg);
			return "success2";
		}
		else {
			TD.saveTransaction(t1);
			
			System.out.println("transaction saved");
			String msg = "Amount withdrawaled";
			m.addAttribute("msg",msg);
			return "success2";	
		}
	}
	
	@RequestMapping("/changepin")
	public String changePinPage(Model m) {
		String v="/changepin";
		m.addAttribute("view",v);
		return "loginpage";
		
	}
	
	@RequestMapping("/changepinprocess")
	public String pinProcess(@ModelAttribute User u, Model m) {
		System.out.println(u);
		UD.updatePin(u);
		String msg ="Pin changed successfully";
		m.addAttribute("msg",msg);
		return "success2";
	}
	
	@RequestMapping("/balance")
	public String balance() {
			return "balance";
		}
	
	@RequestMapping("/balanceInquiry")
	public String balanceProcess(@ModelAttribute User u, Model m) {
		System.out.println(u);
		String bal= TD.balance(u);
		String msg = "Your balnce is Rs "+bal+"/-";
		m.addAttribute("msg",msg);
		return "success2";
	}
	
}