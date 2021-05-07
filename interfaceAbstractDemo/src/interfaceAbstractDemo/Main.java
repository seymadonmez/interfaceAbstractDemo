package interfaceAbstractDemo;

import java.time.LocalDate;

import interfaceAbstractDemo.abstracts.BaseCustomerManager;
import interfaceAbstractDemo.adapters.MernisServiceAdapter;
import interfaceAbstractDemo.concrete.NeroCustomerManager;
import interfaceAbstractDemo.concrete.StarbucksCustomerManager;
import interfaceAbstractDemo.entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseCustomerManager customerManager=new NeroCustomerManager();
		customerManager.Save(new Customer(1,"Engin","Demiroð","28861499108",LocalDate.of(1985,01, 06)));
		
		BaseCustomerManager customerManager2=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager2.Save(new Customer(1,"Engin","Demiroð","28861499108",LocalDate.of(1985,01, 06)));
		
	}

}
