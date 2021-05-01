package org.comp.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUtil {
	public static boolean validateMail(String emailId) {
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(emailId);
		boolean isValid = matcher.matches();

		return isValid;

	}

	public static boolean validateMobileNumber(long mobileNo1) {

		String regex = "\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}";
		Pattern pattern = Pattern.compile(regex);
		String str = Long.toString(mobileNo1);

		Matcher matcher = pattern.matcher(str);
		boolean isValidMobileNo = matcher.matches();
		return isValidMobileNo;
	}

}
