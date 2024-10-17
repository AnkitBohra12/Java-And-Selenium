package Day11;

public class GreetingsMain {

	public static void main(String[] args) {
		
		Greetings g = new Greetings();
		g.m1();			// 1
		
		
		// whenever we return in a value form method we have to store it into a variable 
		String s = g.m2();			// 2
		System.out.println(s);
		
		g.m3("John");		// 3
		
		String ret = g.m4(10);
		System.out.println(ret);
	}
	
}
