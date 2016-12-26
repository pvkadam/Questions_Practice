import java.util.*;

public class main {
	public static void main (String[] args) {
		student student1 = new student(1, "james", 12, "abcd@abcd", 89);
		student student2 = new student(2, "lyndsay", 12, "adffr@abcd", 91);
		student student3 = new student(3, "han", 11, "abcrgrgd@abcd", 45);
		student student4 = new student(4, "yolo", 12, "abvfdvefcd@abcd", 32);
		student student5 = new student(5, "matt", 11, "abcwrfrd@abcd", 75);
		student student6 = new student(6, "harvey", 12, "ar33bcd@abcd", 77);
		student student7 = new student(7, "harry", 11, "abc4t34gd@abcd", 65);
		student student8 = new student(8, "chloe", 12, "abcgssrgrd@abcd", 92);
		student student9 = new student(9, "linda", 11, "abgrgikrcd@abcd", 57);
		student student10 = new student(10, "duncan", 12, "abjumnycd@abcd", 29);
		
		
		ArrayList<student> listOfStudents1 = new ArrayList<student>();
		listOfStudents1.add(student1);
		listOfStudents1.add(student2);
		listOfStudents1.add(student3);
		listOfStudents1.add(student4);
		listOfStudents1.add(student5);
		
		
		ArrayList<student> listOfStudents2 = new ArrayList<student>();
		listOfStudents2.add(student6);
		listOfStudents2.add(student7);
		listOfStudents2.add(student8);
		listOfStudents2.add(student9);
		listOfStudents2.add(student10);
		

		teacher teacher1 = new teacher(1110, "Samantha", 47,  "vhecarg@iuehrt", "Physics", 15, 65000);
		classSection section9A = new classSection(listOfStudents1, 'A', teacher1);
		
		System.out.println("Average of class 9A is " + section9A.getClassAverage());
		System.out.println("Number of students who failed in class 9A are: " + section9A.getFailedStudents());
		
		System.out.println("------------------------------");
		
		teacher teacher2 = new teacher(1210, "Heather", 47,  "ccrg@iuehrt", "Math", 20, 75000);
		classSection section9B = new classSection(listOfStudents2, 'B', teacher2);
		
		System.out.println("Average of class 9B is " + section9B.getClassAverage());
		System.out.println("Number of students who failed in class 9B are: " + section9B.getFailedStudents());
		
		
		System.out.println("------------------------------");
		
		ArrayList<classSection> grade9Sections = new ArrayList<classSection>();
		grade9Sections.add(section9A);
		grade9Sections.add(section9B);

		teacher grade9Head = new teacher(1410, "Flynn", 57,  "chj@orutr", "All Subjects", 25, 105000);
		grade grade9 = new grade(grade9Sections, grade9Head);

		System.out.println("Grade 9 average is " + grade9.computeGradeAverage());
		System.out.println("Total students who failed in grade 9 are: " + grade9.gradeNumberOfFailedStudents());
		
		
		System.out.println("------------------------------");
		

	}
	
}
