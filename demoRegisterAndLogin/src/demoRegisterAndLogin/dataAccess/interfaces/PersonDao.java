package demoRegisterAndLogin.dataAccess.interfaces;

import demoRegisterAndLogin.entities.abstracts.Person;

public interface PersonDao {

	void add(Person person);

	void update(Person person);

	void delete(Person person);

	boolean ifEmailExists(String eMail);
	
	Person getByEmail(String eMail);
	
	boolean checkPassword(String password);

}
