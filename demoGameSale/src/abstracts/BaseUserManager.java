package abstracts;

import entities.Player;

public abstract class BaseUserManager {
	
	public void add(Player player) {
		System.out.println("A new player is added: " + player.getFirsName());
	}
	
	public void delete(Player player) {
		System.out.println("The player is deleted: " + player.getFirsName());
	}
	
	public void update(Player player) {
		System.out.println("The player is updated: " + player.getFirsName());
	}
	
}
