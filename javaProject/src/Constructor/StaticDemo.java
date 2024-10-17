package Constructor;

public class StaticDemo 
{
	static int a = 100;			// static variable 
	int b = 200;				// non-static variable
	
	static void s1() 
	{
		System.out.println("this is s1 static method");
	}
	
	// 3) non-static can access everything directly
	void s2() 
	{
		System.out.println("this is s2 non-static method");
		System.out.println(a);
		System.out.println(b);
		s1();
	}

	/*public static void main(String[] args)
	{
		// 1) static method can access static stuff directly(without object)
		System.out.println(a);
		s1();
		
		// 2) static method can access non-static stuff through object
		StaticDemo obj = new StaticDemo();
		System.out.println(obj.b);
		obj.s2();		

	}*/

}
;