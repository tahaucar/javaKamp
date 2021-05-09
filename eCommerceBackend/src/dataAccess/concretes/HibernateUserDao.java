package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("veri tabanýna ekleme iþlemi gerçekleþti. ");
	}

	@Override
	public void delete(User user) {
		System.out.println("veri tabanýndan silme iþlemi gerçekleþti. ");
	}

	@Override
	public void update(User user) {
		System.out.println("veri tabanýnda güncelleme iþlemi gerçekleþti. ");		
	}

	@Override
	public void logIn(User user) {
		System.out.println("Sisteme giriþ yapýldý. ");
	}
	
}
