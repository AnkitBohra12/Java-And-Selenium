package TypeCasting;

public class TypeCasting {

	public static void main(String[] args) 
	{
		// Widening typecasting 
		
		int a = 10;
		long b = a;
		float c = a;
		
		System.out.println(a);
		System.out.println(b);	
		System.out.println(c);
		
		
		// Narrow Typecasting
		
		double f = 100.3433333;
		int g = (int)f;
		short h = (short)g;
		
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
	

	}

}
