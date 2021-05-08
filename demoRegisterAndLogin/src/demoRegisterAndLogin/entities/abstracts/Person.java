package demoRegisterAndLogin.entities.abstracts;

import demoRegisterAndLogin.entities.interfaces.Entity;

public abstract class Person implements Entity {

//	Kullanıcı tarafında neden en üst yapı Person?
//	Çünkü ister kurumsal üye, ister kişisel üye, ister web servis olsun daima bir gerçek kişi/insan üzerinden sisteme dahil olmasını istiyorum.
//	İlgili üyeliğin sorumlusu bir gerçek kişi olacak her zaman.

//	Peki neden abstract class?
//	Sadece referans tutan bir class işime yaramaz çünkü Person nesnesinde her bir kullanıcı/user için gerekli field ve getter setter metodları 1 kez tanımlamak istedim.

	private int id;
	private String firstName;
	private String lastName;
	private String eMail;
	private String password;
	private String nationalityId;
	private String phoneNumber;
	private boolean isVerified;

	public Person() {
		super();
	}

	public Person(String firstName, String lastName, String eMail, String password, String nationalityId,
			String phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.password = password;
		this.nationalityId = nationalityId;
		this.phoneNumber = phoneNumber;
	}

//	id alanı için set metodu yazmadım.
//	Çünkü id alanı arayüzde set edilemesin, veri tabanında otomatik atansın diye.

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

}
