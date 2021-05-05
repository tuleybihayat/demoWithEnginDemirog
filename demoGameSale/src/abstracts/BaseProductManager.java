package abstracts;

public abstract class BaseProductManager {
	
	public void add(Product product) {
		System.out.println("A new game is added: " + product.getName());
		
	}
	
	public void delete(Product product) {
		System.out.println("The game is deleted: " + product.getName());
	}
	
	public void update(Product product) {
		System.out.println("The game is updated: " + product.getName());
	}
	
}
