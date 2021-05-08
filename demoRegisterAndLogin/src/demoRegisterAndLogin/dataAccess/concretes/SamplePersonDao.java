package demoRegisterAndLogin.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import demoRegisterAndLogin.dataAccess.interfaces.PersonDao;
import demoRegisterAndLogin.entities.abstracts.Person;

public class SamplePersonDao implements PersonDao {

	List<Person> persons = new ArrayList<Person>();

	@Override
	public void add(Person person) {
		persons.add(person);
		person.setVerified(false);
		System.out.println("Örnek ekleme işlemi gerçekleşti: " + person.getFirstName());
	}

	@Override
	public void update(Person person) {
	}

	@Override
	public void delete(Person person) {
	}

	@Override
	public boolean ifEmailExists(String eMail) {
		for (Person person : persons) {
			if (person.geteMail() == eMail) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean checkPassword(String password) {
		for (Person person : persons) {
			if (person.getPassword() == password) {
				return true;
			}
		}

		return false;
	}

	@Override
	public Person getByEmail(String eMail) {
		for (Person person : persons) {
			if (person.geteMail() == eMail) {
				return person;
			}
		}
		return null;
	}

}
