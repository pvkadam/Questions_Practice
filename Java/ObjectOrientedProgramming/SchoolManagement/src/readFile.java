import java.io.*;
import java.util.*;
public class readFile {
	
	ArrayList<student> listOfStudentsA;
	ArrayList<student> listOfStudentsB;
	
	public void execute() {
		try {
			FileInputStream FIS = new FileInputStream("students.txt");
			DataInputStream DIS = new DataInputStream(FIS);
			BufferedReader BR = new BufferedReader(new InputStreamReader(DIS));
			String readLine;
			
			listOfStudentsA = new ArrayList<student>();
			listOfStudentsB = new ArrayList<student>();
			
			while ((readLine = BR.readLine()) != null) {
				String[] array = readLine.split("\t");
				
				char classType = array[0].charAt(0);
				
				switch (classType) {
					case 'A':
						student studentA = new student(Integer.parseInt(array[1]), array[2], Integer.parseInt(array[3]), array[4], Integer.parseInt(array[5]));
						listOfStudentsA.add(studentA);
						break;
						
					case 'B':
						student studentB = new student(Integer.parseInt(array[1]), array[2], Integer.parseInt(array[3]), array[4], Integer.parseInt(array[5]));
						listOfStudentsB.add(studentB);	
						break;
				}
						
			}
			
			BR.close();
		}
		
		
		catch (Exception e) {
			System.out.println("Error, cannot read file" + e);
		}
		
		teacher teacher1 = new teacher(1110, "Samantha", 47,  "vhecarg@iuehrt", "Physics", 15, 65000);
		teacher teacher2 = new teacher(1210, "Heather", 47,  "ccrg@iuehrt", "Math", 20, 75000);
		
		classSection section9A = new classSection(listOfStudentsA, 'A', teacher1);
		classSection section9B = new classSection(listOfStudentsB, 'B', teacher2);
		
		System.out.println("Average of class 9A is " + section9A.getClassAverage());
		System.out.println("Number of students who failed in class 9A are: " + section9A.getFailedStudents());
		
		System.out.println("------------------------------");
		
		System.out.println("Average of class 9B is " + section9B.getClassAverage());
		System.out.println("Number of students who failed in class 9B are: " + section9B.getFailedStudents());
	}
	
	public static void main (String[] args) {
		readFile file = new readFile();
		file.execute();
		
	}
	
	
}
