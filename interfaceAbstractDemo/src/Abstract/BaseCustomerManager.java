package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		
		System.out.println("burada ilgili database kodu çağrıldı ve müşteri kaydedildi: " + customer.getFirstName());
	}

}