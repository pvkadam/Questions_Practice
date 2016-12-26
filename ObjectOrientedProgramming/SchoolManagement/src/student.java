
public class student extends person {

	private int score;
	
	public student (int ID, String fullName, int age, String email, int score) {
		super (ID, fullName, age, email);
		this.score = score;
	}
	
	public int getScore() {
		return score;
	}
}
