package abstracts;

import entities.Sale;

public abstract class BaseSaleManager {
	
	public void add(Sale sale) {
		System.out.println("A new sale is added: " + sale.getAmount());
	}
	
	public void delete(Sale sale) {
		System.out.println("The sale is deleted: " + sale.getAmount());
	}
	
	public void update(Sale sale) {
		System.out.println("The sale is updated: " + sale.getAmount());
	}


	
	
	
}
