package demoRegisterAndLogin.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import demoRegisterAndLogin.core.interfaces.ValidationService;

public class EmailValidationManager implements ValidationService {

	private static final String eMailPattern = "^(.+)@(\\S+)$";
	private static final Pattern pattern = Pattern.compile(eMailPattern);


	public boolean isValid(String eMail) {

		Matcher matcher = pattern.matcher(eMail);
		return matcher.matches();

//		mailin daha önce kullanılıp kullanılmadığını kontrol et
	}

}
