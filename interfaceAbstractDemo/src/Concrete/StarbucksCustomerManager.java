package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

	CustomerCheckService checkService;

	public StarbucksCustomerManager(CustomerCheckService checkService) {
		super();
		this.checkService = checkService;
	}

	@Override
	public void save(Customer customer) {
		

		// checkIfRealPerson(customer);

		if (checkService.checkIfRealPerson(customer)) {
			super.save(customer);
			System.out.println("STARBUCKS İÇİN");
		} else {
			System.out.println("geçersiz kayıt");
		}

	}

	/*
	 * private void checkIfRealPerson(Customer customer) {
	 * method stub
	 * 
	 * }
	 */

}
