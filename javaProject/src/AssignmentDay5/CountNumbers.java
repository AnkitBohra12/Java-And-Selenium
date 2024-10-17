package AssignmentDay5;

public class CountNumbers {

	public static void main(String[] args) 
	{
		// count number of digits in a number
		//	input : 423424
		//	output : 6
		
		int a = 423424;
		
		int count = 0;
		
		while (a>0) 
		{
			a = a/10;
			count++;
		}
		System.out.println("Numbers of digits : " + count);
		

	}

}
