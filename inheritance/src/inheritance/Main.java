package inheritance;

public class Main {

	public static void main(String[] args) {

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setCustomerNumber("654321");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setCustomerNumber("123456");
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(corporateCustomer);
		customerManager.add(individualCustomer);
		
	}

}
