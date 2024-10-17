package TypeCasting;

public class Employee 
{
	// Variables 
	int emp_id;
	String emp_name;
	String emp_job;
	int emp_salary;
	
	void display()
	{
		System.out.println(emp_id);
		System.out.println(emp_name);
		System.out.println(emp_job);
		System.out.println(emp_salary);
	}
	
	void set_data(String name, int sal, String job, int id)
	{
		emp_id = id;
		emp_name = name;
		emp_job = job;
		emp_salary = sal;
	}
	
	Employee(String name, int sal, int id)	// constructor
	{
		emp_id = id;
		emp_name = name;
		emp_salary = sal;
	}
	
	/*public static void main(String[] args) 
	{
		Employee obj = new Employee();
		obj.emp_id = 98;
		obj.emp_name = "John";
		obj.emp_job = "SDE";
		obj.emp_salary = 100000;
		
		obj.display();

	}*/

}
