package day4Hw3Game;

import java.util.List;

public class GamerManager implements GamerService {
	
	private VerificationService verificationService;

	public GamerManager(VerificationService verificationService) {
		super();
		this.verificationService = verificationService;
	}

	@Override
	public void add(Gamer gamer) {
		this.verificationService.verificationToGamer("Oyuncu eklendi : " + gamer.getFirstName());
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu güncellendi" + gamer.getFirstName());
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi" + gamer.getFirstName());
	}

	@Override
	public Gamer get(int id) {
		System.out.println("Oyuncu getirildi");
		return null;
	}

	@Override
	public List<Gamer> getaAll() {
		System.out.println("Oyuncular listelendi");
		return null;
	}

}
