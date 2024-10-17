package AssignmentDay5;

public class CountNumberIsEvenOrOdd {

	public static void main(String[] args) 
	{
		// 	count number of even and odd digits in a number
		//	input : 23456
		//	output : 3 even 2 odd
		
		int a = 23456;
		
		int even = 0;
		int odd = 0;
		
		while(a>0) {
			
			int rem = a % 10;
			
			if(a % 2 ==0) {
				even++;
			}
			
			else {
				odd++;	
			}
			
			a = a/10;
		}
		
		System.out.println("count of even number : " + even);
		System.out.println("count of odd number : " + odd);
	}
}
