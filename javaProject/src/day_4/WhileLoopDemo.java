package day_4;

public class WhileLoopDemo {

	public static void main(String[] args) 
	{
		// Example 1
		
		/*int i = 1;			// Initialisation
		while(i<11)		//Condition
			{
			
			System.out.println(i);
			//i++;
			
			}*/
		
		
		//--------------- Example 2 ------------------
		// Even numbers 1 to 20
		
		// Approach 1 
		
		int i = 20;
		
		/*while(i<=20)
		{
			System.out.println(i);
			i+=2;
			
		}*/
		
		/*while(i<=20)
		{
			if(i%2==0)
				System.out.println("Even number "+i);
			else
				System.out.println("odd number " +i);
			i++;
			
		}*/

		while(i>=1)
		{
			System.out.println(i);
			i--;
		}
		
	}

}
