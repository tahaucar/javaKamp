import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Adapters.MernisServiceAdapter;
import Concrate.NeroCustomerManager;
import Concrate.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer1 = new Customer();
		customer1.setId(1);
		customer1.setFirstName("Zeynel Taha");
		customer1.setLastName("Uçar");
		customer1.setDateOfBirth(1996);
		customer1.setNationalityId("2352673467");

		customerManager.save(customer1);
	};
}
