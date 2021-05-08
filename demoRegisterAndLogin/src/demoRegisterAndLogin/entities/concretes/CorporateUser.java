package demoRegisterAndLogin.entities.concretes;

import demoRegisterAndLogin.entities.abstracts.Person;

public class CorporateUser extends Person {

	public CorporateUser() {
		super();
	}

	public CorporateUser(String firstName, String lastName, String eMail, String password, String nationalityId,
			String phoneNumber) {
		super(firstName, lastName, eMail, password, nationalityId, phoneNumber);
		// TODO Auto-generated constructor stub
	}

//	private String companyName;
//	private String taxId;

}
