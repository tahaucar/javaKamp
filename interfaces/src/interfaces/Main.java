package interfaces;

public class Main {

	public static void main(String[] args) {
		
		Logger[] loggers = {new SmsLogger(),new EmailLogger(),new DatabaseLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer customer1 = new Customer(1,"Taha","UÇAR");
		
		customerManager.add(customer1);
				
	}

}
