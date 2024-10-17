package Day3;

public class TernaryOperator {

	public static void main(String[] args) 
	{
		//ternary operator
		// var = exp ? result1 : result2;
		
		//example 1:
		int a=200, b=100;
		
		int x = (a>b) ? a : b;
		System.out.println(x);
		
		
		//example 2:
		
		int y = (1==1) ? 100 : 200;
		System.out.println(y);
		
		int z = (1==2) ? 200 : 100;
		System.out.println(z);
		
		
		//example 3:
		
		int person_age = 30;
		
		String res = (person_age>=18) ? "Can vote" : "Can't vote";
		System.out.println(res);
	}

}
