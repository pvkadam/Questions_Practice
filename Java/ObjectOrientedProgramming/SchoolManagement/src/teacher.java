
public class teacher extends person {

	private String subject;
	private int yearsOfExperience;
	private int salary;
	
	public teacher (int ID, String fullName, int age, String email, String subject, int yearsOfExperience, int salary) {
		super (ID, fullName, age, email);
		this.subject = subject;
		this.yearsOfExperience = yearsOfExperience;
		this.salary = salary;
	}
	
	public String getSubject() {
		return subject;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	
	public int getSalary() {
		return salary;
	}
}
