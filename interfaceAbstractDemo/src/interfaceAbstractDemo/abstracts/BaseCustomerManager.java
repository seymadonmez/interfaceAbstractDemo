package interfaceAbstractDemo.abstracts;

import interfaceAbstractDemo.entities.Customer;

public class BaseCustomerManager implements ICustomerService {

	@Override
	public void Save(Customer customer) {
		System.out.println("Saved to database: "+customer.getFirstName());
	}
	
}
