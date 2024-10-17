	package day_5;

public class ForLoopDemo {

	public static void main(String[] args) 
	{
		// 1-----10 numbers 
		
		/*for(int i=1; i<=10; i++) 
		{
			System.out.println(i);
		}	*/
		
		
		// 1------10 even numbers
		
		for(int i = 2; i<=10; i+=2) 
		{
			System.out.println(i);
		}
		
		
		// Example :- 1------10 print odd and even like 1 is odd 
		
		for(int i=1; i<=10; i++) 
		{
			if(i%2==0) {
				System.out.println(i + " is Even");
			}
			else {
				System.out.println(i + " is Odd");
			}
		}
		
		
		// Example :- 10----------------1 desc 
		
		for(int i=10; i>0; i--) {
			System.out.println(i);
		}
		
		
		
		
		
		
	}

}
