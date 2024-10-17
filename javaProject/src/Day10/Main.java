package Day10;

public class Main {

	public static void main(String[] args) {
			
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
			
			
			// Student class
			
			Student s1 = new Student();
			s1.rollNo = 1;
			s1.StudName = "Shubham";
			s1.Class = 10;
			s1.display();
			System.out.println();
			
			Student s2 = new Student();
			s2.rollNo = 2;
			s2.StudName = "Ushmita";
			s2.Class = 12;
			s2.display();
			

	}

}
