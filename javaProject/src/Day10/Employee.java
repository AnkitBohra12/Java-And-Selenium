package Day10;

public class Employee {
	
	// Variables 
	int eid;
	String ename;
	String job;
	int sal;
	
	//Methods
	void display(){				// method return some value what this method will be return we have to specify that  
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
	}
	
	// objects can only created into main method
	/*public static void main(String[] args) {
		
		Employee emp1 = new Employee();		// Object
		emp1.eid=101;
		emp1.ename="john";
		emp1.job="manager";
		emp1.sal=50000;
		emp1.display();
		
		System.out.println();
		
		Employee emp2 = new Employee();
		emp2.eid = 202;
		emp2.ename = "Shreya";
		emp2.job = "HR";
		emp2.sal = 30000;
		emp2.display();

	}*/

}
