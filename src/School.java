import java.util.ArrayList;

public class School {
	
	//Variables for this class
	
	Library library;
	ArrayList<Student> students = new ArrayList<Student>();
	  	int numStudents = 0;
	    String name = "Great School";
	    int MAX_STUDENTS = 0;
	

	/**
	 * Start the execution of your program here.
	 * 
	 * --------------INSTRUCTIONS----------------
	 * 1. The main method should create a school, add books to its catalog, and print all the books in its catalog.
	 
	*/
	    public static void main(String args[]) {
	    School mySchool = new School("Hogwarts", 7500);
	    		
	    mySchool.AddSingleStudent("Mauricio", "Martinez", Student.Gender.MALE, 1);
	    		
	    mySchool.AddSingleStudent("Daniel", "Andrade", Student.Gender.MALE, 3);
	    		
	    mySchool.AddSingleStudent("Maria", "Granados", Student.Gender.FEMALE, 2);
	    	
	    mySchool.removeSingleStudent();
	
	
		
	/**
	 * 2. After printing the books, the program should add students and print the total number of student.
	 * 
	 *  */
	  System.out.println(mySchool.toString());	
		
	/**	
	 * 3. Finally, the program should call other methods that you design and print anything that makes sense for a school.
	 *  */ 
	  System.out.println(mySchool.getInfo());
  	}
	    /**
	 * Thoughts:
	 * Schools have books, students, teachers, principles, classes.
	 * Add students, remove students, add teachers, open the school, close the school.
	 */ 
		
		
	/**
		 
	 * ----------------CHALLENGE:----------------
	 * 
	 * Can a school have a library? How would this be represented within the school?
	 * 
	 */
	
		//TODO create a school (similar to the library)
		
		//TODO Print the toString method in school. Such as, school.toString()
		
		//TODO Print any other variables that make sense for a school. Be creative.
	
	/**
	 * Constructs a school.
	 * this.name refers to the global variable for the class. String name is the name we pass in when building the school
	 * @param name
	 */
       
	 	public School(String name, int maxStudents) {
	  	this.name = name;
	 	this.MAX_STUDENTS = maxStudents;
	 	this.library = new Library ();
	  	}
	
	
	/**
	 * Write a method to return a list of all books at the school
	 */
	 	public String toString() {
	 //TODO Write a method to return a list of all books at the school
	     
	     String returnString = "School: '" + this.name + "'\n  School library:\n";	
	      returnString += library;
	 	return returnString;
	  }
	
	/**
	 * adds a single student to the school
	 */
	 	public void AddSingleStudent(String firstName, String lastName, Student.Gender gender, int grade) {
	 	if(numStudents < MAX_STUDENTS) {
	 	numStudents++;
	    students.add(new Student (firstName, lastName, gender, grade));
	 			
	 	}
	}
	/**
	 * removes a single student from the school
	 */
	 	public void removeSingleStudent() {
	  		if(numStudents > 0) {
	  			numStudents--;
	  students.remove(students.size()-1);
	  		}
	 	}
	/**
	 * method to return number of students
	 * 
	 * @return number of students in the school
	 */
	 	public String getInfo() {
	 	String returnString = "School: '" + this.name + "', number of students " + this.numStudents + " of capasity " + this.MAX_STUDENTS;
	 
	    returnString += "\nStudents:\n";
	 	for (Student s : students ) {
	 	returnString += "    " + s + "\n";
	 		}
	 	return returnString;
	 		 	}
	 		}

