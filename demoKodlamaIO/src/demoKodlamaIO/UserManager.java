package demoKodlamaIO;

public class UserManager {
	
	public UserManager() {
		
	}
	
	public void add(User user) {
		System.out.println("User added: " + user.getName());
	}

	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
		
		System.out.println("All users succesfully added.");
	}

	
}
