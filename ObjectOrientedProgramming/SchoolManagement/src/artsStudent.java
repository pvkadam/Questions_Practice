
public class artsStudent extends student{
	private int artsScore;
	
	public artsStudent (int ID, String fullName, int age, String email, int score, int artsScore) {
		super (ID, fullName, age, email, score);
		this.artsScore = artsScore;
	}
	
	public int getScienceScore() {
		return artsScore;
	}

}
