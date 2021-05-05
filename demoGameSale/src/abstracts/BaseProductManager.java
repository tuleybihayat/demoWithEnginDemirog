package abstracts;

import entities.Game;

public abstract class BaseProductManager {
	
	public void add(Game game) {
		System.out.println("A new game is added: " + game.getName());
		
	}
	
	public void delete(Game game) {
		System.out.println("The game is deleted: " + game.getName());
	}
	
	public void update(Game game) {
		System.out.println("The game is updated: " + game.getName());
	}
	
}
