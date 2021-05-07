package day4Hw3Game;

import day4Hw3Game.eDevletVerification.EDevletVerification;

public class EDevletVerificationManagerAdapter implements VerificationService{

	@Override
	public void verificationToGamer(String message) {
		EDevletVerification eDevletVerification = new EDevletVerification();
		eDevletVerification.verification(message);
	}

}
