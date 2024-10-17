package TypeCasting;

public class Employee_Main 
{
	public static void main(String[] args)
	{
		Employee obj = new Employee();		// obj 
		obj.emp_id = 78;
		obj.emp_name = "Marry";
		obj.emp_job = "SDET";
		obj.emp_salary = 98000;
		
		obj.display();
		
		
		Employee obj_1 = new Employee();
		obj_1.emp_id = 88;
		obj_1.emp_name = "Marin";
		obj_1.emp_job = "Engineer";
		obj_1.emp_salary = 78000;
		
		obj_1.display();
		
		obj.set_data("Ankit", 300000, "HR", 10);
		obj.display();
	}
	
}
