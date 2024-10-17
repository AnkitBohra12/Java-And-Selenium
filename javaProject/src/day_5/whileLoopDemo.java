package day_5;

public class whileLoopDemo 
{
	public static void main(String[] args)
	{
		// Example 1: print 1 to numbers
		
		/*int a = 1;
		
		while(a<=10)
		{
			System.out.println(a);
			a++;	
		}*/
		
		// Example 2 : printing hello message 10 times
		
		int i = 1;
		
		while(i<=10)
		{
			System.out.println("hello");
			i++;
		}
		
		// Example 3 : Print even numbers b/w 1 to 10
		
		/*int e = 2;
		
		while(e <= 10)
		{
			System.out.println(e);
			e+=2;				// e = e+2
		}*/
		
		// approach 2 
		int e = 2;
		
		while(e <= 10)
		{
			if(e%2==0)
			{
				System.out.println(e + " Even");
			}
			else
			{
				System.out.println(e + " Odd");
			}
			e++;
			
		}
		
		
		// Example 4 : Print 10-------------------1
		
		int dec = 10;
		
		while(dec>=1)
		{
			System.out.println(dec);
			dec--;
		}
		
		

	}
	
	
}
