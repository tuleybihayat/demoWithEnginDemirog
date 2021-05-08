package demoRegisterAndLogin.business.concretes;

import demoRegisterAndLogin.business.interfaces.PersonService;
import demoRegisterAndLogin.core.concretes.EmailValidationManager;
import demoRegisterAndLogin.core.interfaces.MailService;
import demoRegisterAndLogin.core.interfaces.OtherLoginService;
import demoRegisterAndLogin.dataAccess.interfaces.PersonDao;
import demoRegisterAndLogin.entities.abstracts.Person;

public class PersonManager implements PersonService {

	EmailValidationManager emailValidationManager;
	PersonDao personDao;
	MailService mailService;
	OtherLoginService otherLoginService;

	public PersonManager(EmailValidationManager emailValidationManager, PersonDao personDao, MailService mailService) {
		super();
		this.emailValidationManager = emailValidationManager;
		this.personDao = personDao;
		this.mailService = mailService;
	}
	


	@Override
	public void register(Person person) {

		if (person.getFirstName() == null || person.getLastName() == null || person.geteMail() == null
				|| person.getPassword() == null || person.getFirstName().length() < 2
				|| person.getLastName().length() < 2 || person.getPassword().length() < 6) {
			System.out.println("Kullanıcı eklenemedi, alanlardan biri eksik ya da olması gerekenden kısa > "
					+ person.getFirstName());
		} else {
			if (emailValidationManager.isValid(person.geteMail()) && !personDao.ifEmailExists(person.geteMail())) {
				mailService.sendMail(person.geteMail());
				personDao.add(person);
			} else {
				System.out.println("Kullanıcı eklenemedi, mail adresi hatalı ya da sistemde daha önceden kayıtlı > "
						+ person.getFirstName());
			}
		}
	}


	@Override
	public void login(Person person) {

//		Scanner input = new Scanner(System.in);
//		System.out.println("mail giriniz: ");
//		String inputMail = input.nextLine();
//		System.out.println("girilen mail: " + inputMail);

		if (personDao.getByEmail(person.geteMail()) != null) {
//			System.out.println("parola giriniz: ");
//			String inputPassword = input.nextLine();
//			System.out.println("girilen parola: " + inputPassword);

			if (personDao.checkPassword(person.getPassword())) {
				if (person.isVerified()) {
					System.out.println("sisteme girişiniz gerçekleşti.");
				} else
					System.out.println("parola hatalı");
			} else
				System.out.println("şifre hatalı");
		} else
			System.out.println("böyle bir kullanıcı yok");
//		input.close();

//		

	}

	@Override
	public void delete(Person person) {
	}

	@Override
	public void update(Person person) {
	}

}
