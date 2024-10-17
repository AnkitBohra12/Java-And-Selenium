package Day3;

/**
 * 
 */
public class OperatorsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// 1) Arithmetic Operators + - * / %
		
		int a=20,b=10;
		System.out.println("Sum of a and b is : " + (a+b));
		System.out.println("Diffrence of a and b is : " + (a-b));
		System.out.println("Multiplication of a and b is : " + (a*b));
		System.out.println("Devision of a and b is : " + (a/b));
		System.out.println("Modular Devision of a and b is : " + (a%b));
		
		
		// 2) Relational and Comparison Operators  > >= < <= != ==
		// always returns a boolean value - true/false
		
		System.out.println(a>b);		//true
		System.out.println(a<b);		//false
		System.out.println(a>=b);		//true
		System.out.println(a<=b);		//false
		b = 20;
		System.out.println(a<=b);		//true
		System.out.println(a>=b);		//true
		
		System.out.println(a!=b);		//false
		System.out.println(a==b);		//true
		
		boolean res = a>b;
		System.out.println(res);
		
		
		// 3) Logical Operators &&  ||  !
		// returns boolean values - true/false
		// works b/w 2 boolean values 
		
		boolean x = true;
		boolean y = false;
		
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		boolean b1 = 10>20;
		System.out.println(b1);		//false
		
		boolean b2 = 20>10;
		System.out.println(b2);		//true
		
		System.out.println(b1 && b2);		// false
		System.out.println(b1 || b2);		// true
				
		System.out.println((10<20) && (20>10));		//true
		
	}

}
