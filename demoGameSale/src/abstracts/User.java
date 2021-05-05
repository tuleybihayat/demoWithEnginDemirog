package abstracts;

public abstract class User {

	private int id;
	private String email;
	private String phone;
	private String adress;
		
//	name, firstname, lastname gibi alanlar farklı kullanıcı tiplerinde (person, corporate etc.) farklı şekillerde olacağı için burada yer verilmedi
//	private String name
//	private String firstName;
//	private String lastName;
	
	public User() {
	}
	
	public User(int id, String email, String phone, String adress) {
		super();
		this.id = id;
		this.email = email;
		this.phone = phone;
		this.adress = adress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
	
}
