package groupc.hw2;

import groupc.hw2.student.StudentManager;

public class Main {

	public static void main(String[] args) {
		
		

		// Instantiate StudentManager, perform operations based on the requirements.
		StudentManager studentManager = new StudentManager();
		
		// Instantiate StudentManager2, to perform operations to test edge cases.
		StudentManager studentManager2 = new StudentManager();
		
		
		// Attempt to read student data from a file and initialize Student objects. - success
		boolean fileReadStatus = studentManager.readFromFile("studentData.txt");
		if(fileReadStatus == true) {
			System.out.println("FileReadStatus Given Valid Path (\"studentData.txt\"): Successful");
		} else {
			System.out.println("FileReadStatus Given Valid Path (\"studentData.txt\"): Failed");
		}
		
		// Attempt to read student data from a file and initialize Student objects, but no file found - failure
		boolean fileReadStatus2 = studentManager2.readFromFile(null); 
		if(fileReadStatus2 == true) {
			System.out.println("FileReadStatus Given Invalid Path (null): Successful");
		} else {
			System.out.println("FileReadStatus Given Invalid Path (null): Failed");
		}
		
		
		// Display all students  - successful case
		System.out.println("\nDisplay the Students on the successfully initialized student object");
		studentManager.displayStudents();
		
		// Display all students  - unsuccessful case
		System.out.println("\nDisplay Students on the unsuccessfully initialzed student object");
		studentManager2.displayStudents();

		
		// Search for a student by ID. - successful case
		System.out.println("\nSearch for Student - successful case:");
		System.out.println(studentManager.searchStudentById(101));
		
		// Search for a student by ID. - unsuccessful case 
		System.out.println("\nSearch for Student - unsuccessful case:");
		studentManager2.searchStudentById(102);
		
		
		// Update the grade of a student by ID. -successfully
		System.out.println("\nUpdating Grade - successful case");
		studentManager.updateStudentGradeById(102, 95);
		
		// Display all students after the update.
		System.out.println("\nDisplay all students after the successful update");
		studentManager.displayStudents();
		
		//update the grade of a non-existent student in non-existent array
		System.out.println("\nTesting a non-existent array of students for update");
		studentManager2.displayStudents();
		boolean studentGradeUpdateStatus2 = studentManager2.updateStudentGradeById(104, 92);
		if(studentGradeUpdateStatus2 == false) {
			System.out.println("No student to update (displaying in main)");
		}
		studentManager2.displayStudents();
		
		//update the grade of a non-existent student in an existing array
		System.out.println("\nTesting an existing array of students for update, where the student doesn't exist");
		studentManager.displayStudents();
		studentManager.updateStudentGradeById(112,80);
		studentManager.displayStudents();
		

	}

}
