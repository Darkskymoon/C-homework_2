package groupc.hw2.student;
/*
 * Class: StudentManager
 * This class extends the Student class and handles all of the main logic of the program
 */
public class StudentManager extends Student{
	Student[] student;
	
	
	/*
	 * Method: readFromFile
	 * This method reads data from a file to initialize the students in the student manager
	 * @Param fileName	The file that is to be read from that contains student data
	 * @author
	 * @return indication that reading/initialization of a file was successful or not. True=successful. False=Failed
	 */
	public boolean readFromFile(String fileName)
	{
		return false;
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
