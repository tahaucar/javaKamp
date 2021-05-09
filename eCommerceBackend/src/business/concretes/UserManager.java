package business.concretes;

import java.util.regex.Pattern;

import Core.Validation;
import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.abstracts.Entity;
import entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private Validation validation;
	private Entity entity;

	public UserManager(UserDao userDao, Validation validation) {
		super();
		this.userDao = userDao;
		this.validation = validation;
	}

	@Override
	public void add(User user) {
		if (user.getPassword().length() >= 6 && user.getFirstName().length() >= 2 && user.getLastName().length() >= 2
				&& validation.isEmailValid(user.geteMail())) {
			validation.sendEmail(" / link üretildi.");
			if (validation.isClickValidationEmail()) {
				this.userDao.add(user);
				System.out.println("Kayýt baþarýlý gerçekleþti.");
			}
		} else {
			System.out.println("Kayýt gerçekleþtirilemedi.");
		}

	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

  	@Override
	public void logIn(User user, String eMail, String password) {
		if (user.geteMail() == eMail && user.getPassword() == password) {
			System.out.println("Sisteme giriþ yapýldý. ");
		} else {
			System.out.println("Mail adresi veya parola yanlýþtýr. ");
		}
	}

}
