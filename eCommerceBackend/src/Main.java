import Core.EMailValidation;
import business.abstracts.UserService;
import business.concretes.UserManager;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User("asasdasdd", "aasdasdsf", "asgs@asfas.asf", "saasadg");
		UserService userService = new UserManager(new HibernateUserDao(), new EMailValidation());
		userService.add(user1);
		userService.logIn(user1, "asfas", "sdagsad");
	}

}
