package demoRegisterAndLogin.core.interfaces;

import java.util.List;

public interface MailService {

	void sendMail(String eMail);

	void sendBulkMail(List<String> eMails);

}
