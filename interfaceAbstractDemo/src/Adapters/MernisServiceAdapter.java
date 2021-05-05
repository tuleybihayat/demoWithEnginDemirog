package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {

	public boolean checkIfRealPerson(Customer customer) {
		

		return true;
//		return false;

	}

}
