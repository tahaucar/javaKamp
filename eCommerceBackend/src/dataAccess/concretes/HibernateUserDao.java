package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("veri taban�na ekleme i�lemi ger�ekle�ti. ");
	}

	@Override
	public void delete(User user) {
		System.out.println("veri taban�ndan silme i�lemi ger�ekle�ti. ");
	}

	@Override
	public void update(User user) {
		System.out.println("veri taban�nda g�ncelleme i�lemi ger�ekle�ti. ");		
	}

	@Override
	public void logIn(User user) {
		System.out.println("Sisteme giri� yap�ld�. ");
	}
	
}
