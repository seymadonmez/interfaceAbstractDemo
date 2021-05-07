package interfaceAbstractDemo.concrete;

import interfaceAbstractDemo.abstracts.ICustomerCheckService;
import interfaceAbstractDemo.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckManager implements ICustomerCheckService {
	@Override
	public boolean CheckIfRealPerson(Customer customer) {	
		return true;
	}
}
