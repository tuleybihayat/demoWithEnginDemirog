package demoRegisterAndLogin.business.interfaces;

import demoRegisterAndLogin.entities.abstracts.Person;

public interface PersonService {

	void register(Person person);

	void login(Person person);

	void update(Person person);

	void delete(Person person);

}
