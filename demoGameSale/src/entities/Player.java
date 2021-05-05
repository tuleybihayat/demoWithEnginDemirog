package entities;

import abstracts.User;

public class Player extends User {


	private String firsName;
	private String lastName;
	private int age;

	public Player() {
		
	}
	
	public Player(int id, String firsName, String lastName, int age) {
		super();
		super.setId(id);
		this.firsName = firsName;
		this.lastName = lastName;
		this.age = age;
	}

	public int getId() {
		return super.getId();
	}

	public void setId(int id) {
		super.setId(id);
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
