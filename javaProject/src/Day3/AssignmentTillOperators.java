package Day3;

public class AssignmentTillOperators {

	public static void main(String[] args)
	{
		
		//Swipping if 2 numbers without using any temp variable 
		
		// Case 1
		int a = 10;
		int b = 20;
		
		a = a+b;		//30
		b = a-b;		//10
		a = a-b;		//20
		
		System.out.println("The value of a after swapping "+ a + " and value of b after swipping "+b);
		
		//Case 2
		
		int c = 2;
		int d = 4;
		
		c = c*d;	// 8
		d = c/d;	// 2
		c = c/d;	// 4 
		System.out.println("The value of a after swapping "+ c + " and value of b after swipping "+d);
		
		//Case 3
		
		int e = 46;	
		int f = 34;
		
		f = e+f - (e=f);		// f = 46+34 - (46=34)
								//		80 -	e = 46
								// f =	34		e = 46
		
		System.out.println("The value of a after swapping "+ f + " and value of b after swipping "+e);
		

	}

}
