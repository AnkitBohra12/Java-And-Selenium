package Day3;

public class DecrementOperators 
{
	public static void main (String[] args)
	{
		//Case 1
		int a=10;
		System.out.println(a);
		a--;					//a=a-1; a-=1;
		System.out.println(a);
		
		
		//Case 2 
		//post-decrement ----> first value will assign to the variable then it will increment
		int b=100;
		int result = b--;
		System.out.println(result);
		
		//Case 3
		// pre-decrement ---> first increment will happen then assignment will happen
		int c = 100;
		int res = --c;
		System.out.println(res);
		
	}
}