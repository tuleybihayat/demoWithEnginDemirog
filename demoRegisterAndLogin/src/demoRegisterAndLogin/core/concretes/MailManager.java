package demoRegisterAndLogin.core.concretes;

import java.util.List;

import demoRegisterAndLogin.core.interfaces.MailService;

public class MailManager implements MailService {

	@Override
	public void sendMail(String eMail) {
		System.out
				.println("Doğrulama e-postası gönderildi:" + eMail + "\n" + "Lütfen e-posta adresinizi kontrol edin.");
	}

	@Override
	public void sendBulkMail(List<String> eMails) {
		System.out.println("Tüm kullanıcılara e-posta gönderildi.");
	}

}
