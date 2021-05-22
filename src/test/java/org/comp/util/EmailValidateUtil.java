package org.comp.util;

public class EmailValidateUtil {
	
	public void validateMail_withValidateMailId() {
		boolean isValid = ValidateUtil.validateMail("pkp@gmail");
		System.out.println("The emailid is valid?" + isValid);
	}

	public void validateMail_withInValidateMailId() {
		boolean isValid = ValidateUtil.validateMail("pkpgmail.com");
		System.out.println("The emailid is valid?" + isValid);
	}

	public static void main(String[] args) {
		EmailValidateUtil test = new EmailValidateUtil();
		test.validateMail_withValidateMailId();
		test.validateMail_withInValidateMailId();
		
	}
}
