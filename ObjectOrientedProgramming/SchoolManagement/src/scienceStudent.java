
public class scienceStudent extends student{

	private int scienceScore;
	
	public scienceStudent (int ID, String fullName, int age, String email, int score, int scienceScore) {
		super (ID, fullName, age, email, score);
		this.scienceScore = scienceScore;
	}
	
	public int getScienceScore() {
		return scienceScore;
	}

}
