package Concrete;

import Abstract.BaseCustomerManager;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

	@Override
	public void save(Customer customer) {
		
		System.out.println(
				"burada ilgili database kodu çağrıldı ve müşteri NERO İÇİN kaydedildi: " + customer.getFirstName());
	}
	
	
}


