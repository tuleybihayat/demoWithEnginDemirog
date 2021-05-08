package demoRegisterAndLogin.entities.concretes;

import demoRegisterAndLogin.entities.abstracts.Person;

public class IndividualUser extends Person {

	public IndividualUser() {
		super();
	}

	public IndividualUser(String firstName, String lastName, String eMail, String password, String nationalityId,
			String phoneNumber) {
		super(firstName, lastName, eMail, password, nationalityId, phoneNumber);
		// TODO Auto-generated constructor stub
	}

}
