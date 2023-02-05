package user.business;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Business {
	
	private Random rand = new Random();

	//find better option
	public long generateAccountNumber(long adhaar, String pan) {
//		System.out.println(adhaar);
		String a = Long.toString(adhaar);
//		System.out.println(a);
//		System.out.println(pan);
		String result=pan.replaceAll("[^0-9]","")+a;
		System.out.println("accountno. generated" + result);
		return Long.parseLong(result);
		
	}
	
	public String generatePassword() {
		String S ="";
		Character[] c ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','w','x','y','z'};
		Character[] n= {'1','2','3','4','5','6','7','8','9','0'};
		Character[] s = {'@','#','$','*'};
		
		for(int i=0;i<3;i++) {
			Character x = c[rand.nextInt(c.length)];
			Character y = n[rand.nextInt(n.length)];
			Character z = s[rand.nextInt(s.length)];
			String d= Character.toString(x)+y+z;
			S+=d;
		     }
		S+=0;
		System.out.println("password genrated"+S);
		return S;
	}
}
