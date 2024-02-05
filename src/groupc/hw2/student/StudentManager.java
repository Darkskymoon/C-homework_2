package groupc.hw2.student;

import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * Class: StudentManager
 * This class extends the Student class and handles all of the main logic of the program
 */
public class StudentManager extends Student{
	Student[] student = new Student[0];
	
	
	/*
	 * Method: readFromFile
	 * This method reads data from a file to initialize the students in the student manager
	 * @Param fileName	The file that is to be read from that contains student data
	 * @author
	 * @return indication that reading/initialization of a file was successful or not. True=successful. False=Failed
	 * 
	 * Note: Used Code from L2 slides for inspiration on how to write file scanning logic
	 */
	public boolean readFromFile(String fileName)
	{
		Scanner fileScanner = null ; // initializes fileScanner to null
		try
		{
			// Attempt to open the file
			fileScanner = new Scanner(new FileInputStream("./src/groupc/hw2/files/" + fileName));
			
			// While there is a student to read in...
			while(fileScanner.hasNextLine()) {
				
				// Get each part of student's info
				int id = fileScanner.nextInt();
				String name = fileScanner.next() + " " + fileScanner.next();
				double grade = fileScanner.nextDouble();
				fileScanner.nextLine();
				
				// Create Student object using info
				Student newStudent = new Student(id, name, grade);
				
				// Copy array "student" and increase size so newStudent can fit
				int N = student.length;
			    student = Arrays.copyOf(student, N + 1);
			    student[N] = newStudent;
			}
			
			// Return true to indicate file was successfully found and read
			return true;
		}
		catch (FileNotFoundException e)
		{
			// If the file could not be found or reading/initialization failed, we alert user with print statement and return false
			System.out.println("File not found or Error occured in the file reading/initialization process");
			return false;
		}
	}
	
	/*
	 * Method: displayStudents()
	 * This method displays student details that have been initialized in the StudentManager.
	 * The student details included are id, name, and grade. If there are no students a message is displayed indicating that no students were found.
	 * @author
	 */
	public void displayStudents() {
		
	}
	
	/*
	 * Method: searchStudentById
	 * This method locates a student by their id number and displays the details of that student
	 * @param id	The id of the student that the user is trying to find
	 * @return returns false if no student was found. returns true if a student was found
	 */
	public boolean searchStudentById(int id) {
		//Using a forEach loop to iterate through student array 
		for (Student student : student) {
			//When ID is matched with an element in the array, return the data
			if (id == student.getId()) {
				System.out.println(student.toString());
			}
		}
		return false;
	}
	
	
	/*
	 * Method: updateStudentGradeByID
	 * This method updates a student's grade information by searching by their ID
	 * @param id	The id of the student that should be updated
	 * @param grade	the updated grade value (as a double value) that should replace the existing grade 
	 * @return	returns false if a student wasn't found. Returns true if the update was successful
	 */
	public boolean updateStudentGradeByID(int id, double grade) {
		return false;
	}

}
