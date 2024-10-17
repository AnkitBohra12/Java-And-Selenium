package Day11;

public class StudentMain {

	public static void main(String[] args) {
		
		//Student stud = new Student();
		
		// 1) using object reference variables 
		/*stud.sid = 101;
		stud.sname = "John";
		stud.grad = 'A';
		
		stud.printStudentData();
		System.out.println();*/
		
		
		// 2) using method - we used it for creating and implementing a logic or calculation
				
		//stud.setStudentData(101,"john",'A');
		//stud.printStudentData();
		
		
		// 3) using constructor
		// method name could be anything 
		// but constructor should have name of class
		// Constructor cannot return any value not even void
		// Constructor take parameters
		// used for assigning the data into variables
		Student stud = new Student(101,"john",'A');
		stud.printStudentData();
	
	}

}
