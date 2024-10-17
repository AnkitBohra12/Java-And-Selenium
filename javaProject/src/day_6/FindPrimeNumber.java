package day_6;

public class FindPrimeNumber {

	public static void main(String[] args) {
		
		int a = 2;
		int count = 0;
		
		if(a>1) 						// first condition if the number is greater than 1
		{
			for(int i =1; i<=a; a++) 
			{
				if(a%i==0) 				// second condition 
				{
					count++;			// how many no able to divide this no
				}
			}
			if(count==2) 				// third condition
			{
				System.out.println("prime number");
			}
			else 
			{
				System.out.println("not a prime number");
			}
		}
		else {
			System.out.println("Not a prime number");
		}

	}

}