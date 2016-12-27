
public abstract class person {

	private int ID;
	private String fullName;
	private int age;
	private String email;
	
	public person (int ID, String fullName, int age, String email) {
		this.ID = ID;
		this.fullName = fullName;
		this.age = age;
		this.email = email;
	}
	
	public int getID() {
		return ID;
	}

	public String getFullName() {
		return fullName;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

}
