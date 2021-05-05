package demoKodlamaIO;

public class Main {

	public static void main(String[] args) {
		
		
		
		User user = new Student();
		user.setId(1);
		user.setName("emre");
		user.setEmail("abc@abc.com");
		
		
		UserManager userManager = new UserManager();
		userManager.add(user);
		userManager.add(new User(3, "selim", "şahin"));
		
		
		System.out.println("-*-*-*-*-");
		User[] users = new User[] {user};
		
		userManager.addMultiple(users);		

		
	}

}
