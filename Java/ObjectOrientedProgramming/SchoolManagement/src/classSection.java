import java.util.*;

public class classSection {
	
	private char classType;
	private teacher teacher;
	private ArrayList<student> listOfStudents;
	private int numberOfStudents;
	private int classAverage;
	private int failedStudents;		//less than 55%
	private int gradeAStudents;
	
	public classSection (ArrayList<student> listOfStudents, char classType, teacher teacher) {
		this.listOfStudents = listOfStudents;
		this.classType = classType;
		this.teacher = teacher;
		this.numberOfStudents = listOfStudents.size();
		this.classAverage = average();
		this.failedStudents = numberOfFailedStudents();
		this.gradeAStudents = numberOfGradeAStudents();
	}
	
	
	public int average() {
		
		int totalScore = 0;
	
		for (student student: listOfStudents) {
			totalScore += student.getScore();
		}
		
		return totalScore/numberOfStudents;
	}
	
	public int numberOfFailedStudents() {
		int totalStudents = 0;
		
		for (student student: listOfStudents) {
			if (student.getScore() >= 0 && student.getScore() < 55) {
				totalStudents++;
			}
		}
		
		return totalStudents;
	}
	
	public int numberOfGradeAStudents() {
		int totalStudents = 0;
		
		for (student student: listOfStudents) {
			if (student.getScore() >= 85 && student.getScore() <= 100) {
				totalStudents++;
			}
		}
		
		return totalStudents;
	}
	
	public ArrayList<student> getListOfStudents() {
		return listOfStudents;
	}

	public char getClassType() {
		return classType;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}


	public int getClassAverage() {
		return classAverage;
	}


	public int getFailedStudents() {
		return failedStudents;
	}
	
	public int getGradeAStudents() {
		return gradeAStudents;
	}
	
	public teacher getTeacher() {
		return teacher;
	}
	
}
