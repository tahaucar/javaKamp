package Core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EMailValidation implements Validation {

	@Override
	public boolean isEmailValid(String email) {
		String expression = "^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
		CharSequence inputStr = email;

		Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(inputStr);
		return matcher.matches();
	}

	@Override
	public void sendEmail(String validationEmail) {
		System.out.println("Doðrulama emaili gönderildi, linke týklayarak üyeliðinizi tamamlayanýz. ");
	}

	@Override
	public boolean isClickValidationEmail() {
		return true;
	}
}
