package demoKodlamaIO;

public class Instructor extends User {
	
	private String skill;
	
	public Instructor() {
		super();
		
	}

	public Instructor(int id, String name, String email, String skill) {
		super(id, name, email);
		this.skill = skill;
		
	}

	// refactor - encapsulate seçeneği ile oluşturdum
	// yukarıda private otomatik oluştu
	// aşağıdakilere otomatik public oluşturmadı
	
	String getSkill() {
		return skill;
	}

	void setSkill(String skill) {
		this.skill = skill;
	}

}

