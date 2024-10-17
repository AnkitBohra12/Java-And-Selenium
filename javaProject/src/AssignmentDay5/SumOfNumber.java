package AssignmentDay5;

public class SumOfNumber {

	public static void main(String[] args) 
	{
		// find sum of digits in a number
		//	input : 1234
		//	sum = 10
		
		int a = 1234;
		
		int sum = 0;
		
		while(a>0) {
			
		
			sum = sum + a % 10; // 4
			a = a/10; // 123 // return the rest of the number
			
			
		}
		
		System.out.println("Sum of number : " + sum);
		
		
	}

}
