package interfaceAbstractDemo;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		

//		BaseCustomerManager customerManager = new NeroCustomerManager();

//		BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());

//		mernis yalnızca simüle edilmiştir.

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

		customerManager.save(new Customer("EMRE", "ŞAHİN", 11123456789L, 1991));
		

	}

}
