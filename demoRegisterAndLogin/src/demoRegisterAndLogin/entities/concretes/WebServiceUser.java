package demoRegisterAndLogin.entities.concretes;

import demoRegisterAndLogin.entities.abstracts.Person;

public class WebServiceUser extends Person {

	public WebServiceUser() {
		super();
	}

	public WebServiceUser(String firstName, String lastName, String eMail, String password, String nationalityId,
			String phoneNumber) {
		super(firstName, lastName, eMail, password, nationalityId, phoneNumber);

	}

}
