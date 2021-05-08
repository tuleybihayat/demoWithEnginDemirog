package demoRegisterAndLogin;

import demoRegisterAndLogin.business.concretes.PersonManager;
import demoRegisterAndLogin.business.interfaces.PersonService;
import demoRegisterAndLogin.core.concretes.EmailValidationManager;
import demoRegisterAndLogin.core.concretes.GoogleLoginAdapter;
import demoRegisterAndLogin.core.concretes.MailManager;
import demoRegisterAndLogin.core.interfaces.OtherLoginService;
import demoRegisterAndLogin.dataAccess.concretes.SamplePersonDao;
import demoRegisterAndLogin.entities.abstracts.Person;
import demoRegisterAndLogin.entities.concretes.CorporateUser;
import demoRegisterAndLogin.entities.concretes.IndividualUser;

public class Main {

	public static void main(String[] args) {
		
		Person person1 = new IndividualUser();
		person1.setFirstName("emre");
		person1.setLastName("şahin");
		person1.seteMail("deneme@deneme.com");
		person1.setPassword("123456");
		
		Person person2 = new CorporateUser();
		person2.seteMail("denemex@deneme.com");
		person2.setFirstName("ahmet");
		person2.setLastName("maranki");
		person2.setPassword("123456");
		
		PersonService personManager = new PersonManager(new EmailValidationManager(), new SamplePersonDao(), new MailManager());
		personManager.register(person1);
		System.out.println("-*-*-*-*-*-*-*-*-*-");

		personManager.register(person2);
		
		System.out.println("-*-*-*-*-*-*-*-*-*-");
		System.out.println("kullanıcıların email link doğrulaması manuel olarak yapıldı.");
		System.out.println("-*-*-*-*-*-*-*-*-*-");

		person1.setVerified(true);
		person2.setVerified(true);
		
		personManager.login(person1);
		personManager.login(person2);
		
		System.out.println("-*-*-*-*-*-*-*-*-*-");
		
		OtherLoginService googleLoginAdapter = new GoogleLoginAdapter();
		googleLoginAdapter.registerWith();

		System.out.println("-*-*-*-*-*-*-*-*-*-");
		
		googleLoginAdapter.loginWith();


		
		
	
		

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
