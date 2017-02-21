import java.util.*;

public class grade {

	private teacher gradeHead;
	private ArrayList<classSection> listOfSections;
	private int numberOfSections;
	private int gradeAverage;
	private int gradeFailedStudents;
	
	public grade (ArrayList<classSection> listOfSections, teacher gradeHead) {
		this.listOfSections = listOfSections;
		this.gradeHead = gradeHead;
		this.numberOfSections = listOfSections.size();
	}
	
	public int computeGradeAverage() {
		
		int totalClassSectionAverage = 0;
		
		for (classSection classSection: listOfSections) {
			totalClassSectionAverage += classSection.getClassAverage();
		}
		
		return totalClassSectionAverage/numberOfSections;
	}
	
	public int gradeNumberOfFailedStudents() {
		int totalStudents = 0;
		
		for (classSection classSection: listOfSections) {
			totalStudents += classSection.getFailedStudents();
		}
		
		return totalStudents;
	}
	
	public teacher getGradeHead() {
		return gradeHead;
	}

	public ArrayList<classSection> getListOfSections() {
		return listOfSections;
	}

	public int getNumberOfSections() {
		return numberOfSections;
	}

	public int getGradeAverage() {
		return gradeAverage;
	}

	public int getGradeFailedStudents() {
		return gradeFailedStudents;
	}
	
}
