package Core;

public interface Validation {
	boolean isEmailValid(String email);
	void sendEmail(String validationEmail);
	boolean isClickValidationEmail(); 
}
