package javaDay3Hw2;

public class UserManager {
	public void signIn(User user) {
		System.out.println("Giriþ yapýldý " );
	}
	public void logOut(User user) {
		System.out.println("Çýkýþ yapýldý ");
	}
	public void list(User user) {
		System.out.println("Listeleme yapýldý ");
	}
	public void add(User user) {
		System.out.println("Kullanýcý eklendi " );
	}
	public void update(User user) {
		System.out.println("Kullanýcý güncellendi " );
	}
	public void delete(User user) {
		System.out.println("Kullanýcý silindi " );
	}
}
