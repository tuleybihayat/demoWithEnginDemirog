package demoKodlamaIO;

public class Student extends User {
	
	private String studentNumber;
	
	
	public Student() {
		super();
		
	}
	

	public Student(int id, String name, String email, String studentNumber) {
		super(id, name, email);
		this.studentNumber = studentNumber;
	}
	
	// source - generate getter setter seçeneği ile oluşturdum.
	// studentNumber değişkenine elime private verdim.
	
	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	
	

	
	

}
