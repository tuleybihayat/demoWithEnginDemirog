package demoRegisterAndLogin.core.concretes;

import demoRegisterAndLogin.SignInWithGoogle.SignInWithGoogle;
import demoRegisterAndLogin.business.concretes.PersonManager;
import demoRegisterAndLogin.core.interfaces.OtherLoginService;
import demoRegisterAndLogin.dataAccess.concretes.SamplePersonDao;
import demoRegisterAndLogin.entities.abstracts.Person;

public class GoogleLoginAdapter implements OtherLoginService {
	
	Person person = new Person() {
		
	};	
	
	PersonManager personManager = new PersonManager(new EmailValidationManager(), new SamplePersonDao(), new MailManager());
	
	public GoogleLoginAdapter() {
		super();	
		
		SignInWithGoogle signInWithGoogle = new SignInWithGoogle();
		person.setFirstName(signInWithGoogle.adi);
		person.setLastName(signInWithGoogle.soyadi);
		person.seteMail(signInWithGoogle.ePosta);
		person.setPassword(signInWithGoogle.parola);
	}

		
	
	public void registerWith() {
		
//		SignInWithGoogle signInWithGoogle = new SignInWithGoogle();
//		person.setFirstName(signInWithGoogle.adi);
//		person.setLastName(signInWithGoogle.soyadi);
//		person.seteMail(signInWithGoogle.ePosta);
//		person.setPassword(signInWithGoogle.parola);
		
		
		personManager.register(person);
		person.setVerified(true);
	}

	@Override
	public void loginWith() {

		personManager.login(person);
		
	}


}
