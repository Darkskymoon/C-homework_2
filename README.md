# C-homework_2

_**Authors:**_
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
- Darkskymoon - Zoe
- Derbzzzzzz - Ryan
- andopepe - Ando
- LinYu-Ch - John

_**Description:**_
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
This Project is a program that manages students. It allows the user to read from a file to add students to the program, and then there are options to display the students, search for a particular student, and update student information by searching by ID.

**Included Methods:**
1. readFromFile(String fileName): 
    - Will read from a file passed in via string and initialize the Student objects.
    - Returns false if reading from the file fails.
    - For the other functions to work correctly, without returning false or indicating an error, this must be called first.
2. displayStudents()
    - Displays all the current students in the student manager. Includes details such as id, name, and grade.
    - Displays appropriate message for when no students are in the student manager.
3. searchStudentById(int id)
    - Performs a search across all of the students in the student manager for a particular student with the given integer ID.
    - Returns false if no student with matching ID was found and displays an appropriate error message.
4. updateStudentGradeById(int id, double grade)
    - Checks to see if a student with a particular ID (passed as an integer) exists, and if so, updates their grade with whatever grade (double) was passed in.
    - Returns false if student was not found.

**_Running The Code:_**
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
There is not any dependencies needed to run the code. To run the code simply clone the repository into eclipse:
**"git clone https://github.com/Darkskymoon/C-homework_2.git"**
Main is located in src/groupc/hw2/main.java
